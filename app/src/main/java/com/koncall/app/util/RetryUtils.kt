package com.koncall.app.util

import kotlinx.coroutines.delay
import retrofit2.Response
import java.io.IOException

/**
 * Utility functions for API call retry logic with exponential backoff.
 */
object RetryUtils {
    
    private const val DEFAULT_MAX_RETRIES = 3
    private const val DEFAULT_INITIAL_DELAY_MS = 1000L
    private const val DEFAULT_MAX_DELAY_MS = 10000L
    private const val DEFAULT_BACKOFF_MULTIPLIER = 2.0
    
    /**
     * Execute a suspending block with retry logic and exponential backoff.
     * Only retries on transient failures (network errors, 5xx responses).
     * 
     * @param maxRetries Maximum number of retry attempts
     * @param initialDelayMs Initial delay before first retry
     * @param maxDelayMs Maximum delay between retries
     * @param backoffMultiplier Multiplier for exponential backoff
     * @param shouldRetry Optional predicate to determine if exception is retryable
     * @param block The suspending block to execute
     * @return Result of the block execution
     */
    suspend fun <T> withRetry(
        maxRetries: Int = DEFAULT_MAX_RETRIES,
        initialDelayMs: Long = DEFAULT_INITIAL_DELAY_MS,
        maxDelayMs: Long = DEFAULT_MAX_DELAY_MS,
        backoffMultiplier: Double = DEFAULT_BACKOFF_MULTIPLIER,
        shouldRetry: (Exception) -> Boolean = ::isRetryableException,
        block: suspend () -> T
    ): T {
        var currentDelay = initialDelayMs
        var lastException: Exception? = null
        
        repeat(maxRetries + 1) { attempt ->
            try {
                return block()
            } catch (e: Exception) {
                lastException = e
                
                if (attempt < maxRetries && shouldRetry(e)) {
                    delay(currentDelay)
                    currentDelay = (currentDelay * backoffMultiplier).toLong().coerceAtMost(maxDelayMs)
                } else {
                    throw e
                }
            }
        }
        
        throw lastException ?: IllegalStateException("Retry loop exited unexpectedly")
    }
    
    /**
     * Execute an API call with retry logic.
     * Automatically handles Retrofit Response and retries on server errors.
     * 
     * @param maxRetries Maximum number of retry attempts
     * @param block The suspending block that returns a Retrofit Response
     * @return Result wrapping success or failure
     */
    suspend fun <T> withApiRetry(
        maxRetries: Int = DEFAULT_MAX_RETRIES,
        block: suspend () -> Response<T>
    ): Result<Response<T>> {
        return try {
            val response = withRetry(
                maxRetries = maxRetries,
                shouldRetry = { e -> isRetryableException(e) }
            ) {
                val resp = block()
                // Throw on server errors so they get retried
                if (resp.code() in 500..599) {
                    throw ServerException(resp.code(), resp.message())
                }
                resp
            }
            Result.success(response)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
    
    /**
     * Determine if an exception is transient and worth retrying.
     */
    private fun isRetryableException(e: Exception): Boolean {
        return when (e) {
            is IOException -> true // Network errors
            is ServerException -> true // 5xx server errors
            else -> false
        }
    }
    
    /**
     * Exception representing a server error (5xx).
     */
    class ServerException(val code: Int, message: String) : Exception("Server error $code: $message")
}
