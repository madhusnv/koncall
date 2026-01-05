package com.koncall.app.ui.settings.recording

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.work.ExistingWorkPolicy
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.WorkManager
import androidx.work.workDataOf
import com.koncall.app.data.local.PreferencesManager
import com.koncall.app.service.recording.CommonRecordingPaths
import com.koncall.app.service.recording.RecordingFinderWorker
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import javax.inject.Inject

data class RecordingSettingsUiState(
    val recordingSyncEnabled: Boolean = true,
    val syncOnWifiOnly: Boolean = false,
    val autoDetectPath: Boolean = true,
    val recordingFolderUri: String? = null,
    val recordingFolderPath: String? = null,
    val detectedPath: String? = null,
    val lastScanTime: Long = 0L,
    val showDialerGuide: Boolean = false,
    val dialerInstructions: String = "",
    val isScanning: Boolean = false
)

@HiltViewModel
class RecordingSettingsViewModel @Inject constructor(
    @ApplicationContext private val context: Context,
    private val preferencesManager: PreferencesManager
) : ViewModel() {
    
    private val _uiState = MutableStateFlow(RecordingSettingsUiState())
    val uiState: StateFlow<RecordingSettingsUiState> = _uiState.asStateFlow()
    
    init {
        // Load preferences
        viewModelScope.launch {
            combine(
                preferencesManager.recordingSyncEnabled,
                preferencesManager.syncOnWifiOnly,
                preferencesManager.autoDetectPath,
                preferencesManager.recordingFolderUri,
                preferencesManager.recordingFolderPath
            ) { syncEnabled, wifiOnly, autoDetect, folderUri, folderPath ->
                RecordingSettingsUiState(
                    recordingSyncEnabled = syncEnabled,
                    syncOnWifiOnly = wifiOnly,
                    autoDetectPath = autoDetect,
                    recordingFolderUri = folderUri,
                    recordingFolderPath = folderPath
                )
            }.collect { state ->
                _uiState.update { 
                    it.copy(
                        recordingSyncEnabled = state.recordingSyncEnabled,
                        syncOnWifiOnly = state.syncOnWifiOnly,
                        autoDetectPath = state.autoDetectPath,
                        recordingFolderUri = state.recordingFolderUri,
                        recordingFolderPath = state.recordingFolderPath
                    )
                }
            }
        }
        
        viewModelScope.launch {
            preferencesManager.lastRecordingScanTime.collect { time ->
                _uiState.update { it.copy(lastScanTime = time) }
            }
        }
        
        // Auto-detect recording path
        detectRecordingPath()
    }
    
    private fun detectRecordingPath() {
        viewModelScope.launch {
            val detectedPath = CommonRecordingPaths.detectRecordingPath(context)
            _uiState.update { 
                it.copy(
                    detectedPath = detectedPath,
                    dialerInstructions = CommonRecordingPaths.getDialerInstructions(context)
                )
            }
        }
    }
    
    fun setRecordingSyncEnabled(enabled: Boolean) {
        viewModelScope.launch {
            preferencesManager.setRecordingSyncEnabled(enabled)
        }
    }
    
    fun setSyncOnWifiOnly(enabled: Boolean) {
        viewModelScope.launch {
            preferencesManager.setSyncOnWifiOnly(enabled)
        }
    }
    
    fun setAutoDetectPath(enabled: Boolean) {
        viewModelScope.launch {
            preferencesManager.setAutoDetectPath(enabled)
            if (enabled) {
                // Clear manual selection when switching to auto-detect
                preferencesManager.setRecordingFolder(null, null)
                detectRecordingPath()
            }
        }
    }
    
    fun onFolderSelected(uri: Uri, context: Context) {
        viewModelScope.launch {
            // Take persistable permission for the folder
            try {
                context.contentResolver.takePersistableUriPermission(
                    uri,
                    Intent.FLAG_GRANT_READ_URI_PERMISSION
                )
            } catch (e: Exception) {
                // Permission might already be taken or not needed
            }
            
            // Get display path if possible
            val path = uri.path?.substringAfter("primary:") ?: uri.toString()
            
            preferencesManager.setRecordingFolder(uri, path)
            preferencesManager.setAutoDetectPath(false)
        }
    }
    
    fun clearFolderSelection() {
        viewModelScope.launch {
            preferencesManager.setRecordingFolder(null, null)
            preferencesManager.setAutoDetectPath(true)
            detectRecordingPath()
        }
    }
    
    fun onAudioPermissionResult(granted: Boolean) {
        viewModelScope.launch {
            preferencesManager.setAudioPermissionRequested(true)
            if (granted) {
                // Re-detect paths now that we have permission
                detectRecordingPath()
            }
        }
    }
    
    fun triggerManualScan() {
        viewModelScope.launch {
            _uiState.update { it.copy(isScanning = true) }
            
            val inputData = workDataOf(
                RecordingFinderWorker.KEY_SCAN_ALL_RECENT to true
            )
            
            val request = OneTimeWorkRequestBuilder<RecordingFinderWorker>()
                .setInputData(inputData)
                .build()
            
            WorkManager.getInstance(context).enqueueUniqueWork(
                "manual_recording_scan",
                ExistingWorkPolicy.REPLACE,
                request
            )
            
            preferencesManager.updateLastScanTime()
            
            // Update UI after short delay
            kotlinx.coroutines.delay(1000)
            _uiState.update { it.copy(isScanning = false) }
        }
    }
    
    fun showDialerGuide() {
        _uiState.update { it.copy(showDialerGuide = true) }
    }
    
    fun hideDialerGuide() {
        _uiState.update { it.copy(showDialerGuide = false) }
    }
}
