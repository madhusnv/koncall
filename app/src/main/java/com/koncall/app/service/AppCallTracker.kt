package com.koncall.app.service

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.provider.CallLog
import android.util.Log
import com.koncall.app.data.local.dao.CallLogDao
import com.koncall.app.data.local.entity.CallLogEntity
import com.koncall.app.data.local.entity.CallType
import com.koncall.app.data.local.entity.SyncStatus
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import java.util.UUID
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Tracks calls initiated via the app's Call button.
 * 
 * Flow:
 * 1. User taps Call button on lead profile
 * 2. AppCallTracker.startTracking(leadId, phoneNumber) stores pending call
 * 3. App initiates call via Intent.ACTION_CALL
 * 4. When call ends, AppCallTracker.completeTracking() matches and stores duration
 * 5. Call is synced to backend with app_initiated = true
 */
@Singleton
class AppCallTracker @Inject constructor(
    @ApplicationContext private val context: Context,
    private val callLogDao: CallLogDao
) {
    companion object {
        private const val TAG = "AppCallTracker"
        private const val CALL_MATCH_WINDOW_MS = 60_000L // 60 seconds window to match call
    }
    
    private val scope = CoroutineScope(Dispatchers.IO + SupervisorJob())
    
    // Currently pending call (waiting for completion)
    private var pendingCall: PendingCall? = null
    
    // Tracking state
    private val _isCallActive = MutableStateFlow(false)
    val isCallActive: StateFlow<Boolean> = _isCallActive
    
    data class PendingCall(
        val leadId: String,
        val phoneNumber: String,
        val startTime: Long = System.currentTimeMillis()
    )
    
    /**
     * Start tracking a call initiated from the app.
     * Call this BEFORE launching the dialer intent.
     */
    fun startTracking(leadId: String, phoneNumber: String) {
        pendingCall = PendingCall(
            leadId = leadId,
            phoneNumber = normalizePhone(phoneNumber)
        )
        _isCallActive.value = true
        Log.d(TAG, "Started tracking call to $phoneNumber for lead $leadId")
    }
    
    /**
     * Make a call and track it.
     * This launches the dialer and automatically tracks the call.
     */
    fun makeTrackedCall(context: Context, leadId: String, phoneNumber: String) {
        startTracking(leadId, phoneNumber)
        
        val intent = Intent(Intent.ACTION_CALL).apply {
            data = Uri.parse("tel:$phoneNumber")
            flags = Intent.FLAG_ACTIVITY_NEW_TASK
        }
        
        try {
            context.startActivity(intent)
        } catch (e: SecurityException) {
            // Permission not granted, fallback to dial
            Log.w(TAG, "CALL_PHONE permission not granted, falling back to dial")
            stopTracking()
            val dialIntent = Intent(Intent.ACTION_DIAL).apply {
                data = Uri.parse("tel:$phoneNumber")
                flags = Intent.FLAG_ACTIVITY_NEW_TASK
            }
            context.startActivity(dialIntent)
        }
    }
    
    /**
     * Stop tracking without completing (user cancelled, permission denied, etc.)
     */
    fun stopTracking() {
        pendingCall = null
        _isCallActive.value = false
        Log.d(TAG, "Stopped tracking call")
    }
    
    /**
     * Complete tracking - finds the call in system logs and stores it.
     * Should be called when phone state returns to IDLE after a call.
     */
    fun completeTracking() {
        val pending = pendingCall ?: return
        pendingCall = null
        _isCallActive.value = false
        
        Log.d(TAG, "Completing tracking for call to ${pending.phoneNumber}")
        
        scope.launch {
            try {
                // Wait a bit for the system to update call logs
                delay(1000)
                
                // Find the matching call in system logs
                val callDetails = findRecentCall(pending.phoneNumber, pending.startTime)
                
                if (callDetails != null) {
                    // Check if already synced by CallMonitorService
                    val existingLog = callLogDao.getCallLogByDeviceId(callDetails.id)
                    
                    if (existingLog != null) {
                        // Update existing log
                        callLogDao.updateAppInitiated(existingLog.id, true, pending.leadId)
                        Log.d(TAG, "Updated existing call log: ${existingLog.id}")
                    } else {
                        // Create app-initiated call log entry
                        val callLogEntity = CallLogEntity(
                            id = UUID.randomUUID().toString(),
                            deviceCallId = callDetails.id,
                            phoneNumber = pending.phoneNumber,
                            contactName = callDetails.contactName,
                            callType = callDetails.callType,
                            duration = callDetails.duration,
                            callDateTime = callDetails.dateTime,
                            appInitiated = true,
                            syncStatus = SyncStatus.PENDING,
                            leadId = pending.leadId
                        )
                        
                        callLogDao.insertCallLog(callLogEntity)
                        Log.d(TAG, "Saved app-initiated call: duration=${callDetails.duration}s, lead=${pending.leadId}")
                    }
                } else {
                    Log.w(TAG, "Could not find matching call in system logs")
                    // Still save a record even if we couldn't find duration
                    val callLogEntity = CallLogEntity(
                        id = UUID.randomUUID().toString(),
                        deviceCallId = 0L,
                        phoneNumber = pending.phoneNumber,
                        contactName = null,
                        callType = CallType.OUTGOING,
                        duration = 0,
                        callDateTime = pending.startTime,
                        appInitiated = true,
                        syncStatus = SyncStatus.PENDING,
                        leadId = pending.leadId
                    )
                    callLogDao.insertCallLog(callLogEntity)
                }
            } catch (e: Exception) {
                Log.e(TAG, "Error completing call tracking", e)
            }
        }
    }
    
    /**
     * Check if there's an active pending call for a specific lead.
     */
    fun getPendingCallForLead(leadId: String): PendingCall? {
        return pendingCall?.takeIf { it.leadId == leadId }
    }
    
    /**
     * Find a recent call in the system call log.
     */
    private fun findRecentCall(phoneNumber: String, afterTime: Long): CallDetails? {
        val normalizedPhone = normalizePhone(phoneNumber)
        val projection = arrayOf(
            CallLog.Calls._ID,
            CallLog.Calls.NUMBER,
            CallLog.Calls.CACHED_NAME,
            CallLog.Calls.TYPE,
            CallLog.Calls.DURATION,
            CallLog.Calls.DATE
        )
        
        // Look for calls after the start time
        val selection = "${CallLog.Calls.DATE} >= ?"
        val selectionArgs = arrayOf((afterTime - CALL_MATCH_WINDOW_MS).toString())
        val sortOrder = "${CallLog.Calls.DATE} DESC"
        
        return try {
            context.contentResolver.query(
                CallLog.Calls.CONTENT_URI,
                projection,
                selection,
                selectionArgs,
                sortOrder
            )?.use { cursor ->
                while (cursor.moveToNext()) {
                    val number = cursor.getString(cursor.getColumnIndexOrThrow(CallLog.Calls.NUMBER))
                    if (normalizePhone(number) == normalizedPhone) {
                        return@use CallDetails(
                            id = cursor.getLong(cursor.getColumnIndexOrThrow(CallLog.Calls._ID)),
                            phoneNumber = number,
                            contactName = cursor.getString(cursor.getColumnIndexOrThrow(CallLog.Calls.CACHED_NAME)),
                            callType = mapCallType(cursor.getInt(cursor.getColumnIndexOrThrow(CallLog.Calls.TYPE))),
                            duration = cursor.getInt(cursor.getColumnIndexOrThrow(CallLog.Calls.DURATION)),
                            dateTime = cursor.getLong(cursor.getColumnIndexOrThrow(CallLog.Calls.DATE))
                        )
                    }
                }
                null
            }
        } catch (e: Exception) {
            Log.e(TAG, "Error querying call log", e)
            null
        }
    }
    
    private fun normalizePhone(phone: String): String {
        return phone.filter { it.isDigit() }.takeLast(10)
    }
    
    private fun mapCallType(type: Int): String {
        return when (type) {
            CallLog.Calls.INCOMING_TYPE -> CallType.INCOMING
            CallLog.Calls.OUTGOING_TYPE -> CallType.OUTGOING
            CallLog.Calls.MISSED_TYPE -> CallType.MISSED
            CallLog.Calls.REJECTED_TYPE -> CallType.REJECTED
            else -> CallType.OUTGOING
        }
    }
    
    private data class CallDetails(
        val id: Long,
        val phoneNumber: String,
        val contactName: String?,
        val callType: String,
        val duration: Int,
        val dateTime: Long
    )
}
