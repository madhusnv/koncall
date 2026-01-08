package com.koncall.app.util

import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Build
import android.provider.Settings
import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Helper to detect aggressive battery optimization on OEM devices (Xiaomi, Huawei, etc.)
 * and provide instructions for users to whitelist the app.
 * 
 * These manufacturers often kill foreground services even when properly configured,
 * so we need to prompt users to add the app to their auto-start list or battery exemption.
 */
@Singleton
class BatteryOptimizationHelper @Inject constructor() {

    companion object {
        private const val TAG = "BatteryOptimization"
        
        // OEMs known for aggressive battery optimization
        val AGGRESSIVE_OEMS = listOf(
            "xiaomi", "redmi", "poco",
            "huawei", "honor",
            "oppo", "realme", "oneplus",
            "vivo", "iqoo",
            "samsung",
            "meizu",
            "asus",
            "lenovo"
        )
    }

    /**
     * Check if this device has an OEM known for aggressive battery optimization.
     */
    fun isAggressiveOem(): Boolean {
        val manufacturer = Build.MANUFACTURER.lowercase()
        val brand = Build.BRAND.lowercase()
        
        return AGGRESSIVE_OEMS.any { oem -> 
            manufacturer.contains(oem) || brand.contains(oem)
        }
    }

    /**
     * Get the device manufacturer display name.
     */
    fun getManufacturerName(): String {
        return Build.MANUFACTURER.replaceFirstChar { it.uppercase() }
    }

    /**
     * Get user-friendly instructions for enabling auto-start on this device.
     */
    fun getAutoStartInstructions(): String {
        val brand = Build.BRAND.lowercase()
        val manufacturer = Build.MANUFACTURER.lowercase()
        
        return when {
            brand.contains("xiaomi") || brand.contains("redmi") || brand.contains("poco") -> """
                To ensure KonCall works reliably:
                
                1. Go to Settings → Apps → Manage apps → KonCall
                2. Tap "Autostart" and enable it
                3. Tap "Battery saver" → Select "No restrictions"
                4. In "Other permissions", enable all
                
                Or use the button below to open settings directly.
            """.trimIndent()
            
            brand.contains("huawei") || brand.contains("honor") -> """
                To ensure KonCall works reliably:
                
                1. Go to Settings → Apps → Apps → KonCall
                2. Tap "Battery" → Select "Don't restrict"
                3. Go to Settings → Battery → App launch
                4. Find KonCall and disable "Manage automatically"
                5. Enable Auto-launch, Secondary launch, and Run in background
            """.trimIndent()
            
            brand.contains("oppo") || brand.contains("realme") -> """
                To ensure KonCall works reliably:
                
                1. Go to Settings → App Management → KonCall
                2. Tap "Auto-startup" and enable it
                3. Tap "Battery" → Select "Allow background activity"
                4. Go to Settings → Battery → High Performance Mode → Enable
            """.trimIndent()
            
            brand.contains("vivo") || brand.contains("iqoo") -> """
                To ensure KonCall works reliably:
                
                1. Go to Settings → More settings → Applications → Autostart
                2. Enable autostart for KonCall
                3. Go to Settings → Battery → Background power consumption
                4. Set KonCall to "Don't restrict"
            """.trimIndent()
            
            brand.contains("samsung") -> """
                To ensure KonCall works reliably:
                
                1. Go to Settings → Apps → KonCall → Battery
                2. Select "Unrestricted"
                3. Go to Settings → Device care → Battery
                4. Tap Battery → Sleeping apps
                5. Make sure KonCall is NOT in this list
            """.trimIndent()
            
            brand.contains("oneplus") -> """
                To ensure KonCall works reliably:
                
                1. Go to Settings → Apps → KonCall → Battery
                2. Select "Don't optimize"
                3. Go to Settings → Battery → Battery optimization
                4. Find KonCall and select "Don't optimize"
            """.trimIndent()
            
            else -> """
                To ensure KonCall works reliably:
                
                1. Go to Settings → Apps → KonCall → Battery
                2. Disable battery optimization / restrictions
                3. Enable "Allow background activity" if available
                4. Check your phone's auto-start settings and enable KonCall
            """.trimIndent()
        }
    }

    /**
     * Try to open the auto-start settings for this device.
     * Returns true if an intent was found and launched, false otherwise.
     */
    fun openAutoStartSettings(context: Context): Boolean {
        val intents = getAutoStartIntents()
        
        for (intent in intents) {
            try {
                if (context.packageManager.resolveActivity(intent, PackageManager.MATCH_DEFAULT_ONLY) != null) {
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                    context.startActivity(intent)
                    return true
                }
            } catch (e: Exception) {
                Log.d(TAG, "Intent not available: ${intent.component}")
            }
        }
        
        // Fallback to app info page
        return openAppSettings(context)
    }

    /**
     * Open the app's detail settings page.
     */
    fun openAppSettings(context: Context): Boolean {
        return try {
            val intent = Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS).apply {
                data = Uri.parse("package:${context.packageName}")
                addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            }
            context.startActivity(intent)
            true
        } catch (e: Exception) {
            Log.e(TAG, "Failed to open app settings", e)
            false
        }
    }

    /**
     * Get list of intents to try for opening auto-start settings.
     * Different OEMs have different package/activity combinations.
     */
    private fun getAutoStartIntents(): List<Intent> {
        return listOf(
            // Xiaomi MIUI
            Intent().setComponent(ComponentName(
                "com.miui.securitycenter",
                "com.miui.permcenter.autostart.AutoStartManagementActivity"
            )),
            // Xiaomi MIUI (alternate)
            Intent().setComponent(ComponentName(
                "com.miui.securitycenter",
                "com.miui.permcenter.MainAc498694tivity"
            )),
            // Huawei
            Intent().setComponent(ComponentName(
                "com.huawei.systemmanager",
                "com.huawei.systemmanager.startupmgr.ui.StartupNormalAppListActivity"
            )),
            Intent().setComponent(ComponentName(
                "com.huawei.systemmanager",
                "com.huawei.systemmanager.optimize.process.ProtectActivity"
            )),
            // OPPO ColorOS
            Intent().setComponent(ComponentName(
                "com.coloros.safecenter",
                "com.coloros.safecenter.permission.startup.StartupAppListActivity"
            )),
            Intent().setComponent(ComponentName(
                "com.oppo.safe",
                "com.oppo.safe.permission.startup.StartupAppListActivity"
            )),
            // Vivo
            Intent().setComponent(ComponentName(
                "com.vivo.permissionmanager",
                "com.vivo.permissionmanager.activity.BgStartUpManagerActivity"
            )),
            Intent().setComponent(ComponentName(
                "com.iqoo.secure",
                "com.iqoo.secure.ui.phoneopt.BgStartUpManager"
            )),
            // Samsung
            Intent().setComponent(ComponentName(
                "com.samsung.android.lool",
                "com.samsung.android.sm.ui.battery.BatteryActivity"
            )),
            // OnePlus
            Intent().setComponent(ComponentName(
                "com.oneplus.security",
                "com.oneplus.security.chainlaunch.view.ChainLaunchAppListActivity"
            )),
            // Asus
            Intent().setComponent(ComponentName(
                "com.asus.mobilemanager",
                "com.asus.mobilemanager.autostart.AutoStartActivity"
            )),
            // Lenovo
            Intent().setComponent(ComponentName(
                "com.lenovo.security",
                "com.lenovo.security.purebackground.PureBackgroundActivity"
            ))
        )
    }
}
