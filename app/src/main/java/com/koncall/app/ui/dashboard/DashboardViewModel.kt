package com.koncall.app.ui.dashboard

import android.app.Application
import android.content.Intent
import android.os.Build
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.koncall.app.data.local.entity.CallType
import com.koncall.app.data.repository.CallLogRepository
import com.koncall.app.data.repository.LeadRepository
import com.koncall.app.service.CallMonitorService
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

data class DashboardStats(
    val totalCalls: Int = 0,
    val totalDuration: Int = 0,  // seconds
    val incomingCalls: Int = 0,
    val outgoingCalls: Int = 0,
    val missedCalls: Int = 0,
    val neverAttendedCount: Int = 0,
    val notPickedUpCount: Int = 0,
    val pendingSyncCount: Int = 0,
    val pendingFollowUps: Int = 0  // Leads with due reminders
)

data class DashboardUiState(
    val isLoading: Boolean = false,
    val isSyncing: Boolean = false,
    val stats: DashboardStats = DashboardStats(),
    val error: String? = null
)

@HiltViewModel
class DashboardViewModel @Inject constructor(
    private val application: Application,
    private val callLogRepository: CallLogRepository,
    private val leadRepository: LeadRepository
) : ViewModel() {

    private val _uiState = MutableStateFlow(DashboardUiState())
    val uiState: StateFlow<DashboardUiState> = _uiState

    init {
        // Auto-sync device call logs on dashboard load
        syncFromDevice()
    }

    fun loadDashboardStats() {
        viewModelScope.launch {
            _uiState.value = _uiState.value.copy(isLoading = true)
            
            try {
                val totalCalls = callLogRepository.getTotalCount()
                val totalDuration = callLogRepository.getTotalDuration()
                val incomingCalls = callLogRepository.getCountByType(CallType.INCOMING)
                val outgoingCalls = callLogRepository.getCountByType(CallType.OUTGOING)
                val missedCalls = callLogRepository.getCountByType(CallType.MISSED)
                val neverAttended = callLogRepository.getNeverAttendedNumbers()
                val notPickedUp = callLogRepository.getNotPickedUpNumbers()
                val pending = callLogRepository.getPendingCallLogs()
                val pendingFollowUps = leadRepository.getPendingRemindersCount()
                
                _uiState.value = DashboardUiState(
                    isLoading = false,
                    stats = DashboardStats(
                        totalCalls = totalCalls,
                        totalDuration = totalDuration,
                        incomingCalls = incomingCalls,
                        outgoingCalls = outgoingCalls,
                        missedCalls = missedCalls,
                        neverAttendedCount = neverAttended.size,
                        notPickedUpCount = notPickedUp.size,
                        pendingSyncCount = pending.size,
                        pendingFollowUps = pendingFollowUps
                    )
                )
            } catch (e: Exception) {
                _uiState.value = _uiState.value.copy(
                    isLoading = false,
                    error = e.message
                )
            }
        }
    }

    /**
     * Trigger reading call logs from device via CallMonitorService
     */
    private fun syncFromDevice() {
        val syncIntent = Intent(application, CallMonitorService::class.java).apply {
            action = CallMonitorService.ACTION_SYNC_CALL_LOGS
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            application.startForegroundService(syncIntent)
        } else {
            application.startService(syncIntent)
        }
        
        // Wait briefly for service to sync, then reload stats
        viewModelScope.launch {
            delay(1000) // Give service time to read call logs
            loadDashboardStats()
        }
    }

    /**
     * Full sync: reads from device, then syncs to server
     */
    fun syncCallLogs() {
        viewModelScope.launch {
            _uiState.value = _uiState.value.copy(isSyncing = true)
            
            // Step 1: Sync device call logs to local DB
            syncFromDevice()
            delay(1500) // Wait for device sync
            
            // Step 2: Sync local DB to server
            callLogRepository.syncCallLogs()
            
            // Reload stats
            loadDashboardStats()
            _uiState.value = _uiState.value.copy(isSyncing = false)
        }
    }
}
