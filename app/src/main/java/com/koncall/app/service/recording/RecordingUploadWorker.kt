package com.koncall.app.service.recording

import android.content.Context
import android.net.Uri
import android.util.Log
import androidx.hilt.work.HiltWorker
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import androidx.work.workDataOf
import com.koncall.app.data.local.dao.CallLogDao
import com.koncall.app.data.local.dao.RecordingDao
import com.koncall.app.data.local.entity.RecordingSyncStatus
import com.koncall.app.data.local.entity.UploadStatus
import com.koncall.app.data.remote.api.KonCallApiService
import dagger.assisted.Assisted
import dagger.assisted.AssistedInject
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.MultipartBody
import okhttp3.RequestBody.Companion.asRequestBody
import okhttp3.RequestBody.Companion.toRequestBody
import java.io.File
import java.io.FileOutputStream

/**
 * WorkManager worker that uploads matched recordings to the server.
 * 
 * Can operate in two modes:
 * 1. Single recording mode - uploads a specific recording by ID
 * 2. Batch mode - uploads all pending recordings
 * 
 * Input data:
 * - recording_id: String? - Specific recording to upload (optional)
 * - call_log_id: String? - Associated call log ID (optional)
 * - batch_mode: Boolean - If true, upload all pending recordings
 * 
 * Output data:
 * - uploads_successful: Int
 * - uploads_failed: Int
 */
