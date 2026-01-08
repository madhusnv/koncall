package com.koncall.app.data.local.dao

import androidx.room.*
import com.koncall.app.data.local.entity.RecordingEntity
import com.koncall.app.data.local.entity.UploadStatus
import kotlinx.coroutines.flow.Flow

/**
 * DAO for recording operations.
 * Handles CRUD for discovered recordings and upload tracking.
 */
@Dao
interface RecordingDao {
    
    // ===== Queries =====
    
    @Query("SELECT * FROM recordings WHERE matchedCallLogId IS NULL ORDER BY dateAdded DESC")
    suspend fun getUnmatchedRecordings(): List<RecordingEntity>
    
    @Query("SELECT * FROM recordings WHERE dateAdded BETWEEN :start AND :end ORDER BY dateAdded DESC")
    suspend fun getRecordingsInRange(start: Long, end: Long): List<RecordingEntity>
    
    @Query("SELECT * FROM recordings WHERE matchedCallLogId = :callLogId LIMIT 1")
    suspend fun getRecordingForCall(callLogId: String): RecordingEntity?
    
    @Query("SELECT * FROM recordings WHERE id = :id")
    suspend fun getById(id: String): RecordingEntity?
    
    @Query("SELECT * FROM recordings WHERE uploadStatus = :status ORDER BY dateAdded ASC")
    suspend fun getByUploadStatus(status: String): List<RecordingEntity>
    
    @Query("SELECT * FROM recordings WHERE uploadStatus = :status")
    fun observeByUploadStatus(status: String): Flow<List<RecordingEntity>>
    
    @Query("""
        SELECT * FROM recordings 
        WHERE uploadStatus = :status 
        AND scheduledForDeletion IS NOT NULL 
        AND scheduledForDeletion < :now
    """)
    suspend fun getRecordingsReadyForDeletion(status: String = UploadStatus.UPLOADED, now: Long): List<RecordingEntity>
    
    @Query("SELECT COUNT(*) FROM recordings WHERE matchedCallLogId IS NOT NULL")
    suspend fun getMatchedCount(): Int
    
    @Query("SELECT COUNT(*) FROM recordings WHERE uploadStatus = :status")
    suspend fun getCountByStatus(status: String): Int
    
    // ===== Inserts =====
    
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(recording: RecordingEntity)
    
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertAll(recordings: List<RecordingEntity>)
    
    @Query("SELECT * FROM recordings WHERE uri = :uri LIMIT 1")
    suspend fun getByUri(uri: String): RecordingEntity?
    
    // ===== Updates =====
    
    @Update
    suspend fun update(recording: RecordingEntity)
    
    @Query("UPDATE recordings SET matchedCallLogId = :callLogId, matchScore = :score, matchedAt = :matchedAt WHERE id = :recordingId")
    suspend fun linkToCall(recordingId: String, callLogId: String, score: Int, matchedAt: Long = System.currentTimeMillis())
    
    @Query("UPDATE recordings SET uploadStatus = :status, uploadAttempts = uploadAttempts + 1, lastUploadAttempt = :timestamp WHERE id = :recordingId")
    suspend fun updateUploadStatus(recordingId: String, status: String, timestamp: Long = System.currentTimeMillis())
    
    @Query("UPDATE recordings SET uploadStatus = :status, serverUrl = :serverUrl, scheduledForDeletion = :deleteAt WHERE id = :recordingId")
    suspend fun markUploaded(recordingId: String, status: String = UploadStatus.UPLOADED, serverUrl: String, deleteAt: Long)
    
    @Query("UPDATE recordings SET uploadStatus = :status, uploadError = :error WHERE id = :recordingId")
    suspend fun markUploadFailed(recordingId: String, status: String = UploadStatus.FAILED, error: String?)
    
    // ===== Deletes =====
    
    @Query("DELETE FROM recordings WHERE id = :id")
    suspend fun deleteById(id: String)
    
    @Delete
    suspend fun delete(recording: RecordingEntity)
    
    @Query("DELETE FROM recordings WHERE scheduledForDeletion IS NOT NULL AND scheduledForDeletion < :now")
    suspend fun deleteExpiredRecordings(now: Long = System.currentTimeMillis()): Int
    
    @Query("DELETE FROM recordings")
    suspend fun deleteAll()
}
