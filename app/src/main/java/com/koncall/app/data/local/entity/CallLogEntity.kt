package com.koncall.app.data.local.entity

import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(
    tableName = "call_logs",
    indices = [
        Index(value = ["phoneNumber"]),
        Index(value = ["callDateTime"]),
        Index(value = ["syncStatus"]),
        Index(value = ["appInitiated"])
    ]
)
data class CallLogEntity(
    @PrimaryKey
    val id: String = java.util.UUID.randomUUID().toString(),
    val deviceCallId: Long,           // Original Android call log ID
    val phoneNumber: String,
    val contactName: String?,
    val callType: String,             // INCOMING, OUTGOING, MISSED, REJECTED
    val duration: Int = 0,            // seconds
    val callDateTime: Long,           // timestamp millis
    val simNumber: String? = null,
    val simSlot: Int? = null,
    
    // App-initiated call tracking (Education CRM)
    val appInitiated: Boolean = false, // True if call was made via app's Call button
    
    // Sync status
    val syncStatus: String = SyncStatus.PENDING,
    val serverId: String? = null,
    
    // Recording info
    val hasNote: Boolean = false,
    val hasRecording: Boolean = false,
    val recordingPath: String? = null,
    
    // Lead connection
    val leadId: String? = null,
    
    val createdAt: Long = System.currentTimeMillis(),
    val updatedAt: Long = System.currentTimeMillis()
)

object SyncStatus {
    const val PENDING = "pending"
    const val SYNCING = "syncing"
    const val SYNCED = "synced"
    const val FAILED = "failed"
}

object CallType {
    const val INCOMING = "incoming"
    const val OUTGOING = "outgoing"
    const val MISSED = "missed"
    const val REJECTED = "rejected"
}
