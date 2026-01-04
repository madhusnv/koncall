package com.koncall.app.ui.analytics

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.koncall.app.data.remote.dto.NeverAttendedCallDto
import com.koncall.app.data.repository.AnalyticsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

data class NeverAttendedUiState(
    val isLoading: Boolean = true,
    val calls: List<NeverAttendedCallDto> = emptyList(),
    val error: String? = null
)

@HiltViewModel
class NeverAttendedViewModel @Inject constructor(
    private val analyticsRepository: AnalyticsRepository
) : ViewModel() {

    private val _uiState = MutableStateFlow(NeverAttendedUiState())
    val uiState: StateFlow<NeverAttendedUiState> = _uiState

    init {
        loadData()
    }

    fun loadData() {
        viewModelScope.launch {
            _uiState.value = _uiState.value.copy(isLoading = true, error = null)
            
            val result = analyticsRepository.getNeverAttendedCalls()
            
            result.onSuccess { calls ->
                _uiState.value = NeverAttendedUiState(isLoading = false, calls = calls)
            }.onFailure { e ->
                _uiState.value = NeverAttendedUiState(isLoading = false, error = e.localizedMessage ?: "Failed to load data")
            }
        }
    }
}
