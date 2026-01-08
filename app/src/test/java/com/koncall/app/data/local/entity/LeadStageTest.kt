package com.koncall.app.data.local.entity

import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

/**
 * Unit tests for LeadStage object.
 * Tests stage constants and displayName() formatting.
 */
class LeadStageTest {

    // ==================
    // displayName() Tests
    // ==================

    @Test
    fun displayName_new_returnsNew() {
        assertEquals("New", LeadStage.displayName(LeadStage.NEW))
    }

    @Test
    fun displayName_contacted_returnsContacted() {
        assertEquals("Contacted", LeadStage.displayName(LeadStage.CONTACTED))
    }

    @Test
    fun displayName_interested_returnsInterested() {
        assertEquals("Interested", LeadStage.displayName(LeadStage.INTERESTED))
    }

    @Test
    fun displayName_applicationSubmitted_returnsApplication() {
        assertEquals("Application", LeadStage.displayName(LeadStage.APPLICATION_SUBMITTED))
    }

    @Test
    fun displayName_documentsCollected_returnsDocuments() {
        assertEquals("Documents", LeadStage.displayName(LeadStage.DOCUMENTS_COLLECTED))
    }

    @Test
    fun displayName_enrolled_returnsEnrolled() {
        assertEquals("Enrolled", LeadStage.displayName(LeadStage.ENROLLED))
    }

    @Test
    fun displayName_joined_returnsJoined() {
        assertEquals("Joined", LeadStage.displayName(LeadStage.JOINED))
    }

    @Test
    fun displayName_unknownStage_capitalizesFirstLetter() {
        assertEquals("Custom_stage", LeadStage.displayName("custom_stage"))
    }

    @Test
    fun displayName_alreadyCapitalized_capitalizes() {
        assertEquals("Already", LeadStage.displayName("already"))
    }

    // ==================
    // ALL_STAGES Tests
    // ==================

    @Test
    fun allStages_containsSevenStages() {
        assertEquals(7, LeadStage.ALL_STAGES.size)
    }

    @Test
    fun allStages_correctOrder() {
        val expected = listOf(
            LeadStage.NEW,
            LeadStage.CONTACTED,
            LeadStage.INTERESTED,
            LeadStage.APPLICATION_SUBMITTED,
            LeadStage.DOCUMENTS_COLLECTED,
            LeadStage.ENROLLED,
            LeadStage.JOINED
        )
        assertEquals(expected, LeadStage.ALL_STAGES)
    }

    @Test
    fun allStages_startsWithNew() {
        assertEquals(LeadStage.NEW, LeadStage.ALL_STAGES.first())
    }

    @Test
    fun allStages_endsWithJoined() {
        assertEquals(LeadStage.JOINED, LeadStage.ALL_STAGES.last())
    }

    // ==================
    // Stage Constants Tests
    // ==================

    @Test
    fun stageConstants_areSnakeCase() {
        assertEquals("new", LeadStage.NEW)
        assertEquals("contacted", LeadStage.CONTACTED)
        assertEquals("interested", LeadStage.INTERESTED)
        assertEquals("application_submitted", LeadStage.APPLICATION_SUBMITTED)
        assertEquals("documents_collected", LeadStage.DOCUMENTS_COLLECTED)
        assertEquals("enrolled", LeadStage.ENROLLED)
        assertEquals("joined", LeadStage.JOINED)
    }
}
