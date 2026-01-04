package com.koncall.app.data.remote.dto

import com.google.gson.annotations.SerializedName

// ==================
// Auth DTOs
// ==================

data class RegisterRequest(
    @SerializedName("org_code") val orgCode: String,
    val phone: String,
    val name: String,
    val password: String,
    val email: String? = null,
    @SerializedName("device_info") val deviceInfo: DeviceInfo? = null
)

data class LoginRequest(
    @SerializedName("org_code") val orgCode: String,
    val phone: String,
    val password: String,
    @SerializedName("device_id") val deviceId: String? = null,
    @SerializedName("fcm_token") val fcmToken: String? = null
)

data class DeviceInfo(
    val name: String? = null,
    val model: String? = null,
    @SerializedName("os_version") val osVersion: String? = null,
    @SerializedName("app_version") val appVersion: String? = null,
    @SerializedName("fcm_token") val fcmToken: String? = null,
    @SerializedName("sim_numbers") val simNumbers: List<String>? = null
)

data class AuthResponse(
    val data: AuthData
)

data class AuthData(
    val user: UserDto,
    val device: DeviceDto? = null,
    val token: String,
    @SerializedName("token_type") val tokenType: String
)

data class TokenResponse(
    val data: TokenData
)

data class TokenData(
    val token: String,
    @SerializedName("token_type") val tokenType: String
)

data class UserDto(
    val id: String,
    val name: String,
    val phone: String,
    val email: String?,
    val role: String,
    @SerializedName("organization_id") val organizationId: String
)

data class DeviceDto(
    val id: String,
    @SerializedName("device_name") val deviceName: String?,
    @SerializedName("device_model") val deviceModel: String?,
    @SerializedName("is_active") val isActive: Boolean
)

// ==================
// Call Log DTOs
// ==================

data class CallLogsResponse(
    val data: List<CallLogDto>
)

data class CallLogResponse(
    val data: CallLogDto
)

data class CallLogDto(
    val id: String,
    @SerializedName("phone_number") val phoneNumber: String,
    @SerializedName("contact_name") val contactName: String?,
    @SerializedName("call_type") val callType: String,
    val duration: Int,
    @SerializedName("call_datetime") val callDatetime: String,
    @SerializedName("sim_number") val simNumber: String?,
    @SerializedName("sim_slot") val simSlot: Int?,
    @SerializedName("has_recording") val hasRecording: Boolean,
    @SerializedName("recording_url") val recordingUrl: String?,
    @SerializedName("device_call_id") val deviceCallId: Long?,
    @SerializedName("lead_id") val leadId: String?,
    val lead: LeadSummaryDto?,
    val notes: List<CallNoteDto>?,
    @SerializedName("inserted_at") val insertedAt: String
)

data class CallNoteDto(
    val id: String,
    val content: String,
    @SerializedName("created_at") val createdAt: String
)

data class LeadSummaryDto(
    val id: String,
    val name: String,
    @SerializedName("phone_number") val phoneNumber: String
)

data class SyncCallLogsRequest(
    @SerializedName("call_logs") val callLogs: List<SyncCallLogDto>
)

data class SyncCallLogDto(
    @SerializedName("device_call_id") val deviceCallId: Long,
    @SerializedName("phone_number") val phoneNumber: String,
    @SerializedName("contact_name") val contactName: String?,
    @SerializedName("call_type") val callType: String,
    val duration: Int,
    @SerializedName("call_datetime") val callDatetime: String,
    @SerializedName("sim_number") val simNumber: String?,
    @SerializedName("sim_slot") val simSlot: Int?
)

data class SyncCallLogsResponse(
    val data: SyncResultDto
)

data class SyncResultDto(
    @SerializedName("synced_count") val syncedCount: Int,
    val synced: List<SyncedCallLogDto>,
    @SerializedName("failed_count") val failedCount: Int
)

data class SyncedCallLogDto(
    val id: String,
    @SerializedName("device_call_id") val deviceCallId: Long,
    @SerializedName("lead_id") val leadId: String?
)

// ==================
// Lead DTOs
// ==================

data class LeadsResponse(
    val data: List<LeadDto>
)

data class LeadResponse(
    val data: LeadDto
)

