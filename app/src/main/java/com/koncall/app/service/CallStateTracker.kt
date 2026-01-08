package com.koncall.app.service

import android.telephony.TelephonyManager
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Thread-safe singleton to track phone call state.
 * 
 * Replaces the static companion object variables in PhoneStateReceiver,
 * fixing potential race conditions when multiple calls occur.
 * 
 * This is injected via Hilt into PhoneStateReceiver.
 */
@Singleton
class CallStateTracker @Inject constructor() {

    private val _state = MutableStateFlow(CallStateData())
    val state: StateFlow<CallStateData> = _state.asStateFlow()
    
    /**
     * Current call state data
     */
    data class CallStateData(
        val lastState: Int = TelephonyManager.CALL_STATE_IDLE,
        val callStartTime: Long = 0,
        val incomingNumber: String? = null,
        val isOutgoing: Boolean = false
    )
    
    /**
     * Get current state snapshot (non-Flow access)
     */
    fun getCurrentState(): CallStateData = _state.value
    
    /**
     * Called when an outgoing call is detected
     */
    fun onOutgoingCall(phoneNumber: String?) {
        _state.update { current ->
            current.copy(
                isOutgoing = true,
                incomingNumber = phoneNumber
            )
        }
    }
    
    /**
     * Called when phone state changes
     */
    fun onStateChange(newState: Int, number: String?): CallStateData {
        val currentState = _state.value
        
        // Only update if state actually changed
        if (currentState.lastState == newState) {
            return currentState
        }
        
        val updated = when (newState) {
            TelephonyManager.CALL_STATE_RINGING -> {
                // Incoming call ringing
                currentState.copy(
                    lastState = newState,
                    isOutgoing = false,
                    callStartTime = System.currentTimeMillis(),
                    incomingNumber = number
                )
            }
            TelephonyManager.CALL_STATE_OFFHOOK -> {
                // Call connected (answered or dialing)
                val startTime = if (currentState.lastState != TelephonyManager.CALL_STATE_RINGING) {
                    // Outgoing call - start timer now
                    System.currentTimeMillis()
                } else {
                    // Incoming call answered - keep existing start time
                    currentState.callStartTime
                }
                currentState.copy(
                    lastState = newState,
                    callStartTime = startTime
                )
            }
            TelephonyManager.CALL_STATE_IDLE -> {
                // Call ended - return data before resetting
                val endedState = currentState.copy(lastState = newState)
                
                // Reset state after call ends
                _state.value = CallStateData()
                
                return endedState
            }
            else -> currentState.copy(lastState = newState)
        }
        
        _state.value = updated
        return updated
    }
    
    /**
     * Calculate call duration in seconds
     */
    fun calculateDuration(): Int {
        val state = _state.value
        return if (state.callStartTime > 0) {
            ((System.currentTimeMillis() - state.callStartTime) / 1000).toInt()
        } else {
            0
        }
    }
    
    /**
     * Reset state (for cleanup/testing)
     */
    fun reset() {
        _state.value = CallStateData()
    }
}
