package com.koncall.app.data.repository

import com.koncall.app.data.remote.api.KonCallApiService
import com.koncall.app.data.remote.dto.*
import com.koncall.app.util.ApiErrorParser
import com.koncall.app.util.TokenManager
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AuthRepository @Inject constructor(
    private val apiService: KonCallApiService,
    private val tokenManager: TokenManager
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
        tokenManager.clearAuth()
    }
    
    suspend fun isLoggedIn(): Boolean = tokenManager.getToken() != null
}
