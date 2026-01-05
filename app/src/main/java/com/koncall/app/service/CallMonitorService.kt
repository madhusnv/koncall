package com.koncall.app.service

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.Service
import android.content.Intent
import android.os.Build
import android.os.Handler
import android.os.IBinder
import android.os.Looper
import android.provider.CallLog
import android.util.Log
import androidx.core.app.NotificationCompat
import androidx.work.Constraints
import androidx.work.ExistingWorkPolicy
import androidx.work.NetworkType
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.WorkManager
import androidx.work.workDataOf
import com.koncall.app.R
import com.koncall.app.data.local.dao.CallLogDao
import com.koncall.app.data.local.dao.LeadDao
import com.koncall.app.data.remote.api.KonCallApiService
import com.koncall.app.service.recording.RecordingFinderWorker
import com.koncall.app.service.recording.RecordingUploadWorker
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch
import java.util.concurrent.TimeUnit
import javax.inject.Inject

/**
 * Foreground service for monitoring and syncing call logs.
 * 
 * Responsibilities:
 * - Running as foreground service to monitor calls
 * - Registering/unregistering call log observer
 * - Coordinating call log sync and recording discovery
 * 
 * Logic delegated to:
 * - CallLogReader: Reading system call logs
 * - RecordingFinderWorker: Finding OEM recordings after calls
 * - CallLogObserver: Observing call log changes
 */
@AndroidEntryPoint
class CallMonitorService : Service() {

    @Inject
    lateinit var callLogDao: CallLogDao

    @Inject
    lateinit var leadDao: LeadDao

    @Inject
    lateinit var apiService: KonCallApiService

    private val serviceScope = CoroutineScope(SupervisorJob() + Dispatchers.IO)
    private var callLogObserver: CallLogObserver? = null

    companion object {
        private const val TAG = "CallMonitorService"
        private const val CHANNEL_ID = "call_monitor_channel"
        private const val NOTIFICATION_ID = 1001
        
        // Service actions
        const val ACTION_SYNC_CALL_LOGS = "com.koncall.app.SYNC_CALL_LOGS"
        const val ACTION_START_FOREGROUND = "com.koncall.app.START_FOREGROUND"
        const val ACTION_STOP_FOREGROUND = "com.koncall.app.STOP_FOREGROUND"
        const val ACTION_CALL_ENDED = "com.koncall.app.CALL_ENDED"
        const val ACTION_SCAN_RECORDINGS = "com.koncall.app.SCAN_RECORDINGS"
        
        // Intent extras
        const val EXTRA_CALL_END_TIME = "callEndTime"
        const val EXTRA_PHONE_NUMBER = "phoneNumber"
        const val EXTRA_CALL_DURATION = "callDuration"
        
        // Recording finder delay (wait for OEM dialer to save)
        private const val RECORDING_FINDER_DELAY_SECONDS = 30L
        
        /**
         * Normalize phone number for matching.
         * Removes country code (+91), spaces, dashes, and keeps last 10 digits.
         */
        fun normalizePhoneNumber(phone: String): String {
            val digitsOnly = phone.filter { it.isDigit() }
            return if (digitsOnly.length >= 10) {
                digitsOnly.takeLast(10)
            } else {
                digitsOnly
            }
        }
    }

    override fun onCreate() {
        super.onCreate()
        createNotificationChannel()
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        // Immediately promote to foreground to comply with startForegroundService requirements
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            try {
                startForeground(NOTIFICATION_ID, createNotification())
            } catch (e: Exception) {
                Log.e(TAG, "Failed to start foreground", e)
            }
        }

        when (intent?.action) {
            ACTION_SYNC_CALL_LOGS -> syncRecentCallLogs()
            ACTION_START_FOREGROUND -> startForegroundMode()
            ACTION_STOP_FOREGROUND -> stopForegroundMode()
            
            ACTION_CALL_ENDED -> {
                // Call ended - schedule recording finder after delay
                val callEndTime = intent.getLongExtra(EXTRA_CALL_END_TIME, System.currentTimeMillis())
                val phoneNumber = intent.getStringExtra(EXTRA_PHONE_NUMBER)
                val duration = intent.getIntExtra(EXTRA_CALL_DURATION, 0)
                
                // Only look for recordings on calls with duration > 0
                if (duration > 0) {
                    scheduleRecordingFinder(callEndTime, phoneNumber)
                }
                syncRecentCallLogs()
            }
            
            ACTION_SCAN_RECORDINGS -> {
                // Manual scan for all recent recordings
                scheduleRecordingFinder(scanAll = true)
            }
            
            else -> syncRecentCallLogs()
        }
        
