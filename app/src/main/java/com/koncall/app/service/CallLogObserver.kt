package com.koncall.app.service

import android.content.Context
import android.database.ContentObserver
import android.os.Handler
import android.provider.CallLog
import android.util.Log
import com.koncall.app.data.local.dao.CallLogDao
import com.koncall.app.data.local.entity.CallLogEntity
import com.koncall.app.data.local.entity.CallType
import com.koncall.app.data.local.entity.SyncStatus
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * ContentObserver that watches for changes in the system call log.
 * This provides more reliable call detection than PhoneStateReceiver alone.
 */
class CallLogObserver @Inject constructor(
    private val context: Context,
    private val callLogDao: CallLogDao,
    handler: Handler
) : ContentObserver(handler) {

    companion object {
        private const val TAG = "CallLogObserver"
    }

    private val scope = CoroutineScope(SupervisorJob() + Dispatchers.IO)
    private var lastProcessedId: Long = -1

    override fun onChange(selfChange: Boolean) {
        super.onChange(selfChange)
        Log.d(TAG, "Call log changed, fetching latest entry")
        fetchLatestCallLog()
    }

    private fun fetchLatestCallLog() {
        scope.launch {
            try {
                val latestCall = readLatestCallLog()
                
                if (latestCall != null && latestCall.deviceCallId != lastProcessedId) {
                    // Check if we already have this call in our DB
                    val existing = callLogDao.getCallLogByDeviceId(latestCall.deviceCallId)
                    
                    if (existing == null) {
                        Log.d(TAG, "New call detected: ${latestCall.phoneNumber}")
                        callLogDao.insertCallLog(latestCall)
                        lastProcessedId = latestCall.deviceCallId
                        
                        // Trigger sync to backend
                        triggerSyncWorker()
                        
                        // Trigger recording finder if call had duration
                        if (latestCall.duration > 0) {
                            triggerRecordingFinder(latestCall.callDateTime, latestCall.phoneNumber)
                        }
                    } else {
                        Log.d(TAG, "Call already exists: ${latestCall.deviceCallId}")
                    }
                }
            } catch (e: Exception) {
                Log.e(TAG, "Error reading call log", e)
            }
        }
    }
    
    private fun triggerSyncWorker() {
        Log.d(TAG, "Triggering SyncWorker")
        val constraints = androidx.work.Constraints.Builder()
            .setRequiredNetworkType(androidx.work.NetworkType.CONNECTED)
            .build()
        
        val syncRequest = androidx.work.OneTimeWorkRequestBuilder<SyncWorker>()
            .setConstraints(constraints)
            .build()
        
        androidx.work.WorkManager.getInstance(context).enqueue(syncRequest)
    }
    
    private fun triggerRecordingFinder(callEndTime: Long, phoneNumber: String) {
        Log.d(TAG, "Scheduling RecordingFinderWorker for $phoneNumber")
        val inputData = androidx.work.workDataOf(
            com.koncall.app.service.recording.RecordingFinderWorker.KEY_CALL_END_TIME to callEndTime,
            com.koncall.app.service.recording.RecordingFinderWorker.KEY_PHONE_NUMBER to phoneNumber
        )
        
        val finderRequest = androidx.work.OneTimeWorkRequestBuilder<com.koncall.app.service.recording.RecordingFinderWorker>()
            .setInitialDelay(30, java.util.concurrent.TimeUnit.SECONDS)
            .setInputData(inputData)
            .build()
        
        androidx.work.WorkManager.getInstance(context).enqueue(finderRequest)
    }

    private fun readLatestCallLog(): CallLogEntity? {
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

        context.contentResolver.query(
            CallLog.Calls.CONTENT_URI,
            projection,
            null,
            null,
            "$sortOrder LIMIT 1"
        )?.use { cursor ->
            if (cursor.moveToFirst()) {
                val idIdx = cursor.getColumnIndex(CallLog.Calls._ID)
                val numberIdx = cursor.getColumnIndex(CallLog.Calls.NUMBER)
                val nameIdx = cursor.getColumnIndex(CallLog.Calls.CACHED_NAME)
                val typeIdx = cursor.getColumnIndex(CallLog.Calls.TYPE)
                val durationIdx = cursor.getColumnIndex(CallLog.Calls.DURATION)
                val dateIdx = cursor.getColumnIndex(CallLog.Calls.DATE)
                val simIdx = cursor.getColumnIndex(CallLog.Calls.PHONE_ACCOUNT_ID)

                val deviceCallId = cursor.getLong(idIdx)
                val phoneNumber = cursor.getString(numberIdx) ?: ""
                val contactName = cursor.getString(nameIdx)
                val callType = mapCallType(cursor.getInt(typeIdx))
                val duration = cursor.getInt(durationIdx)
                val callDateTime = cursor.getLong(dateIdx)
                val simInfo = cursor.getString(simIdx)

                return CallLogEntity(
                    deviceCallId = deviceCallId,
                    phoneNumber = phoneNumber,
                    contactName = contactName,
                    callType = callType,
                    duration = duration,
                    callDateTime = callDateTime,
                    simSlot = extractSimSlot(simInfo),
                    syncStatus = SyncStatus.PENDING
                )
            }
        }
        return null
    }

    private fun mapCallType(type: Int): String {
        return when (type) {
            CallLog.Calls.INCOMING_TYPE -> CallType.INCOMING
            CallLog.Calls.OUTGOING_TYPE -> CallType.OUTGOING
            CallLog.Calls.MISSED_TYPE -> CallType.MISSED
            CallLog.Calls.REJECTED_TYPE -> CallType.REJECTED
            else -> CallType.INCOMING
        }
    }

    private fun extractSimSlot(phoneAccountId: String?): Int? {
        if (phoneAccountId.isNullOrBlank()) return null
        
        // Try to extract SIM slot from phone account ID
        // Format varies by device, common patterns: "0", "1", "sim1", "sim2"
        return when {
            phoneAccountId.contains("0") || phoneAccountId.lowercase().contains("sim1") -> 0
            phoneAccountId.contains("1") || phoneAccountId.lowercase().contains("sim2") -> 1
            else -> null
        }
    }
}
