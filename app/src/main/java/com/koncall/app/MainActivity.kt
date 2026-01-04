package com.koncall.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.koncall.app.ui.navigation.KonCallNavGraph
import com.koncall.app.ui.navigation.Screen
import com.koncall.app.ui.theme.KonCallTheme
import com.koncall.app.util.TokenManager
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.runBlocking
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    lateinit var tokenManager: TokenManager
    
    @Inject
    lateinit var appCallTracker: com.koncall.app.service.AppCallTracker

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        
        // Determine start destination based on auth state
        val isLoggedIn = runBlocking { tokenManager.getToken() != null }
        val startDestination = if (isLoggedIn) Screen.Dashboard.route else Screen.OrgCode.route
        
        setContent {
            KonCallTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()
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