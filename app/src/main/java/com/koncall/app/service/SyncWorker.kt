package com.koncall.app.service

import android.content.Context
import androidx.hilt.work.HiltWorker
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import com.koncall.app.data.local.dao.CallLogDao
import com.koncall.app.data.local.entity.SyncStatus
import com.koncall.app.data.remote.api.KonCallApiService
import com.koncall.app.data.remote.dto.SyncCallLogDto
import com.koncall.app.data.remote.dto.SyncCallLogsRequest
import com.koncall.app.util.TokenManager
import dagger.assisted.Assisted
import dagger.assisted.AssistedInject
import java.text.SimpleDateFormat
import java.util.*

@HiltWorker
class SyncWorker @AssistedInject constructor(
    @Assisted context: Context,
    @Assisted params: WorkerParameters,
    private val callLogDao: CallLogDao,
    private val apiService: KonCallApiService,
    private val tokenManager: TokenManager
) : CoroutineWorker(context, params) {

    companion object {
        const val WORK_NAME = "call_log_sync_work"
    }

    override suspend fun doWork(): Result {
        return try {
            // Check if logged in
            val token = tokenManager.getToken()
            if (token == null) {
                return Result.success() // Not logged in, skip sync
            }

            // Get pending call logs
            val pendingLogs = callLogDao.getCallLogsBySyncStatus(SyncStatus.PENDING)
            if (pendingLogs.isEmpty()) {
                return Result.success()
            }

            // Mark as syncing
            pendingLogs.forEach { log ->
                callLogDao.updateSyncStatus(log.id, SyncStatus.SYNCING)
            }

            // Convert to DTOs
            val dateFormat = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US).apply {
                timeZone = TimeZone.getTimeZone("UTC")
            }

            val syncDtos = pendingLogs.map { log ->
                SyncCallLogDto(
                    deviceCallId = log.deviceCallId,
                    phoneNumber = log.phoneNumber,
                    contactName = log.contactName,
                    callType = log.callType,
                    duration = log.duration,
                    callDatetime = dateFormat.format(Date(log.callDateTime)),
                    simNumber = log.simNumber,
                    simSlot = log.simSlot
                )
            }

            // Sync to server
            val response = apiService.syncCallLogs(SyncCallLogsRequest(syncDtos))

            if (response.isSuccessful) {
                val result = response.body()?.data
                var hasRecordingsToUpload = false
                var hasSyncedCalls = false
                
                result?.synced?.forEach { syncedLog ->
                    hasSyncedCalls = true
                    // Find local log by device call id and mark as synced
                    val localLog = callLogDao.getCallLogByDeviceId(syncedLog.deviceCallId)
                    localLog?.let {
                        callLogDao.markAsSynced(it.id, syncedLog.id, SyncStatus.SYNCED)
                        // Link to lead if server found one
                        syncedLog.leadId?.let { leadId ->
                            callLogDao.linkToLead(it.id, leadId)
                        }
                        
                        // Check if this call has a pending recording to upload
                        val updatedLog = callLogDao.getCallLogById(it.id)
                        if (updatedLog?.hasRecording == true && 
                            updatedLog.recordingSyncStatus == com.koncall.app.data.local.entity.RecordingSyncStatus.PENDING) {
                            hasRecordingsToUpload = true
                        }
                    }
                }
                
                // Always trigger RecordingFinderWorker after syncing calls to discover recordings
                if (hasSyncedCalls) {
                    android.util.Log.d("SyncWorker", "Triggering RecordingFinderWorker for synced calls")
                    triggerRecordingFinder()
                }
                
                // Trigger upload if any synced calls have pending recordings
                if (hasRecordingsToUpload) {
                    triggerRecordingUpload()
                }
                
                Result.success()
            } else {
                // Mark as failed for retry
                pendingLogs.forEach { log ->
                    callLogDao.updateSyncStatus(log.id, SyncStatus.FAILED)
                }
                Result.retry()
            }
        } catch (e: Exception) {
            Result.retry()
        }
    }
    
    private fun triggerRecordingUpload() {
        try {
            val request = androidx.work.OneTimeWorkRequestBuilder<com.koncall.app.service.recording.RecordingUploadWorker>()
                .setConstraints(
                    androidx.work.Constraints.Builder()
                        .setRequiredNetworkType(androidx.work.NetworkType.CONNECTED)
                        .build()
                )
                .build()
            
            androidx.work.WorkManager.getInstance(applicationContext).enqueue(request)
            android.util.Log.d("SyncWorker", "Triggered RecordingUploadWorker after sync")
        } catch (e: Exception) {
            android.util.Log.e("SyncWorker", "Failed to trigger upload worker", e)
        }
    }
    
    private fun triggerRecordingFinder() {
        try {
            // Schedule with short delay to allow phone to save recording
            val finderRequest = androidx.work.OneTimeWorkRequestBuilder<com.koncall.app.service.recording.RecordingFinderWorker>()
                .setInitialDelay(10, java.util.concurrent.TimeUnit.SECONDS)
                .setInputData(
                    androidx.work.workDataOf(
                        com.koncall.app.service.recording.RecordingFinderWorker.KEY_SCAN_ALL_RECENT to true
                    )
                )
                .build()
            
            androidx.work.WorkManager.getInstance(applicationContext).enqueue(finderRequest)
            android.util.Log.d("SyncWorker", "Scheduled RecordingFinderWorker (10s delay)")
        } catch (e: Exception) {
            android.util.Log.e("SyncWorker", "Failed to trigger recording finder", e)
        }
    }
}
