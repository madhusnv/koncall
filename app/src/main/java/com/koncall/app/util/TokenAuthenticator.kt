package com.koncall.app.util

import android.util.Log
import com.koncall.app.BuildConfig
import com.koncall.app.data.remote.dto.TokenResponse
import com.google.gson.Gson
import kotlinx.coroutines.runBlocking
import okhttp3.Authenticator
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response
import okhttp3.Route
import javax.inject.Inject

/**
 * OkHttp Authenticator that handles 401 responses by refreshing the token.
 * 
 * When a request returns 401 Unauthorized:
 * 1. Attempts to refresh the token using the refresh endpoint
 * 2. If successful, retries the original request with the new token
 * 3. If refresh fails, clears auth and lets the 401 propagate
 * 
 * This avoids infinite loops by only retrying once per request.
 */
class TokenAuthenticator @Inject constructor(
    private val tokenManager: TokenManager
) : Authenticator {

    companion object {
        private const val TAG = "TokenAuthenticator"
    }

    @Volatile
    private var isRefreshing = false

    override fun authenticate(route: Route?, response: Response): Request? {
        // Don't retry if we've already tried or if we're refreshing
        if (responseCount(response) >= 2) {
            Log.w(TAG, "Already retried, giving up")
            return null
        }

        // Don't try to refresh for auth endpoints
        val path = response.request.url.encodedPath
        if (path.contains("/auth/")) {
            return null
        }

        synchronized(this) {
            // Check if another thread already refreshed
            val currentToken = tokenManager.getTokenBlocking()
            val requestToken = response.request.header("Authorization")?.removePrefix("Bearer ")
            
            if (currentToken != null && currentToken != requestToken) {
                // Token was already refreshed by another thread, retry with new token
                Log.d(TAG, "Token already refreshed, retrying request")
                return response.request.newBuilder()
                    .header("Authorization", "Bearer $currentToken")
                    .build()
            }

            if (isRefreshing) {
                return null
            }
            isRefreshing = true
        }

        try {
            // Attempt to refresh the token
            val newToken = refreshToken()
            
            return if (newToken != null) {
                Log.d(TAG, "Token refreshed successfully, retrying request")
                response.request.newBuilder()
                    .header("Authorization", "Bearer $newToken")
                    .build()
            } else {
                Log.w(TAG, "Token refresh failed, user needs to re-login")
                // Clear auth data so user gets redirected to login
                // NOTE: runBlocking is necessary here because OkHttp's Authenticator
                // interface is synchronous, but our TokenManager uses suspend functions
                runBlocking { tokenManager.clearAuth() }
                null
            }
        } finally {
            synchronized(this) {
                isRefreshing = false
            }
        }
    }

    /**
     * Refresh the token by calling the refresh endpoint.
     * Uses a separate OkHttpClient without the authenticator to avoid loops.
     */
    private fun refreshToken(): String? {
        val currentToken = tokenManager.getTokenBlocking() ?: return null
        
        // Create a simple client without authenticator for refresh call
        val client = OkHttpClient.Builder()
            .build()
        
        val request = Request.Builder()
            .url("${BuildConfig.BASE_URL}api/auth/refresh")
            .post(okhttp3.RequestBody.create(null, ByteArray(0)))
            .header("Authorization", "Bearer $currentToken")
            .build()
        
        return try {
            val response = client.newCall(request).execute()
            
            if (response.isSuccessful) {
                val body = response.body?.string()
                val tokenResponse = Gson().fromJson(body, TokenResponse::class.java)
                val newToken = tokenResponse?.data?.token
                
                if (newToken != null) {
                    // Save the new token
                    // NOTE: runBlocking is necessary here because OkHttp's Authenticator
                    // interface is synchronous, but our TokenManager uses suspend functions
                    runBlocking {
                        tokenManager.updateToken(newToken)
                    }
                    newToken
                } else {
                    Log.e(TAG, "Refresh response missing token")
                    null
                }
            } else {
                Log.e(TAG, "Token refresh failed: ${response.code}")
                null
            }
        } catch (e: Exception) {
            Log.e(TAG, "Token refresh error", e)
            null
        }
    }

    /**
     * Count how many times we've retried this request.
     */
    private fun responseCount(response: Response): Int {
        var count = 1
        var current = response.priorResponse
        while (current != null) {
            count++
            current = current.priorResponse
        }
        return count
    }
}
