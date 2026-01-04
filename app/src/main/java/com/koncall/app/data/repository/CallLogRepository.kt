package com.koncall.app.data.repository

import com.koncall.app.data.local.dao.CallLogDao
import com.koncall.app.data.local.entity.CallLogEntity
import com.koncall.app.data.local.entity.SyncStatus
import com.koncall.app.data.remote.api.KonCallApiService
import com.koncall.app.data.remote.dto.SyncCallLogDto
import com.koncall.app.data.remote.dto.SyncCallLogsRequest
import kotlinx.coroutines.flow.Flow
import java.text.SimpleDateFormat
import java.util.*
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class CallLogRepository @Inject constructor(
    private val callLogDao: CallLogDao,
    private val apiService: KonCallApiService
) {
    fun getAllCallLogs(): Flow<List<CallLogEntity>> = callLogDao.getAllCallLogs()
    
    fun getCallLogsByPhoneNumber(phoneNumber: String): Flow<List<CallLogEntity>> = 
        callLogDao.getCallLogsByPhoneNumber(phoneNumber)
    
    fun getCallLogsByType(type: String): Flow<List<CallLogEntity>> = 
        callLogDao.getCallLogsByType(type)
    
    suspend fun getCallLogById(id: String): CallLogEntity? = callLogDao.getCallLogById(id)
    
    suspend fun insertCallLog(callLog: CallLogEntity) = callLogDao.insertCallLog(callLog)
    
    suspend fun getPendingCallLogs(): List<CallLogEntity> = 
        callLogDao.getCallLogsBySyncStatus(SyncStatus.PENDING)
    
    suspend fun syncCallLogs(): Result<Int> {
        val pendingLogs = callLogDao.getCallLogsBySyncStatus(SyncStatus.PENDING)
        if (pendingLogs.isEmpty()) return Result.success(0)
        
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
        
        return try {
            val response = apiService.syncCallLogs(SyncCallLogsRequest(syncDtos))
            if (response.isSuccessful) {
                response.body()?.data?.synced?.forEach { synced ->
                    callLogDao.getCallLogByDeviceId(synced.deviceCallId)?.let { localLog ->
                        callLogDao.markAsSynced(localLog.id, synced.id, SyncStatus.SYNCED)
                        synced.leadId?.let { leadId ->
                            callLogDao.linkToLead(localLog.id, leadId)
                        }
                    }
                }
                Result.success(response.body()?.data?.syncedCount ?: 0)
            } else {
                Result.failure(Exception("Sync failed: ${response.code()}"))
            }
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
    
    // Analytics
    suspend fun getTotalCount(): Int = callLogDao.getTotalCount()
    suspend fun getCountByType(type: String): Int = callLogDao.getCountByType(type)
    suspend fun getTotalDuration(): Int = callLogDao.getTotalDuration() ?: 0
    suspend fun getNeverAttendedNumbers(): List<String> = callLogDao.getNeverAttendedNumbers()
    suspend fun getNotPickedUpNumbers(): List<String> = callLogDao.getNotPickedUpNumbers()
}
