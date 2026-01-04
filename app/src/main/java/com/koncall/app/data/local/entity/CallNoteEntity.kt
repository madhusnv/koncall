package com.koncall.app.data.local.entity

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(
    tableName = "call_notes",
    indices = [Index(value = ["callLogId"])],
    foreignKeys = [
        ForeignKey(
            entity = CallLogEntity::class,
            parentColumns = ["id"],
            childColumns = ["callLogId"],
            onDelete = ForeignKey.CASCADE
        )
    ]
)
data class CallNoteEntity(
    @PrimaryKey
    val id: String = java.util.UUID.randomUUID().toString(),
    val callLogId: String,
    val content: String,
    val syncStatus: String = SyncStatus.PENDING,
    val serverId: String? = null,
    val createdAt: Long = System.currentTimeMillis()
)
