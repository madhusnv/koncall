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
import com.koncall.app.R
import com.koncall.app.data.local.dao.CallLogDao
import com.koncall.app.data.local.dao.LeadDao
import com.koncall.app.data.remote.api.KonCallApiService
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch
import java.io.File
import javax.inject.Inject

/**
 * Foreground service for monitoring and syncing call logs.
 * 
 * Responsibilities:
 * - Running as foreground service to monitor calls
 * - Registering/unregistering call log observer
 * - Coordinating call log sync and recording
 * 
 * Logic delegated to:
 * - CallLogReader: Reading system call logs
 * - CallRecorder: Recording calls
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
    private var callRecorder: CallRecorder? = null
    private var lastRecordingFile: File? = null

    companion object {
        private const val TAG = "CallMonitorService"
        private const val CHANNEL_ID = "call_monitor_channel"
        private const val NOTIFICATION_ID = 1001
        
        // Service actions
        const val ACTION_SYNC_CALL_LOGS = "com.koncall.app.SYNC_CALL_LOGS"
        const val ACTION_START_FOREGROUND = "com.koncall.app.START_FOREGROUND"
        const val ACTION_STOP_FOREGROUND = "com.koncall.app.STOP_FOREGROUND"
        const val ACTION_START_RECORDING = "com.koncall.app.START_RECORDING"
        const val ACTION_STOP_RECORDING = "com.koncall.app.STOP_RECORDING"
    }

    override fun onCreate() {
        super.onCreate()
        createNotificationChannel()
        callRecorder = CallRecorder(this)
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
            ACTION_START_RECORDING -> {
                val phoneNumber = intent.getStringExtra("phoneNumber")
                callRecorder?.startRecording(phoneNumber)
            }
            ACTION_STOP_RECORDING -> {
                lastRecordingFile = callRecorder?.stopRecording()
                syncRecentCallLogs()
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
        callRecorder?.release()
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
                    
                    // Only sync calls that match a known lead
                    val lead = leadDao.getLeadByPhoneNumber(call.phoneNumber)
                    val isLead = lead != null
                    
                    if (isLead) {
                        Log.d(TAG, "Syncing call for lead: ${call.phoneNumber}")
                    } else {
                        Log.d(TAG, "Ignored unknown number: ${call.phoneNumber}")
                    }
                    
                    isLead
                }
                
                if (newCalls.isEmpty()) {
                    Log.d(TAG, "No new call logs to sync")
                    return@launch
                }
                
                Log.d(TAG, "Found ${newCalls.size} new call logs to save")
                
                // Link recording to latest call if available
                val callsToInsert = if (lastRecordingFile != null && newCalls.isNotEmpty()) {
                    val updatedCall = newCalls.first().copy(
                        hasRecording = true,
                        recordingPath = lastRecordingFile!!.absolutePath
                    )
                    lastRecordingFile = null
                    listOf(updatedCall) + newCalls.drop(1)
                } else {
                    newCalls
                }
                
                callLogDao.insertCallLogs(callsToInsert)
                
            } catch (e: Exception) {
                Log.e(TAG, "Error syncing call logs", e)
            } finally {
                stopSelf()
            }
        }
    }
}
