package com.koncall.app.ui.settings.recording

import android.Manifest
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Build
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.core.content.ContextCompat
import androidx.hilt.navigation.compose.hiltViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RecordingSettingsScreen(
    viewModel: RecordingSettingsViewModel = hiltViewModel(),
    onNavigateBack: () -> Unit
) {
    val context = LocalContext.current
    val uiState by viewModel.uiState.collectAsState()
    
    // SAF folder picker launcher
    val folderPickerLauncher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.OpenDocumentTree()
    ) { uri: Uri? ->
        uri?.let { viewModel.onFolderSelected(it, context) }
    }
    
    // Permission launcher for READ_MEDIA_AUDIO (Android 13+)
    val audioPermissionLauncher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.RequestPermission()
    ) { isGranted ->
        viewModel.onAudioPermissionResult(isGranted)
    }
    
    // Check current permission status
    val hasAudioPermission = remember {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            ContextCompat.checkSelfPermission(
                context,
                Manifest.permission.READ_MEDIA_AUDIO
            ) == PackageManager.PERMISSION_GRANTED
        } else {
            ContextCompat.checkSelfPermission(
                context,
                Manifest.permission.READ_EXTERNAL_STORAGE
            ) == PackageManager.PERMISSION_GRANTED
        }
    }
    
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Recording Settings") },
                navigationIcon = {
                    IconButton(onClick = onNavigateBack) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back")
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.surface
                )
            )
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .verticalScroll(rememberScrollState())
        ) {
            // Status Card
            StatusCard(
                hasAudioPermission = hasAudioPermission,
                recordingFolder = uiState.recordingFolderPath,
                lastScanTime = uiState.lastScanTime,
                detectedPath = uiState.detectedPath
            )
            
            Spacer(modifier = Modifier.height(16.dp))
            
            // Recording Sync Toggle
            SettingsSection(title = "Sync Settings") {
                SettingsSwitch(
                    icon = Icons.Default.Sync,
                    title = "Enable Recording Sync",
                    subtitle = "Automatically find and sync call recordings",
                    checked = uiState.recordingSyncEnabled,
                    onCheckedChange = { viewModel.setRecordingSyncEnabled(it) }
                )
                
                SettingsSwitch(
                    icon = Icons.Default.Wifi,
                    title = "Sync on Wi-Fi Only",
                    subtitle = "Upload recordings only when connected to Wi-Fi",
                    checked = uiState.syncOnWifiOnly,
                    onCheckedChange = { viewModel.setSyncOnWifiOnly(it) }
                )
            }
            
            Spacer(modifier = Modifier.height(16.dp))
            
            // Recording Folder Settings
            SettingsSection(title = "Recording Folder") {
                SettingsSwitch(
                    icon = Icons.Default.AutoAwesome,
                    title = "Auto-detect Folder",
                    subtitle = if (uiState.detectedPath != null) 
                        "Detected: ${uiState.detectedPath}" 
                        else "Scanning common OEM paths...",
                    checked = uiState.autoDetectPath,
                    onCheckedChange = { viewModel.setAutoDetectPath(it) }
                )
                
                if (!uiState.autoDetectPath) {
                    HorizontalDivider(modifier = Modifier.padding(vertical = 8.dp))
                    
                    SettingsItem(
                        icon = Icons.Default.Folder,
                        title = "Select Recording Folder",
                        subtitle = uiState.recordingFolderPath ?: "No folder selected",
                        onClick = { folderPickerLauncher.launch(null) }
                    )
                    
                    if (uiState.recordingFolderUri != null) {
                        SettingsItem(
                            icon = Icons.Default.Clear,
                            title = "Clear Folder Selection",
                            subtitle = "Revert to auto-detection",
                            onClick = { viewModel.clearFolderSelection() }
                        )
                    }
                }
            }
            
            Spacer(modifier = Modifier.height(16.dp))
            
            // Permissions Section
            SettingsSection(title = "Permissions") {
                SettingsItem(
                    icon = if (hasAudioPermission) Icons.Default.Check else Icons.Default.Warning,
                    title = "Audio File Access",
                    subtitle = if (hasAudioPermission) 
                        "Permission granted" 
                        else "Required to find recordings",
                    onClick = {
                        if (!hasAudioPermission) {
                            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
                                audioPermissionLauncher.launch(Manifest.permission.READ_MEDIA_AUDIO)
                            } else {
                                audioPermissionLauncher.launch(Manifest.permission.READ_EXTERNAL_STORAGE)
                            }
                        }
                    },
                    showArrow = !hasAudioPermission
                )
            }
            
            Spacer(modifier = Modifier.height(16.dp))
            
            // Actions Section
            SettingsSection(title = "Actions") {
                SettingsItem(
                    icon = Icons.Default.Search,
                    title = "Scan Now",
                    subtitle = "Manually scan for call recordings",
                    onClick = { viewModel.triggerManualScan() }
                )
                
                SettingsItem(
                    icon = Icons.Default.Info,
                    title = "Dialer Setup Guide",
                    subtitle = "How to enable call recording on your phone",
                    onClick = { viewModel.showDialerGuide() }
                )
            }
            
            Spacer(modifier = Modifier.height(32.dp))
        }
    }
    
    // Dialer guide dialog
    if (uiState.showDialerGuide) {
        DialerGuideDialog(
            instructions = uiState.dialerInstructions,
            onDismiss = { viewModel.hideDialerGuide() }
        )
    }
}