        return START_STICKY
    }

    private fun startForegroundMode() {
        Log.d(TAG, "Starting foreground mode with CallLogObserver")
        startForeground(NOTIFICATION_ID, createNotification())
        registerCallLogObserver()
    }

    private fun stopForegroundMode() {
        Log.d(TAG, "Stopping foreground mode")
        unregisterCallLogObserver()
        stopForeground(STOP_FOREGROUND_REMOVE)
        stopSelf()
    }

    private fun registerCallLogObserver() {
        if (callLogObserver == null) {
            callLogObserver = CallLogObserver(
                context = this,
                callLogDao = callLogDao,
                handler = Handler(Looper.getMainLooper())
            )
            
            contentResolver.registerContentObserver(
                CallLog.Calls.CONTENT_URI,
                true,
                callLogObserver!!
            )
            Log.d(TAG, "CallLogObserver registered")
        }
    }

    private fun unregisterCallLogObserver() {
        callLogObserver?.let {
            contentResolver.unregisterContentObserver(it)
            callLogObserver = null
            Log.d(TAG, "CallLogObserver unregistered")
        }
    }

    override fun onDestroy() {
        unregisterCallLogObserver()
        super.onDestroy()
    }

    override fun onBind(intent: Intent?): IBinder? = null

    private fun createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channel = NotificationChannel(
                CHANNEL_ID,
                "Call Monitor",
                NotificationManager.IMPORTANCE_LOW
            ).apply {
                description = "Monitors calls for syncing"
            }
            val notificationManager = getSystemService(NotificationManager::class.java)
            notificationManager.createNotificationChannel(channel)
        }
    }

    private fun createNotification(): Notification {
        return NotificationCompat.Builder(this, CHANNEL_ID)
            .setContentTitle("KonCall Active")
            .setContentText("Tracking your calls")
            .setSmallIcon(R.drawable.ic_launcher_foreground)
            .setPriority(NotificationCompat.PRIORITY_LOW)
            .setOngoing(true)
            .build()
    }

    /**
     * Sync recent call logs from the system to local database.
     * Only syncs calls that match known leads.
     */
    private fun syncRecentCallLogs() {
        serviceScope.launch {
            try {
                Log.d(TAG, "Starting call log sync...")
                
                // Read recent calls using helper
                val recentCalls = CallLogReader.readSystemCallLogs(contentResolver, 100)
                
                // Filter to only new calls that belong to known leads
                val newCalls = recentCalls.filter { call ->
                    val notExists = callLogDao.getCallLogByDeviceId(call.deviceCallId) == null
                    if (!notExists) return@filter false
                    
                    // Normalize phone number for matching (handle +91, spaces, dashes)
                    val normalizedNumber = normalizePhoneNumber(call.phoneNumber)
                    
                    // Try exact match first, then normalized match
                    val lead = leadDao.getLeadByPhoneNumber(call.phoneNumber)
                        ?: leadDao.getLeadByNormalizedPhone(normalizedNumber)
                    val isLead = lead != null
                    
                    if (isLead) {
                        Log.d(TAG, "Syncing call for lead: ${call.phoneNumber} (${call.callType})")
                    } else {
                        Log.d(TAG, "Skipped non-lead call: ${call.phoneNumber}")
                    }
                    
                    isLead
                }
                
                if (newCalls.isEmpty()) {
                    Log.d(TAG, "No new call logs to sync")
                    return@launch
                }
                
                Log.d(TAG, "Found ${newCalls.size} new call logs to save")
                
                // Recordings will be linked later by RecordingFinderWorker
                callLogDao.insertCallLogs(newCalls)
                Log.d(TAG, "Inserted ${newCalls.size} call logs, triggering sync...")
                
                // Trigger immediate sync to backend
                triggerImmediateSync()
                
            } catch (e: Exception) {
                Log.e(TAG, "Error syncing call logs", e)
            } finally {
                stopSelf()
            }
        }
    }
    
    /**
     * Trigger immediate sync to backend using WorkManager
     */
    private fun triggerImmediateSync() {
        val constraints = Constraints.Builder()
            .setRequiredNetworkType(NetworkType.CONNECTED)
            .build()
        
        val syncRequest = OneTimeWorkRequestBuilder<SyncWorker>()
            .setConstraints(constraints)
            .build()
        
        WorkManager.getInstance(this).enqueue(syncRequest)
        Log.d(TAG, "Immediate sync enqueued")
    }
    
    /**
     * Schedule recording finder worker to discover OEM recordings.
     * Runs with a delay to allow the native dialer to save the recording.
     */
    private fun scheduleRecordingFinder(
        callEndTime: Long = System.currentTimeMillis(),
        phoneNumber: String? = null,
        scanAll: Boolean = false
    ) {
        val inputData = workDataOf(
            RecordingFinderWorker.KEY_CALL_END_TIME to callEndTime,
            RecordingFinderWorker.KEY_PHONE_NUMBER to phoneNumber,
            RecordingFinderWorker.KEY_SCAN_ALL_RECENT to scanAll
        )
        
        val request = OneTimeWorkRequestBuilder<RecordingFinderWorker>()
            .setInitialDelay(RECORDING_FINDER_DELAY_SECONDS, TimeUnit.SECONDS)
            .setInputData(inputData)
            .build()
        
        WorkManager.getInstance(this).enqueueUniqueWork(
            "recording_finder_${callEndTime}",
            ExistingWorkPolicy.KEEP,
            request
        )
        
        Log.d(TAG, "Recording finder scheduled for ${RECORDING_FINDER_DELAY_SECONDS}s from now")
    }
    
    /**
     * Schedule upload of pending recordings
     */
    private fun scheduleRecordingUpload() {
        val constraints = Constraints.Builder()
            .setRequiredNetworkType(NetworkType.CONNECTED)
            .build()
            
        val request = OneTimeWorkRequestBuilder<RecordingUploadWorker>()
            .setConstraints(constraints)
            .setInputData(workDataOf(RecordingUploadWorker.KEY_BATCH_MODE to true))
            .build()
            
        WorkManager.getInstance(this).enqueueUniqueWork(
            "recording_upload",
            ExistingWorkPolicy.KEEP,
            request
        )
        
        Log.d(TAG, "Recording upload scheduled")
    }
}
