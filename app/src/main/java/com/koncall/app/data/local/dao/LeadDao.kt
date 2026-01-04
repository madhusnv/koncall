package com.koncall.app.data.local.dao

import androidx.room.*
import com.koncall.app.data.local.entity.LeadEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface LeadDao {
    
    @Query("SELECT * FROM leads ORDER BY updatedAt DESC")
    fun getAllLeads(): Flow<List<LeadEntity>>
    
    @Query("SELECT * FROM leads WHERE id = :id")
    suspend fun getLeadById(id: String): LeadEntity?
    
    @Query("SELECT * FROM leads WHERE id = :id")
    fun getLeadByIdFlow(id: String): Flow<LeadEntity?>
    
    @Query("SELECT * FROM leads WHERE phoneNumber = :phoneNumber OR alternatePhone = :phoneNumber LIMIT 1")
    suspend fun getLeadByPhoneNumber(phoneNumber: String): LeadEntity?
    
    @Query("SELECT * FROM leads WHERE " +
           "SUBSTR(REPLACE(REPLACE(REPLACE(phoneNumber, ' ', ''), '-', ''), '+', ''), -10) = :last10Digits " +
           "OR SUBSTR(REPLACE(REPLACE(REPLACE(alternatePhone, ' ', ''), '-', ''), '+', ''), -10) = :last10Digits " +
           "LIMIT 1")
    suspend fun getLeadByNormalizedPhone(last10Digits: String): LeadEntity?
    
    @Query("SELECT * FROM leads WHERE syncStatus = :status")
    suspend fun getLeadsBySyncStatus(status: String): List<LeadEntity>
    
    @Query("SELECT * FROM leads WHERE stage = :stage ORDER BY updatedAt DESC")
    fun getLeadsByStage(stage: String): Flow<List<LeadEntity>>
    
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertLead(lead: LeadEntity): Long
    
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertLeads(leads: List<LeadEntity>)
    
    @Update
    suspend fun updateLead(lead: LeadEntity)
    
    @Query("UPDATE leads SET stage = :stage, updatedAt = :updatedAt WHERE id = :leadId")
    suspend fun updateLeadStage(leadId: String, stage: String, updatedAt: Long = System.currentTimeMillis())
    
    @Query("UPDATE leads SET reminderAt = :reminderAt, updatedAt = :updatedAt WHERE id = :leadId")
    suspend fun updateReminder(leadId: String, reminderAt: Long?, updatedAt: Long = System.currentTimeMillis())
    
    @Delete
    suspend fun deleteLead(lead: LeadEntity)
    
    @Query("DELETE FROM leads")
    suspend fun deleteAll()
    
    @Query("SELECT COUNT(*) FROM leads WHERE reminderAt IS NOT NULL AND reminderAt <= :currentTime")
    suspend fun getPendingRemindersCount(currentTime: Long = System.currentTimeMillis()): Int
}
