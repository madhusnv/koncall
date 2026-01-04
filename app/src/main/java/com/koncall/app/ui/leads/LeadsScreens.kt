package com.koncall.app.ui.leads

import android.Manifest
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.core.content.ContextCompat
import com.koncall.app.data.local.entity.LeadEntity
import com.koncall.app.data.local.entity.LeadStage
import com.koncall.app.service.AppCallTracker

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LeadsScreen(
    viewModel: LeadsViewModel,
    onLeadClick: (String) -> Unit,
    onCreateLead: () -> Unit,
    onNavigateBack: () -> Unit
) {
    val uiState by viewModel.uiState.collectAsState()
    val context = LocalContext.current
    var showMenu by remember { mutableStateOf(false) }
    var selectedStage by remember { mutableStateOf<String?>(null) }
    
    // File picker for CSV import
    val csvPickerLauncher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.OpenDocument()
    ) { uri: Uri? ->
        uri?.let {
            viewModel.importLeadsFromCsv(context.contentResolver, it)
        }
    }
    
    // Filter leads by stage
    val filteredLeads = remember(uiState.leads, selectedStage) {
        if (selectedStage == null) {
            uiState.leads
        } else {
            uiState.leads.filter { it.stage == selectedStage }
        }
    }
    
    // Import result dialog
    if (uiState.importState.isComplete || uiState.importState.error != null) {
        AlertDialog(
            onDismissRequest = { viewModel.clearImportState() },
            title = { 
                Text(
                    if (uiState.importState.error != null) "Import Failed" 
                    else "Import Complete"
                ) 
            },
            text = {
                if (uiState.importState.error != null) {
                    Text(uiState.importState.error!!)
                } else {
                    Column {
                        Text("Successfully imported ${uiState.importState.importedCount} leads")
                        if (uiState.importState.failedCount > 0) {
                            Text("Failed: ${uiState.importState.failedCount}")
                        }
                    }
                }
            },
            confirmButton = {
                TextButton(onClick = { viewModel.clearImportState() }) {
                    Text("OK")
                }
            }
        )
    }
    
    // Import progress dialog
    if (uiState.importState.isImporting) {
        AlertDialog(
            onDismissRequest = { },
            title = { Text("Importing Leads...") },
            text = {
                Column {
                    if (uiState.importState.totalRows > 0) {
                        Text(
                            "Processing ${uiState.importState.importedCount + uiState.importState.failedCount} of ${uiState.importState.totalRows}"
                        )
                        Spacer(modifier = Modifier.height(16.dp))
                        LinearProgressIndicator(
                            progress = { 
                                (uiState.importState.importedCount + uiState.importState.failedCount).toFloat() / 
                                uiState.importState.totalRows.toFloat() 
                            },
                            modifier = Modifier.fillMaxWidth()
                        )
                    } else {
                        Text("Reading CSV file...")
                        Spacer(modifier = Modifier.height(16.dp))
                        LinearProgressIndicator(modifier = Modifier.fillMaxWidth())
                    }
                }
            },
            confirmButton = { }
        )
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Leads") },
                navigationIcon = {
                    IconButton(onClick = onNavigateBack) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back")
                    }
                },
                actions = {
                    IconButton(onClick = viewModel::syncLeadsFromServer) {
                        Icon(Icons.Default.Refresh, contentDescription = "Sync")
                    }
                    IconButton(onClick = { showMenu = true }) {
                        Icon(Icons.Default.MoreVert, contentDescription = "More")
                    }
                    DropdownMenu(
                        expanded = showMenu,
                        onDismissRequest = { showMenu = false }
                    ) {
                        DropdownMenuItem(
                            text = { Text("Import CSV") },
                            leadingIcon = { 
                                Icon(Icons.Default.Add, contentDescription = null) 
                            },
                            onClick = {
                                showMenu = false
                                csvPickerLauncher.launch(arrayOf("text/csv", "text/comma-separated-values", "*/*"))
                            }
                        )
                    }
                }
            )
        },
        floatingActionButton = {
            FloatingActionButton(onClick = onCreateLead) {
                Icon(Icons.Default.Add, contentDescription = "Add Lead")
            }
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            // Stage filter chips
            StageFilterChips(
                selectedStage = selectedStage,
                onStageSelected = { selectedStage = it },
                stageCounts = uiState.leads.groupingBy { it.stage }.eachCount()
            )
            
            if (filteredLeads.isEmpty()) {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Icon(
                            Icons.Default.Person,
                            contentDescription = null,
                            modifier = Modifier.size(64.dp),
                            tint = MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.5f)
                        )
                        Spacer(modifier = Modifier.height(16.dp))
                        Text(
                            text = if (selectedStage != null) "No leads in this stage" else "No leads yet",
                            style = MaterialTheme.typography.bodyLarge,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        TextButton(onClick = onCreateLead) {
                            Text("Create your first lead")
                        }
                    }
                }
            } else {
                LazyColumn(
                    modifier = Modifier.fillMaxSize(),
                    contentPadding = PaddingValues(16.dp),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    items(filteredLeads, key = { it.id }) { lead ->
                        LeadItem(
                            lead = lead,
                            onClick = { onLeadClick(lead.id) }
                        )
                    }
                }
            }
        }
    }
}

