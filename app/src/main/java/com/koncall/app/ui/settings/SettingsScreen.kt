package com.koncall.app.ui.settings

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.koncall.app.ui.components.GradientButton
import com.koncall.app.ui.theme.KonCallColors

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SettingsScreen(
    viewModel: SettingsViewModel,
    onLogout: () -> Unit,
    onNavigateBack: () -> Unit,
    onNavigateToRecordingSettings: () -> Unit = {}
) {
    val isLoggingOut by viewModel.isLoggingOut.collectAsState()
    var showLogoutDialog by remember { mutableStateOf(false) }
    var hasPendingSync by remember { mutableStateOf(false) }
    
    // Check for pending sync when showing logout dialog
    LaunchedEffect(showLogoutDialog) {
        if (showLogoutDialog) {
            hasPendingSync = viewModel.hasPendingSync()
        }
    }

    if (showLogoutDialog) {
        AlertDialog(
            onDismissRequest = { showLogoutDialog = false },
            title = { 
                Text(
                    if (hasPendingSync) "Unsaved Data" else "Logout",
                    color = KonCallColors.TextPrimary
                ) 
            },
            text = { 
                Text(
                    if (hasPendingSync) {
                        "You have call logs that haven't synced to the server yet. Logging out may result in data loss. Continue anyway?"
                    } else {
                        "Are you sure you want to logout?"
                    },
                    color = KonCallColors.TextSecondary
                ) 
            },
            confirmButton = {
                TextButton(
                    onClick = {
                        showLogoutDialog = false
                        viewModel.logout(onLogout)
                    }
                ) {
                    Text(
                        if (hasPendingSync) "Logout Anyway" else "Logout",
                        color = KonCallColors.Error
                    )
                }
            },
            dismissButton = {
                TextButton(onClick = { showLogoutDialog = false }) {
                    Text(
                        if (hasPendingSync) "Wait for Sync" else "Cancel",
                        color = KonCallColors.TextSecondary
                    )
                }
            },
            containerColor = KonCallColors.SurfaceCard,
            titleContentColor = KonCallColors.TextPrimary,
            textContentColor = KonCallColors.TextSecondary
        )
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { 
                    Text(
                        "Settings", 
                        style = MaterialTheme.typography.headlineSmall,
                        fontWeight = FontWeight.SemiBold
                    ) 
                },
                navigationIcon = {
                    IconButton(onClick = onNavigateBack) {
                        Icon(
                            Icons.AutoMirrored.Filled.ArrowBack, 
                            contentDescription = "Back",
                            tint = KonCallColors.TextSecondary
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = KonCallColors.BackgroundDeep,
                    titleContentColor = KonCallColors.TextPrimary
                )
            )
        },
        containerColor = KonCallColors.BackgroundDeep
    ) { paddingValues ->
        val userProfile by viewModel.userProfile.collectAsState()
        
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(16.dp)
        ) {
            // Profile Section
            Card(
                shape = RoundedCornerShape(20.dp),
                colors = CardDefaults.cardColors(containerColor = KonCallColors.SurfaceCard)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    // Avatar
                    Surface(
                        modifier = Modifier.size(64.dp),
                        shape = androidx.compose.foundation.shape.CircleShape,
                        color = KonCallColors.Teal.copy(alpha = 0.15f)
                    ) {
                        Box(contentAlignment = Alignment.Center) {
                            Text(
                                text = userProfile.name.take(1).uppercase(),
                                style = MaterialTheme.typography.headlineMedium,
                                fontWeight = FontWeight.Bold,
                                color = KonCallColors.Teal
                            )
                        }
                    }
                    
                    Spacer(modifier = Modifier.width(16.dp))
                    
                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            text = userProfile.name.ifEmpty { "User" },
                            style = MaterialTheme.typography.titleLarge,
                            fontWeight = FontWeight.Bold,
                            color = KonCallColors.TextPrimary
                        )
                        if (userProfile.email.isNotEmpty()) {
                            Text(
                                text = userProfile.email,
                                style = MaterialTheme.typography.bodyMedium,
                                color = KonCallColors.TextSecondary
                            )
                        }
                        Spacer(modifier = Modifier.height(4.dp))
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            // Role badge
                            Surface(
                                shape = RoundedCornerShape(6.dp),
                                color = when (userProfile.role.lowercase()) {
                                    "admin" -> KonCallColors.Error.copy(alpha = 0.15f)
                                    "manager" -> KonCallColors.Violet.copy(alpha = 0.15f)
                                    else -> KonCallColors.Teal.copy(alpha = 0.15f)
                                }
                            ) {
                                Text(
                                    text = userProfile.role.replaceFirstChar { it.uppercase() },
                                    style = MaterialTheme.typography.labelSmall,
                                    fontWeight = FontWeight.Medium,
                                    color = when (userProfile.role.lowercase()) {
                                        "admin" -> KonCallColors.Error
                                        "manager" -> KonCallColors.Violet
                                        else -> KonCallColors.Teal
                                    },
                                    modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                                )
                            }
                            if (userProfile.orgName.isNotEmpty()) {
                                Spacer(modifier = Modifier.width(8.dp))
                                Text(
                                    text = "• ${userProfile.orgName}",
                                    style = MaterialTheme.typography.bodySmall,
                                    color = KonCallColors.TextTertiary
                                )
                            }
                        }
                    }
                }
            }
            
            Spacer(modifier = Modifier.height(24.dp))
            
            // Account Section
            Text(
                "Account",
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.SemiBold,
                color = KonCallColors.Teal,
                modifier = Modifier.padding(bottom = 12.dp)
            )
            
            Card(
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = KonCallColors.SurfaceCard)
            ) {
                SettingItem(
                    title = "Recording Settings",
                    subtitle = "Configure call recording sync",
                    icon = Icons.Default.Mic,
                    iconColor = KonCallColors.Teal,
                    onClick = onNavigateToRecordingSettings
                )
            }
            
            Spacer(modifier = Modifier.height(24.dp))
            
            // App Info Section
            Text(
                "App Info",
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.SemiBold,
                color = KonCallColors.Teal,
                modifier = Modifier.padding(bottom = 12.dp)
            )
            
            Card(
                shape = RoundedCornerShape(16.dp),
                colors = CardDefaults.cardColors(containerColor = KonCallColors.SurfaceCard)
            ) {
                SettingItem(
                    title = "Version",
                    subtitle = "1.0.0",
                    icon = Icons.Default.Info,
                    iconColor = KonCallColors.TextSecondary,
                    onClick = null,
                    showArrow = false
                )
            }
            
            Spacer(modifier = Modifier.weight(1f))
            
            // Logout Button
            Button(
                onClick = { showLogoutDialog = true },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = KonCallColors.SurfaceCard,
                    contentColor = KonCallColors.Error
                ),
                shape = RoundedCornerShape(16.dp),
                enabled = !isLoggingOut
            ) {
                if (isLoggingOut) {
                    CircularProgressIndicator(
                        modifier = Modifier.size(24.dp),
                        color = KonCallColors.Error
                    )
                } else {
                    Icon(Icons.Default.ExitToApp, contentDescription = null)
                    Spacer(modifier = Modifier.width(8.dp))
                    Text("Logout", style = MaterialTheme.typography.titleMedium, fontWeight = FontWeight.Bold)
                }
            }
            Spacer(modifier = Modifier.height(16.dp))
        }
    }
}

