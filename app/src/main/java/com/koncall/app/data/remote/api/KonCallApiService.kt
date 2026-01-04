package com.koncall.app.data.remote.api

import com.koncall.app.data.remote.dto.*
import retrofit2.Response
import retrofit2.http.*

interface KonCallApiService {

    // ==================
    // Authentication
    // ==================
    
    @POST("api/auth/register")
    suspend fun register(@Body request: RegisterRequest): Response<AuthResponse>
    
    @POST("api/auth/login")
    suspend fun login(@Body request: LoginRequest): Response<AuthResponse>
    
    @POST("api/auth/refresh")
    suspend fun refreshToken(): Response<TokenResponse>
    
    @DELETE("api/auth/logout")
    suspend fun logout(): Response<Unit>

    // ==================
    // Call Logs
    // ==================
    
    @GET("api/call-logs")
    suspend fun getCallLogs(
        @Query("page") page: Int = 1,
        @Query("per_page") perPage: Int = 50,
        @Query("call_type") callType: String? = null,
        @Query("start_date") startDate: String? = null,
        @Query("end_date") endDate: String? = null
    ): Response<CallLogsResponse>
    
    @POST("api/call-logs/sync")
    suspend fun syncCallLogs(@Body request: SyncCallLogsRequest): Response<SyncCallLogsResponse>
    
    @GET("api/call-logs/{id}")
    suspend fun getCallLog(@Path("id") id: String): Response<CallLogResponse>
    
    @Multipart
    @POST("api/recordings/upload")
    suspend fun uploadRecording(@Part file: okhttp3.MultipartBody.Part): Response<UploadResponse>
    
    // ==================
    // Leads
    // ==================
    
    @GET("api/leads")
    suspend fun getLeads(
        @Query("page") page: Int = 1,
        @Query("per_page") perPage: Int = 20,
        @Query("status_id") statusId: String? = null,
        @Query("search") search: String? = null
    ): Response<LeadsResponse>
    
    @POST("api/leads")
    suspend fun createLead(@Body request: CreateLeadRequest): Response<LeadResponse>
    
    @GET("api/leads/{id}")
    suspend fun getLead(@Path("id") id: String): Response<LeadResponse>
    
    @PUT("api/leads/{id}")
    suspend fun updateLead(@Path("id") id: String, @Body request: UpdateLeadRequest): Response<LeadResponse>
    
    @DELETE("api/leads/{id}")
    suspend fun deleteLead(@Path("id") id: String): Response<Unit>
    
    @PUT("api/leads/{id}/stage")
    suspend fun updateLeadStage(@Path("id") id: String, @Body request: UpdateStageRequest): Response<LeadResponse>
    
    @GET("api/leads/by-phone/{phone}")
    suspend fun getLeadByPhone(@Path("phone") phone: String): Response<LeadResponse>


    // ==================
    // Analytics
    // ==================
    
    @GET("api/analytics/summary")
    suspend fun getAnalyticsSummary(
        @Query("start_date") startDate: String? = null,
        @Query("end_date") endDate: String? = null
    ): Response<AnalyticsSummaryResponse>
    
    @GET("api/analytics/never-attended")
    suspend fun getNeverAttendedCalls(
        @Query("start_date") startDate: String? = null,
        @Query("end_date") endDate: String? = null
    ): Response<NeverAttendedResponse>
    
    @GET("api/analytics/not-picked-up")
    suspend fun getNotPickedUpCalls(
        @Query("start_date") startDate: String? = null,
        @Query("end_date") endDate: String? = null
    ): Response<NotPickedUpResponse>
    
    // ==================
    // Lead Statuses
    // ==================
    
    @GET("api/lead-statuses")
    suspend fun getLeadStatuses(): Response<LeadStatusesResponse>
    
    // ==================
    // Users (for lead assignment)
    // ==================
    
    @GET("api/users")
    suspend fun getUsers(): Response<UsersResponse>
    
    // ==================
    // Lead Import (Admin only)
    // ==================
    
    @POST("api/leads/import")
    suspend fun importLeads(@Body request: ImportLeadsRequest): Response<ImportLeadsResponse>
}