@Composable
private fun StageFilterChips(
    selectedStage: String?,
    onStageSelected: (String?) -> Unit,
    stageCounts: Map<String, Int>
) {
    LazyRow(
        modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        item {
            FilterChip(
                selected = selectedStage == null,
                onClick = { onStageSelected(null) },
                label = { Text("All") }
            )
        }
        items(LeadStage.ALL_STAGES) { stage ->
            val count = stageCounts[stage] ?: 0
            FilterChip(
                selected = selectedStage == stage,
                onClick = { onStageSelected(if (selectedStage == stage) null else stage) },
                label = { Text("${LeadStage.displayName(stage)} ($count)") },
                colors = FilterChipDefaults.filterChipColors(
                    selectedContainerColor = getStageColor(stage).copy(alpha = 0.2f)
                )
            )
        }
    }
}

@Composable
private fun LeadItem(
    lead: LeadEntity,
    onClick: () -> Unit
) {
    Card(onClick = onClick) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Avatar
            Surface(
                modifier = Modifier.size(48.dp),
                shape = MaterialTheme.shapes.medium,
                color = getStageColor(lead.stage).copy(alpha = 0.2f)
            ) {
                Box(contentAlignment = Alignment.Center) {
                    Text(
                        text = lead.displayName.take(1).uppercase(),
                        style = MaterialTheme.typography.titleLarge,
                        color = getStageColor(lead.stage)
                    )
                }
            }
            
            Spacer(modifier = Modifier.width(12.dp))
            
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = lead.displayName,
                    fontWeight = FontWeight.Medium,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
                Text(
                    text = lead.phoneNumber,
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
                if (lead.universityName != null) {
                    Text(
                        text = lead.universityName,
                        style = MaterialTheme.typography.labelSmall,
                        color = MaterialTheme.colorScheme.primary
                    )
                }
            }
            
            // Stage badge
            Surface(
                shape = MaterialTheme.shapes.small,
                color = getStageColor(lead.stage).copy(alpha = 0.15f)
            ) {
                Text(
                    text = LeadStage.displayName(lead.stage),
                    style = MaterialTheme.typography.labelSmall,
                    color = getStageColor(lead.stage),
                    modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                )
            }
            
            Spacer(modifier = Modifier.width(8.dp))
            
            // Call indicator
            Icon(
                imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                contentDescription = "View",
                tint = MaterialTheme.colorScheme.onSurfaceVariant
            )
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LeadDetailScreen(
    leadId: String,
    viewModel: LeadsViewModel,
    appCallTracker: AppCallTracker,
    onNavigateBack: () -> Unit
) {
    val context = LocalContext.current
    val lead by viewModel.getLeadById(leadId).collectAsState(initial = null)
    var showStageDialog by remember { mutableStateOf(false) }
    
    // Permission launcher for CALL_PHONE
    val callPermissionLauncher = rememberLauncherForActivityResult(
        ActivityResultContracts.RequestPermission()
    ) { isGranted ->
        if (isGranted) {
            lead?.let { appCallTracker.makeTrackedCall(context, it.id, it.phoneNumber) }
        }
    }
    
    fun makeCall() {
        lead?.let { l ->
            if (ContextCompat.checkSelfPermission(context, Manifest.permission.CALL_PHONE) 
                == PackageManager.PERMISSION_GRANTED) {
                appCallTracker.makeTrackedCall(context, l.id, l.phoneNumber)
            } else {
                callPermissionLauncher.launch(Manifest.permission.CALL_PHONE)
            }
        }
    }
    
    // Stage selection dialog
    if (showStageDialog && lead != null) {
        AlertDialog(
            onDismissRequest = { showStageDialog = false },
            title = { Text("Update Stage") },
            text = {
                Column {
                    LeadStage.ALL_STAGES.forEach { stage ->
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .clickable {
                                    viewModel.updateLeadStage(lead!!.id, stage)
                                    showStageDialog = false
                                }
                                .padding(vertical = 12.dp, horizontal = 8.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            RadioButton(
                                selected = lead!!.stage == stage,
                                onClick = {
                                    viewModel.updateLeadStage(lead!!.id, stage)
                                    showStageDialog = false
                                }
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Text(LeadStage.displayName(stage))
                        }
                    }
                }
            },
            confirmButton = {
                TextButton(onClick = { showStageDialog = false }) {
                    Text("Cancel")
                }
            }
        )
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(lead?.displayName ?: "Lead Details") },
                navigationIcon = {
                    IconButton(onClick = onNavigateBack) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back")
                    }
                }
            )
        },
        floatingActionButton = {
            ExtendedFloatingActionButton(
                onClick = { makeCall() },
                icon = { Icon(Icons.Default.Phone, contentDescription = null) },
                text = { Text("Call") },
                containerColor = MaterialTheme.colorScheme.primary
            )
        }
    ) { paddingValues ->
        if (lead == null) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues),
                contentAlignment = Alignment.Center
            ) {
                CircularProgressIndicator()
            }
        } else {
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues),
                contentPadding = PaddingValues(16.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                // Lead info card
                item {
                    Card {
                        Column(modifier = Modifier.padding(16.dp)) {
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Column {
                                    Text(
                                        text = lead!!.displayName,
                                        style = MaterialTheme.typography.headlineSmall,
                                        fontWeight = FontWeight.Bold
                                    )
                                    Text(
                                        text = lead!!.phoneNumber,
                                        style = MaterialTheme.typography.bodyLarge,
                                        color = MaterialTheme.colorScheme.onSurfaceVariant
                                    )
                                }
                                
                                Surface(
                                    onClick = { showStageDialog = true },
                                    shape = MaterialTheme.shapes.medium,
                                    color = getStageColor(lead!!.stage).copy(alpha = 0.15f)
                                ) {
                                    Row(
                                        modifier = Modifier.padding(horizontal = 12.dp, vertical = 8.dp),
                                        verticalAlignment = Alignment.CenterVertically
                                    ) {
                                        Text(
                                            text = LeadStage.displayName(lead!!.stage),
                                            color = getStageColor(lead!!.stage),
                                            fontWeight = FontWeight.Medium
                                        )
                                        Icon(
                                            Icons.Default.ArrowDropDown,
                                            contentDescription = "Change stage",
                                            tint = getStageColor(lead!!.stage)
                                        )
                                    }
                                }
                            }
                        }
                    }
                }
                
                // Details card
                item {
                    Card {
                        Column(modifier = Modifier.padding(16.dp)) {
                            Text(
                                "Details",
                                style = MaterialTheme.typography.titleMedium,
                                fontWeight = FontWeight.Bold
                            )
                            Spacer(modifier = Modifier.height(12.dp))
                            
                            DetailRow("Email", lead!!.email ?: "-")
                            DetailRow("Alternate Phone", lead!!.alternatePhone ?: "-")
                            DetailRow("Branch", lead!!.branchName ?: "-")
                            DetailRow("University", lead!!.universityName ?: "-")
                            DetailRow("Contact Count", lead!!.contactCount.toString())
                            DetailRow("Assigned To", lead!!.assignedToName ?: "Unassigned")
                        }
                    }
                }
                
                // Notes card
                if (!lead!!.notes.isNullOrBlank()) {
                    item {
                        Card {
                            Column(modifier = Modifier.padding(16.dp)) {
                                Text(
                                    "Notes",
                                    style = MaterialTheme.typography.titleMedium,
                                    fontWeight = FontWeight.Bold
                                )
                                Spacer(modifier = Modifier.height(8.dp))
                                Text(lead!!.notes!!)
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
private fun DetailRow(label: String, value: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = label,
            color = MaterialTheme.colorScheme.onSurfaceVariant,
            style = MaterialTheme.typography.bodyMedium
        )
        Text(
            text = value,
            style = MaterialTheme.typography.bodyMedium
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CreateLeadScreen(
    viewModel: LeadsViewModel,
    onNavigateBack: () -> Unit,
    onLeadCreated: () -> Unit
) {
    var studentName by remember { mutableStateOf("") }
    var phoneNumber by remember { mutableStateOf("") }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Create Lead") },
                navigationIcon = {
                    IconButton(onClick = onNavigateBack) {
                        Icon(Icons.Default.Close, contentDescription = "Cancel")
                    }
                },
                actions = {
                    TextButton(
                        onClick = {
                            viewModel.createLead(studentName, phoneNumber)
                            onLeadCreated()
                        },
                        enabled = studentName.isNotBlank() && phoneNumber.isNotBlank()
                    ) {
                        Text("Save")
                    }
                }
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            OutlinedTextField(
                value = studentName,
                onValueChange = { studentName = it },
                label = { Text("Student Name *") },
                modifier = Modifier.fillMaxWidth()
            )
            OutlinedTextField(
                value = phoneNumber,
                onValueChange = { phoneNumber = it },
                label = { Text("Phone Number *") },
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}

// Stage color helper
@Composable
fun getStageColor(stage: String): Color {
    return when (stage) {
        LeadStage.NEW -> Color(0xFF3B82F6)           // Blue
        LeadStage.CONTACTED -> Color(0xFFEAB308)      // Yellow
        LeadStage.INTERESTED -> Color(0xFF22C55E)     // Green
        LeadStage.APPLICATION_SUBMITTED -> Color(0xFF8B5CF6)  // Purple
        LeadStage.DOCUMENTS_COLLECTED -> Color(0xFF6366F1)    // Indigo
        LeadStage.ENROLLED -> Color(0xFF14B8A6)       // Teal
        LeadStage.JOINED -> Color(0xFF059669)         // Emerald
        else -> Color(0xFF6B7280)                     // Gray
    }
}
