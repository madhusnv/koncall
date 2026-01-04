package com.koncall.app.ui.leads

import android.content.ContentResolver
import android.net.Uri
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.koncall.app.data.local.entity.LeadEntity
import com.koncall.app.data.remote.api.KonCallApiService
import com.koncall.app.data.remote.dto.CreateLeadRequest
import com.koncall.app.data.remote.dto.ImportLeadsRequest
import com.koncall.app.data.remote.dto.UserForAssignmentDto
import com.koncall.app.data.repository.LeadRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.io.BufferedReader
import java.io.InputStreamReader
import javax.inject.Inject

data class CsvImportState(
    val isImporting: Boolean = false,
    val totalRows: Int = 0,
    val importedCount: Int = 0,
    val failedCount: Int = 0,
    val error: String? = null,
    val isComplete: Boolean = false
)

data class AdminImportState(
    val isLoadingUsers: Boolean = false,
    val users: List<UserForAssignmentDto> = emptyList(),
    val selectedUserIds: List<String> = emptyList(),
    val csvContent: String? = null,
    val isImporting: Boolean = false,
    val importResult: ImportResult? = null
)

data class ImportResult(
    val success: Boolean,
    val total: Int,
    val imported: Int,
    val failed: Int,
    val errors: List<String>
)

data class LeadsUiState(
    val isLoading: Boolean = false,
    val leads: List<LeadEntity> = emptyList(),
    val error: String? = null,
    val importState: CsvImportState = CsvImportState(),
    val adminImportState: AdminImportState = AdminImportState()
)

