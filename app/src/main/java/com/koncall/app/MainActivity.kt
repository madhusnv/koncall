package com.koncall.app

import android.Manifest
import android.content.pm.PackageManager
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.core.content.ContextCompat
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.koncall.app.ui.components.AppBottomBar
import com.koncall.app.ui.navigation.BottomNavItem
import com.koncall.app.ui.navigation.KonCallNavGraph
import com.koncall.app.ui.navigation.Screen
import com.koncall.app.ui.theme.KonCallColors
import com.koncall.app.ui.theme.KonCallTheme
import com.koncall.app.util.BatteryOptimizationHelper
import com.koncall.app.util.TokenManager
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.runBlocking
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    companion object {
        private const val PREFS_NAME = "koncall_prefs"
        private const val KEY_BATTERY_PROMPT_SHOWN = "battery_prompt_shown"
    }

    @Inject
    lateinit var tokenManager: TokenManager
    
    @Inject
    lateinit var appCallTracker: com.koncall.app.service.AppCallTracker
    
    @Inject
    lateinit var batteryOptimizationHelper: BatteryOptimizationHelper

    // Permission launcher for multiple permissions
    private val permissionLauncher = registerForActivityResult(
        ActivityResultContracts.RequestMultiplePermissions()
    ) { permissions ->
        permissions.entries.forEach { entry ->
            android.util.Log.d("MainActivity", "Permission ${entry.key}: ${entry.value}")
        }
        
        // Restart service after permissions granted to register CallLogObserver
        if (permissions.values.any { it }) {
            android.util.Log.d("MainActivity", "Permissions granted, restarting service")
            startCallMonitorService()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        
        // Request permissions on app start
        requestRequiredPermissions()
        
        // Start CallMonitorService to ensure recording logic is active
        startCallMonitorService()
        
        // Determine start destination based on auth state
        val isLoggedIn = runBlocking { tokenManager.getToken() != null }
        val startDestination = if (isLoggedIn) Screen.Dashboard.route else Screen.OrgCode.route
        
        // Check if we should show battery optimization prompt
        val shouldShowBatteryPrompt = isLoggedIn && 
            batteryOptimizationHelper.isAggressiveOem() && 
            !hasBatteryPromptBeenShown()
        
        setContent {
            KonCallTheme {
                val navController = rememberNavController()
                val navBackStackEntry by navController.currentBackStackEntryAsState()
                val currentRoute = navBackStackEntry?.destination?.route
                
                val bottomNavItems = listOf(
                    BottomNavItem.Dashboard.route,
                    BottomNavItem.CallLogs.route,
                    BottomNavItem.Leads.route
                )
                
                // Show bottom bar only on main screens
                val showBottomBar = currentRoute in bottomNavItems
                
                // Battery optimization dialog state
                var showBatteryDialog by remember { mutableStateOf(shouldShowBatteryPrompt) }

                // Battery Optimization Dialog
                if (showBatteryDialog) {
                    BatteryOptimizationDialog(
                        manufacturerName = batteryOptimizationHelper.getManufacturerName(),
                        instructions = batteryOptimizationHelper.getAutoStartInstructions(),
                        onOpenSettings = {
                            batteryOptimizationHelper.openAutoStartSettings(this@MainActivity)
                            markBatteryPromptShown()
                            showBatteryDialog = false
                        },
                        onDismiss = {
                            markBatteryPromptShown()
                            showBatteryDialog = false
                        }
                    )
                }

                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    containerColor = KonCallColors.BackgroundDeep,
                    bottomBar = {
                        if (showBottomBar) {
                            AppBottomBar(
                                navController = navController,
                                currentRoute = currentRoute
                            )
                        }
                    }
                ) { innerPadding ->
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(bottom = innerPadding.calculateBottomPadding())
                    ) {
                        KonCallNavGraph(
                            navController = navController,
                            startDestination = startDestination,
                            appCallTracker = appCallTracker
                        )
                    }
                }
            }
        }
    }

    private fun requestRequiredPermissions() {
        val requiredPermissions = arrayOf(
            Manifest.permission.RECORD_AUDIO,
            Manifest.permission.READ_CALL_LOG,
            Manifest.permission.READ_PHONE_STATE,
            Manifest.permission.CALL_PHONE
        )
        
        val permissionsToRequest = requiredPermissions.filter { permission ->
            ContextCompat.checkSelfPermission(this, permission) != PackageManager.PERMISSION_GRANTED
        }.toTypedArray()
        
        if (permissionsToRequest.isNotEmpty()) {
            permissionLauncher.launch(permissionsToRequest)
        }
    }

    private fun startCallMonitorService() {
        val intent = android.content.Intent(this, com.koncall.app.service.CallMonitorService::class.java).apply {
            action = com.koncall.app.service.CallMonitorService.ACTION_START_FOREGROUND
        }
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            startForegroundService(intent)
        } else {
            startService(intent)
        }
    }
    
    private fun hasBatteryPromptBeenShown(): Boolean {
        return getSharedPreferences(PREFS_NAME, MODE_PRIVATE)
            .getBoolean(KEY_BATTERY_PROMPT_SHOWN, false)
    }
    
    private fun markBatteryPromptShown() {
        getSharedPreferences(PREFS_NAME, MODE_PRIVATE)
            .edit()
            .putBoolean(KEY_BATTERY_PROMPT_SHOWN, true)
            .apply()
    }
}

@Composable
private fun BatteryOptimizationDialog(
    manufacturerName: String,
    instructions: String,
    onOpenSettings: () -> Unit,
    onDismiss: () -> Unit
) {
    AlertDialog(
        onDismissRequest = onDismiss,
        title = {
            Text(
                "$manufacturerName Device Detected",
                fontWeight = FontWeight.Bold,
                color = KonCallColors.TextPrimary
            )
        },
        text = {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .verticalScroll(rememberScrollState())
            ) {
                Text(
                    "To ensure KonCall tracks all your calls reliably, please enable auto-start permissions.",
                    color = KonCallColors.TextSecondary
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    instructions,
                    style = MaterialTheme.typography.bodySmall,
                    color = KonCallColors.TextTertiary
                )
            }
        },
        confirmButton = {
            TextButton(onClick = onOpenSettings) {
                Text("Open Settings", color = KonCallColors.Teal, fontWeight = FontWeight.Bold)
            }
        },
        dismissButton = {
            TextButton(onClick = onDismiss) {
                Text("Later", color = KonCallColors.TextSecondary)
            }
        },
        containerColor = KonCallColors.SurfaceCard
    )
}