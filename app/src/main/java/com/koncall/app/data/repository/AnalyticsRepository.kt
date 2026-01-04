package com.koncall.app.data.repository

import com.koncall.app.data.remote.api.KonCallApiService
import com.koncall.app.data.remote.dto.NeverAttendedCallDto
import com.koncall.app.data.remote.dto.NotPickedUpCallDto
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AnalyticsRepository @Inject constructor(
    private val apiService: KonCallApiService
) {
    suspend fun getNeverAttendedCalls(startDate: String? = null, endDate: String? = null): Result<List<NeverAttendedCallDto>> {
        return try {
            val response = apiService.getNeverAttendedCalls(startDate, endDate)
            if (response.isSuccessful) {
                Result.success(response.body()?.data ?: emptyList())
            } else {
                Result.failure(Exception("Failed to fetch never attended calls: ${response.code()}"))
            }
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    suspend fun getNotPickedUpCalls(startDate: String? = null, endDate: String? = null): Result<List<NotPickedUpCallDto>> {
        return try {
            val response = apiService.getNotPickedUpCalls(startDate, endDate)
            if (response.isSuccessful) {
                Result.success(response.body()?.data ?: emptyList())
            } else {
                Result.failure(Exception("Failed to fetch not picked up calls: ${response.code()}"))
            }
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}
