package com.koncall.app.util

import com.google.gson.Gson
import com.google.gson.annotations.SerializedName
import retrofit2.Response

/**
 * Custom exception for API errors with parsed error messages
 */
class ApiException(
    val code: Int,
    override val message: String,
    val errors: Map<String, List<String>>? = null
) : Exception(message)

/**
 * API error response structure matching Phoenix JSON API format
 */
data class ApiErrorResponse(
    @SerializedName("error") val error: String? = null,
    @SerializedName("errors") val errors: Map<String, List<String>>? = null,
    @SerializedName("message") val message: String? = null
)

/**
 * Utility object for parsing API error responses
 */
object ApiErrorParser {
    private val gson = Gson()

    /**
     * Parse error response body into a user-friendly message
     */
    fun parseError(response: Response<*>): ApiException {
        val code = response.code()
        val errorBody = response.errorBody()?.string()

        if (errorBody.isNullOrEmpty()) {
            return ApiException(code, getDefaultMessage(code))
        }

        return try {
            val errorResponse = gson.fromJson(errorBody, ApiErrorResponse::class.java)
            val message = errorResponse.error
                ?: errorResponse.message
                ?: formatErrors(errorResponse.errors)
                ?: getDefaultMessage(code)

            ApiException(code, message, errorResponse.errors)
        } catch (e: Exception) {
            ApiException(code, getDefaultMessage(code))
        }
    }

    /**
     * Format validation errors map into readable string
     */
    private fun formatErrors(errors: Map<String, List<String>>?): String? {
        if (errors.isNullOrEmpty()) return null

        return errors.entries.joinToString("; ") { (field, messages) ->
            "$field: ${messages.joinToString(", ")}"
        }
    }

    /**
     * Get default error message based on HTTP status code
     */
    private fun getDefaultMessage(code: Int): String = when (code) {
        400 -> "Invalid request"
        401 -> "Please log in again"
        403 -> "You don't have permission to do this"
        404 -> "Not found"
        422 -> "Validation failed"
        500 -> "Server error, please try again"
        502, 503, 504 -> "Server temporarily unavailable"
        else -> "Something went wrong (Error $code)"
    }
}

/**
 * Extension function to convert Response to Result with proper error parsing
 */
suspend fun <T> Response<T>.toResult(): Result<T> {
    return if (isSuccessful) {
        body()?.let { Result.success(it) }
            ?: Result.failure(ApiException(code(), "Empty response"))
    } else {
        Result.failure(ApiErrorParser.parseError(this))
    }
}

/**
 * Extension function to get data from a response wrapper
 */
suspend fun <T, R> Response<T>.toResultWithData(
    extractor: (T) -> R?
): Result<R> {
    return if (isSuccessful) {
        body()?.let { extractor(it) }?.let { Result.success(it) }
            ?: Result.failure(ApiException(code(), "No data returned"))
    } else {
        Result.failure(ApiErrorParser.parseError(this))
    }
}
