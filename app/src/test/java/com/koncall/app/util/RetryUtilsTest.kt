package com.koncall.app.util

import kotlinx.coroutines.runBlocking
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Assert.fail
import org.junit.Test
import java.io.IOException

/**
 * Unit tests for RetryUtils exponential backoff logic.
 */
class RetryUtilsTest {

    // ==================
    // withRetry() Tests
    // ==================

    @Test
    fun withRetry_successOnFirstTry_returnsImmediately() = runBlocking {
        var callCount = 0
        
        val result = RetryUtils.withRetry {
            callCount++
            "success"
        }
        
        assertEquals("success", result)
        assertEquals(1, callCount)
    }

    @Test
    fun withRetry_ioExceptionThenSuccess_retriesAndSucceeds() = runBlocking {
        var callCount = 0
        
        val result = RetryUtils.withRetry(
            maxRetries = 3,
            initialDelayMs = 10,  // Short delay for tests
            maxDelayMs = 100
        ) {
            callCount++
            if (callCount < 3) {
                throw IOException("Network error")
            }
            "success after retries"
        }
        
        assertEquals("success after retries", result)
        assertEquals(3, callCount)
    }

    @Test
    fun withRetry_allRetriesFail_throwsLastException() = runBlocking {
        var callCount = 0
        
        try {
            RetryUtils.withRetry(
                maxRetries = 2,
                initialDelayMs = 10,
                maxDelayMs = 50
            ) {
                callCount++
                throw IOException("Persistent network error")
            }
            fail("Should have thrown exception")
        } catch (e: IOException) {
            assertEquals("Persistent network error", e.message)
        }
        
        assertEquals(3, callCount) // Initial + 2 retries
    }

    @Test
    fun withRetry_nonRetryableException_throwsImmediately() = runBlocking {
        var callCount = 0
        
        try {
            RetryUtils.withRetry(
                maxRetries = 3,
                initialDelayMs = 10
            ) {
                callCount++
                throw IllegalArgumentException("Bad argument")
            }
            fail("Should have thrown exception")
        } catch (e: IllegalArgumentException) {
            assertEquals("Bad argument", e.message)
        }
        
        assertEquals(1, callCount) // No retries for non-retryable
    }

    @Test
    fun withRetry_customRetryPredicate_usesCustomLogic() = runBlocking {
        var callCount = 0
        
        val result = RetryUtils.withRetry(
            maxRetries = 3,
            initialDelayMs = 10,
            shouldRetry = { e -> e is IllegalStateException }
        ) {
            callCount++
            if (callCount < 2) {
                throw IllegalStateException("Temporary state issue")
            }
            "recovered"
        }
        
        assertEquals("recovered", result)
        assertEquals(2, callCount)
    }

    @Test
    fun withRetry_zeroRetries_failsImmediately() = runBlocking {
        var callCount = 0
        
        try {
            RetryUtils.withRetry(
                maxRetries = 0,
                initialDelayMs = 10
            ) {
                callCount++
                throw IOException("Single attempt failure")
            }
            fail("Should have thrown exception")
        } catch (e: IOException) {
            // Expected
        }
        
        assertEquals(1, callCount)
    }

    // ==================
    // ServerException Tests
    // ==================

    @Test
    fun serverException_storesCodeAndMessage() {
        val exception = RetryUtils.ServerException(503, "Service Unavailable")
        
        assertEquals(503, exception.code)
        assertTrue(exception.message!!.contains("503"))
        assertTrue(exception.message!!.contains("Service Unavailable"))
    }

    @Test
    fun serverException_isRetryable() = runBlocking {
        var callCount = 0
        
        val result = RetryUtils.withRetry(
            maxRetries = 2,
            initialDelayMs = 10
        ) {
            callCount++
            if (callCount < 2) {
                throw RetryUtils.ServerException(500, "Internal Error")
            }
            "recovered from server error"
        }
        
        assertEquals("recovered from server error", result)
        assertEquals(2, callCount)
    }
}
