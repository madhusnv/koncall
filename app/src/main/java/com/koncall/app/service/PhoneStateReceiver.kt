package com.koncall.app.service

import android.annotation.SuppressLint
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.telephony.TelephonyManager
import android.util.Log
import android.provider.Settings
import com.koncall.app.service.recording.RecordingFinderWorker
import dagger.hilt.android.EntryPointAccessors
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

/**
 * BroadcastReceiver that listens for phone state changes and outgoing calls.
 * 
 * NOTE: This receiver is declared in AndroidManifest.xml and cannot use @AndroidEntryPoint
 * because manifest-registered receivers are instantiated by the system, not Hilt.
 * Instead, we manually fetch dependencies using EntryPointAccessors.
 */
class PhoneStateReceiver : BroadcastReceiver() {

    companion object {
        private const val TAG = "PhoneStateReceiver"
    }

    /**
     * Hilt EntryPoint for accessing dependencies from non-Hilt components.
     */
    @EntryPoint
    @InstallIn(SingletonComponent::class)
    interface PhoneStateReceiverEntryPoint {
        fun appCallTracker(): AppCallTracker
        fun callStateTracker(): CallStateTracker
    }

    @SuppressLint("UnsafeProtectedBroadcastReceiver")
    override fun onReceive(context: Context, intent: Intent) {
        Log.d(TAG, "onReceive: action=${intent.action}")
        
        // Manually fetch dependencies from Hilt
        val appContext = context.applicationContext
        val entryPoint = EntryPointAccessors.fromApplication(
            appContext,
            PhoneStateReceiverEntryPoint::class.java
        )
        val appCallTracker = entryPoint.appCallTracker()
        val callStateTracker = entryPoint.callStateTracker()
        
        when (intent.action) {
            Intent.ACTION_NEW_OUTGOING_CALL -> {
                // Outgoing call started
                val outgoingNumber = intent.getStringExtra(Intent.EXTRA_PHONE_NUMBER)
                Log.d(TAG, "Outgoing call to: $outgoingNumber")
                callStateTracker.onOutgoingCall(outgoingNumber)
            }
            TelephonyManager.ACTION_PHONE_STATE_CHANGED -> {
                val stateStr = intent.getStringExtra(TelephonyManager.EXTRA_STATE)
                val number = intent.getStringExtra(TelephonyManager.EXTRA_INCOMING_NUMBER)
                
                val state = when (stateStr) {
                    TelephonyManager.EXTRA_STATE_IDLE -> TelephonyManager.CALL_STATE_IDLE
                    TelephonyManager.EXTRA_STATE_RINGING -> TelephonyManager.CALL_STATE_RINGING
                    TelephonyManager.EXTRA_STATE_OFFHOOK -> TelephonyManager.CALL_STATE_OFFHOOK
                    else -> TelephonyManager.CALL_STATE_IDLE
                }
                
                onCallStateChanged(context, state, number, callStateTracker, appCallTracker)
            }
        }
    }

    private fun onCallStateChanged(
        context: Context, 
        state: Int, 
        number: String?,
        callStateTracker: CallStateTracker,
        appCallTracker: AppCallTracker
    ) {
        // Get previous state before update
        val previousState = callStateTracker.getCurrentState()
        
        // Skip if state hasn't changed
        if (previousState.lastState == state) return
        
        // Update state and get the snapshot at the transition
        val stateSnapshot = callStateTracker.onStateChange(state, number)
        
        when (state) {
            TelephonyManager.CALL_STATE_RINGING -> {
                Log.d(TAG, "Incoming call from: $number")
            }
            TelephonyManager.CALL_STATE_OFFHOOK -> {
                Log.d(TAG, "Call connected")
            }
            TelephonyManager.CALL_STATE_IDLE -> {
                // Call ended
                val callEndTime = System.currentTimeMillis()
                val duration = if (stateSnapshot.callStartTime > 0) {
                    ((callEndTime - stateSnapshot.callStartTime) / 1000).toInt()
                } else {
                    0
                }

                // Complete app-initiated call tracking if there was a pending call
                if (appCallTracker.isCallActive.value) {
                    Log.d(TAG, "Completing app-initiated call tracking")
                    appCallTracker.completeTracking()
                }

                when (previousState.lastState) {
                    TelephonyManager.CALL_STATE_RINGING -> {
                        // Missed call (rang but no answer)
                        Log.d(TAG, "Missed call from: ${stateSnapshot.incomingNumber}")
                        triggerCallLogSync(context)
                    }
                    TelephonyManager.CALL_STATE_OFFHOOK -> {
                        // Call ended normally - notify service to find recording
                        Log.d(TAG, "Call ended. Duration: ${duration}s, isOutgoing: ${stateSnapshot.isOutgoing}")
                        notifyCallEnded(context, callEndTime, stateSnapshot.incomingNumber, duration)
                    }
                }
                
                // Show note popup if overlay permission granted
                if (Settings.canDrawOverlays(context)) {
                    val popupIntent = Intent(context, NotePopupService::class.java).apply {
                        putExtra("phoneNumber", stateSnapshot.incomingNumber ?: "Unknown")
                        flags = Intent.FLAG_ACTIVITY_NEW_TASK
                    }
                    context.startService(popupIntent)
                }
            }
        }
    }
    
    /**
     * Notify that a call ended.
     * Schedules workers to ingest log and find recording using WorkManager.
     */
    private fun notifyCallEnded(context: Context, callEndTime: Long, phoneNumber: String?, duration: Int) {
        if (duration > 0) {
            // Schedule Recording Finder
            val inputData = androidx.work.workDataOf(
                RecordingFinderWorker.KEY_CALL_END_TIME to callEndTime,
                RecordingFinderWorker.KEY_PHONE_NUMBER to phoneNumber
            )
            
            val finderRequest = androidx.work.OneTimeWorkRequestBuilder<RecordingFinderWorker>()
                .setInitialDelay(30, java.util.concurrent.TimeUnit.SECONDS)
                .setInputData(inputData)
                .addTag(WorkerTags.TAG_CALL_TRACKING)
                .addTag(WorkerTags.TAG_RECORDING_FINDER)
                .build()
            
            androidx.work.WorkManager.getInstance(context).enqueue(finderRequest)
            Log.d(TAG, "Scheduled RecordingFinderWorker")
        }
        
        // Schedule Call Log Ingestion
        triggerCallLogIngestion(context)
    }

    private fun triggerCallLogSync(context: Context) {
        triggerCallLogIngestion(context)
    }
    
    private fun triggerCallLogIngestion(context: Context) {
        val request = androidx.work.OneTimeWorkRequestBuilder<CallLogIngestionWorker>()
            .setInitialDelay(2, java.util.concurrent.TimeUnit.SECONDS)
            .addTag(WorkerTags.TAG_CALL_TRACKING)
            .addTag(WorkerTags.TAG_CALL_LOG_INGESTION)
            .build()
            
        androidx.work.WorkManager.getInstance(context).enqueue(request)
        Log.d(TAG, "Scheduled CallLogIngestionWorker")
    }
}
