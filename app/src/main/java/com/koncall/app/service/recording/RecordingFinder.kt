package com.koncall.app.service.recording

import android.content.Context
import android.database.Cursor
import android.net.Uri
import android.os.Build
import android.provider.DocumentsContract
import android.provider.MediaStore
import android.util.Log
import androidx.documentfile.provider.DocumentFile
import com.koncall.app.data.local.entity.RecordingEntity
import com.koncall.app.data.local.entity.UploadStatus
import java.io.File
import java.security.MessageDigest
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Finds call recordings from multiple sources:
 * 1. MediaStore (Android 11+) - System-indexed audio files
 * 2. SAF folder - User-selected recording directory
 * 3. File system - Direct path access (legacy/known paths)
 */
@Singleton
class RecordingFinder @Inject constructor(
    private val context: Context
) {
    companion object {
        private const val TAG = "RecordingFinder"
    }
    
    /**
     * Data class for discovered recordings before they're saved to database
     */
    data class DiscoveredRecording(
        val id: String,
        val uri: Uri,
        val fileName: String,
        val filePath: String?,
        val dateAdded: Long,
        val dateModified: Long,
        val mimeType: String?,
        val relativePath: String?,
        val size: Long
    ) {
        fun toEntity(): RecordingEntity {
            return RecordingEntity(
                id = id,
                uri = uri.toString(),
                fileName = fileName,
                filePath = filePath,
                dateAdded = dateAdded,
                dateModified = dateModified,
                mimeType = mimeType,
                relativePath = relativePath,
                size = size,
                uploadStatus = UploadStatus.PENDING
            )
        }
    }
    
    /**
     * Find all recordings from all available sources within a time range.
     * Combines results from MediaStore, SAF, and file system.
     */
    fun findRecordings(
        sinceTime: Long,
        untilTime: Long = System.currentTimeMillis(),
        safFolderUri: Uri? = null
    ): List<DiscoveredRecording> {
        val recordings = mutableListOf<DiscoveredRecording>()
        val seenIds = mutableSetOf<String>()
        
        // 1. Try MediaStore (most reliable on Android 11+)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            try {
                val mediaStoreRecordings = findFromMediaStore(sinceTime, untilTime)
                mediaStoreRecordings.forEach { recording ->
                    if (seenIds.add(recording.id)) {
                        recordings.add(recording)
                    }
                }
                Log.d(TAG, "Found ${mediaStoreRecordings.size} recordings from MediaStore")
            } catch (e: Exception) {
                Log.e(TAG, "Error querying MediaStore", e)
            }
        }
        
        // 2. Try SAF folder if provided
        safFolderUri?.let { uri ->
            try {
                val safRecordings = findFromSAF(uri, sinceTime, untilTime)
                safRecordings.forEach { recording ->
                    if (seenIds.add(recording.id)) {
                        recordings.add(recording)
                    }
                }
                Log.d(TAG, "Found ${safRecordings.size} recordings from SAF")
            } catch (e: Exception) {
                Log.e(TAG, "Error scanning SAF folder", e)
            }
        }
        
        // 3. Try known file system paths
        try {
            val fsRecordings = findFromKnownPaths(sinceTime, untilTime)
            fsRecordings.forEach { recording ->
                if (seenIds.add(recording.id)) {
                    recordings.add(recording)
                }
            }
            Log.d(TAG, "Found ${fsRecordings.size} recordings from file system")
        } catch (e: Exception) {
            Log.e(TAG, "Error scanning file system", e)
        }
        
        Log.d(TAG, "Total unique recordings found: ${recordings.size}")
        return recordings.sortedByDescending { it.dateAdded }
    }
    
    /**
     * Find recordings from MediaStore (Android 11+)
     * Queries the system's audio media database
     */
    fun findFromMediaStore(sinceTime: Long, untilTime: Long): List<DiscoveredRecording> {
        val recordings = mutableListOf<DiscoveredRecording>()
        
        val projection = arrayOf(
            MediaStore.Audio.Media._ID,
            MediaStore.Audio.Media.DISPLAY_NAME,
            MediaStore.Audio.Media.DATA,
            MediaStore.Audio.Media.DATE_ADDED,
            MediaStore.Audio.Media.DATE_MODIFIED,
            MediaStore.Audio.Media.MIME_TYPE,
            MediaStore.Audio.Media.SIZE
        ).plus(
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                arrayOf(MediaStore.Audio.Media.RELATIVE_PATH)
            } else {
                emptyArray()
            }
        )
        
        // MediaStore uses seconds, not milliseconds
        val sinceSeconds = sinceTime / 1000
        val untilSeconds = untilTime / 1000
        
        val selection = "${MediaStore.Audio.Media.DATE_ADDED} >= ? AND ${MediaStore.Audio.Media.DATE_ADDED} <= ?"
        val selectionArgs = arrayOf(sinceSeconds.toString(), untilSeconds.toString())
        val sortOrder = "${MediaStore.Audio.Media.DATE_ADDED} DESC"
        
        context.contentResolver.query(
            MediaStore.Audio.Media.EXTERNAL_CONTENT_URI,
            projection,
            selection,
            selectionArgs,
            sortOrder
        )?.use { cursor ->
            while (cursor.moveToNext()) {
                val recording = cursorToRecording(cursor)
                if (recording != null && isLikelyCallRecording(recording)) {
                    recordings.add(recording)
                }
            }
        }
        
        return recordings
    }
    
    /**
     * Find recordings from SAF (Storage Access Framework) folder
     */
    fun findFromSAF(treeUri: Uri, sinceTime: Long, untilTime: Long): List<DiscoveredRecording> {
        val recordings = mutableListOf<DiscoveredRecording>()
        
        val documentFile = DocumentFile.fromTreeUri(context, treeUri) ?: return recordings
        
        scanDocumentTree(documentFile, sinceTime, untilTime, recordings)
        
        return recordings
    }
    
    /**
     * Find recordings from known OEM recording paths
     */
    fun findFromKnownPaths(sinceTime: Long, untilTime: Long): List<DiscoveredRecording> {
        val recordings = mutableListOf<DiscoveredRecording>()
        
        val validPaths = CommonRecordingPaths.getAllValidPaths()
        
        for (path in validPaths) {
            val dir = File(path)
            if (dir.isDirectory && dir.canRead()) {
                scanDirectory(dir, sinceTime, untilTime, recordings, maxDepth = 2)
            }
        }
        
        return recordings
    }
    
    /**
     * Find a single recording closest to a specific call time
     */
    fun findRecordingForCall(
        callEndTime: Long,
        phoneNumber: String?,
        safFolderUri: Uri? = null
    ): DiscoveredRecording? {
        // Search in a window from call end to 1 minute after
        val startTime = callEndTime - 5000  // 5 seconds before
        val endTime = callEndTime + 60000   // 1 minute after
        
        val recordings = findRecordings(startTime, endTime, safFolderUri)
        
        if (recordings.isEmpty()) return null
        
        // If phone number is provided, prefer recordings with that number in filename
        val normalizedNumber = phoneNumber?.let { RecordingMatcher.normalizePhoneNumber(it) }
        
        // Sort by: 1) phone number match, 2) closest timestamp
        return recordings.minByOrNull { recording ->
            var score = 0L
            
            // Penalize if phone number doesn't match
            if (normalizedNumber != null && 
                !RecordingMatcher.filenameContainsNumber(recording.fileName, normalizedNumber)) {
                score += 100000 // Large penalty
            }
            
            // Add timestamp difference
            score += kotlin.math.abs(recording.dateAdded - callEndTime)
            
            score
        }
    }
    
    // ===== Private helper methods =====
    
    private fun cursorToRecording(cursor: Cursor): DiscoveredRecording? {
        return try {
            val id = cursor.getLong(cursor.getColumnIndexOrThrow(MediaStore.Audio.Media._ID))
            val displayName = cursor.getString(cursor.getColumnIndexOrThrow(MediaStore.Audio.Media.DISPLAY_NAME))
            val data = cursor.getStringOrNull(cursor.getColumnIndex(MediaStore.Audio.Media.DATA))
            val dateAdded = cursor.getLong(cursor.getColumnIndexOrThrow(MediaStore.Audio.Media.DATE_ADDED)) * 1000 // Convert to millis
            val dateModified = cursor.getLong(cursor.getColumnIndexOrThrow(MediaStore.Audio.Media.DATE_MODIFIED)) * 1000
            val mimeType = cursor.getStringOrNull(cursor.getColumnIndex(MediaStore.Audio.Media.MIME_TYPE))
            val size = cursor.getLong(cursor.getColumnIndexOrThrow(MediaStore.Audio.Media.SIZE))
            
            val relativePath = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                cursor.getStringOrNull(cursor.getColumnIndex(MediaStore.Audio.Media.RELATIVE_PATH))
            } else {
                null
            }
            
            val uri = Uri.withAppendedPath(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, id.toString())
            
            DiscoveredRecording(
                id = "mediastore_$id",
                uri = uri,
                fileName = displayName ?: "unknown",
                filePath = data,
                dateAdded = dateAdded,
                dateModified = dateModified,
                mimeType = mimeType,
                relativePath = relativePath,
                size = size
            )
        } catch (e: Exception) {
            Log.e(TAG, "Error parsing cursor row", e)
            null
        }
    }
    
    private fun scanDocumentTree(
        documentFile: DocumentFile,
        sinceTime: Long,
        untilTime: Long,
        recordings: MutableList<DiscoveredRecording>,
        depth: Int = 0
    ) {
        if (depth > 3) return // Limit recursion
        
        documentFile.listFiles().forEach { file ->
            if (file.isDirectory) {
                scanDocumentTree(file, sinceTime, untilTime, recordings, depth + 1)
            } else if (file.isFile) {
                val lastModified = file.lastModified()
                if (lastModified in sinceTime..untilTime) {
                    val recording = documentFileToRecording(file)
                    if (recording != null && isLikelyCallRecording(recording)) {
                        recordings.add(recording)
                    }
                }
            }
        }
    }
    
    private fun documentFileToRecording(file: DocumentFile): DiscoveredRecording? {
        val uri = file.uri
        val name = file.name ?: return null
        val size = file.length()
        val lastModified = file.lastModified()
        val mimeType = file.type
        
        return DiscoveredRecording(
            id = "saf_${md5Hash(uri.toString())}",
            uri = uri,
            fileName = name,
            filePath = null, // SAF doesn't expose file path
            dateAdded = lastModified,
            dateModified = lastModified,
            mimeType = mimeType,
            relativePath = null,
            size = size
        )
    }
    
    private fun scanDirectory(
        dir: File,
        sinceTime: Long,
        untilTime: Long,
        recordings: MutableList<DiscoveredRecording>,
        maxDepth: Int,
        currentDepth: Int = 0
    ) {
        if (currentDepth >= maxDepth || !dir.isDirectory || !dir.canRead()) return
        
        dir.listFiles()?.forEach { file ->
            if (file.isDirectory) {
                scanDirectory(file, sinceTime, untilTime, recordings, maxDepth, currentDepth + 1)
            } else if (file.isFile && CommonRecordingPaths.isAudioFile(file.name)) {
                val lastModified = file.lastModified()
                if (lastModified in sinceTime..untilTime) {
                    val recording = fileToRecording(file)
                    if (isLikelyCallRecording(recording)) {
                        recordings.add(recording)
                    }
                }
            }
        }
    }
    
    private fun fileToRecording(file: File): DiscoveredRecording {
        val uri = Uri.fromFile(file)
        val mimeType = when (file.extension.lowercase()) {
            "m4a", "aac" -> "audio/mp4"
            "mp3" -> "audio/mpeg"
            "amr" -> "audio/amr"
            "ogg" -> "audio/ogg"
            "wav" -> "audio/wav"
            else -> "audio/*"
        }
        
        return DiscoveredRecording(
            id = "file_${md5Hash(file.absolutePath)}",
            uri = uri,
            fileName = file.name,
            filePath = file.absolutePath,
            dateAdded = file.lastModified(),
            dateModified = file.lastModified(),
            mimeType = mimeType,
            relativePath = file.parentFile?.name,
            size = file.length()
        )
    }
    
    /**
     * Check if a recording is likely a call recording based on path and filename
     */
    private fun isLikelyCallRecording(recording: DiscoveredRecording): Boolean {
        val fileName = recording.fileName.lowercase()
        val path = (recording.filePath ?: recording.relativePath ?: "").lowercase()
        
        // Keywords that indicate call recording
        val callKeywords = listOf("call", "record", "rec_", "phone", "voice")
        
        // Check if path or filename contains call-related keywords
        val hasCallKeyword = callKeywords.any { keyword ->
            fileName.contains(keyword) || path.contains(keyword)
        }
        
        // Check if it's a valid audio file
        val isAudio = CommonRecordingPaths.isAudioFile(recording.fileName)
        
        // Check minimum size (at least 10KB for a valid recording)
        val hasMinimumSize = recording.size > 10_000
        
        return isAudio && hasMinimumSize && (hasCallKeyword || path.contains("miui/sound_recorder"))
    }
    
    private fun md5Hash(input: String): String {
        val md = MessageDigest.getInstance("MD5")
        val digest = md.digest(input.toByteArray())
        return digest.joinToString("") { "%02x".format(it) }
    }
    
    private fun Cursor.getStringOrNull(columnIndex: Int): String? {
        return if (columnIndex >= 0 && !isNull(columnIndex)) getString(columnIndex) else null
    }
}
