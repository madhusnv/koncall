package com.koncall.app.ui.calllogs

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Send
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.koncall.app.data.local.entity.CallLogEntity
import com.koncall.app.data.local.entity.CallNoteEntity
import com.koncall.app.data.local.entity.CallType
import java.text.SimpleDateFormat
import java.util.*

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CallLogsScreen(
    viewModel: CallLogsViewModel,
    onCallLogClick: (String) -> Unit,
    onNavigateBack: () -> Unit
) {
    val uiState by viewModel.uiState.collectAsState()
    var showFilterMenu by remember { mutableStateOf(false) }
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
                title = { Text("Call Logs") },
                navigationIcon = {
                    IconButton(onClick = onNavigateBack) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back")
                    }
                },
                actions = {
                    IconButton(onClick = { showFilterMenu = true }) {
                        Icon(Icons.Default.MoreVert, contentDescription = "Filter")
                    }
                    DropdownMenu(
                        expanded = showFilterMenu,
                        onDismissRequest = { showFilterMenu = false }
                    ) {
                        DropdownMenuItem(
                            text = { Text("All Calls") },
                            onClick = {
                                viewModel.filterByType(null)
                                showFilterMenu = false
                            }
                        )
                        DropdownMenuItem(
                            text = { Text("Incoming") },
                            onClick = {
                                viewModel.filterByType(CallType.INCOMING)
                                showFilterMenu = false
                            }
                        )
                        DropdownMenuItem(
                            text = { Text("Outgoing") },
                            onClick = {
                                viewModel.filterByType(CallType.OUTGOING)
                                showFilterMenu = false
                            }
                        )
                        DropdownMenuItem(
                            text = { Text("Missed") },
                            onClick = {
                                viewModel.filterByType(CallType.MISSED)
                                showFilterMenu = false
                            }
                        )
                    }
                }
            )
        }
    ) { paddingValues ->
        if (uiState.callLogs.isEmpty()) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues),
                contentAlignment = Alignment.Center
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Icon(
                        Icons.Default.Phone,
                        contentDescription = null,
                        modifier = Modifier.size(64.dp),
                        tint = MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.5f)
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    Text(
                        text = "No call logs yet",
                        style = MaterialTheme.typography.bodyLarge,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
            }
        } else {
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues),
                contentPadding = PaddingValues(16.dp),
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