@Composable
private fun StatusCard(
    hasAudioPermission: Boolean,
    recordingFolder: String?,
    lastScanTime: Long,
    detectedPath: String?
) {
    val statusColor = if (hasAudioPermission && (recordingFolder != null || detectedPath != null)) {
        MaterialTheme.colorScheme.primaryContainer
    } else {
        MaterialTheme.colorScheme.errorContainer
    }
    
    val statusText = when {
        !hasAudioPermission -> "Permission Required"
        recordingFolder != null -> "Ready - Using selected folder"
        detectedPath != null -> "Ready - Auto-detected folder"
        else -> "Setup Required"
    }
    
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        colors = CardDefaults.cardColors(containerColor = statusColor),
        shape = RoundedCornerShape(16.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = if (hasAudioPermission && (recordingFolder != null || detectedPath != null))
                    Icons.Default.CheckCircle else Icons.Default.Warning,
                contentDescription = null,
                modifier = Modifier.size(48.dp)
            )
            
            Spacer(modifier = Modifier.width(16.dp))
            
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = statusText,
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold
                )
                
                if (lastScanTime > 0) {
                    val timeAgo = formatTimeAgo(lastScanTime)
                    Text(
                        text = "Last scan: $timeAgo",
                        style = MaterialTheme.typography.bodySmall
                    )
                }
            }
        }
    }
}

@Composable
private fun SettingsSection(
    title: String,
    content: @Composable ColumnScope.() -> Unit
) {
    Column(modifier = Modifier.fillMaxWidth()) {
        Text(
            text = title,
            style = MaterialTheme.typography.titleSmall,
            color = MaterialTheme.colorScheme.primary,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
        )
        
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            shape = RoundedCornerShape(12.dp)
        ) {
            Column(
                modifier = Modifier.padding(8.dp),
                content = content
            )
        }
    }
}

@Composable
private fun SettingsSwitch(
    icon: ImageVector,
    title: String,
    subtitle: String,
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onCheckedChange(!checked) }
            .padding(12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            tint = MaterialTheme.colorScheme.primary
        )
        
        Spacer(modifier = Modifier.width(16.dp))
        
        Column(modifier = Modifier.weight(1f)) {
            Text(title, style = MaterialTheme.typography.bodyLarge)
            Text(
                subtitle,
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
        }
        
        Switch(checked = checked, onCheckedChange = onCheckedChange)
    }
}

@Composable
private fun SettingsItem(
    icon: ImageVector,
    title: String,
    subtitle: String,
    onClick: () -> Unit,
    showArrow: Boolean = true
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = onClick)
            .padding(12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            tint = MaterialTheme.colorScheme.primary
        )
        
        Spacer(modifier = Modifier.width(16.dp))
        
        Column(modifier = Modifier.weight(1f)) {
            Text(title, style = MaterialTheme.typography.bodyLarge)
            Text(
                subtitle,
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                maxLines = 2
            )
        }
        
        if (showArrow) {
            Icon(
                imageVector = Icons.Default.ChevronRight,
                contentDescription = null,
                tint = MaterialTheme.colorScheme.onSurfaceVariant
            )
        }
    }
}

@Composable
private fun DialerGuideDialog(
    instructions: String,
    onDismiss: () -> Unit
) {
    AlertDialog(
        onDismissRequest = onDismiss,
        title = { Text("Enable Call Recording") },
        text = {
            Text(instructions)
        },
        confirmButton = {
            TextButton(onClick = onDismiss) {
                Text("Got it")
            }
        }
    )
}

private fun formatTimeAgo(timestamp: Long): String {
    val now = System.currentTimeMillis()
    val diff = now - timestamp
    
    return when {
        diff < 60_000 -> "Just now"
        diff < 3_600_000 -> "${diff / 60_000} minutes ago"
        diff < 86_400_000 -> "${diff / 3_600_000} hours ago"
        else -> "${diff / 86_400_000} days ago"
    }
}
