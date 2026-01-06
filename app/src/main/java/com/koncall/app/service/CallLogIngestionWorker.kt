package com.koncall.app.service

import android.content.Context
import android.provider.CallLog
import android.util.Log
import androidx.hilt.work.HiltWorker
import androidx.work.Constraints
import androidx.work.CoroutineWorker
import androidx.work.NetworkType
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.WorkManager
import androidx.work.WorkerParameters
import com.koncall.app.data.local.dao.CallLogDao
import com.koncall.app.data.local.dao.LeadDao
import dagger.assisted.Assisted
import dagger.assisted.AssistedInject

@HiltWorker
class CallLogIngestionWorker @AssistedInject constructor(
    @Assisted private val context: Context,
    @Assisted params: WorkerParameters,
    private val callLogDao: CallLogDao,
    private val leadDao: LeadDao
) : CoroutineWorker(context, params) {

    companion object {
        private const val TAG = "CallLogIngestionWorker"
    }

    override suspend fun doWork(): Result {
        return try {
            Log.d(TAG, "Starting call log ingestion...")
            
            // Read recent calls 
            val recentCalls = CallLogReader.readSystemCallLogs(context.contentResolver, 50)
            
            // Filter: Only new calls + Leading matching
            val newCalls = recentCalls.filter { call ->
                val notExists = callLogDao.getCallLogByDeviceId(call.deviceCallId) == null
                if (!notExists) return@filter false
                
                val normalizedNumber = CallMonitorService.normalizePhoneNumber(call.phoneNumber)
                val lead = leadDao.getLeadByPhoneNumber(call.phoneNumber)
                    ?: leadDao.getLeadByNormalizedPhone(normalizedNumber)
                
                val isLead = lead != null
                if (isLead) {
                    Log.d(TAG, "Syncing call for lead: ${call.phoneNumber}")
                }
                isLead
            }

            if (newCalls.isNotEmpty()) {
                Log.d(TAG, "Saving ${newCalls.size} new call logs")
                callLogDao.insertCallLogs(newCalls)
                
                // Trigger Sync to Server
                triggerSyncWorker()
            } else {
                Log.d(TAG, "No new lead calls found")
            }

            Result.success()
        } catch (e: Exception) {
            Log.e(TAG, "Error ingesting call logs", e)
            if (runAttemptCount < 3) Result.retry() else Result.failure()
        }
    }

    private fun triggerSyncWorker() {
        val constraints = Constraints.Builder()
            .setRequiredNetworkType(NetworkType.CONNECTED)
            .build()
        
        val syncRequest = OneTimeWorkRequestBuilder<SyncWorker>()
            .setConstraints(constraints)
            .build()
        
        WorkManager.getInstance(context).enqueue(syncRequest)
    }
}
