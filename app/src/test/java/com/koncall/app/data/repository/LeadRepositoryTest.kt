package com.koncall.app.data.repository

import com.koncall.app.data.local.dao.LeadDao
import com.koncall.app.data.local.entity.LeadEntity
import com.koncall.app.data.local.entity.LeadStage
import com.koncall.app.data.remote.api.KonCallApiService
import com.koncall.app.data.remote.dto.AssignedUserDto
import com.koncall.app.data.remote.dto.LeadDto
import com.koncall.app.data.remote.dto.LeadResponse
import com.koncall.app.data.remote.dto.LeadsResponse
import com.koncall.app.data.remote.dto.UpdateStageRequest
import io.mockk.Ordering
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
 * Tests for LeadRepository - the core CRM data layer.
 * 
 * Critical paths:
 * - syncLeadsFromServer() pagination
 * - updateLeadStage() optimistic updates
 * - DTO to Entity conversion
 */
class LeadRepositoryTest {

    private lateinit var repository: LeadRepository
    private lateinit var mockDao: LeadDao
    private lateinit var mockApi: KonCallApiService

    @Before
    fun setup() {
        mockDao = mockk(relaxed = true)
        mockApi = mockk(relaxed = true)
        repository = LeadRepository(mockDao, mockApi)
    }

    // ==================
    // syncLeadsFromServer() Tests
    // ==================

    @Test
    fun syncLeadsFromServer_singlePage_insertsAllLeads() = runTest {
        // Given: API returns one page with 10 leads (less than pageSize of 50)
        val leads = (1..10).map { createTestLeadDto(id = "lead-$it") }
        coEvery { mockApi.getLeads(page = 1, perPage = 50) } returns Response.success(
            LeadsResponse(data = leads)
        )

        // When
        val result = repository.syncLeadsFromServer()

        // Then
        assertTrue(result.isSuccess)
        assertEquals(10, result.getOrNull())
        coVerify { mockDao.insertLeads(match { it.size == 10 }) }
    }

    @Test
    fun syncLeadsFromServer_multiplePages_fetchesAllPages() = runTest {
        // Given: First page is full (50 leads), second page has 30
        val page1Leads = (1..50).map { createTestLeadDto(id = "lead-$it") }
        val page2Leads = (51..80).map { createTestLeadDto(id = "lead-$it") }
        
        coEvery { mockApi.getLeads(page = 1, perPage = 50) } returns Response.success(
            LeadsResponse(data = page1Leads)
        )
        coEvery { mockApi.getLeads(page = 2, perPage = 50) } returns Response.success(
            LeadsResponse(data = page2Leads)
        )

        // When
        val result = repository.syncLeadsFromServer()

        // Then
        assertTrue(result.isSuccess)
        assertEquals(80, result.getOrNull())
        // Should have called API twice
        coVerify { mockApi.getLeads(page = 1, perPage = 50) }
        coVerify { mockApi.getLeads(page = 2, perPage = 50) }
    }

    @Test
    fun syncLeadsFromServer_emptyResponse_returnsZero() = runTest {
        // Given: API returns empty list
        coEvery { mockApi.getLeads(page = 1, perPage = 50) } returns Response.success(
            LeadsResponse(data = emptyList())
        )

        // When
        val result = repository.syncLeadsFromServer()

        // Then
        assertTrue(result.isSuccess)
        assertEquals(0, result.getOrNull())
        // Should NOT insert anything
        coVerify(exactly = 0) { mockDao.insertLeads(any()) }
    }

    @Test
    fun syncLeadsFromServer_apiError_returnsFailure() = runTest {
        // Given: API returns 401
        coEvery { mockApi.getLeads(any(), any()) } returns Response.error(
            401,
            "Unauthorized".toResponseBody()
        )

        // When
        val result = repository.syncLeadsFromServer()

        // Then
        assertTrue(result.isFailure)
        coVerify(exactly = 0) { mockDao.insertLeads(any()) }
    }

    // ==================
    // updateLeadStage() Tests
    // ==================

    @Test
    fun updateLeadStage_success_updatesLocalAndRemote() = runTest {
        // Given: Lead exists locally with far-future updatedAt (to avoid conflict detection)
        val localLead = createTestLeadEntity(id = "lead-1", stage = LeadStage.NEW)
            .copy(updatedAt = Long.MAX_VALUE)
        coEvery { mockDao.getLeadById("lead-1") } returns localLead
        coEvery { mockDao.updateLeadStage(any(), any(), any()) } returns Unit
        coEvery { mockDao.updateLead(any()) } returns Unit

        // API returns updated lead
        val updatedDto = createTestLeadDto(id = "lead-1", stage = LeadStage.CONTACTED)
        coEvery { mockApi.updateLeadStage("lead-1", any()) } returns Response.success(
            LeadResponse(data = updatedDto)
        )

        // When
        val result = repository.updateLeadStage("lead-1", LeadStage.CONTACTED)

        // Then
        assertTrue("Expected success but got: ${result.exceptionOrNull()}", result.isSuccess)
        // First updates local DB (optimistic)
        coVerify { mockDao.updateLeadStage("lead-1", LeadStage.CONTACTED, any()) }
        // Then syncs to API
        coVerify { mockApi.updateLeadStage("lead-1", any()) }
    }

