package com.koncall.app.ui.dashboard

import androidx.compose.animation.core.*
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.Phone
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.koncall.app.ui.components.GradientCard
import com.koncall.app.ui.components.KonCallGradients
import com.koncall.app.ui.components.PulsingDot
import com.koncall.app.ui.theme.KonCallColors

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DashboardScreen(
    viewModel: DashboardViewModel,
    onNavigateToCallLogs: () -> Unit,
    onNavigateToLeads: () -> Unit,
    onNavigateToSettings: () -> Unit,
    onNavigateToNeverAttended: () -> Unit,
    onNavigateToNotPickedUp: () -> Unit
) {
    val uiState by viewModel.uiState.collectAsState()

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "KonCall",
                        style = MaterialTheme.typography.headlineMedium,
                        fontWeight = FontWeight.Bold
                    )
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.Transparent,
                    titleContentColor = MaterialTheme.colorScheme.onBackground
                ),
                actions = {
                    IconButton(onClick = viewModel::syncCallLogs) {
                        Icon(
                            Icons.Default.Refresh,
                            contentDescription = "Sync",
                            tint = KonCallColors.Teal
                        )
                    }
                    IconButton(onClick = onNavigateToSettings) {
                        Icon(
                            Icons.Default.Settings,
                            contentDescription = "Settings",
                            tint = KonCallColors.TextSecondary
                        )
                    }
                }
            )
        },
        containerColor = KonCallColors.BackgroundDeep
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .verticalScroll(rememberScrollState())
                .padding(horizontal = 16.dp)
        ) {
            // Section Title
            Text(
                text = "Today's Overview",
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.SemiBold,
                color = KonCallColors.TextPrimary
            )
            
            Spacer(modifier = Modifier.height(16.dp))
            
            // Hero Card - Total Calls with Gradient
            HeroStatCard(
                title = "Total Calls",
                value = uiState.stats.totalCalls.toString(),
                duration = formatDuration(uiState.stats.totalDuration),
                onClick = onNavigateToCallLogs
            )
            
            Spacer(modifier = Modifier.height(16.dp))
            
            // Stats Grid - 2x2
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                StatCard(
                    modifier = Modifier.weight(1f),
                    icon = Icons.Default.Phone,
                    title = "Incoming",
                    value = uiState.stats.incomingCalls.toString(),
                    accentColor = KonCallColors.Incoming,
                    onClick = {}
                )
                StatCard(
                    modifier = Modifier.weight(1f),
                    icon = Icons.Outlined.Phone,
                    title = "Outgoing",
                    value = uiState.stats.outgoingCalls.toString(),
                    accentColor = KonCallColors.Outgoing,
                    onClick = {}
                )
            }
            
            Spacer(modifier = Modifier.height(12.dp))
            
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                StatCard(
                    modifier = Modifier.weight(1f),
                    icon = Icons.Default.Warning,
                    title = "Missed",
                    value = uiState.stats.missedCalls.toString(),
                    accentColor = KonCallColors.Missed,
                    onClick = {}
                )
                StatCard(
                    modifier = Modifier.weight(1f),
                    icon = Icons.Default.Warning,
                    title = "Never Attended",
                    value = uiState.stats.neverAttendedCount.toString(),
                    accentColor = KonCallColors.Warning,
                    onClick = onNavigateToNeverAttended
                )
            }
            
            Spacer(modifier = Modifier.height(12.dp))
            
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                StatCard(
                    modifier = Modifier.weight(1f),
                    icon = Icons.Default.Warning,
                    title = "Not Picked Up",
                    value = uiState.stats.notPickedUpCount.toString(),
                    accentColor = KonCallColors.Error,
                    onClick = onNavigateToNotPickedUp
                )
                StatCard(
                    modifier = Modifier.weight(1f),
                    icon = Icons.Default.Notifications,
                    title = "Follow-ups",
                    value = uiState.stats.pendingFollowUps.toString(),
                    accentColor = KonCallColors.Violet,
                    onClick = onNavigateToLeads
                )
            }
            
            // Pending Sync Banner
            if (uiState.stats.pendingSyncCount > 0) {
                Spacer(modifier = Modifier.height(16.dp))
                PendingSyncBanner(
                    count = uiState.stats.pendingSyncCount,
                    onSyncClick = viewModel::syncCallLogs
                )
            }
            
            Spacer(modifier = Modifier.height(28.dp))
            
            // Quick Actions Section
            Text(
                text = "Quick Actions",
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.SemiBold,
                color = KonCallColors.TextPrimary
            )
            
            Spacer(modifier = Modifier.height(16.dp))
            
            QuickActionCard(
                icon = Icons.Default.List,
                iconColor = KonCallColors.Teal,
                title = "Call Logs",
                description = "View and manage your call history",
                onClick = onNavigateToCallLogs
            )
            
            Spacer(modifier = Modifier.height(12.dp))
            
            QuickActionCard(
                icon = Icons.Default.Person,
                iconColor = KonCallColors.Violet,
                title = "Leads",
                description = "Manage your contacts and leads",
                onClick = onNavigateToLeads
            )
            
            Spacer(modifier = Modifier.height(24.dp))
        }
    }
}

