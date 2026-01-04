package com.koncall.app.data.local.entity

import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(
    tableName = "leads",
    indices = [
        Index(value = ["phoneNumber"]),
        Index(value = ["syncStatus"]),
        Index(value = ["stage"]),
        Index(value = ["branchId"]),
        Index(value = ["universityId"])
    ]
)
data class LeadEntity(
    @PrimaryKey
    val id: String,
    val firstName: String? = null,
    val lastName: String? = null,
    val studentName: String? = null,  // Simplified name for education CRM
    val phoneNumber: String,
    val alternatePhone: String? = null,
    val email: String? = null,
    
    // Status (legacy - for backward compatibility)
    val statusId: String? = null,
    val statusName: String? = null,
    val statusColor: String? = null,
    
    // Education CRM: Lead Stage
    val stage: String = LeadStage.NEW,
    
    // Branch and University
    val branchId: String? = null,
    val branchName: String? = null,
    val universityId: String? = null,
    val universityName: String? = null,
    
    // Tags and notes
    val tags: String = "[]",  // JSON array stored as string
    val notes: String? = null,
    
    // Follow-up reminder
    val reminderAt: Long? = null,
    
    // Contact tracking
    val lastContactedAt: Long? = null,
    val contactCount: Int = 0,
    
    // Assignment
    val assignedToId: String? = null,
    val assignedToName: String? = null,
    
    // Sync
    val syncStatus: String = SyncStatus.SYNCED,
    val updatedAt: Long = System.currentTimeMillis()
) {
    val displayName: String
        get() = studentName ?: listOfNotNull(firstName, lastName).joinToString(" ").ifEmpty { "Unknown" }
    
    val fullName: String
        get() = listOfNotNull(firstName, lastName).joinToString(" ")
}

/**
 * Lead stages for education CRM funnel
 */
object LeadStage {
    const val NEW = "new"
    const val CONTACTED = "contacted"
    const val INTERESTED = "interested"
    const val APPLICATION_SUBMITTED = "application_submitted"
    const val DOCUMENTS_COLLECTED = "documents_collected"
    const val ENROLLED = "enrolled"
    const val JOINED = "joined"
    
    val ALL_STAGES = listOf(
        NEW, CONTACTED, INTERESTED, APPLICATION_SUBMITTED, 
        DOCUMENTS_COLLECTED, ENROLLED, JOINED
    )
    
    fun displayName(stage: String): String = when (stage) {
        NEW -> "New"
        CONTACTED -> "Contacted"
        INTERESTED -> "Interested"
        APPLICATION_SUBMITTED -> "Application"
        DOCUMENTS_COLLECTED -> "Documents"
        ENROLLED -> "Enrolled"
        JOINED -> "Joined"
        else -> stage.replaceFirstChar { it.uppercase() }
    }
}
