package com.koncall.app.data.repository

import android.content.Context
import androidx.work.WorkInfo
import androidx.work.WorkManager
import com.koncall.app.data.local.dao.LeadDao
import com.koncall.app.data.remote.api.KonCallApiService
import com.koncall.app.data.remote.dto.*
import com.koncall.app.util.ApiErrorParser
import com.koncall.app.util.TokenManager
import com.koncall.app.service.WorkerTags
import com.google.firebase.crashlytics.FirebaseCrashlytics
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AuthRepository @Inject constructor(
    @ApplicationContext private val context: Context,
    private val apiService: KonCallApiService,
    private val tokenManager: TokenManager,
    private val leadDao: LeadDao  // Added to clear local data on logout
) {
    suspend fun login(orgCode: String, phone: String, password: String): Result<UserDto> {
        val request = LoginRequest(
            orgCode = orgCode,
            phone = phone,
            password = password,
            deviceId = tokenManager.getDeviceId()
        )
        
        return try {
            val response = apiService.login(request)
            if (response.isSuccessful) {
                val data = response.body()?.data
                    ?: return Result.failure(Exception("No data returned"))
                
                tokenManager.saveAuthData(
                    token = data.token,
                    userId = data.user.id,
                    orgId = data.user.organizationId,
                    deviceId = data.device?.id,
                    userName = data.user.name
                )
                
                // Set Crashlytics user context for crash attribution
                FirebaseCrashlytics.getInstance().apply {
                    setUserId(data.user.id)
                    setCustomKey("user_email", data.user.email ?: "")
                    setCustomKey("user_name", data.user.name ?: "")
                    setCustomKey("user_role", data.user.role ?: "")
                    setCustomKey("organization", orgCode)
                }
                
                Result.success(data.user)
            } else {
                Result.failure(ApiErrorParser.parseError(response))
            }
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
    
    suspend fun register(
        orgCode: String,
        phone: String,
        name: String,
        password: String,
        deviceInfo: DeviceInfo?
    ): Result<UserDto> {
        val request = RegisterRequest(
            orgCode = orgCode,
            phone = phone,
            name = name,
            password = password,
            deviceInfo = deviceInfo
        )
        
        return try {
            val response = apiService.register(request)
            if (response.isSuccessful) {
                val data = response.body()?.data
                    ?: return Result.failure(Exception("No data returned"))
                
                tokenManager.saveAuthData(
                    token = data.token,
                    userId = data.user.id,
                    orgId = data.user.organizationId,
                    deviceId = data.device?.id,
                    userName = data.user.name
                )
                
                Result.success(data.user)
            } else {
                Result.failure(ApiErrorParser.parseError(response))
            }
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
    
    suspend fun logout() {
        try {
            apiService.logout()
        } catch (e: Exception) {
            // Ignore logout errors
        }
        
        // Cancel ONLY user data sync workers, not call tracking workers
        // Call tracking (CallLogIngestionWorker, RecordingFinderWorker) continues to work
        WorkManager.getInstance(context).cancelAllWorkByTag(WorkerTags.TAG_USER_DATA_SYNC)
        
        // Clear Crashlytics user context
        FirebaseCrashlytics.getInstance().setUserId("")
        
        // CRITICAL: Clear all local data to prevent data leakage between users
        tokenManager.clearAuth()
        leadDao.deleteAll()  // Clear cached leads from previous user
    }
    
    /**
     * Check if there are pending sync operations.
     * Used to warn user before logout if data hasn't been synced yet.
     * 
     * @return true if any user data sync workers are running or enqueued
     */
    suspend fun hasPendingSync(): Boolean {
        return try {
            val workManager = WorkManager.getInstance(context)
            // Check for running or enqueued user data sync workers
            val workInfos = workManager
                .getWorkInfosByTag(WorkerTags.TAG_USER_DATA_SYNC)
                .get()  // Use get() instead of await() - it's already blocking
            
            workInfos.any { workInfo ->
                workInfo.state == WorkInfo.State.RUNNING || 
                workInfo.state == WorkInfo.State.ENQUEUED 
            }
        } catch (e: Exception) {
            android.util.Log.e("AuthRepository", "Error checking pending sync", e)
            false
        }
    }
    
    suspend fun isLoggedIn(): Boolean = tokenManager.getToken() != null
}
