package com.koncall.app.service.recording

import android.content.Context
import android.net.Uri
import android.util.Log
import androidx.hilt.work.HiltWorker
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import androidx.work.workDataOf
import com.koncall.app.data.local.dao.RecordingDao
import com.koncall.app.data.local.entity.UploadStatus
import dagger.assisted.Assisted
import dagger.assisted.AssistedInject
import java.io.File

/**
 * WorkManager worker that cleans up old recordings.
 * 
 * Runs daily to delete recordings that have been successfully uploaded
 * and are past their retention period (7 days).
 * 
 * Output data:
 * - recordings_deleted: Int
 * - space_freed_bytes: Long
 */
@HiltWorker
class RecordingCleanupWorker @AssistedInject constructor(
    @Assisted private val context: Context,
    @Assisted params: WorkerParameters,
    private val recordingDao: RecordingDao
) : CoroutineWorker(context, params) {
    
    companion object {
        private const val TAG = "RecordingCleanupWorker"
    }
    
    override suspend fun doWork(): Result {
        return try {
            Log.d(TAG, "Starting recording cleanup")
            
            var deletedCount = 0
            var freedBytes = 0L
            
            // 1. Delete recordings past retention period
            val expiredRecordings = recordingDao.getRecordingsReadyForDeletion(
                status = UploadStatus.UPLOADED,
                now = System.currentTimeMillis()
            )
            
            for (recording in expiredRecordings) {
                try {
                    // Try to delete local file if we have a path
                    recording.filePath?.let { path ->
                        val file = File(path)
                        if (file.exists()) {
                            freedBytes += file.length()
                            file.delete()
                            Log.d(TAG, "Deleted file: $path")
                        }
                    }
                    
                    // Remove from database
                    recordingDao.deleteById(recording.id)
                    deletedCount++
                    
                } catch (e: Exception) {
                    Log.e(TAG, "Error deleting recording ${recording.id}", e)
                }
            }
            
            // 2. Clean up orphaned temp files in cache
            val cacheFreed = cleanupCacheFiles()
            freedBytes += cacheFreed
            
            Log.d(TAG, "Cleanup complete: deleted=$deletedCount, freed=${freedBytes / 1024}KB")
            
            Result.success(
                workDataOf(
                    "recordings_deleted" to deletedCount,
                    "space_freed_bytes" to freedBytes
                )
            )
            
        } catch (e: Exception) {
            Log.e(TAG, "Error in cleanup worker", e)
            Result.failure()
        }
    }
    
    /**
     * Clean up old temp files from cache directory
     */
    private fun cleanupCacheFiles(): Long {
        var freedBytes = 0L
        val cacheDir = context.cacheDir
        val cutoffTime = System.currentTimeMillis() - (24 * 60 * 60 * 1000L) // 1 day old
        
        cacheDir.listFiles()?.forEach { file ->
            if (file.isFile && file.name.startsWith("upload_") && file.lastModified() < cutoffTime) {
                freedBytes += file.length()
                file.delete()
                Log.d(TAG, "Deleted temp file: ${file.name}")
            }
        }
        
        return freedBytes
    }
}
