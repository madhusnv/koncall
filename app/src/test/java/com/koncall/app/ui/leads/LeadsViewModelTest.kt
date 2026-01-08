package com.koncall.app.ui.leads

import com.koncall.app.data.local.entity.LeadEntity
import com.koncall.app.data.local.entity.LeadStage
import com.koncall.app.data.repository.LeadRepository
import io.mockk.coEvery
import io.mockk.mockk
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.test.StandardTestDispatcher
import kotlinx.coroutines.test.advanceUntilIdle
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.test.setMain
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Before
import org.junit.Test
import java.io.IOException

@OptIn(ExperimentalCoroutinesApi::class)
class LeadsViewModelTest {

    private lateinit var viewModel: LeadsViewModel
    private lateinit var mockRepository: LeadRepository
    private val testDispatcher = StandardTestDispatcher()

    @Before
    fun setup() {
        Dispatchers.setMain(testDispatcher)
        mockRepository = mockk(relaxed = true)
        
        // Default happy path for init block
        coEvery { mockRepository.getAllLeads() } returns flowOf(emptyList())
        coEvery { mockRepository.syncLeadsFromServer() } returns Result.success(0)
    }

    @After
    fun tearDown() {
        Dispatchers.resetMain()
    }
    
    // ==================
    // updateLeadStage() Tests
    // ==================

    @Test
    fun updateLeadStage_repositoryFailure_setsErrorState() = runTest(testDispatcher) {
        // Given: ViewModel is initialized
        viewModel = LeadsViewModel(mockRepository, mockk())
        advanceUntilIdle() // Process init loading

        // Repository fails to update stage (rollback happens in repo, but VM should catch error)
        coEvery { mockRepository.updateLeadStage("lead-1", LeadStage.CONTACTED) } returns 
            Result.failure(Exception("Sync failed"))

        // When
        viewModel.updateLeadStage("lead-1", LeadStage.CONTACTED)
        advanceUntilIdle()

        // Then: ViewModel should expose the error
        // CURRENTLY THIS FAILS because VM ignores the result
        assertEquals("Sync failed", viewModel.uiState.value.error)
    }
}
