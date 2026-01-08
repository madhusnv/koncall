package com.koncall.app.data.repository

import com.koncall.app.data.local.dao.CallLogDao
import com.koncall.app.data.local.entity.CallLogEntity
import com.koncall.app.data.local.entity.SyncStatus
import com.koncall.app.data.remote.api.KonCallApiService
import com.koncall.app.data.remote.dto.SyncCallLogsRequest
import com.koncall.app.data.remote.dto.SyncCallLogsResponse
import com.koncall.app.data.remote.dto.SyncResultDto
import com.koncall.app.data.remote.dto.SyncedCallLogDto
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.mockk
import io.mockk.slot
import kotlinx.coroutines.test.runTest
import okhttp3.ResponseBody.Companion.toResponseBody
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test
import retrofit2.Response

/**
 * Tests for CallLogRepository.syncCallLogs() - the critical sync workflow.
 * 
 * This is the core business logic: syncing local call logs to the backend
 * and linking them to leads when the API returns lead associations.
 */
class CallLogRepositoryTest {

    private lateinit var repository: CallLogRepository
    private lateinit var mockDao: CallLogDao
    private lateinit var mockApi: KonCallApiService

    @Before
    fun setup() {
        mockDao = mockk(relaxed = true)
        mockApi = mockk(relaxed = true)
        repository = CallLogRepository(mockDao, mockApi)
    }

    // ==================
    // getPendingCallLogs() Tests
    // ==================

    @Test
    fun getPendingCallLogs_returnsPendingLogs() = runTest {
        // Given
        val pendingLog = createTestCallLog(id = "local-1", syncStatus = SyncStatus.PENDING)
        coEvery { mockDao.getCallLogsBySyncStatus(SyncStatus.PENDING) } returns listOf(pendingLog)

        // When
        val result = repository.getPendingCallLogs()

        // Then
        assertEquals(1, result.size)
        assertEquals("local-1", result.first().id)
        coVerify { mockDao.getCallLogsBySyncStatus(SyncStatus.PENDING) }
    }

    // ==================
    // syncCallLogs() Tests
    // ==================

    @Test
    fun syncCallLogs_noPendingLogs_returnsZero() = runTest {
        // Given: No pending logs
        coEvery { mockDao.getCallLogsBySyncStatus(SyncStatus.PENDING) } returns emptyList()

        // When
        val result = repository.syncCallLogs()

        // Then
        assertTrue(result.isSuccess)
        assertEquals(0, result.getOrNull())
        // API should NOT be called
        coVerify(exactly = 0) { mockApi.syncCallLogs(any()) }
    }

    @Test
    fun syncCallLogs_apiSuccess_marksSynced() = runTest {
        // Given: One pending log
        val pendingLog = createTestCallLog(
            id = "local-1",
            deviceCallId = 1001L,
            phoneNumber = "+919876543210",
            syncStatus = SyncStatus.PENDING
        )
        coEvery { mockDao.getCallLogsBySyncStatus(SyncStatus.PENDING) } returns listOf(pendingLog)
        coEvery { mockDao.getCallLogByDeviceId(1001L) } returns pendingLog

        // API returns success with server ID
        val syncedDto = SyncedCallLogDto(
            id = "server-1",
            deviceCallId = 1001L,
            leadId = null
        )
        val apiResponse = SyncCallLogsResponse(
            data = SyncResultDto(
                syncedCount = 1,
                synced = listOf(syncedDto),
                failedCount = 0
            )
        )
        coEvery { mockApi.syncCallLogs(any()) } returns Response.success(apiResponse)

        // When
        val result = repository.syncCallLogs()

        // Then
        assertTrue(result.isSuccess)
        assertEquals(1, result.getOrNull())
        
        // Verify log was marked as synced with server ID
        coVerify { mockDao.markAsSynced("local-1", "server-1", SyncStatus.SYNCED) }
    }

    @Test
    fun syncCallLogs_partialSuccess_marksOnlySyncedLogs() = runTest {
        // Given: Two pending logs
        val log1 = createTestCallLog(id = "local-1", deviceCallId = 1001L, syncStatus = SyncStatus.PENDING)
        val log2 = createTestCallLog(id = "local-2", deviceCallId = 1002L, syncStatus = SyncStatus.PENDING)
        
        coEvery { mockDao.getCallLogsBySyncStatus(SyncStatus.PENDING) } returns listOf(log1, log2)
        coEvery { mockDao.getCallLogByDeviceId(1001L) } returns log1
        coEvery { mockDao.getCallLogByDeviceId(1002L) } returns log2

        // API returns success but ONLY for log1 (log2 failed on server)
        val syncedDto1 = SyncedCallLogDto(id = "server-1", deviceCallId = 1001L, leadId = null)
        val apiResponse = SyncCallLogsResponse(
            data = SyncResultDto(
                syncedCount = 1,
                synced = listOf(syncedDto1),
                failedCount = 1
            )
        )
        coEvery { mockApi.syncCallLogs(any()) } returns Response.success(apiResponse)

        // When
        val result = repository.syncCallLogs()

        // Then
        assertTrue(result.isSuccess)
        assertEquals(1, result.getOrNull()) // Count matches server synced count
        
        // Verify log1 was marked as synced
        coVerify { mockDao.markAsSynced("local-1", "server-1", SyncStatus.SYNCED) }
        
        // Verify log2 was NOT touched (remains PENDING)
        coVerify(exactly = 0) { mockDao.markAsSynced("local-2", any(), any()) }
    }

