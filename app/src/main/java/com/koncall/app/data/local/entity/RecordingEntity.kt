package com.koncall.app.data.local.entity

import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

/**
 * Entity representing a discovered call recording.
 * 
 * Recordings are found by scanning:
 * 1. MediaStore (Android 11+)
 * 2. SAF folder (user-selected)
 * 3. Common OEM recording paths
 */
@Entity(
    tableName = "recordings",
    indices = [
        Index(value = ["dateAdded"]),
        Index(value = ["matchedCallLogId"]),
        Index(value = ["uploadStatus"])
    ]
)
data class RecordingEntity(
    @PrimaryKey
    val id: String,                         // MediaStore ID or file path hash
    val uri: String,                        // Content URI (content:// or file://)
    val fileName: String,
    val filePath: String?,                  // Absolute file path (if available)
    val dateAdded: Long,                    // When file was created (millis)
    val dateModified: Long,                 // When file was last modified
    val mimeType: String?,                  // audio/mpeg, audio/aac, etc.
    val relativePath: String?,              // e.g., "Recordings/Call/"
    val size: Long,                         // File size in bytes
    
    // Matching info
    val matchedCallLogId: String? = null,   // Linked call log entry ID
    val matchScore: Int = 0,                // Matching confidence score
    val matchedAt: Long? = null,            // When recording was matched
    
    // Upload info
    val uploadStatus: String = UploadStatus.PENDING,
    val uploadAttempts: Int = 0,
    val lastUploadAttempt: Long? = null,
    val serverUrl: String? = null,          // URL after successful upload
    val uploadError: String? = null,        // Error message if upload failed
    
    // Retention
    val createdAt: Long = System.currentTimeMillis(),
    val scheduledForDeletion: Long? = null  // When to auto-delete (7 days after upload)
)

object UploadStatus {
    const val PENDING = "pending"
    const val UPLOADING = "uploading"
    const val UPLOADED = "uploaded"
    const val FAILED = "failed"
    const val SKIPPED = "skipped"           // e.g., file too large, invalid format
}
