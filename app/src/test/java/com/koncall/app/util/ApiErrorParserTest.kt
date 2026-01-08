package com.koncall.app.util

import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertNull
import org.junit.Test
import retrofit2.Response
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.ResponseBody.Companion.toResponseBody

/**
 * Unit tests for ApiErrorParser.
 * Tests error parsing from various API response formats.
 */
class ApiErrorParserTest {

    // ==================
    // parseError() Tests
    // ==================

    @Test
    fun parseError_jsonWithErrorField_extractsMessage() {
        val errorBody = """{"error": "Invalid credentials"}""".toResponseBody("application/json".toMediaType())
        val response = Response.error<Any>(401, errorBody)

        val exception = ApiErrorParser.parseError(response)

        assertEquals(401, exception.code)
        assertEquals("Invalid credentials", exception.message)
    }

    @Test
    fun parseError_jsonWithMessageField_extractsMessage() {
        val errorBody = """{"message": "Resource not found"}""".toResponseBody("application/json".toMediaType())
        val response = Response.error<Any>(404, errorBody)

        val exception = ApiErrorParser.parseError(response)

        assertEquals(404, exception.code)
        assertEquals("Resource not found", exception.message)
    }

    @Test
    fun parseError_jsonWithErrorsMap_formatsAsString() {
        val errorBody = """{"errors": {"phone": ["is required", "must be valid"], "name": ["is too short"]}}"""
            .toResponseBody("application/json".toMediaType())
        val response = Response.error<Any>(422, errorBody)

        val exception = ApiErrorParser.parseError(response)

        assertEquals(422, exception.code)
        // Should contain field names and messages
        assert(exception.message.contains("phone"))
        assert(exception.message.contains("required") || exception.message.contains("valid"))
    }

    @Test
    fun parseError_emptyBody_401_returnsLoginMessage() {
        val errorBody = "".toResponseBody("application/json".toMediaType())
        val response = Response.error<Any>(401, errorBody)

        val exception = ApiErrorParser.parseError(response)

        assertEquals(401, exception.code)
        assertEquals("Please log in again", exception.message)
    }

    @Test
    fun parseError_emptyBody_403_returnsForbiddenMessage() {
        val errorBody = "".toResponseBody("application/json".toMediaType())
        val response = Response.error<Any>(403, errorBody)

        val exception = ApiErrorParser.parseError(response)

        assertEquals(403, exception.code)
        assertEquals("You don't have permission to do this", exception.message)
    }

    @Test
    fun parseError_emptyBody_404_returnsNotFoundMessage() {
        val errorBody = "".toResponseBody("application/json".toMediaType())
        val response = Response.error<Any>(404, errorBody)

        val exception = ApiErrorParser.parseError(response)

        assertEquals(404, exception.code)
        assertEquals("Not found", exception.message)
    }

    @Test
    fun parseError_emptyBody_422_returnsValidationMessage() {
        val errorBody = "".toResponseBody("application/json".toMediaType())
        val response = Response.error<Any>(422, errorBody)

        val exception = ApiErrorParser.parseError(response)

        assertEquals(422, exception.code)
        assertEquals("Validation failed", exception.message)
    }

    @Test
    fun parseError_emptyBody_500_returnsServerErrorMessage() {
        val errorBody = "".toResponseBody("application/json".toMediaType())
        val response = Response.error<Any>(500, errorBody)

        val exception = ApiErrorParser.parseError(response)

        assertEquals(500, exception.code)
        assertEquals("Server error, please try again", exception.message)
    }

    @Test
    fun parseError_emptyBody_503_returnsUnavailableMessage() {
        val errorBody = "".toResponseBody("application/json".toMediaType())
        val response = Response.error<Any>(503, errorBody)

        val exception = ApiErrorParser.parseError(response)

        assertEquals(503, exception.code)
        assertEquals("Server temporarily unavailable", exception.message)
    }

    @Test
    fun parseError_malformedJson_returnsDefaultMessage() {
        val errorBody = "not valid json {{{{".toResponseBody("application/json".toMediaType())
        val response = Response.error<Any>(400, errorBody)

        val exception = ApiErrorParser.parseError(response)

        assertEquals(400, exception.code)
        assertEquals("Invalid request", exception.message)
    }

    @Test
    fun parseError_unknownStatusCode_returnsGenericMessage() {
        val errorBody = "".toResponseBody("application/json".toMediaType())
        val response = Response.error<Any>(418, errorBody) // I'm a teapot

        val exception = ApiErrorParser.parseError(response)

        assertEquals(418, exception.code)
        assert(exception.message.contains("418"))
    }

    // ==================
    // ApiException Tests
    // ==================

    @Test
    fun apiException_storesErrorsMap() {
        val errors = mapOf("field" to listOf("error1", "error2"))
        val exception = ApiException(422, "Validation failed", errors)

        assertNotNull(exception.errors)
        assertEquals(2, exception.errors?.get("field")?.size)
    }

    @Test
    fun apiException_errorsCanBeNull() {
        val exception = ApiException(500, "Server error")

        assertNull(exception.errors)
    }
}
