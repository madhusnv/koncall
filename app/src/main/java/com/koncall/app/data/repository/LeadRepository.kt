package com.koncall.app.data.repository

import com.koncall.app.data.local.dao.LeadDao
import com.koncall.app.data.local.entity.LeadEntity
import com.koncall.app.data.local.entity.LeadStage
import com.koncall.app.data.local.entity.SyncStatus
import com.koncall.app.data.remote.api.KonCallApiService
import com.koncall.app.data.remote.dto.CreateLeadRequest
import com.koncall.app.data.remote.dto.LeadDto
import com.koncall.app.data.remote.dto.UpdateLeadRequest
import com.koncall.app.data.remote.dto.UpdateStageRequest
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class LeadRepository @Inject constructor(
    private val leadDao: LeadDao,
    private val apiService: KonCallApiService
) {
    fun getAllLeads(): Flow<List<LeadEntity>> = leadDao.getAllLeads()
    
    fun getLeadById(id: String): Flow<LeadEntity?> = leadDao.getLeadByIdFlow(id)
    
    suspend fun getLeadByIdOnce(id: String): LeadEntity? = leadDao.getLeadById(id)
    
    suspend fun getLeadByPhoneNumber(phoneNumber: String): LeadEntity? = 
        leadDao.getLeadByPhoneNumber(phoneNumber)
    
    suspend fun syncLeadsFromServer(): Result<Int> {
        return try {
            val response = apiService.getLeads()
            if (response.isSuccessful) {
                val leads = response.body()?.data?.map { it.toEntity() } ?: emptyList()
                leadDao.insertLeads(leads)
                Result.success(leads.size)
            } else {
                Result.failure(Exception("Failed to fetch leads: ${response.code()}"))
            }
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
    
    suspend fun createLead(request: CreateLeadRequest): Result<LeadEntity> {
        return try {
            val response = apiService.createLead(request)
            if (response.isSuccessful) {
                val lead = response.body()?.data?.toEntity()
                    ?: return Result.failure(Exception("No data returned"))
                leadDao.insertLead(lead)
                Result.success(lead)
            } else {
                Result.failure(Exception("Failed to create lead: ${response.code()}"))
            }
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
    
    suspend fun updateLead(id: String, request: UpdateLeadRequest): Result<LeadEntity> {
        return try {
            val response = apiService.updateLead(id, request)
            if (response.isSuccessful) {
                val lead = response.body()?.data?.toEntity()
                    ?: return Result.failure(Exception("No data returned"))
                leadDao.updateLead(lead)
                Result.success(lead)
            } else {
                Result.failure(Exception("Failed to update lead: ${response.code()}"))
            }
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
    
    /**
     * Update lead stage (Education CRM)
     */
    suspend fun updateLeadStage(leadId: String, newStage: String): Result<LeadEntity> {
        return try {
            // Update locally first for instant feedback
            leadDao.updateLeadStage(leadId, newStage)
            
            // Sync to server
            val request = UpdateStageRequest(stage = newStage)
            val response = apiService.updateLeadStage(leadId, request)
            if (response.isSuccessful) {
                val lead = response.body()?.data?.toEntity()
                if (lead != null) {
                    leadDao.updateLead(lead)
                    Result.success(lead)
                } else {
                    // Server returned OK but no data - keep local change
                    val localLead = leadDao.getLeadById(leadId)
                    Result.success(localLead ?: throw Exception("Lead not found"))
                }
            } else {
                // Revert local change on failure
                Result.failure(Exception("Failed to update stage: ${response.code()}"))
            }
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
    
    private fun LeadDto.toEntity(): LeadEntity {
        return LeadEntity(
            id = id,
            firstName = firstName,
            lastName = lastName,
            studentName = studentName,
            phoneNumber = phoneNumber,
            alternatePhone = alternatePhone,
            email = email,
            statusId = status?.id,
            statusName = status?.name,
            statusColor = status?.color,
            stage = stage ?: LeadStage.NEW,
            branchId = branchId,
            branchName = branchName,
            universityId = universityId,
            universityName = universityName,
            tags = tags?.joinToString(",") ?: "",
            reminderAt = reminderAt?.let { parseDateTime(it) },
            lastContactedAt = lastContactedAt?.let { parseDateTime(it) },
            contactCount = contactCount,
            assignedToId = assignedTo?.id,
            assignedToName = assignedTo?.name,
            notes = notes,
            syncStatus = SyncStatus.SYNCED,
            updatedAt = System.currentTimeMillis()
        )
    }
    
    private fun parseDateTime(dateString: String): Long? {
        return try {
            java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", java.util.Locale.US)
                .parse(dateString)?.time
        } catch (e: Exception) {
            null
        }
    }
}
