package com.koncall.app.ui.calllogs

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Done
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Send
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material.icons.outlined.Phone
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.koncall.app.data.local.entity.CallLogEntity
import com.koncall.app.data.local.entity.CallNoteEntity
import com.koncall.app.data.local.entity.CallType
import com.koncall.app.ui.components.GradientButton
import com.koncall.app.ui.theme.KonCallColors
import java.text.SimpleDateFormat
import java.util.*

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CallLogsScreen(
    viewModel: CallLogsViewModel,
    onCallLogClick: (String) -> Unit
) {
    val uiState by viewModel.uiState.collectAsState()
    val context = LocalContext.current
    var selectedFilter by remember { mutableStateOf<String?>(null) }
    
    // Helper function to make a call
    fun makeCall(phoneNumber: String) {
        val intent = Intent(Intent.ACTION_DIAL).apply {
            data = Uri.parse("tel:$phoneNumber")
        }
        context.startActivity(intent)
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { 
                    Text(
                        "Call Logs", 
                        style = MaterialTheme.typography.headlineSmall,
                        fontWeight = FontWeight.SemiBold
                    ) 
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = KonCallColors.BackgroundDeep,
                    titleContentColor = KonCallColors.TextPrimary
                )
            )
        },
        containerColor = KonCallColors.BackgroundDeep
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            // Filters
            LazyRow(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 8.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                item {
                    FilterChip(
                        selected = selectedFilter == null,
                        onClick = { 
                            selectedFilter = null
                            viewModel.filterByType(null) 
                        },
                        label = { Text("All") },
                        colors = FilterChipDefaults.filterChipColors(
                            selectedContainerColor = KonCallColors.Teal,
                            selectedLabelColor = Color.White,
                            containerColor = KonCallColors.SurfaceCard,
                            labelColor = KonCallColors.TextSecondary
                        ),
                        border = FilterChipDefaults.filterChipBorder(
                            enabled = true,
                            selected = selectedFilter == null,
                            borderColor = Color.Transparent,
                            selectedBorderColor = Color.Transparent
                        )
                    )
                }
                
                item {
                    FilterChip(
                        selected = selectedFilter == CallType.INCOMING,
                        onClick = { 
                            selectedFilter = CallType.INCOMING
                            viewModel.filterByType(CallType.INCOMING)
                        },
                        label = { Text("Incoming") },
                        colors = FilterChipDefaults.filterChipColors(
                            selectedContainerColor = KonCallColors.Incoming.copy(alpha=0.8f),
                            selectedLabelColor = Color.White,
                            containerColor = KonCallColors.SurfaceCard,
                            labelColor = KonCallColors.TextSecondary
                        ),
                        border = FilterChipDefaults.filterChipBorder(
                            enabled = true,
                            selected = selectedFilter == CallType.INCOMING,
                            borderColor = Color.Transparent,
                            selectedBorderColor = Color.Transparent
                        )
                    )
                }
                
                item {
                    FilterChip(
                        selected = selectedFilter == CallType.OUTGOING,
                        onClick = { 
                            selectedFilter = CallType.OUTGOING
                            viewModel.filterByType(CallType.OUTGOING)
                        },
                        label = { Text("Outgoing") },
                        colors = FilterChipDefaults.filterChipColors(
                            selectedContainerColor = KonCallColors.Outgoing.copy(alpha=0.8f),
                            selectedLabelColor = Color.White,
                            containerColor = KonCallColors.SurfaceCard,
                            labelColor = KonCallColors.TextSecondary
                        ),
                        border = FilterChipDefaults.filterChipBorder(
                            enabled = true,
                            selected = selectedFilter == CallType.OUTGOING,
                            borderColor = Color.Transparent,
                            selectedBorderColor = Color.Transparent
                        )
                    )
                }
                
                item {
                    FilterChip(
                        selected = selectedFilter == CallType.MISSED,
                        onClick = { 
                            selectedFilter = CallType.MISSED
                            viewModel.filterByType(CallType.MISSED)
                        },
                        label = { Text("Missed") },
                        colors = FilterChipDefaults.filterChipColors(
                            selectedContainerColor = KonCallColors.Missed.copy(alpha=0.8f),
                            selectedLabelColor = Color.White,
                            containerColor = KonCallColors.SurfaceCard,
                            labelColor = KonCallColors.TextSecondary
                        ),
                        border = FilterChipDefaults.filterChipBorder(
                            enabled = true,
                            selected = selectedFilter == CallType.MISSED,
                            borderColor = Color.Transparent,
                            selectedBorderColor = Color.Transparent
                        )
                    )
                }
            }

            if (uiState.callLogs.isEmpty()) {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Icon(
                            Icons.Default.Phone,
                            contentDescription = null,
                            modifier = Modifier.size(64.dp),
                            tint = KonCallColors.SurfaceVariant
                        )
                        Spacer(modifier = Modifier.height(16.dp))
                        Text(
                            text = "No call logs found",
                            style = MaterialTheme.typography.bodyLarge,
                            color = KonCallColors.TextSecondary
                        )
                    }
                }
            } else {
                LazyColumn(
                    modifier = Modifier.fillMaxSize(),
                    contentPadding = PaddingValues(horizontal = 12.dp, vertical = 8.dp),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    items(uiState.callLogs, key = { it.id }) { callLog ->
                        CallLogItem(
                            callLog = callLog,
                            onClick = { onCallLogClick(callLog.id) },
                            onCallClick = { phone -> makeCall(phone) }
                        )
                    }
                }
            }
        }
    }
}

