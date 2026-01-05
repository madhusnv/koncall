package com.koncall.app.data.local

import android.content.Context
import android.net.Uri
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.*
import androidx.datastore.preferences.preferencesDataStore
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.map
import java.io.IOException
import javax.inject.Inject
import javax.inject.Singleton

// Extension property for DataStore
private val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = "koncall_preferences")

/**
 * Manager for app preferences using DataStore.
 * Handles recording settings, user preferences, and app state.
 */
@Singleton
class PreferencesManager @Inject constructor(
    @ApplicationContext private val context: Context
) {
    private val dataStore = context.dataStore
    
    companion object {
        // Recording settings
        val RECORDING_SYNC_ENABLED = booleanPreferencesKey("recording_sync_enabled")
        val RECORDING_FOLDER_URI = stringPreferencesKey("recording_folder_uri")
        val RECORDING_FOLDER_PATH = stringPreferencesKey("recording_folder_path")
        val LAST_RECORDING_SCAN_TIME = longPreferencesKey("last_recording_scan_time")
        val AUTO_DETECT_PATH = booleanPreferencesKey("auto_detect_recording_path")
        
        // Permission status
        val AUDIO_PERMISSION_REQUESTED = booleanPreferencesKey("audio_permission_requested")
        val STORAGE_PERMISSION_REQUESTED = booleanPreferencesKey("storage_permission_requested")
        val SAF_PERMISSION_GRANTED = booleanPreferencesKey("saf_permission_granted")
        
        // App settings
        val SHOW_CALL_POPUP = booleanPreferencesKey("show_call_popup")
        val SYNC_ON_WIFI_ONLY = booleanPreferencesKey("sync_on_wifi_only")
        val NOTIFICATION_ENABLED = booleanPreferencesKey("notification_enabled")
        
        // User session
        val USER_ID = stringPreferencesKey("user_id")
        val AUTH_TOKEN = stringPreferencesKey("auth_token")
        val ORGANIZATION_CODE = stringPreferencesKey("organization_code")
    }
    
    // ===== Recording Settings =====
    
    val recordingSyncEnabled: Flow<Boolean> = dataStore.data
        .catch { exception ->
            if (exception is IOException) {
                emit(emptyPreferences())
            } else {
                throw exception
            }
        }
        .map { preferences ->
            preferences[RECORDING_SYNC_ENABLED] ?: true // Enabled by default
        }
    
    val recordingFolderUri: Flow<String?> = dataStore.data
        .map { preferences ->
            preferences[RECORDING_FOLDER_URI]
        }
    
    val recordingFolderPath: Flow<String?> = dataStore.data
        .map { preferences ->
            preferences[RECORDING_FOLDER_PATH]
        }
    
    val autoDetectPath: Flow<Boolean> = dataStore.data
        .map { preferences ->
            preferences[AUTO_DETECT_PATH] ?: true // Auto-detect by default
        }
    
    val lastRecordingScanTime: Flow<Long> = dataStore.data
        .map { preferences ->
            preferences[LAST_RECORDING_SCAN_TIME] ?: 0L
        }
    
    val safPermissionGranted: Flow<Boolean> = dataStore.data
        .map { preferences ->
            preferences[SAF_PERMISSION_GRANTED] ?: false
        }
    
    // ===== App Settings =====
    
    val showCallPopup: Flow<Boolean> = dataStore.data
        .map { preferences ->
            preferences[SHOW_CALL_POPUP] ?: true
        }
    
    val syncOnWifiOnly: Flow<Boolean> = dataStore.data
        .map { preferences ->
            preferences[SYNC_ON_WIFI_ONLY] ?: false
        }
    
    // ===== Setters =====
    
    suspend fun setRecordingSyncEnabled(enabled: Boolean) {
        dataStore.edit { preferences ->
            preferences[RECORDING_SYNC_ENABLED] = enabled
        }
    }
    
    suspend fun setRecordingFolder(uri: Uri?, path: String?) {
        dataStore.edit { preferences ->
            if (uri != null) {
                preferences[RECORDING_FOLDER_URI] = uri.toString()
                preferences[SAF_PERMISSION_GRANTED] = true
            } else {
                preferences.remove(RECORDING_FOLDER_URI)
                preferences[SAF_PERMISSION_GRANTED] = false
            }
            
            if (path != null) {
                preferences[RECORDING_FOLDER_PATH] = path
            } else {
                preferences.remove(RECORDING_FOLDER_PATH)
            }
        }
    }
    
    suspend fun setAutoDetectPath(enabled: Boolean) {
        dataStore.edit { preferences ->
            preferences[AUTO_DETECT_PATH] = enabled
        }
    }
    
    suspend fun updateLastScanTime(time: Long = System.currentTimeMillis()) {
        dataStore.edit { preferences ->
            preferences[LAST_RECORDING_SCAN_TIME] = time
        }
    }
    
    suspend fun setShowCallPopup(enabled: Boolean) {
        dataStore.edit { preferences ->
            preferences[SHOW_CALL_POPUP] = enabled
        }
    }
    
    suspend fun setSyncOnWifiOnly(enabled: Boolean) {
        dataStore.edit { preferences ->
            preferences[SYNC_ON_WIFI_ONLY] = enabled
        }
    }
    
    suspend fun setAudioPermissionRequested(requested: Boolean) {
        dataStore.edit { preferences ->
            preferences[AUDIO_PERMISSION_REQUESTED] = requested
        }
    }
    
    suspend fun setStoragePermissionRequested(requested: Boolean) {
        dataStore.edit { preferences ->
            preferences[STORAGE_PERMISSION_REQUESTED] = requested
        }
    }
    
    // ===== Utility Methods =====
    
    /**
     * Get recording folder as URI (for SAF access)
     */
    suspend fun getRecordingFolderUri(): Uri? {
        var uri: Uri? = null
        dataStore.data.collect { preferences ->
            val uriString = preferences[RECORDING_FOLDER_URI]
            uri = uriString?.let { Uri.parse(it) }
        }
        return uri
    }
    
    /**
     * Clear all recording settings (for logout/reset)
     */
    suspend fun clearRecordingSettings() {
        dataStore.edit { preferences ->
            preferences.remove(RECORDING_FOLDER_URI)
            preferences.remove(RECORDING_FOLDER_PATH)
            preferences.remove(SAF_PERMISSION_GRANTED)
            preferences.remove(LAST_RECORDING_SCAN_TIME)
        }
    }
    
    /**
     * Clear all preferences (full reset)
     */
    suspend fun clearAll() {
        dataStore.edit { preferences ->
            preferences.clear()
        }
    }
}
