package com.koncall.app.ui.calllogs

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.koncall.app.data.local.dao.CallLogDao
import com.koncall.app.data.local.dao.CallNoteDao
import com.koncall.app.data.local.dao.LeadDao
import com.koncall.app.data.local.entity.CallLogEntity
import com.koncall.app.data.local.entity.CallNoteEntity
import com.koncall.app.data.local.entity.LeadEntity
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import java.util.UUID
import javax.inject.Inject

data class CallLogDetailUiState(
    val isLoading: Boolean = true,
    val callLog: CallLogEntity? = null,
    val notes: List<CallNoteEntity> = emptyList(),
    val linkedLead: LeadEntity? = null,
    val error: String? = null
)

@HiltViewModel
class CallLogDetailViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle,
    private val callLogDao: CallLogDao,
    private val callNoteDao: CallNoteDao,
    private val leadDao: LeadDao
) : ViewModel() {

    private val callId: String = savedStateHandle.get<String>("callId") ?: ""

    private val _uiState = MutableStateFlow(CallLogDetailUiState())
    val uiState: StateFlow<CallLogDetailUiState> = _uiState

    init {
        loadCallLogDetails()
    }

    private fun loadCallLogDetails() {
        viewModelScope.launch {
            _uiState.value = _uiState.value.copy(isLoading = true)
            
            try {
                val callLog = callLogDao.getCallLogById(callId)
                
                if (callLog != null) {
                    // Load notes for this call
                    val notes = callNoteDao.getNotesForCallLog(callLog.id)
                    
                    // Try to find linked lead
                    val lead = leadDao.getLeadByPhoneNumber(callLog.phoneNumber)
                    
                    _uiState.value = CallLogDetailUiState(
                        isLoading = false,
                        callLog = callLog,
                        notes = notes,
                        linkedLead = lead
                    )
                } else {
                    _uiState.value = CallLogDetailUiState(
                        isLoading = false,
                        error = "Call log not found"
                    )
                }
            } catch (e: Exception) {
                _uiState.value = CallLogDetailUiState(
                    isLoading = false,
                    error = e.message ?: "Failed to load call details"
                )
            }
        }
    }

    fun addNote(content: String) {
        if (content.isBlank()) return
        
        viewModelScope.launch {
            val callLog = _uiState.value.callLog ?: return@launch
            
            val note = CallNoteEntity(
                id = UUID.randomUUID().toString(),
                callLogId = callLog.id,
                content = content.trim(),
                createdAt = System.currentTimeMillis()
            )
            
            callNoteDao.insertNote(note)
            
            // Refresh notes
            val notes = callNoteDao.getNotesForCallLog(callLog.id)
            _uiState.value = _uiState.value.copy(notes = notes)
        }
    }

    fun deleteNote(noteId: String) {
        viewModelScope.launch {
            callNoteDao.deleteNoteById(noteId)
            
            // Refresh notes
            val callLog = _uiState.value.callLog ?: return@launch
            val notes = callNoteDao.getNotesForCallLog(callLog.id)
            _uiState.value = _uiState.value.copy(notes = notes)
        }
    }
}