@Composable
private fun CallLogItem(
    callLog: CallLogEntity,
    onClick: () -> Unit,
    onCallClick: (String) -> Unit
) {
    val accentColor = when (callLog.callType) {
        CallType.INCOMING -> KonCallColors.Incoming
        CallType.OUTGOING -> KonCallColors.Outgoing
        CallType.MISSED -> KonCallColors.Missed
        else -> KonCallColors.TextSecondary
    }

    val icon = when (callLog.callType) {
        CallType.INCOMING -> Icons.Default.Phone
        CallType.OUTGOING -> Icons.Outlined.Phone
        CallType.MISSED -> Icons.Default.Warning
        else -> Icons.Default.Phone
    }

    Card(
        onClick = onClick,
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(
            containerColor = KonCallColors.SurfaceCard
        )
    ) {
        Row(
            modifier = Modifier.fillMaxWidth().height(IntrinsicSize.Min)
        ) {
            // Accent strip
            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .width(3.dp)
                    .background(accentColor)
            )

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(12.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Surface(
                    modifier = Modifier.size(36.dp),
                    shape = RoundedCornerShape(8.dp),
                    color = accentColor.copy(alpha = 0.15f)
                ) {
                    Box(contentAlignment = Alignment.Center) {
                        Icon(
                            imageVector = icon,
                            contentDescription = null,
                            tint = accentColor,
                            modifier = Modifier.size(18.dp)
                        )
                    }
                }
                
                Spacer(modifier = Modifier.width(12.dp))
                
                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = callLog.contactName ?: callLog.phoneNumber,
                        style = MaterialTheme.typography.bodyLarge,
                        fontWeight = FontWeight.SemiBold,
                        color = KonCallColors.TextPrimary,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                    Text(
                        text = if (callLog.contactName != null) callLog.phoneNumber else formatTime(callLog.callDateTime),
                        style = MaterialTheme.typography.bodySmall,
                        color = KonCallColors.TextSecondary
                    )
                }
                
                Text(
                    text = formatDuration(callLog.duration),
                    style = MaterialTheme.typography.labelMedium,
                    color = KonCallColors.TextPrimary
                )
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CallLogDetailScreen(
    viewModel: CallLogDetailViewModel,
    onNavigateBack: () -> Unit,
    onCreateLead: (String) -> Unit
) {
    val uiState by viewModel.uiState.collectAsState()
    var noteText by remember { mutableStateOf("") }
    val context = LocalContext.current
    
    // Helper function to make a call
    fun makeCall(phoneNumber: String) {
        val intent = Intent(Intent.ACTION_DIAL).apply {
            data = Uri.parse("tel:$phoneNumber")
        }
        context.startActivity(intent)
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { 
                    Text(
                        "Call Details", 
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
        when {
            uiState.isLoading -> {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    CircularProgressIndicator(color = KonCallColors.Teal)
                }
            }
            uiState.error != null -> {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    Text(uiState.error ?: "Error", color = KonCallColors.Error)
                }
            }
            uiState.callLog != null -> {
                val callLog = uiState.callLog!!
                
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(paddingValues)
                        .verticalScroll(rememberScrollState())
                        .padding(16.dp)
                ) {
                    // Contact Card
                    Card(
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(20.dp),
                        colors = CardDefaults.cardColors(containerColor = KonCallColors.SurfaceCard)
                    ) {
                        Column(modifier = Modifier.padding(20.dp)) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Surface(
                                    modifier = Modifier.size(64.dp),
                                    shape = RoundedCornerShape(16.dp),
                                    color = KonCallColors.SurfaceElevated
                                ) {
                                    Box(contentAlignment = Alignment.Center) {
                                        Text(
                                            text = (callLog.contactName ?: callLog.phoneNumber).take(1).uppercase(),
                                            style = MaterialTheme.typography.headlineMedium,
                                            fontWeight = FontWeight.Bold,
                                            color = KonCallColors.Teal
                                        )
                                    }
                                }
                                
                                Spacer(modifier = Modifier.width(16.dp))
                                
                                Column(modifier = Modifier.weight(1f)) {
                                    Text(
                                        text = callLog.contactName ?: callLog.phoneNumber,
                                        style = MaterialTheme.typography.headlineSmall,
                                        fontWeight = FontWeight.Bold,
                                        color = KonCallColors.TextPrimary
                                    )
                                    if (callLog.contactName != null) {
                                        Text(
                                            text = callLog.phoneNumber,
                                            style = MaterialTheme.typography.bodyLarge,
                                            color = KonCallColors.TextSecondary
                                        )
                                    }
                                }
                            }
                            
                            Spacer(modifier = Modifier.height(24.dp))
                            
                            GradientButton(
                                onClick = { makeCall(callLog.phoneNumber) },
                                modifier = Modifier.fillMaxWidth()
                            ) {
                                Icon(Icons.Default.Phone, contentDescription = null, tint = Color.White)
                                Spacer(modifier = Modifier.width(8.dp))
                                Text("Call Again", color = Color.White, fontWeight = FontWeight.Bold)
                            }
                        }
                    }
                    
                    Spacer(modifier = Modifier.height(16.dp))
                    
                    // Call Info Grid
                    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                         DetailItem(
                             modifier = Modifier.weight(1f),
                             label = "Type",
                             value = callLog.callType.replaceFirstChar { it.uppercase() },
                             icon = Icons.Default.Phone
                         )
                         DetailItem(
                             modifier = Modifier.weight(1f),
                             label = "Duration",
                             value = formatDuration(callLog.duration),
                             icon = Icons.Default.PlayArrow // Use a time icon
                         )
                    }
                    
                    Spacer(modifier = Modifier.height(12.dp))
                    
                    DetailItem(
                        modifier = Modifier.fillMaxWidth(),
                        label = "Date & Time",
                        value = formatDateTime(callLog.callDateTime),
                        icon = Icons.Default.Add // Calendar icon
                    )
                    
                    Spacer(modifier = Modifier.height(16.dp))
                    
                    // Linked Lead Section
                    if (uiState.linkedLead != null) {
                        Text(
                            "Linked Lead",
                            style = MaterialTheme.typography.titleMedium,
                            fontWeight = FontWeight.SemiBold,
                            color = KonCallColors.TextPrimary
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        Card(
                            modifier = Modifier.fillMaxWidth(),
                            colors = CardDefaults.cardColors(containerColor = KonCallColors.SurfaceCard),
                            shape = RoundedCornerShape(16.dp)
                        ) {
                            Row(
                                modifier = Modifier.padding(16.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Box(
                                    modifier = Modifier
                                        .size(10.dp)
                                        .background(KonCallColors.Success, androidx.compose.foundation.shape.CircleShape)
                                )
                                Spacer(modifier = Modifier.width(12.dp))
                                Column {
                                    Text(
                                        uiState.linkedLead!!.fullName,
                                        style = MaterialTheme.typography.titleMedium,
                                        fontWeight = FontWeight.Medium,
                                        color = KonCallColors.TextPrimary
                                    )
                                    uiState.linkedLead!!.statusName?.let {
                                        Text(it, style = MaterialTheme.typography.bodySmall, color = KonCallColors.TextSecondary)
                                    }
                                }
                            }
                        }
                    } else {
                        Card(
                            onClick = { onCreateLead(callLog.phoneNumber) },
                            modifier = Modifier.fillMaxWidth(),
                            colors = CardDefaults.cardColors(containerColor = KonCallColors.SurfaceCard),
                            shape = RoundedCornerShape(16.dp)
                        ) {
                            Row(
                                modifier = Modifier.padding(16.dp),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.Center
                            ) {
                                Icon(Icons.Default.Add, contentDescription = null, tint = KonCallColors.Teal)
                                Spacer(modifier = Modifier.width(8.dp))
                                Text("Create Lead from this Call", color = KonCallColors.Teal, fontWeight = FontWeight.Medium)
                            }
                        }
                    }
                    
                    Spacer(modifier = Modifier.height(24.dp))
                    
                    // Notes Section
                    Text(
                        "Notes",
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.SemiBold,
                        color = KonCallColors.TextPrimary
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    
                    OutlinedTextField(
                        value = noteText,
                        onValueChange = { noteText = it },
                        placeholder = { Text("Add a note...", color = KonCallColors.TextTertiary) },
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(12.dp),
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedBorderColor = KonCallColors.Teal,
                            unfocusedBorderColor = KonCallColors.SurfaceElevated,
                            focusedTextColor = KonCallColors.TextPrimary,
                            unfocusedTextColor = KonCallColors.TextPrimary
                        ),
                        trailingIcon = {
                            IconButton(onClick = { 
                                if (noteText.isNotBlank()) {
                                    viewModel.addNote(noteText)
                                    noteText = ""
                                }
                            }) {
                                Icon(Icons.Default.Send, contentDescription = "Send", tint = KonCallColors.Teal)
                            }
                        }
                    )
                    
                    if (uiState.notes.isNotEmpty()) {
                        Spacer(modifier = Modifier.height(12.dp))
                        uiState.notes.forEach { note ->
                            NoteItem(
                                note = note,
                                onDelete = { viewModel.deleteNote(note.id) }
                            )
                            Spacer(modifier = Modifier.height(8.dp))
                        }
                    }
                }
            }
        }
    }
}

