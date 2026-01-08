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
import dagger.assisted.Assisted
import dagger.assisted.AssistedInject

/**
 * WorkManager worker that discovers and matches call recordings.
 * 
 * Triggered after a call ends with a delay to allow OEM dialer to save recording.
 * 
 * Input data:
 * - call_end_time: Long - When the call ended (milliseconds)
 * - phone_number: String? - Phone number of the call (optional)
 * - saf_folder_uri: String? - User's selected recording folder URI (optional)
 * 
 * Output data:
 * - recordings_found: Int - Number of recordings discovered
 * - recordings_matched: Int - Number of recordings matched to calls
 */
@HiltWorker
class RecordingFinderWorker @AssistedInject constructor(
    @Assisted private val context: Context,
    @Assisted params: WorkerParameters,
    private val recordingFinder: RecordingFinder,
    private val callLogDao: CallLogDao,
    private val recordingDao: RecordingDao,
    private val preferencesManager: com.koncall.app.data.local.PreferencesManager
) : CoroutineWorker(context, params) {
    
    companion object {
        private const val TAG = "RecordingFinderWorker"
        
        // Input data keys
        const val KEY_CALL_END_TIME = "call_end_time"
        const val KEY_PHONE_NUMBER = "phone_number"
        const val KEY_SAF_FOLDER_URI = "saf_folder_uri"
        const val KEY_SCAN_ALL_RECENT = "scan_all_recent"
        
        // Time windows
        private const val SINGLE_CALL_WINDOW_MS = 60_000L  // 1 minute for single call
        private const val BATCH_SCAN_WINDOW_MS = 3_600_000L // 1 hour for batch scan
    }
    
    override suspend fun doWork(): Result {
        return try {
            Log.d(TAG, "Starting recording finder work")
            
            val callEndTime = inputData.getLong(KEY_CALL_END_TIME, 0L)
            val phoneNumber = inputData.getString(KEY_PHONE_NUMBER)
            var safFolderUriStr = inputData.getString(KEY_SAF_FOLDER_URI)
            val scanAllRecent = inputData.getBoolean(KEY_SCAN_ALL_RECENT, false)
            
            // If SAF URI is missing from input, try to get it from preferences
            if (safFolderUriStr == null) {
                safFolderUriStr = preferencesManager.getRecordingFolderUri()?.toString()
                if (safFolderUriStr != null) {
                    Log.d(TAG, "Using SAF URI from preferences: $safFolderUriStr")
                }
            }
            
            val safFolderUri = safFolderUriStr?.let { Uri.parse(it) }
            
            val (found, matched) = if (scanAllRecent || callEndTime == 0L) {
                // Batch scan for all recent unmatched calls
                scanAndMatchRecentRecordings(safFolderUri)
            } else {
                // Single call mode - look for recording for specific call
                scanForSpecificCall(callEndTime, phoneNumber, safFolderUri)
            }
            
            Log.d(TAG, "Recording finder complete: found=$found, matched=$matched")
            
            // Trigger upload if we matched any recordings
            if (matched > 0) {
                triggerUploadWorker()
            }
            
            Result.success(
                workDataOf(
                    "recordings_found" to found,
                    "recordings_matched" to matched
                )
            )
        } catch (e: Exception) {
            Log.e(TAG, "Error in recording finder worker", e)
            
            if (runAttemptCount < 3) {
                Result.retry()
            } else {
                Result.failure()
            }
        }
    }

    private fun triggerUploadWorker() {
        try {
            // Add delay to ensure SyncWorker has completed and saved serverId
            val request = androidx.work.OneTimeWorkRequestBuilder<RecordingUploadWorker>()
                .setInitialDelay(15, java.util.concurrent.TimeUnit.SECONDS)
                .setConstraints(
                    androidx.work.Constraints.Builder()
                        .setRequiredNetworkType(androidx.work.NetworkType.CONNECTED)
                        .build()
                )
                .build()
            
            androidx.work.WorkManager.getInstance(context).enqueue(request)
            Log.d(TAG, "Triggered RecordingUploadWorker (15s delay)")
        } catch (e: Exception) {
            Log.e(TAG, "Failed to trigger upload worker", e)
        }
    }
    
    /**
     * Scan for a recording that matches a specific call
     */
    private suspend fun scanForSpecificCall(
        callEndTime: Long,
        phoneNumber: String?,
        safFolderUri: Uri?
    ): Pair<Int, Int> {
        // Widen search window: check 2 minutes before call end to catch early writes
        val startTime = callEndTime - 120_000 
        val endTime = callEndTime + SINGLE_CALL_WINDOW_MS
        
        // Find recordings in time window
        val discoveries = recordingFinder.findRecordings(startTime, endTime, safFolderUri)
        Log.d(TAG, "Found ${discoveries.size} recordings in single-call window")
        
        if (discoveries.isEmpty()) {
            return Pair(0, 0)
        }
        
        // Save discovered recordings to database
        saveDiscoveredRecordings(discoveries)
        
        // Get the call that triggered this search
        val calls = callLogDao.getCallsWithoutRecording(startTime, endTime)
        if (calls.isEmpty()) {
            return Pair(discoveries.size, 0)
        }
        
        // Convert discoveries to RecordingInfo for matching
        // CRITICAL: Filter out recordings that are already matched to prevent duplicates
        val unmatchedRecordingInfos = discoveries.mapNotNull { d ->
            // Check if this recording is already linked to a call
            val exists = recordingDao.getById(d.id)
            if (exists?.matchedCallLogId != null) {
                Log.d(TAG, "Skipping already-matched recording: ${d.fileName} (linked to call ${exists.matchedCallLogId})")
                null  // Skip this recording
            } else {
                // Recording is not matched yet, include it
                RecordingMatcher.RecordingInfo(
                    id = d.id,
                    fileName = d.fileName,
                    dateAdded = d.dateAdded,
                    size = d.size
                )
            }
        }
        
        if (unmatchedRecordingInfos.isEmpty()) {
            Log.d(TAG, "All ${discoveries.size} recordings are already matched, skipping matcher")
            return Pair(discoveries.size, 0)
        }
        
        Log.d(TAG, "Running matcher on ${unmatchedRecordingInfos.size} unmatched recordings (${discoveries.size - unmatchedRecordingInfos.size} were already matched)")
        
        // Run matching algorithm
        val matches = RecordingMatcher.findMatches(calls, unmatchedRecordingInfos)
        
        // Update database with matches
        var matchedCount = 0
        matches.forEach { (callId, matchResult) ->
            try {
                val discovery = discoveries.first { it.id == matchResult.recording.id }
                
                // Update call log with recording info
                callLogDao.linkRecording(
                    callLogId = callId,
                    uri = discovery.uri.toString(),
                    fileName = discovery.fileName,
                    mimeType = discovery.mimeType,
                    size = discovery.size,
                    syncStatus = RecordingSyncStatus.PENDING
                )
                
                // Update recording with call link
                recordingDao.linkToCall(
                    recordingId = matchResult.recording.id,
                    callLogId = callId,
                    score = matchResult.score
                )
                
                matchedCount++
                Log.d(TAG, "Matched recording ${discovery.fileName} to call $callId (score: ${matchResult.score})")
                matchResult.reasons.forEach { reason ->
                    Log.v(TAG, "  - $reason")
                }
            } catch (e: Exception) {
                Log.e(TAG, "Error linking recording to call", e)
            }
        }
        
        return Pair(discoveries.size, matchedCount)
    }
    
    /**
     * Scan for all recent recordings and match to unmatched calls
     */
    private suspend fun scanAndMatchRecentRecordings(safFolderUri: Uri?): Pair<Int, Int> {
        val endTime = System.currentTimeMillis()
        val startTime = endTime - BATCH_SCAN_WINDOW_MS
        
        // Find all recordings in the window
        val discoveries = recordingFinder.findRecordings(startTime, endTime, safFolderUri)
        Log.d(TAG, "Found ${discoveries.size} recordings in batch scan")
        
        if (discoveries.isEmpty()) {
            return Pair(0, 0)
        }
        
        // Save discovered recordings
        saveDiscoveredRecordings(discoveries)
        
        // Get all unmatched calls that could have recordings
        val calls = callLogDao.getRecentCallsNeedingRecording(50)
        if (calls.isEmpty()) {
            return Pair(discoveries.size, 0)
        }
        
        Log.d(TAG, "Found ${calls.size} calls needing recording match")
        
        // Convert discoveries to RecordingInfo
        val recordingInfos = discoveries.map { d ->
            RecordingMatcher.RecordingInfo(
                id = d.id,
                fileName = d.fileName,
                dateAdded = d.dateAdded,
                size = d.size
            )
        }
        
        // Run matching
        val matches = RecordingMatcher.findMatches(calls, recordingInfos)
        
        // Update database
        var matchedCount = 0
        matches.forEach { (callId, matchResult) ->
            try {
                val discovery = discoveries.first { it.id == matchResult.recording.id }
                
                callLogDao.linkRecording(
                    callLogId = callId,
                    uri = discovery.uri.toString(),
                    fileName = discovery.fileName,
                    mimeType = discovery.mimeType,
                    size = discovery.size,
                    syncStatus = RecordingSyncStatus.PENDING
                )
                
                recordingDao.linkToCall(
                    recordingId = matchResult.recording.id,
                    callLogId = callId,
                    score = matchResult.score
                )
                
                matchedCount++
                Log.d(TAG, "Matched recording ${discovery.fileName} to call $callId")
            } catch (e: Exception) {
                Log.e(TAG, "Error linking recording to call", e)
            }
        }
        
        return Pair(discoveries.size, matchedCount)
    }
    
    /**
     * Save discovered recordings to database (skip if already exists).
     * Helper method to avoid code duplication.
     */
    private suspend fun saveDiscoveredRecordings(discoveries: List<RecordingFinder.DiscoveredRecording>) {
        discoveries.forEach { discovery ->
            val existing = recordingDao.getById(discovery.id)
            if (existing == null) {
                recordingDao.insert(discovery.toEntity())
            }
        }
    }
}
