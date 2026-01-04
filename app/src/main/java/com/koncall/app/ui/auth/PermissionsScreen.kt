package com.koncall.app.ui.auth

import android.Manifest
import android.content.Intent
import android.os.Build
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.koncall.app.service.CallMonitorService

@Composable
fun PermissionsScreen(
    onPermissionsGranted: () -> Unit
) {
    val context = LocalContext.current
    
    // Helper function to start service and sync
    fun startCallMonitoringAndNavigate() {
        // Start the foreground service to monitor calls
        val serviceIntent = Intent(context, CallMonitorService::class.java).apply {
            action = CallMonitorService.ACTION_START_FOREGROUND
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            context.startForegroundService(serviceIntent)
        } else {
            context.startService(serviceIntent)
        }
        
        // Also trigger initial sync of existing call logs
        val syncIntent = Intent(context, CallMonitorService::class.java).apply {
            action = CallMonitorService.ACTION_SYNC_CALL_LOGS
        }
        context.startService(syncIntent)
        
        onPermissionsGranted()
    }
    
    val requiredPermissions = remember {
        buildList {
            add(Manifest.permission.READ_CALL_LOG)
            add(Manifest.permission.READ_PHONE_STATE)
            add(Manifest.permission.READ_CONTACTS)
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
                add(Manifest.permission.POST_NOTIFICATIONS)
            }
        }
    }
    
    var permissionStates by remember { 
        mutableStateOf(requiredPermissions.associateWith { false })
    }
    
    val permissionLauncher = rememberLauncherForActivityResult(
        ActivityResultContracts.RequestMultiplePermissions()
    ) { results ->
        permissionStates = results
        if (results.values.all { it }) {
            startCallMonitoringAndNavigate()
        }
    }
    
    // Check if all granted on launch
    LaunchedEffect(Unit) {
        val allGranted = requiredPermissions.all { permission ->
            context.checkSelfPermission(permission) == android.content.pm.PackageManager.PERMISSION_GRANTED
        }
        if (allGranted) {
            startCallMonitoringAndNavigate()
        } else {
            permissionLauncher.launch(requiredPermissions.toTypedArray())
        }
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Icon(
            imageVector = Icons.Default.Phone,
            contentDescription = null,
            modifier = Modifier.size(64.dp),
            tint = MaterialTheme.colorScheme.primary
        )
        
        Spacer(modifier = Modifier.height(24.dp))
        
        Text(
            text = "Permissions Required",
            style = MaterialTheme.typography.headlineSmall,
            fontWeight = FontWeight.Bold
        )
        
        Spacer(modifier = Modifier.height(8.dp))
        
        Text(
            text = "KonCall needs these permissions to track your calls",
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.onSurfaceVariant,
            textAlign = TextAlign.Center
        )
        
        Spacer(modifier = Modifier.height(32.dp))
        
        Card(
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(modifier = Modifier.padding(16.dp)) {
                PermissionItem(
                    title = "Call Log",
                    description = "Read your call history",
                    isGranted = permissionStates[Manifest.permission.READ_CALL_LOG] == true
                )
                Spacer(modifier = Modifier.height(12.dp))
                PermissionItem(
                    title = "Phone State",
                    description = "Detect incoming/outgoing calls",
                    isGranted = permissionStates[Manifest.permission.READ_PHONE_STATE] == true
                )
                Spacer(modifier = Modifier.height(12.dp))
                PermissionItem(
                    title = "Contacts",
                    description = "Show contact names",
                    isGranted = permissionStates[Manifest.permission.READ_CONTACTS] == true
                )
            }
        }
        
        Spacer(modifier = Modifier.height(32.dp))
        
        Button(
            onClick = {
                permissionLauncher.launch(requiredPermissions.toTypedArray())
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Grant Permissions")
        }
        
        Spacer(modifier = Modifier.height(8.dp))
        
        TextButton(onClick = onPermissionsGranted) {
            Text("Skip for now")
        }
    }
}

@Composable
private fun PermissionItem(
    title: String,
    description: String,
    isGranted: Boolean
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.fillMaxWidth()
    ) {
        Icon(
            imageVector = if (isGranted) Icons.Default.Check else Icons.Default.Close,
            contentDescription = null,
            tint = if (isGranted) MaterialTheme.colorScheme.primary 
                   else MaterialTheme.colorScheme.error
        )
        Spacer(modifier = Modifier.width(12.dp))
        Column {
            Text(text = title, fontWeight = FontWeight.Medium)
            Text(
                text = description,
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
        }
    }
}
