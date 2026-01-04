package com.koncall.app.ui.calllogs

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.koncall.app.data.local.entity.CallLogEntity
import com.koncall.app.data.repository.CallLogRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject

data class CallLogsUiState(
    val isLoading: Boolean = false,
    val callLogs: List<CallLogEntity> = emptyList(),
    val error: String? = null,
    val filterType: String? = null
)

@HiltViewModel
class CallLogsViewModel @Inject constructor(
    private val callLogRepository: CallLogRepository
) : ViewModel() {

    private val _uiState = MutableStateFlow(CallLogsUiState())
    val uiState: StateFlow<CallLogsUiState> = _uiState

    init {
        loadCallLogs()
    }

    private fun loadCallLogs() {
        viewModelScope.launch {
            callLogRepository.getAllCallLogs().collectLatest { logs ->
                _uiState.value = _uiState.value.copy(
                    isLoading = false,
                    callLogs = logs
                )
            }
        }
    }

    fun filterByType(type: String?) {
        _uiState.value = _uiState.value.copy(filterType = type)
        viewModelScope.launch {
            if (type == null) {
                loadCallLogs()
            } else {
                callLogRepository.getCallLogsByType(type).collectLatest { logs ->
                    _uiState.value = _uiState.value.copy(callLogs = logs)
                }
            }
        }
    }
}
