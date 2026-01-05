package com.koncall.app.service

import android.annotation.SuppressLint
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.telephony.TelephonyManager
import android.util.Log
import android.provider.Settings
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class PhoneStateReceiver : BroadcastReceiver() {

    @Inject
    lateinit var appCallTracker: AppCallTracker

    companion object {
        private const val TAG = "PhoneStateReceiver"
        private var lastState = TelephonyManager.CALL_STATE_IDLE
        private var callStartTime: Long = 0
        private var incomingNumber: String? = null
        private var isOutgoing = false
    }

    @SuppressLint("UnsafeProtectedBroadcastReceiver")
    override fun onReceive(context: Context, intent: Intent) {
        when (intent.action) {
            Intent.ACTION_NEW_OUTGOING_CALL -> {
                // Outgoing call started
                val outgoingNumber = intent.getStringExtra(Intent.EXTRA_PHONE_NUMBER)
                Log.d(TAG, "Outgoing call to: $outgoingNumber")
                isOutgoing = true
                incomingNumber = outgoingNumber
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
                
                onCallStateChanged(context, state, number)
            }
        }
    }

    private fun onCallStateChanged(context: Context, state: Int, number: String?) {
        if (lastState == state) return
        
        when (state) {
            TelephonyManager.CALL_STATE_RINGING -> {
                // Incoming call ringing
                isOutgoing = false
                callStartTime = System.currentTimeMillis()
                incomingNumber = number
                Log.d(TAG, "Incoming call from: $number")
            }
            TelephonyManager.CALL_STATE_OFFHOOK -> {
                // Call answered or dialing
                if (lastState != TelephonyManager.CALL_STATE_RINGING) {
                    // Outgoing call started
                    callStartTime = System.currentTimeMillis()
                }
                Log.d(TAG, "Call connected")
                // Recording is handled by OEM dialer, no action needed here
            }
            TelephonyManager.CALL_STATE_IDLE -> {
                // Call ended
                val callEndTime = System.currentTimeMillis()
                val duration = ((callEndTime - callStartTime) / 1000).toInt()

                // Complete app-initiated call tracking if there was a pending call
                if (::appCallTracker.isInitialized && appCallTracker.isCallActive.value) {
                    Log.d(TAG, "Completing app-initiated call tracking")
                    appCallTracker.completeTracking()
                }

                when (lastState) {
                    TelephonyManager.CALL_STATE_RINGING -> {
                        // Missed call (rang but no answer)
                        Log.d(TAG, "Missed call from: $incomingNumber")
                        triggerCallLogSync(context)
                    }
                    TelephonyManager.CALL_STATE_OFFHOOK -> {
                        // Call ended normally - notify service to find recording
                        Log.d(TAG, "Call ended. Duration: ${duration}s, isOutgoing: $isOutgoing")
                        notifyCallEnded(context, callEndTime, incomingNumber, duration)
                    }
                }
                
                // Show note popup if overlay permission granted
                if (Settings.canDrawOverlays(context)) {
                    val popupIntent = Intent(context, NotePopupService::class.java).apply {
                        putExtra("phoneNumber", incomingNumber ?: "Unknown")
                        flags = Intent.FLAG_ACTIVITY_NEW_TASK
                    }
                    context.startService(popupIntent)
                }
                
                // Reset state
                incomingNumber = null
                isOutgoing = false
            }
        }
        lastState = state
    }
    
    /**
     * Notify CallMonitorService that a call ended.
     * The service will schedule the RecordingFinderWorker to discover OEM recordings.
     */
    private fun notifyCallEnded(context: Context, callEndTime: Long, phoneNumber: String?, duration: Int) {
        val intent = Intent(context, CallMonitorService::class.java).apply {
            action = CallMonitorService.ACTION_CALL_ENDED
            putExtra(CallMonitorService.EXTRA_CALL_END_TIME, callEndTime)
            putExtra(CallMonitorService.EXTRA_PHONE_NUMBER, phoneNumber)
            putExtra(CallMonitorService.EXTRA_CALL_DURATION, duration)
        }
        context.startService(intent)
    }

    private fun triggerCallLogSync(context: Context) {
        // Start CallMonitorService to sync call logs
        val serviceIntent = Intent(context, CallMonitorService::class.java).apply {
            action = CallMonitorService.ACTION_SYNC_CALL_LOGS
        }
        context.startService(serviceIntent)
    }
}