@Composable
private fun DetailItem(
    modifier: Modifier = Modifier,
    label: String,
    value: String,
    icon: ImageVector
) {
    Card(
        modifier = modifier,
        colors = CardDefaults.cardColors(containerColor = KonCallColors.SurfaceCard),
        shape = RoundedCornerShape(12.dp)
    ) {
        Column(modifier = Modifier.padding(12.dp)) {
            Text(label, style = MaterialTheme.typography.labelMedium, color = KonCallColors.TextSecondary)
            Spacer(modifier = Modifier.height(4.dp))
            Text(value, style = MaterialTheme.typography.bodyLarge, fontWeight = FontWeight.Medium, color = KonCallColors.TextPrimary)
        }
    }
}

@Composable
private fun NoteItem(
    note: CallNoteEntity,
    onDelete: () -> Unit
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(containerColor = KonCallColors.SurfaceCard),
        shape = RoundedCornerShape(12.dp)
    ) {
        Row(
            modifier = Modifier.padding(12.dp),
            verticalAlignment = Alignment.Top
        ) {
            Text(
                text = note.content,
                modifier = Modifier.weight(1f),
                style = MaterialTheme.typography.bodyMedium,
                color = KonCallColors.TextPrimary
            )
            IconButton(
                onClick = onDelete,
                modifier = Modifier.size(24.dp)
            ) {
                Icon(
                    Icons.Default.Delete,
                    contentDescription = "Delete",
                    modifier = Modifier.size(16.dp),
                    tint = KonCallColors.Error
                )
            }
        }
    }
}

private fun formatDuration(seconds: Int): String {
    val mins = seconds / 60
    val secs = seconds % 60
    return if (mins > 0) "${mins}m ${secs}s" else "${secs}s"
}

private fun formatTime(timestamp: Long): String {
    val sdf = SimpleDateFormat("HH:mm", Locale.getDefault())
    return sdf.format(Date(timestamp))
}

private fun formatDateTime(timestamp: Long): String {
    val sdf = SimpleDateFormat("MMM d, yyyy • HH:mm", Locale.getDefault())
    return sdf.format(Date(timestamp))
}