@HiltViewModel
class LeadsViewModel @Inject constructor(
    private val leadRepository: LeadRepository,
    private val apiService: KonCallApiService
) : ViewModel() {

    private val _uiState = MutableStateFlow(LeadsUiState())
    val uiState: StateFlow<LeadsUiState> = _uiState

    init {
        loadLeads()
        syncLeadsFromServer()
    }

    private fun loadLeads() {
        viewModelScope.launch {
            leadRepository.getAllLeads().collectLatest { leads ->
                _uiState.value = _uiState.value.copy(
                    isLoading = false,
                    leads = leads
                )
            }
        }
    }

    fun syncLeadsFromServer() {
        viewModelScope.launch {
            _uiState.value = _uiState.value.copy(isLoading = true)
            leadRepository.syncLeadsFromServer()
        }
    }

    /**
     * Get a single lead by ID as a Flow
     */
    fun getLeadById(leadId: String) = leadRepository.getLeadById(leadId)

    /**
     * Create a new lead with student name (Education CRM)
     */
    fun createLead(studentName: String, phoneNumber: String) {
        viewModelScope.launch {
            _uiState.value = _uiState.value.copy(isLoading = true)
            val request = CreateLeadRequest(
                firstName = studentName,  // Using firstName field for backward compat
                lastName = null,
                phoneNumber = phoneNumber,
                studentName = studentName
            )
            leadRepository.createLead(request)
                .onSuccess { 
                    _uiState.value = _uiState.value.copy(isLoading = false)
                }
                .onFailure { error ->
                    _uiState.value = _uiState.value.copy(
                        isLoading = false,
                        error = error.message
                    )
                }
        }
    }

    /**
     * Update lead stage in the funnel
     */
    fun updateLeadStage(leadId: String, newStage: String) {
        viewModelScope.launch {
            leadRepository.updateLeadStage(leadId, newStage)
        }
    }
    
    /**
     * Set a follow-up reminder for a lead
     */
    fun setReminder(leadId: String, reminderAt: Long) {
        viewModelScope.launch {
            leadRepository.setReminder(leadId, reminderAt)
        }
    }
    
    /**
     * Clear the follow-up reminder for a lead
     */
    fun clearReminder(leadId: String) {
        viewModelScope.launch {
            leadRepository.setReminder(leadId, null)
        }
    }

    /**
     * Import leads from a CSV file
     * Expected format: firstName,lastName,phoneNumber (header row optional)
     */
    fun importLeadsFromCsv(contentResolver: ContentResolver, uri: Uri) {
        viewModelScope.launch {
            _uiState.value = _uiState.value.copy(
                importState = CsvImportState(isImporting = true)
            )
            
            try {
                val leads = withContext(Dispatchers.IO) {
                    parseCsvFile(contentResolver, uri)
                }
                
                _uiState.value = _uiState.value.copy(
                    importState = _uiState.value.importState.copy(totalRows = leads.size)
                )
                
                var imported = 0
                var failed = 0
                
                for (lead in leads) {
                    val request = CreateLeadRequest(
                        firstName = lead.firstName,
                        lastName = lead.lastName,
                        phoneNumber = lead.phoneNumber
                    )
                    
                    leadRepository.createLead(request)
                        .onSuccess { imported++ }
                        .onFailure { failed++ }
                    
                    _uiState.value = _uiState.value.copy(
                        importState = _uiState.value.importState.copy(
                            importedCount = imported,
                            failedCount = failed
                        )
                    )
                }
                
                _uiState.value = _uiState.value.copy(
                    importState = CsvImportState(
                        isImporting = false,
                        totalRows = leads.size,
                        importedCount = imported,
                        failedCount = failed,
                        isComplete = true
                    )
                )
                
            } catch (e: Exception) {
                _uiState.value = _uiState.value.copy(
                    importState = CsvImportState(
                        isImporting = false,
                        error = e.message ?: "Failed to import CSV"
                    )
                )
            }
        }
    }

    private data class CsvLead(
        val firstName: String,
        val lastName: String?,
        val phoneNumber: String
    )

    private fun parseCsvFile(contentResolver: ContentResolver, uri: Uri): List<CsvLead> {
        val leads = mutableListOf<CsvLead>()
        
        contentResolver.openInputStream(uri)?.use { inputStream ->
            BufferedReader(InputStreamReader(inputStream)).use { reader ->
                var lineNumber = 0
                var headerIndices: Map<String, Int>? = null
                
                reader.forEachLine { line ->
                    lineNumber++
                    val values = line.split(",").map { it.trim().removeSurrounding("\"") }
                    
                    if (lineNumber == 1) {
                        // Check if this is a header row
                        val isHeader = values.any { 
                            it.equals("firstName", ignoreCase = true) ||
                            it.equals("first_name", ignoreCase = true) ||
                            it.equals("phone", ignoreCase = true) ||
                            it.equals("phoneNumber", ignoreCase = true)
                        }
                        
                        if (isHeader) {
                            headerIndices = values.mapIndexed { index, header -> 
                                header.lowercase() to index 
                            }.toMap()
                            return@forEachLine
                        }
                    }
                    
                    // Parse data row
                    if (values.size >= 2) {
                        val lead = if (headerIndices != null) {
                            // Use header-based parsing
                            val firstNameIdx = headerIndices!!["firstname"] 
                                ?: headerIndices!!["first_name"] 
                                ?: 0
                            val lastNameIdx = headerIndices!!["lastname"] 
                                ?: headerIndices!!["last_name"]
                            val phoneIdx = headerIndices!!["phonenumber"] 
                                ?: headerIndices!!["phone_number"] 
                                ?: headerIndices!!["phone"] 
                                ?: (values.size - 1)
                            
                            CsvLead(
                                firstName = values.getOrElse(firstNameIdx) { "" },
                                lastName = lastNameIdx?.let { values.getOrNull(it) },
                                phoneNumber = values.getOrElse(phoneIdx) { "" }
                            )
                        } else {
                            // Use positional parsing: firstName, lastName, phoneNumber
                            // Or: firstName, phoneNumber (if only 2 columns)
                            if (values.size >= 3) {
                                CsvLead(
                                    firstName = values[0],
                                    lastName = values[1],
                                    phoneNumber = values[2]
                                )
                            } else {
                                CsvLead(
                                    firstName = values[0],
                                    lastName = null,
                                    phoneNumber = values[1]
                                )
                            }
                        }
                        
                        // Validate and add
                        if (lead.firstName.isNotBlank() && lead.phoneNumber.isNotBlank()) {
                            leads.add(lead)
                        }
                    }
                }
            }
        }
        
        return leads
    }

    fun clearImportState() {
        _uiState.value = _uiState.value.copy(
            importState = CsvImportState()
        )
    }

    // ==================
    // Admin Import Functions (Server-side with user distribution)
    // ==================

    /**
     * Load users for admin to select for lead distribution
     */
    fun loadUsersForAssignment() {
        viewModelScope.launch {
            _uiState.value = _uiState.value.copy(
                adminImportState = _uiState.value.adminImportState.copy(isLoadingUsers = true)
            )
            
            try {
                val response = apiService.getUsers()
                if (response.isSuccessful) {
                    val users = response.body()?.data ?: emptyList()
                    _uiState.value = _uiState.value.copy(
                        adminImportState = _uiState.value.adminImportState.copy(
                            isLoadingUsers = false,
                            users = users.filter { it.isActive }
                        )
                    )
                } else {
                    _uiState.value = _uiState.value.copy(
                        adminImportState = _uiState.value.adminImportState.copy(
                            isLoadingUsers = false
                        ),
                        error = "Failed to load users"
                    )
                }
            } catch (e: Exception) {
                _uiState.value = _uiState.value.copy(
                    adminImportState = _uiState.value.adminImportState.copy(
                        isLoadingUsers = false
                    ),
                    error = e.message
                )
            }
        }
    }

    /**
     * Set CSV content for admin import after file is selected
     */
    fun setCsvContentForAdminImport(contentResolver: ContentResolver, uri: Uri) {
        viewModelScope.launch {
            try {
                val content = withContext(Dispatchers.IO) {
                    contentResolver.openInputStream(uri)?.use { inputStream ->
                        BufferedReader(InputStreamReader(inputStream)).readText()
                    } ?: ""
                }
                _uiState.value = _uiState.value.copy(
                    adminImportState = _uiState.value.adminImportState.copy(
                        csvContent = content
                    )
                )
            } catch (e: Exception) {
                _uiState.value = _uiState.value.copy(error = "Failed to read CSV: ${e.message}")
            }
        }
    }

    /**
     * Toggle user selection for lead distribution
     */
    fun toggleUserSelection(userId: String) {
        val currentSelected = _uiState.value.adminImportState.selectedUserIds
        val newSelected = if (userId in currentSelected) {
            currentSelected - userId
        } else {
            currentSelected + userId
        }
        _uiState.value = _uiState.value.copy(
            adminImportState = _uiState.value.adminImportState.copy(
                selectedUserIds = newSelected
            )
        )
    }

    /**
     * Perform server-side import with round-robin distribution
     */
    fun importLeadsWithDistribution() {
        val adminState = _uiState.value.adminImportState
        val csvContent = adminState.csvContent ?: return
        val userIds = adminState.selectedUserIds
        
        if (userIds.isEmpty()) {
            _uiState.value = _uiState.value.copy(error = "Please select at least one caller")
            return
        }
        
        viewModelScope.launch {
            _uiState.value = _uiState.value.copy(
                adminImportState = adminState.copy(isImporting = true)
            )
            
            try {
                val request = ImportLeadsRequest(
                    csvContent = csvContent,
                    userIds = userIds
                )
                
                val response = apiService.importLeads(request)
                if (response.isSuccessful) {
                    val result = response.body()
                    _uiState.value = _uiState.value.copy(
                        adminImportState = AdminImportState(
                            importResult = ImportResult(
                                success = result?.success ?: false,
                                total = result?.total ?: 0,
                                imported = result?.imported ?: 0,
                                failed = result?.failed ?: 0,
                                errors = result?.errors ?: emptyList()
                            )
                        )
                    )
                    // Refresh leads list
                    syncLeadsFromServer()
                } else {
                    _uiState.value = _uiState.value.copy(
                        adminImportState = adminState.copy(isImporting = false),
                        error = "Import failed: ${response.message()}"
                    )
                }
            } catch (e: Exception) {
                _uiState.value = _uiState.value.copy(
                    adminImportState = adminState.copy(isImporting = false),
                    error = "Import failed: ${e.message}"
                )
            }
        }
    }

    /**
     * Clear admin import state
     */
    fun clearAdminImportState() {
        _uiState.value = _uiState.value.copy(
            adminImportState = AdminImportState()
        )
    }
}

