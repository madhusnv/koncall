package com.koncall.app

import android.Manifest
import android.content.pm.PackageManager
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.core.content.ContextCompat
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.koncall.app.ui.components.AppBottomBar
import com.koncall.app.ui.navigation.BottomNavItem
import com.koncall.app.ui.navigation.KonCallNavGraph
import com.koncall.app.ui.navigation.Screen
import com.koncall.app.ui.theme.KonCallColors
import com.koncall.app.ui.theme.KonCallTheme
import com.koncall.app.util.TokenManager
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.runBlocking
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    lateinit var tokenManager: TokenManager
    
    @Inject
    lateinit var appCallTracker: com.koncall.app.service.AppCallTracker

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
}