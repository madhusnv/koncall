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
                result?.synced?.forEach { syncedLog ->
                    // Find local log by device call id and mark as synced
                    val localLog = callLogDao.getCallLogByDeviceId(syncedLog.deviceCallId)
                    localLog?.let {
                        callLogDao.markAsSynced(it.id, syncedLog.id, SyncStatus.SYNCED)
                        // Link to lead if server found one
                        syncedLog.leadId?.let { leadId ->
                            callLogDao.linkToLead(it.id, leadId)
                        }
                    }
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
}
