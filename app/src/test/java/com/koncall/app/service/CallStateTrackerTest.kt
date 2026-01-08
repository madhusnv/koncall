package com.koncall.app.service

import android.telephony.TelephonyManager
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertNull
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test

/**
 * Unit tests for CallStateTracker state machine.
 * Tests call state transitions and duration calculation.
 */
class CallStateTrackerTest {

    private lateinit var tracker: CallStateTracker

    @Before
    fun setup() {
        tracker = CallStateTracker()
    }

    // ==================
    // Initial State Tests
    // ==================

    @Test
    fun initialState_isIdle() {
        val state = tracker.getCurrentState()
        assertEquals(TelephonyManager.CALL_STATE_IDLE, state.lastState)
        assertFalse(state.isOutgoing)
        assertNull(state.incomingNumber)
        assertEquals(0L, state.callStartTime)
    }

    // ==================
    // onOutgoingCall() Tests
    // ==================

    @Test
    fun onOutgoingCall_setsIsOutgoingTrue() {
        tracker.onOutgoingCall("+919876543210")
        
        val state = tracker.getCurrentState()
        assertTrue(state.isOutgoing)
        assertEquals("+919876543210", state.incomingNumber)
    }

    @Test
    fun onOutgoingCall_withNullNumber_stillSetsOutgoing() {
        tracker.onOutgoingCall(null)
        
        val state = tracker.getCurrentState()
        assertTrue(state.isOutgoing)
        assertNull(state.incomingNumber)
    }

    // ==================
    // onStateChange() Tests - Incoming Call Flow
    // ==================

    @Test
    fun onStateChange_idleToRinging_setsIncomingCall() {
        val result = tracker.onStateChange(TelephonyManager.CALL_STATE_RINGING, "+919876543210")
        
        assertEquals(TelephonyManager.CALL_STATE_RINGING, result.lastState)
        assertFalse(result.isOutgoing)
        assertEquals("+919876543210", result.incomingNumber)
        assertTrue(result.callStartTime > 0)
    }

    @Test
    fun onStateChange_ringingToOffhook_preservesStartTime() {
        // Simulate ringing first
        tracker.onStateChange(TelephonyManager.CALL_STATE_RINGING, "+919876543210")
        val stateAfterRinging = tracker.getCurrentState()
        val startTime = stateAfterRinging.callStartTime
        
        // Now answer the call
        Thread.sleep(10) // Small delay to ensure time difference
        val result = tracker.onStateChange(TelephonyManager.CALL_STATE_OFFHOOK, null)
        
        assertEquals(TelephonyManager.CALL_STATE_OFFHOOK, result.lastState)
        assertEquals(startTime, result.callStartTime) // Should preserve original start time
    }

    @Test
    fun onStateChange_offhookToIdle_returnsEndedState() {
        // Simulate a complete incoming call
        tracker.onStateChange(TelephonyManager.CALL_STATE_RINGING, "+919876543210")
        tracker.onStateChange(TelephonyManager.CALL_STATE_OFFHOOK, null)
        
        val result = tracker.onStateChange(TelephonyManager.CALL_STATE_IDLE, null)
        
        assertEquals(TelephonyManager.CALL_STATE_IDLE, result.lastState)
        // After IDLE, state should be reset
        val currentState = tracker.getCurrentState()
        assertEquals(TelephonyManager.CALL_STATE_IDLE, currentState.lastState)
        assertEquals(0L, currentState.callStartTime)
    }

    // ==================
    // onStateChange() Tests - Outgoing Call Flow
    // ==================

    @Test
    fun onStateChange_idleToOffhook_outgoingCall() {
        // Mark as outgoing first
        tracker.onOutgoingCall("+919876543210")
        
        val result = tracker.onStateChange(TelephonyManager.CALL_STATE_OFFHOOK, null)
        
        assertEquals(TelephonyManager.CALL_STATE_OFFHOOK, result.lastState)
        assertTrue(result.callStartTime > 0) // Should set start time for outgoing
    }

    // ==================
    // Duplicate State Change Tests
    // ==================

    @Test
    fun onStateChange_duplicateState_returnsCurrentState() {
        tracker.onStateChange(TelephonyManager.CALL_STATE_RINGING, "+919876543210")
        val firstState = tracker.getCurrentState()
        
        // Send same state again
        val result = tracker.onStateChange(TelephonyManager.CALL_STATE_RINGING, "+919876543210")
        
        assertEquals(firstState.lastState, result.lastState)
        assertEquals(firstState.callStartTime, result.callStartTime)
    }

    // ==================
    // calculateDuration() Tests
    // ==================

    @Test
    fun calculateDuration_noActiveCall_returnsZero() {
        val duration = tracker.calculateDuration()
        assertEquals(0, duration)
    }

    @Test
    fun calculateDuration_activeCall_returnsSeconds() {
        tracker.onStateChange(TelephonyManager.CALL_STATE_RINGING, "+919876543210")
        tracker.onStateChange(TelephonyManager.CALL_STATE_OFFHOOK, null)
        
        // Wait a bit
        Thread.sleep(100)
        
        val duration = tracker.calculateDuration()
        assertTrue(duration >= 0) // At least 0 seconds
    }

    // ==================
    // reset() Tests
    // ==================

    @Test
    fun reset_clearsAllState() {
        // Set up some state
        tracker.onOutgoingCall("+919876543210")
        tracker.onStateChange(TelephonyManager.CALL_STATE_OFFHOOK, null)
        
        // Reset
        tracker.reset()
        
        val state = tracker.getCurrentState()
        assertEquals(TelephonyManager.CALL_STATE_IDLE, state.lastState)
        assertFalse(state.isOutgoing)
        assertNull(state.incomingNumber)
        assertEquals(0L, state.callStartTime)
    }
}