@Composable
private fun CallLogItem(
    callLog: CallLogEntity,
    onClick: () -> Unit,
    onCallClick: (String) -> Unit
) {
    Card(onClick = onClick) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Call type icon
            val icon: ImageVector
            val color: androidx.compose.ui.graphics.Color
            when (callLog.callType) {
                CallType.INCOMING -> {
                    icon = Icons.Default.Phone
                    color = MaterialTheme.colorScheme.tertiary
                }
                CallType.OUTGOING -> {
                    icon = Icons.Default.Phone
                    color = MaterialTheme.colorScheme.primary
                }
                CallType.MISSED -> {
                    icon = Icons.Default.Warning
                    color = MaterialTheme.colorScheme.error
                }
                else -> {
                    icon = Icons.Default.Phone
                    color = MaterialTheme.colorScheme.onSurface
                }
            }
            
            Icon(
                imageVector = icon,
                contentDescription = callLog.callType,
                tint = color,
                modifier = Modifier.size(24.dp)
            )
            
            Spacer(modifier = Modifier.width(12.dp))
            
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = callLog.contactName ?: callLog.phoneNumber,
                    fontWeight = FontWeight.Medium,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
                if (callLog.contactName != null) {
                    Text(
                        text = callLog.phoneNumber,
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
            }
            
            Column(horizontalAlignment = Alignment.End) {
                Text(
                    text = formatDuration(callLog.duration),
                    style = MaterialTheme.typography.bodyMedium
                )
                Text(
                    text = formatTime(callLog.callDateTime),
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
            
            Spacer(modifier = Modifier.width(8.dp))
            
            // Call button
            IconButton(
                onClick = { onCallClick(callLog.phoneNumber) }
            ) {
                Icon(
                    imageVector = Icons.Default.Phone,
                    contentDescription = "Call ${callLog.contactName ?: callLog.phoneNumber}",
                    tint = MaterialTheme.colorScheme.primary
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
                title = { Text("Call Details") },
                navigationIcon = {
                    IconButton(onClick = onNavigateBack) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back")
                    }
                }
            )
        }
    ) { paddingValues ->
        when {
            uiState.isLoading -> {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(paddingValues),
                    contentAlignment = Alignment.Center
                ) {
                    CircularProgressIndicator()
                }
            }
            uiState.error != null -> {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(paddingValues),
                    contentAlignment = Alignment.Center
                ) {
                    Text(uiState.error ?: "Error", color = MaterialTheme.colorScheme.error)
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
                    // Call Info Card
                    Card(modifier = Modifier.fillMaxWidth()) {
                        Column(modifier = Modifier.padding(16.dp)) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Surface(
                                    modifier = Modifier.size(56.dp),
                                    shape = MaterialTheme.shapes.medium,
                                    color = MaterialTheme.colorScheme.primaryContainer
                                ) {
                                    Box(contentAlignment = Alignment.Center) {
                                        Icon(
                                            Icons.Default.Phone,
                                            contentDescription = null,
                                            modifier = Modifier.size(28.dp)
                                        )
                                    }
                                }
                                Spacer(modifier = Modifier.width(16.dp))
                                Column(modifier = Modifier.weight(1f)) {
                                    Text(
                                        text = callLog.contactName ?: callLog.phoneNumber,
                                        style = MaterialTheme.typography.titleLarge,
                                        fontWeight = FontWeight.Bold
                                    )
                                    if (callLog.contactName != null) {
                                        Text(
                                            text = callLog.phoneNumber,
                                            style = MaterialTheme.typography.bodyMedium,
                                            color = MaterialTheme.colorScheme.onSurfaceVariant
                                        )
                                    }
                                }
                                // Call button in header
                                FilledIconButton(
                                    onClick = { makeCall(callLog.phoneNumber) }
                                ) {
                                    Icon(
                                        imageVector = Icons.Default.Phone,
                                        contentDescription = "Call"
                                    )
                                }
                            }
                            
                            Spacer(modifier = Modifier.height(16.dp))
                            HorizontalDivider()
                            Spacer(modifier = Modifier.height(16.dp))
                            
                            // Call details
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {
                                Column {
                                    Text("Type", style = MaterialTheme.typography.labelSmall)
                                    Text(callLog.callType.replaceFirstChar { it.uppercase() })
                                }
                                Column(horizontalAlignment = Alignment.End) {
                                    Text("Duration", style = MaterialTheme.typography.labelSmall)
                                    Text(formatDuration(callLog.duration))
                                }
                            }
                            Spacer(modifier = Modifier.height(8.dp))
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {
                                Column {
                                    Text("Date", style = MaterialTheme.typography.labelSmall)
                                    Text(formatDateTime(callLog.callDateTime))
                                }
                                if (callLog.simSlot != null) {
                                    Column(horizontalAlignment = Alignment.End) {
                                        Text("SIM", style = MaterialTheme.typography.labelSmall)
                                        Text("SIM ${callLog.simSlot + 1}")
                                    }
                                }
                            }
                            
                            // Recording Section
                            if (!callLog.recordingPath.isNullOrBlank()) {
                                Spacer(modifier = Modifier.height(16.dp))
                                OutlinedButton(
                                    onClick = { 
                                        // TODO: Launch intent to play URL
                                        // val intent = Intent(Intent.ACTION_VIEW, Uri.parse(callLog.recordingPath))
                                        // context.startActivity(intent)
                                    },
                                    modifier = Modifier.fillMaxWidth()
                                ) {
                                    Icon(Icons.Default.PlayArrow, contentDescription = null)
                                    Spacer(modifier = Modifier.width(8.dp))
                                    Text("Play Recording")
                                }
                            }
                            
                            // Call Again button
                            Spacer(modifier = Modifier.height(16.dp))
                            Button(
                                onClick = { makeCall(callLog.phoneNumber) },
                                modifier = Modifier.fillMaxWidth()
                            ) {
                                Icon(Icons.Default.Phone, contentDescription = null)
                                Spacer(modifier = Modifier.width(8.dp))
                                Text("Call Again")
                            }
                        }
                    }
                    
                    Spacer(modifier = Modifier.height(16.dp))
                    
                    // Linked Lead Card
                    Card(modifier = Modifier.fillMaxWidth()) {
                        Column(modifier = Modifier.padding(16.dp)) {
                            Text(
                                text = "Linked Lead",
                                style = MaterialTheme.typography.titleMedium,
                                fontWeight = FontWeight.SemiBold
                            )
                            Spacer(modifier = Modifier.height(8.dp))
                            
                            if (uiState.linkedLead != null) {
                                val lead = uiState.linkedLead!!
                                Row(verticalAlignment = Alignment.CenterVertically) {
                                    Surface(
                                        modifier = Modifier.size(40.dp),
                                        shape = MaterialTheme.shapes.small,
                                        color = MaterialTheme.colorScheme.secondaryContainer
                                    ) {
                                        Box(contentAlignment = Alignment.Center) {
                                            Text(
                                                text = lead.displayName.take(1).uppercase(),
                                                style = MaterialTheme.typography.titleMedium
                                            )
                                        }
                                    }
                                    Spacer(modifier = Modifier.width(12.dp))
                                    Column {
                                        Text(lead.fullName, fontWeight = FontWeight.Medium)
                                        lead.statusName?.let { status ->
                                            Text(
                                                text = status,
                                                style = MaterialTheme.typography.bodySmall,
                                                color = MaterialTheme.colorScheme.onSurfaceVariant
                                            )
                                        }
                                    }
                                }
                            } else {
                                Text(
                                    text = "No lead linked to this number",
                                    color = MaterialTheme.colorScheme.onSurfaceVariant
                                )
                                Spacer(modifier = Modifier.height(8.dp))
                                OutlinedButton(
                                    onClick = { onCreateLead(callLog.phoneNumber) }
                                ) {
                                    Text("Create Lead")
                                }
                            }
                        }
                    }
                    
                    Spacer(modifier = Modifier.height(16.dp))
                    
                    // Notes Section
                    Card(modifier = Modifier.fillMaxWidth()) {
                        Column(modifier = Modifier.padding(16.dp)) {
                            Text(
                                text = "Notes (${uiState.notes.size})",
                                style = MaterialTheme.typography.titleMedium,
                                fontWeight = FontWeight.SemiBold
                            )
                            Spacer(modifier = Modifier.height(12.dp))
                            
                            // Add note input
                            OutlinedTextField(
                                value = noteText,
                                onValueChange = { noteText = it },
                                label = { Text("Add a note...") },
                                modifier = Modifier.fillMaxWidth(),
                                trailingIcon = {
                                    if (noteText.isNotBlank()) {
                                        IconButton(onClick = {
                                            viewModel.addNote(noteText)
                                            noteText = ""
                                        }) {
                                            Icon(Icons.Default.Send, contentDescription = "Add")
                                        }
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
    }
}

@Composable
private fun NoteItem(
    note: CallNoteEntity,
    onDelete: () -> Unit
) {
    Surface(
        modifier = Modifier.fillMaxWidth(),
        color = MaterialTheme.colorScheme.surfaceVariant,
        shape = MaterialTheme.shapes.small
    ) {
        Row(
            modifier = Modifier.padding(12.dp),
            verticalAlignment = Alignment.Top
        ) {
            Text(
                text = note.content,
                modifier = Modifier.weight(1f),
                style = MaterialTheme.typography.bodyMedium
            )
            IconButton(
                onClick = onDelete,
                modifier = Modifier.size(24.dp)
            ) {
                Icon(
                    Icons.Default.Delete,
                    contentDescription = "Delete",
                    modifier = Modifier.size(16.dp),
                    tint = MaterialTheme.colorScheme.error
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
    val sdf = SimpleDateFormat("MMM d, HH:mm", Locale.getDefault())
    return sdf.format(Date(timestamp))
}

private fun formatDateTime(timestamp: Long): String {
    val sdf = SimpleDateFormat("MMM d, yyyy 'at' HH:mm", Locale.getDefault())
    return sdf.format(Date(timestamp))
}

