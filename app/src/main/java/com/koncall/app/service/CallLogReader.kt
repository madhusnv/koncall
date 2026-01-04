package com.koncall.app.service

import android.content.ContentResolver
import android.database.Cursor
import android.provider.CallLog
import android.util.Log
import com.koncall.app.data.local.entity.CallLogEntity
import com.koncall.app.data.local.entity.CallType
import com.koncall.app.data.local.entity.SyncStatus

/**
 * Helper class to read call logs from the system.
 * Extracted from CallMonitorService for better separation of concerns.
 */
object CallLogReader {
    
    private const val TAG = "CallLogReader"
    
    /**
     * Read call logs from the system call log content provider
     * 
     * @param contentResolver Content resolver to access call logs
     * @param limit Maximum number of call logs to read
     * @return List of CallLogEntity representing recent calls
     */
    fun readSystemCallLogs(
        contentResolver: ContentResolver,
        limit: Int = 100
    ): List<CallLogEntity> {
        val callLogs = mutableListOf<CallLogEntity>()
        
        val projection = arrayOf(
            CallLog.Calls._ID,
            CallLog.Calls.NUMBER,
            CallLog.Calls.CACHED_NAME,
            CallLog.Calls.TYPE,
            CallLog.Calls.DURATION,
            CallLog.Calls.DATE,
            CallLog.Calls.PHONE_ACCOUNT_ID
        )
        
        val sortOrder = "${CallLog.Calls.DATE} DESC"
        
        val cursor: Cursor? = try {
            contentResolver.query(
                CallLog.Calls.CONTENT_URI,
                projection,
                null,
                null,
                sortOrder
            )
        } catch (e: SecurityException) {
            Log.e(TAG, "Permission denied to read call logs", e)
            return emptyList()
        }
        
        cursor?.use {
            val idIdx = it.getColumnIndex(CallLog.Calls._ID)
            val numberIdx = it.getColumnIndex(CallLog.Calls.NUMBER)
            val nameIdx = it.getColumnIndex(CallLog.Calls.CACHED_NAME)
            val typeIdx = it.getColumnIndex(CallLog.Calls.TYPE)
            val durationIdx = it.getColumnIndex(CallLog.Calls.DURATION)
            val dateIdx = it.getColumnIndex(CallLog.Calls.DATE)
            val simIdx = it.getColumnIndex(CallLog.Calls.PHONE_ACCOUNT_ID)
            
            var count = 0
            while (it.moveToNext() && count < limit) {
                count++
                val deviceCallId = it.getLong(idIdx)
                val phoneNumber = it.getString(numberIdx) ?: "Unknown"
                val contactName = it.getString(nameIdx)
                val callType = mapCallType(it.getInt(typeIdx))
                val duration = it.getInt(durationIdx)
                val callDateTime = it.getLong(dateIdx)
                val simInfo = it.getString(simIdx)
                
                callLogs.add(
                    CallLogEntity(
                        deviceCallId = deviceCallId,
                        phoneNumber = phoneNumber,
                        contactName = contactName,
                        callType = callType,
                        duration = duration,
                        callDateTime = callDateTime,
                        simSlot = extractSimSlot(simInfo),
                        syncStatus = SyncStatus.PENDING
                    )
                )
            }
        }
        
        Log.d(TAG, "Read ${callLogs.size} call logs from system")
        return callLogs
    }
    
    /**
     * Map Android call type constant to our CallType string
     */
    private fun mapCallType(type: Int): String {
        return when (type) {
            CallLog.Calls.INCOMING_TYPE -> CallType.INCOMING
            CallLog.Calls.OUTGOING_TYPE -> CallType.OUTGOING
            CallLog.Calls.MISSED_TYPE -> CallType.MISSED
            CallLog.Calls.REJECTED_TYPE -> CallType.REJECTED
            else -> CallType.INCOMING
        }
    }
    
    /**
     * Extract SIM slot number from phone account ID
     */
    private fun extractSimSlot(phoneAccountId: String?): Int? {
        if (phoneAccountId.isNullOrBlank()) return null
        return when {
            phoneAccountId.contains("0") || phoneAccountId.lowercase().contains("sim1") -> 0
            phoneAccountId.contains("1") || phoneAccountId.lowercase().contains("sim2") -> 1
            else -> null
        }
    }
}
