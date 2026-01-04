package com.koncall.app.service

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log

class BootReceiver : BroadcastReceiver() {

    companion object {
        private const val TAG = "BootReceiver"
    }

    override fun onReceive(context: Context, intent: Intent) {
        if (intent.action == Intent.ACTION_BOOT_COMPLETED ||
            intent.action == "android.intent.action.QUICKBOOT_POWERON") {
            Log.d(TAG, "Device booted, starting call monitor service")
            
            // The PhoneStateReceiver will be active due to manifest registration
            // Optionally, we can trigger an initial sync here
            val serviceIntent = Intent(context, CallMonitorService::class.java).apply {
                action = CallMonitorService.ACTION_SYNC_CALL_LOGS
            }
            context.startService(serviceIntent)
        }
    }
}