    @Test
    fun updateLeadStage_apiError_rollsBackToOriginalStage() = runTest {
        // Given: Lead exists with stage NEW (far-future updatedAt to avoid conflict detection)
        val originalLead = createTestLeadEntity(id = "lead-1", stage = LeadStage.NEW)
            .copy(updatedAt = Long.MAX_VALUE)
        coEvery { mockDao.getLeadById("lead-1") } returns originalLead
        coEvery { mockDao.updateLeadStage(any(), any(), any()) } returns Unit
        
        // API returns 500 error
        coEvery { mockApi.updateLeadStage(any(), any()) } returns Response.error(
            500,
            "Server error".toResponseBody()
        )

        // When: Try to update to INTERESTED (should fail)
        val result = repository.updateLeadStage("lead-1", LeadStage.INTERESTED)

        // Then
        assertTrue(result.isFailure)
        
        // Verify: First updates to new stage, then ROLLS BACK to original
        coVerify(ordering = Ordering.ORDERED) {
            mockDao.updateLeadStage("lead-1", LeadStage.INTERESTED, any())  // Optimistic
            mockDao.updateLeadStage("lead-1", LeadStage.NEW, any())         // Rollback!
        }
    }

    @Test
    fun updateLeadStage_networkException_rollsBackToOriginalStage() = runTest {
        // Given: Lead exists with stage CONTACTED (far-future updatedAt to avoid conflict detection)
        val originalLead = createTestLeadEntity(id = "lead-2", stage = LeadStage.CONTACTED)
            .copy(updatedAt = Long.MAX_VALUE)
        coEvery { mockDao.getLeadById("lead-2") } returns originalLead
        coEvery { mockDao.updateLeadStage(any(), any(), any()) } returns Unit
        
        // Network exception
        coEvery { mockApi.updateLeadStage(any(), any()) } throws java.io.IOException("Network error")

        // When
        val result = repository.updateLeadStage("lead-2", LeadStage.ENROLLED)

        // Then
        assertTrue(result.isFailure)
        assertTrue(result.exceptionOrNull() is java.io.IOException)
        
        // Verify rollback
        coVerify(ordering = Ordering.ORDERED) {
            mockDao.updateLeadStage("lead-2", LeadStage.ENROLLED, any())   // Optimistic
            mockDao.updateLeadStage("lead-2", LeadStage.CONTACTED, any())  // Rollback!
        }
    }



    // ==================
    // DTO to Entity Conversion Tests
    // ==================

    @Test
    fun syncLeadsFromServer_convertsFieldsCorrectly() = runTest {
        // Given: A lead with all fields populated
        val dto = LeadDto(
            id = "lead-full",
            firstName = "John",
            lastName = "Doe",
            studentName = "Johnny",
            fullName = "John Doe",
            phoneNumber = "+919876543210",
            alternatePhone = "+911234567890",
            email = "john@example.com",
            tags = listOf("tag1", "tag2"),
            source = "website",
            stage = LeadStage.INTERESTED,
            branchId = "branch-1",
            branchName = "Main Branch",
            universityId = "uni-1",
            universityName = "Test University",
            reminderAt = "2024-01-15T10:00:00",
            lastContactedAt = "2024-01-10T15:30:00",
            contactCount = 5,
            notes = "Test notes",
            status = null,
            assignedTo = AssignedUserDto(id = "user-1", name = "Agent A"),
            insertedAt = "2024-01-01T00:00:00",
            updatedAt = "2024-01-10T00:00:00"
        )
        
        coEvery { mockApi.getLeads(page = 1, perPage = 50) } returns Response.success(
            LeadsResponse(data = listOf(dto))
        )
        
        // Capture what gets inserted
        val insertedLeadsSlot = slot<List<LeadEntity>>()
        coEvery { mockDao.insertLeads(capture(insertedLeadsSlot)) } returns Unit

        // When
        repository.syncLeadsFromServer()

        // Then: Verify conversion
        val insertedLead = insertedLeadsSlot.captured.first()
        assertEquals("lead-full", insertedLead.id)
        assertEquals("John", insertedLead.firstName)
        assertEquals("Doe", insertedLead.lastName)
        assertEquals("+919876543210", insertedLead.phoneNumber)
        assertEquals(LeadStage.INTERESTED, insertedLead.stage)
        assertEquals("tag1,tag2", insertedLead.tags)
        assertEquals("user-1", insertedLead.assignedToId)
        assertEquals("Agent A", insertedLead.assignedToName)
    }

    // ==================
    // Helper Functions
    // ==================

    private fun createTestLeadDto(
        id: String = "test-lead",
        stage: String = LeadStage.NEW
    ) = LeadDto(
        id = id,
        firstName = "Test",
        lastName = "User",
        studentName = null,
        fullName = "Test User",
        phoneNumber = "+919876543210",
        alternatePhone = null,
        email = null,
        tags = null,
        source = null,
        stage = stage,
        branchId = null,
        branchName = null,
        universityId = null,
        universityName = null,
        reminderAt = null,
        lastContactedAt = null,
        contactCount = 0,
        notes = null,
        status = null,
        assignedTo = null,
        insertedAt = "2024-01-01T00:00:00",
        updatedAt = "2024-01-01T00:00:00"
    )

    private fun createTestLeadEntity(
        id: String = "test-lead",
        stage: String = LeadStage.NEW
    ) = LeadEntity(
        id = id,
        firstName = "Test",
        lastName = "User",
        phoneNumber = "+919876543210",
        stage = stage
    )
}