data class LeadDto(
    val id: String,
    @SerializedName("first_name") val firstName: String?,
    @SerializedName("last_name") val lastName: String?,
    @SerializedName("student_name") val studentName: String?,
    @SerializedName("full_name") val fullName: String?,
    @SerializedName("phone_number") val phoneNumber: String,
    @SerializedName("alternate_phone") val alternatePhone: String?,
    val email: String?,
    val tags: List<String>?,
    val source: String?,
    // Education CRM fields
    val stage: String?,
    @SerializedName("branch_id") val branchId: String?,
    @SerializedName("branch_name") val branchName: String?,
    @SerializedName("university_id") val universityId: String?,
    @SerializedName("university_name") val universityName: String?,
    @SerializedName("reminder_at") val reminderAt: String?,
    @SerializedName("last_contacted_at") val lastContactedAt: String?,
    @SerializedName("contact_count") val contactCount: Int,
    val notes: String?,
    val status: LeadStatusDto?,
    @SerializedName("assigned_to") val assignedTo: AssignedUserDto?,
    @SerializedName("inserted_at") val insertedAt: String,
    @SerializedName("updated_at") val updatedAt: String
)

data class LeadStatusDto(
    val id: String,
    val name: String,
    val color: String
)

data class AssignedUserDto(
    val id: String,
    val name: String
)

data class CreateLeadRequest(
    @SerializedName("first_name") val firstName: String,
    @SerializedName("last_name") val lastName: String? = null,
    @SerializedName("student_name") val studentName: String? = null,
    @SerializedName("phone_number") val phoneNumber: String,
    @SerializedName("alternate_phone") val alternatePhone: String? = null,
    val email: String? = null,
    @SerializedName("status_id") val statusId: String? = null,
    val tags: List<String>? = null,
    val source: String? = null,
    val notes: String? = null,
    @SerializedName("branch_id") val branchId: String? = null,
    @SerializedName("university_id") val universityId: String? = null
)

data class UpdateLeadRequest(
    @SerializedName("first_name") val firstName: String? = null,
    @SerializedName("last_name") val lastName: String? = null,
    @SerializedName("student_name") val studentName: String? = null,
    @SerializedName("phone_number") val phoneNumber: String? = null,
    @SerializedName("alternate_phone") val alternatePhone: String? = null,
    val email: String? = null,
    @SerializedName("status_id") val statusId: String? = null,
    val stage: String? = null,
    val tags: List<String>? = null,
    val notes: String? = null,
    @SerializedName("reminder_at") val reminderAt: String? = null,
    @SerializedName("branch_id") val branchId: String? = null,
    @SerializedName("university_id") val universityId: String? = null
)

data class UpdateStageRequest(
    val stage: String
)

data class LeadStatusesResponse(
    val data: List<LeadStatusDto>
)



// ==================
// Analytics DTOs
// ==================

data class AnalyticsSummaryResponse(
    val data: AnalyticsSummaryDto
)

data class AnalyticsSummaryDto(
    @SerializedName("total_calls") val totalCalls: Int,
    @SerializedName("total_duration") val totalDuration: Int,
    val incoming: Int,
    val outgoing: Int,
    val missed: Int,
    val rejected: Int,
    @SerializedName("unique_contacts") val uniqueContacts: Int,
    @SerializedName("connected_calls") val connectedCalls: Int,
    @SerializedName("avg_duration") val avgDuration: Int
)

data class NeverAttendedResponse(
    val data: List<NeverAttendedCallDto>
)

data class NeverAttendedCallDto(
    @SerializedName("phone_number") val phoneNumber: String,
    @SerializedName("contact_name") val contactName: String?,
    @SerializedName("missed_count") val missedCount: Int,
    @SerializedName("last_missed") val lastMissed: String
)

data class NotPickedUpResponse(
    val data: List<NotPickedUpCallDto>
)

data class NotPickedUpCallDto(
    @SerializedName("phone_number") val phoneNumber: String,
    @SerializedName("contact_name") val contactName: String?,
    val attempts: Int,
    @SerializedName("last_attempt") val lastAttempt: String
)

// ==================
// Users DTOs (for lead assignment)
// ==================

data class UsersResponse(
    val data: List<UserForAssignmentDto>
)

data class UserForAssignmentDto(
    val id: String,
    val name: String,
    val phone: String?,
    val email: String?,
    val role: String,
    @SerializedName("is_active") val isActive: Boolean
)

// ==================
// Lead Import DTOs (Admin only)
// ==================

data class ImportLeadsRequest(
    @SerializedName("csv_content") val csvContent: String,
    @SerializedName("user_ids") val userIds: List<String>
)

data class ImportLeadsResponse(
    val success: Boolean,
    val total: Int,
    val imported: Int,
    val failed: Int,
    val errors: List<String>?
)
