package com.koncall.app.util

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.runBlocking

private val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = "auth_prefs")

class TokenManager(private val context: Context) {

    companion object {
        private val TOKEN_KEY = stringPreferencesKey("auth_token")
        private val USER_ID_KEY = stringPreferencesKey("user_id")
        private val ORG_ID_KEY = stringPreferencesKey("org_id")
        private val DEVICE_ID_KEY = stringPreferencesKey("device_id")
        private val USER_NAME_KEY = stringPreferencesKey("user_name")
        private val USER_EMAIL_KEY = stringPreferencesKey("user_email")
        private val USER_ROLE_KEY = stringPreferencesKey("user_role")
        private val ORG_NAME_KEY = stringPreferencesKey("org_name")
    }
    
    /**
     * In-memory cache of the auth token.
     * Avoids runBlocking calls on network threads which could cause ANR.
     * Updated when token is saved or cleared.
     */
    @Volatile
    private var cachedToken: String? = null
    
    init {
        // Initialize cache from DataStore on startup
        // This runs once during DI initialization, which is safe
        runBlocking {
            cachedToken = context.dataStore.data.first()[TOKEN_KEY]
        }
    }

    val tokenFlow: Flow<String?> = context.dataStore.data.map { prefs ->
        prefs[TOKEN_KEY]
    }

    val isLoggedIn: Flow<Boolean> = context.dataStore.data.map { prefs ->
        prefs[TOKEN_KEY] != null
    }

    suspend fun saveAuthData(
        token: String,
        userId: String,
        orgId: String,
        deviceId: String?,
        userName: String,
        userEmail: String? = null,
        userRole: String? = null,
        orgName: String? = null
    ) {
        // Update in-memory cache first for immediate availability
        cachedToken = token
        
        context.dataStore.edit { prefs ->
            prefs[TOKEN_KEY] = token
            prefs[USER_ID_KEY] = userId
            prefs[ORG_ID_KEY] = orgId
            deviceId?.let { prefs[DEVICE_ID_KEY] = it }
            prefs[USER_NAME_KEY] = userName
            userEmail?.let { prefs[USER_EMAIL_KEY] = it }
            userRole?.let { prefs[USER_ROLE_KEY] = it }
            orgName?.let { prefs[ORG_NAME_KEY] = it }
        }
    }

    suspend fun getToken(): String? {
        return context.dataStore.data.first()[TOKEN_KEY]
    }

    /**
     * Get token synchronously from in-memory cache.
     * This is safe to call from any thread as it doesn't block on I/O.
     */
    fun getTokenBlocking(): String? {
        return cachedToken
    }
    
    /**
     * Update only the token (used for token refresh).
     * Updates both in-memory cache and persistent storage.
     */
    suspend fun updateToken(newToken: String) {
        cachedToken = newToken
        context.dataStore.edit { prefs ->
            prefs[TOKEN_KEY] = newToken
        }
    }

    suspend fun getUserId(): String? {
        return context.dataStore.data.first()[USER_ID_KEY]
    }

    suspend fun getOrgId(): String? {
        return context.dataStore.data.first()[ORG_ID_KEY]
    }

    suspend fun getDeviceId(): String? {
        return context.dataStore.data.first()[DEVICE_ID_KEY]
    }

    suspend fun getUserName(): String? {
        return context.dataStore.data.first()[USER_NAME_KEY]
    }

    suspend fun getUserEmail(): String? {
        return context.dataStore.data.first()[USER_EMAIL_KEY]
    }

    suspend fun getUserRole(): String? {
        return context.dataStore.data.first()[USER_ROLE_KEY]
    }

    suspend fun getOrgName(): String? {
        return context.dataStore.data.first()[ORG_NAME_KEY]
    }

    suspend fun clearAuth() {
        // Clear in-memory cache first
        cachedToken = null
        
        context.dataStore.edit { prefs ->
            prefs.clear()
        }
    }
}
