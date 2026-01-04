package com.koncall.app.data.local.dao

import androidx.room.*
import com.koncall.app.data.local.entity.CallLogEntity
import com.koncall.app.data.local.entity.SyncStatus
import kotlinx.coroutines.flow.Flow

@Dao
interface CallLogDao {
    
    @Query("SELECT * FROM call_logs ORDER BY callDateTime DESC")
    fun getAllCallLogs(): Flow<List<CallLogEntity>>
    
    @Query("SELECT * FROM call_logs ORDER BY callDateTime DESC LIMIT :limit OFFSET :offset")
    suspend fun getCallLogsPaged(limit: Int, offset: Int): List<CallLogEntity>
    
    @Query("SELECT * FROM call_logs WHERE id = :id")
    suspend fun getCallLogById(id: String): CallLogEntity?
    
    @Query("SELECT * FROM call_logs WHERE deviceCallId = :deviceCallId LIMIT 1")
    suspend fun getCallLogByDeviceId(deviceCallId: Long): CallLogEntity?
    
    @Query("SELECT * FROM call_logs WHERE syncStatus = :status")
    suspend fun getCallLogsBySyncStatus(status: String = SyncStatus.PENDING): List<CallLogEntity>
    
    @Query("SELECT * FROM call_logs WHERE phoneNumber = :phoneNumber ORDER BY callDateTime DESC")
    fun getCallLogsByPhoneNumber(phoneNumber: String): Flow<List<CallLogEntity>>
    
    @Query("SELECT * FROM call_logs WHERE callType = :type ORDER BY callDateTime DESC")
    fun getCallLogsByType(type: String): Flow<List<CallLogEntity>>
    
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCallLog(callLog: CallLogEntity): Long
    
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCallLogs(callLogs: List<CallLogEntity>)
    
    @Update
    suspend fun updateCallLog(callLog: CallLogEntity)
    
    @Query("UPDATE call_logs SET syncStatus = :status WHERE id = :id")
    suspend fun updateSyncStatus(id: String, status: String)
    
    @Query("UPDATE call_logs SET serverId = :serverId, syncStatus = :status WHERE id = :id")
    suspend fun markAsSynced(id: String, serverId: String, status: String = SyncStatus.SYNCED)
    
    @Query("UPDATE call_logs SET leadId = :leadId WHERE id = :id")
    suspend fun linkToLead(id: String, leadId: String)
    
    @Query("UPDATE call_logs SET appInitiated = :appInitiated, leadId = :leadId WHERE id = :id")
    suspend fun updateAppInitiated(id: String, appInitiated: Boolean, leadId: String?)
    
    @Delete
    suspend fun deleteCallLog(callLog: CallLogEntity)
    
    @Query("DELETE FROM call_logs")
    suspend fun deleteAll()
    
    // Analytics queries
    @Query("SELECT COUNT(*) FROM call_logs")
    suspend fun getTotalCount(): Int
    
    @Query("SELECT COUNT(*) FROM call_logs WHERE callType = :type")
    suspend fun getCountByType(type: String): Int
    
    @Query("SELECT SUM(duration) FROM call_logs")
    suspend fun getTotalDuration(): Int?
    
    @Query("SELECT DISTINCT phoneNumber FROM call_logs WHERE callType = 'missed' " +
           "EXCEPT SELECT DISTINCT phoneNumber FROM call_logs WHERE callType = 'outgoing' AND duration > 0")
    suspend fun getNeverAttendedNumbers(): List<String>
    
    @Query("SELECT DISTINCT phoneNumber FROM call_logs WHERE callType = 'outgoing' AND duration = 0 " +
           "EXCEPT SELECT DISTINCT phoneNumber FROM call_logs WHERE callType = 'outgoing' AND duration > 0")
    suspend fun getNotPickedUpNumbers(): List<String>
    
    @Query("SELECT * FROM call_logs WHERE phoneNumber = :phoneNumber ORDER BY callDateTime DESC LIMIT 1")
    suspend fun getLatestCallLogByPhoneNumber(phoneNumber: String): CallLogEntity?
}