@Composable
private fun HeroStatCard(
    title: String,
    value: String,
    duration: String,
    onClick: () -> Unit
) {
    GradientCard(
        modifier = Modifier.fillMaxWidth(),
        onClick = onClick
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = title,
                    style = MaterialTheme.typography.titleMedium,
                    color = Color.White.copy(alpha = 0.8f)
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = value,
                    style = MaterialTheme.typography.displayMedium,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = "Duration: $duration",
                    style = MaterialTheme.typography.bodyMedium,
                    color = Color.White.copy(alpha = 0.7f)
                )
            }
            
            Surface(
                modifier = Modifier.size(64.dp),
                shape = RoundedCornerShape(16.dp),
                color = Color.White.copy(alpha = 0.15f)
            ) {
                Box(contentAlignment = Alignment.Center) {
                    Icon(
                        imageVector = Icons.Default.Phone,
                        contentDescription = null,
                        modifier = Modifier.size(32.dp),
                        tint = Color.White
                    )
                }
            }
        }
    }
}

@Composable
private fun StatCard(
    modifier: Modifier = Modifier,
    icon: ImageVector,
    title: String,
    value: String,
    accentColor: Color,
    onClick: () -> Unit
) {
    Card(
        modifier = modifier,
        onClick = onClick,
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = KonCallColors.SurfaceCard
        )
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Icon(
                imageVector = icon,
                contentDescription = null,
                tint = accentColor,
                modifier = Modifier.size(24.dp)
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = value,
                style = MaterialTheme.typography.headlineSmall,
                fontWeight = FontWeight.Bold,
                color = accentColor
            )
            Spacer(modifier = Modifier.height(2.dp))
            Text(
                text = title,
                style = MaterialTheme.typography.labelMedium,
                color = KonCallColors.TextSecondary
            )
        }
    }
}

@Composable
private fun PendingSyncBanner(
    count: Int,
    onSyncClick: () -> Unit
) {
    Card(
        onClick = onSyncClick,
        shape = RoundedCornerShape(14.dp),
        colors = CardDefaults.cardColors(
            containerColor = KonCallColors.SurfaceElevated
        )
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            PulsingDot(color = KonCallColors.Teal, size = 10.dp)
            
            Spacer(modifier = Modifier.width(12.dp))
            
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = "$count calls pending sync",
                    style = MaterialTheme.typography.titleSmall,
                    fontWeight = FontWeight.Medium,
                    color = KonCallColors.TextPrimary
                )
                Text(
                    text = "Tap to upload",
                    style = MaterialTheme.typography.bodySmall,
                    color = KonCallColors.TextSecondary
                )
            }
            
            Icon(
                imageVector = Icons.Default.Refresh,
                contentDescription = "Sync",
                tint = KonCallColors.Teal,
                modifier = Modifier.size(20.dp)
            )
        }
    }
}

@Composable
private fun QuickActionCard(
    icon: ImageVector,
    iconColor: Color,
    title: String,
    description: String,
    onClick: () -> Unit
) {
    Card(
        onClick = onClick,
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = KonCallColors.SurfaceCard
        )
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Surface(
                modifier = Modifier.size(48.dp),
                shape = RoundedCornerShape(12.dp),
                color = iconColor.copy(alpha = 0.15f)
            ) {
                Box(contentAlignment = Alignment.Center) {
                    Icon(
                        imageVector = icon,
                        contentDescription = null,
                        modifier = Modifier.size(24.dp),
                        tint = iconColor
                    )
                }
            }
            
            Spacer(modifier = Modifier.width(16.dp))
            
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = title,
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.SemiBold,
                    color = KonCallColors.TextPrimary
                )
                Text(
                    text = description,
                    style = MaterialTheme.typography.bodySmall,
                    color = KonCallColors.TextSecondary
                )
            }
            
            Icon(
                imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                contentDescription = null,
                tint = KonCallColors.TextTertiary
            )
        }
    }
}

private fun formatDuration(seconds: Int): String {
    val hours = seconds / 3600
    val minutes = (seconds % 3600) / 60
    return when {
        hours > 0 -> "${hours}h ${minutes}m"
        minutes > 0 -> "${minutes}m"
        else -> "${seconds}s"
    }
}