@Composable
private fun SettingItem(
    title: String,
    subtitle: String? = null,
    icon: ImageVector,
    iconColor: Color,
    onClick: (() -> Unit)?,
    showArrow: Boolean = true
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(enabled = onClick != null, onClick = onClick ?: {})
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Surface(
            modifier = Modifier.size(40.dp),
            shape = RoundedCornerShape(10.dp),
            color = iconColor.copy(alpha = 0.15f)
        ) {
            Box(contentAlignment = Alignment.Center) {
                Icon(
                    imageVector = icon,
                    contentDescription = null,
                    tint = iconColor,
                    modifier = Modifier.size(20.dp)
                )
            }
        }
        
        Spacer(modifier = Modifier.width(16.dp))
        
        Column(modifier = Modifier.weight(1f)) {
            Text(
                text = title,
                style = MaterialTheme.typography.bodyLarge,
                fontWeight = FontWeight.Medium,
                color = KonCallColors.TextPrimary
            )
            if (subtitle != null) {
                Text(
                    text = subtitle,
                    style = MaterialTheme.typography.bodySmall,
                    color = KonCallColors.TextSecondary
                )
            }
        }
        
        if (showArrow) {
            Icon(
                imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                contentDescription = null,
                tint = KonCallColors.TextTertiary
            )
        }
    }
}