@HiltWorker
class RecordingUploadWorker @AssistedInject constructor(
    @Assisted private val context: Context,
    @Assisted params: WorkerParameters,
    private val apiService: KonCallApiService,
    private val callLogDao: CallLogDao,
    private val recordingDao: RecordingDao
) : CoroutineWorker(context, params) {
    
    companion object {
        private const val TAG = "RecordingUploadWorker"
        
        const val KEY_RECORDING_ID = "recording_id"
        const val KEY_CALL_LOG_ID = "call_log_id"
        const val KEY_BATCH_MODE = "batch_mode"
        
        // Retention period: 7 days after upload
        private const val RETENTION_DAYS = 7
        private const val RETENTION_MS = RETENTION_DAYS * 24 * 60 * 60 * 1000L
    }
    
    override suspend fun doWork(): Result {
        return try {
            val recordingId = inputData.getString(KEY_RECORDING_ID)
            val batchMode = inputData.getBoolean(KEY_BATCH_MODE, false)
            
            val (successful, failed) = if (batchMode || recordingId == null) {
                uploadPendingRecordings()
            } else {
                val result = uploadSingleRecording(recordingId)
                if (result) Pair(1, 0) else Pair(0, 1)
            }
            
            Log.d(TAG, "Upload complete: successful=$successful, failed=$failed")
            
            Result.success(
                workDataOf(
                    "uploads_successful" to successful,
                    "uploads_failed" to failed
                )
            )
        } catch (e: Exception) {
            Log.e(TAG, "Error in upload worker", e)
            
            if (runAttemptCount < 3) {
                Result.retry()
            } else {
                Result.failure()
            }
        }
    }
    
    /**
     * Upload a single recording by ID
     */
    private suspend fun uploadSingleRecording(recordingId: String): Boolean {
        val recording = recordingDao.getById(recordingId)
        if (recording == null) {
            Log.w(TAG, "Recording not found: $recordingId")
            return false
        }
        
        if (recording.matchedCallLogId == null) {
            Log.w(TAG, "Recording not matched to a call: $recordingId")
            return false
        }
        
        return uploadRecording(recording.id, Uri.parse(recording.uri), recording.matchedCallLogId)
    }
    
    /**
     * Upload all pending recordings
     */
    private suspend fun uploadPendingRecordings(): Pair<Int, Int> {
        // Get calls with recordings that need upload
        val pendingCalls = callLogDao.getCallsWithRecordingByStatus(RecordingSyncStatus.PENDING)
        
        var successful = 0
        var failed = 0
        
        for (call in pendingCalls) {
            val uri = call.recordingUri ?: continue
            
            // Must use serverId (backend's call_log ID) not local id
            val serverCallLogId = call.serverId
            if (serverCallLogId == null) {
                Log.w(TAG, "Call ${call.id} has no serverId, skipping upload")
                continue
            }
            
            val success = uploadRecording(
                recordingId = null,
                uri = Uri.parse(uri),
                callLogId = serverCallLogId
            )
            
            if (success) {
                successful++
            } else {
                failed++
            }
        }
        
        return Pair(successful, failed)
    }
    
    /**
     * Upload a recording file to the server
     */
    private suspend fun uploadRecording(
        recordingId: String?,
        uri: Uri,
        callLogId: String
    ): Boolean {
        try {
            // Update status to uploading
            callLogDao.updateRecordingUpload(callLogId, RecordingSyncStatus.UPLOADING, null)
            
            // Get file from URI
            val tempFile = copyToTempFile(uri) ?: run {
                Log.e(TAG, "Failed to create temp file for upload")
                callLogDao.updateRecordingUpload(callLogId, RecordingSyncStatus.FAILED, null)
                return false
            }
            
            try {
                // Create multipart request
                val mimeType = when (tempFile.extension.lowercase()) {
                    "m4a", "aac" -> "audio/mp4"
                    "mp3" -> "audio/mpeg"
                    "amr" -> "audio/amr"
                    "ogg" -> "audio/ogg"
                    "wav" -> "audio/wav"
                    else -> "audio/*"
                }.toMediaTypeOrNull()
                
                val requestBody = tempFile.asRequestBody(mimeType)
                val filePart = MultipartBody.Part.createFormData("file", tempFile.name, requestBody)
                val callLogIdBody = callLogId.toRequestBody("text/plain".toMediaTypeOrNull())
                
                // Upload to server with call_log_id
                val response = apiService.uploadRecording(filePart, callLogIdBody)
                
                if (response.isSuccessful) {
                    val uploadResponse = response.body()
                    val serverUrl = uploadResponse?.url
                    
                    if (serverUrl != null) {
                        // Update call log with server URL
                        callLogDao.updateRecordingUpload(
                            callLogId = callLogId,
                            status = RecordingSyncStatus.UPLOADED,
                            serverUrl = serverUrl
                        )
                        
                        // Update recording entity if we have it
                        if (recordingId != null) {
                            val deleteAt = System.currentTimeMillis() + RETENTION_MS
                            recordingDao.markUploaded(recordingId, UploadStatus.UPLOADED, serverUrl, deleteAt)
                        }
                        
                        Log.d(TAG, "Recording uploaded successfully: $serverUrl")
                        return true
                    }
                }
                
                Log.e(TAG, "Upload failed: ${response.code()} ${response.message()}")
                callLogDao.updateRecordingUpload(callLogId, RecordingSyncStatus.FAILED, null)
                
                if (recordingId != null) {
                    recordingDao.markUploadFailed(recordingId, UploadStatus.FAILED, response.message())
                }
                
                return false
                
            } finally {
                // Clean up temp file
                tempFile.delete()
            }
            
        } catch (e: Exception) {
            Log.e(TAG, "Error uploading recording", e)
            callLogDao.updateRecordingUpload(callLogId, RecordingSyncStatus.FAILED, null)
            return false
        }
    }
    
    /**
     * Copy content URI to temp file for upload
     */
    private fun copyToTempFile(uri: Uri): File? {
        return try {
            val inputStream = context.contentResolver.openInputStream(uri) ?: return null
            
            // Determine extension from URI or default to m4a
            val extension = uri.lastPathSegment?.substringAfterLast('.', "m4a") ?: "m4a"
            val tempFile = File.createTempFile("upload_", ".$extension", context.cacheDir)
            
            FileOutputStream(tempFile).use { output ->
                inputStream.copyTo(output)
            }
            inputStream.close()
            
            tempFile
        } catch (e: Exception) {
            Log.e(TAG, "Error copying URI to temp file", e)
            null
        }
    }
}
