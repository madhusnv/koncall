package com.koncall.app.ui.analytics

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.koncall.app.data.remote.dto.NotPickedUpCallDto
import com.koncall.app.data.repository.AnalyticsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

data class NotPickedUpUiState(
    val isLoading: Boolean = true,
    val calls: List<NotPickedUpCallDto> = emptyList(),
    val error: String? = null
)

@HiltViewModel
class NotPickedUpViewModel @Inject constructor(
    private val analyticsRepository: AnalyticsRepository
) : ViewModel() {

    private val _uiState = MutableStateFlow(NotPickedUpUiState())
    val uiState: StateFlow<NotPickedUpUiState> = _uiState

    init {
        loadData()
    }

    fun loadData() {
        viewModelScope.launch {
            _uiState.value = _uiState.value.copy(isLoading = true, error = null)
            
            val result = analyticsRepository.getNotPickedUpCalls()
            
            result.onSuccess { calls ->
                _uiState.value = NotPickedUpUiState(isLoading = false, calls = calls)
            }.onFailure { e ->
                _uiState.value = NotPickedUpUiState(isLoading = false, error = e.localizedMessage ?: "Failed to load data")
            }
        }
    }
}