    @Test
    fun syncCallLogs_apiReturnsLeadId_linksToLead() = runTest {
        // Given: Pending log for a known lead's number
        val pendingLog = createTestCallLog(
            id = "local-2",
            deviceCallId = 2001L,
            phoneNumber = "+919876543210",
            syncStatus = SyncStatus.PENDING
        )
        coEvery { mockDao.getCallLogsBySyncStatus(SyncStatus.PENDING) } returns listOf(pendingLog)
        coEvery { mockDao.getCallLogByDeviceId(2001L) } returns pendingLog

        // API returns success WITH leadId (backend matched to a lead)
        val syncedDto = SyncedCallLogDto(
            id = "server-2",
            deviceCallId = 2001L,
            leadId = "lead-123"  // Backend found this is a lead's number
        )
        val apiResponse = SyncCallLogsResponse(
            data = SyncResultDto(
                syncedCount = 1,
                synced = listOf(syncedDto),
                failedCount = 0
            )
        )
        coEvery { mockApi.syncCallLogs(any()) } returns Response.success(apiResponse)

        // When
        val result = repository.syncCallLogs()

        // Then
        assertTrue(result.isSuccess)
        
        // Verify log was linked to lead
        coVerify { mockDao.linkToLead("local-2", "lead-123") }
    }

    @Test
    fun syncCallLogs_apiError_returnsFailure() = runTest {
        // Given: Pending log
        val pendingLog = createTestCallLog(
            id = "local-3",
            deviceCallId = 3001L,
            syncStatus = SyncStatus.PENDING
        )
        coEvery { mockDao.getCallLogsBySyncStatus(SyncStatus.PENDING) } returns listOf(pendingLog)

        // API returns error
        coEvery { mockApi.syncCallLogs(any()) } returns Response.error(
            500,
            "Internal Server Error".toResponseBody()
        )

        // When
        val result = repository.syncCallLogs()

        // Then
        assertTrue(result.isFailure)
        assertTrue(result.exceptionOrNull()?.message?.contains("500") == true)
        
        // Log should NOT be marked as synced
        coVerify(exactly = 0) { mockDao.markAsSynced(any(), any(), any()) }
    }

    @Test
    fun syncCallLogs_networkException_returnsFailure() = runTest {
        // Given: Pending log
        val pendingLog = createTestCallLog(
            id = "local-4",
            deviceCallId = 4001L,
            syncStatus = SyncStatus.PENDING
        )
        coEvery { mockDao.getCallLogsBySyncStatus(SyncStatus.PENDING) } returns listOf(pendingLog)

        // Network exception
        coEvery { mockApi.syncCallLogs(any()) } throws java.io.IOException("Network unreachable")

        // When
        val result = repository.syncCallLogs()

        // Then
        assertTrue(result.isFailure)
        assertTrue(result.exceptionOrNull() is java.io.IOException)
        
        // Log should NOT be marked as synced
        coVerify(exactly = 0) { mockDao.markAsSynced(any(), any(), any()) }
    }

    @Test
    fun syncCallLogs_sendsCorrectDtoFormat() = runTest {
        // Given: Pending log with specific data
        val pendingLog = createTestCallLog(
            id = "local-5",
            deviceCallId = 5001L,
            phoneNumber = "+919876543210",
            contactName = "John Doe",
            callType = "incoming",
            duration = 120,
            callDateTime = 1704067200000L, // 2024-01-01 00:00:00 UTC
            syncStatus = SyncStatus.PENDING
        )
        coEvery { mockDao.getCallLogsBySyncStatus(SyncStatus.PENDING) } returns listOf(pendingLog)

        // Capture the request sent to API
        val requestSlot = slot<SyncCallLogsRequest>()
        coEvery { mockApi.syncCallLogs(capture(requestSlot)) } returns Response.success(
            SyncCallLogsResponse(
                data = SyncResultDto(syncedCount = 0, synced = emptyList(), failedCount = 0)
            )
        )

        // When
        repository.syncCallLogs()

        // Then: Verify DTO format
        val sentDto = requestSlot.captured.callLogs.first()
        assertEquals(5001L, sentDto.deviceCallId)
        assertEquals("+919876543210", sentDto.phoneNumber)
        assertEquals("John Doe", sentDto.contactName)
        assertEquals("incoming", sentDto.callType)
        assertEquals(120, sentDto.duration)
        
        // Strict TimeZone Verification: 
        // 1704067200000L is 2024-01-01 00:00:00 UTC
        // The repository forces UTC timezone, so output MUST be:
        assertEquals("2024-01-01T00:00:00Z", sentDto.callDatetime)
    }

    // ==================
    // Helper Functions
    // ==================

    private fun createTestCallLog(
        id: String = "test-id",
        deviceCallId: Long = 1L,
        phoneNumber: String = "+919876543210",
        contactName: String? = null,
        callType: String = "incoming",
        duration: Int = 60,
        callDateTime: Long = System.currentTimeMillis(),
        syncStatus: String = SyncStatus.PENDING
    ) = CallLogEntity(
        id = id,
        deviceCallId = deviceCallId,
        phoneNumber = phoneNumber,
        contactName = contactName,
        callType = callType,
        duration = duration,
        callDateTime = callDateTime,
        syncStatus = syncStatus
    )
}
