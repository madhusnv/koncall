package com.koncall.app.ui.leads

import android.Manifest
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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
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
import com.koncall.app.ui.components.GradientButton
import com.koncall.app.ui.theme.KonCallColors

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
                    else "Import Complete",
                    color = KonCallColors.TextPrimary
                ) 
            },
            text = {
                if (uiState.importState.error != null) {
                    Text(uiState.importState.error!!, color = KonCallColors.Error)
                } else {
                    Column {
                        Text("Successfully imported ${uiState.importState.importedCount} leads", color = KonCallColors.TextPrimary)
                        if (uiState.importState.failedCount > 0) {
                            Text("Failed: ${uiState.importState.failedCount}", color = KonCallColors.Warning)
                        }
                    }
                }
            },
            confirmButton = {
                TextButton(onClick = { viewModel.clearImportState() }) {
                    Text("OK", color = KonCallColors.Teal)
                }
            },
            containerColor = KonCallColors.SurfaceCard,
            titleContentColor = KonCallColors.TextPrimary,
            textContentColor = KonCallColors.TextSecondary
        )
    }
    
    // Import progress dialog
    if (uiState.importState.isImporting) {
        AlertDialog(
            onDismissRequest = { },
            title = { Text("Importing Leads...", color = KonCallColors.TextPrimary) },
            text = {
                Column {
                    if (uiState.importState.totalRows > 0) {
                        Text(
                            "Processing ${uiState.importState.importedCount + uiState.importState.failedCount} of ${uiState.importState.totalRows}",
                            color = KonCallColors.TextSecondary
                        )
                        Spacer(modifier = Modifier.height(16.dp))
                        LinearProgressIndicator(
                            progress = { 
                                (uiState.importState.importedCount + uiState.importState.failedCount).toFloat() / 
                                uiState.importState.totalRows.toFloat() 
                            },
                            modifier = Modifier.fillMaxWidth(),
                            color = KonCallColors.Teal,
                            trackColor = KonCallColors.SurfaceElevated
                        )
                    } else {
                        Text("Reading CSV file...", color = KonCallColors.TextSecondary)
                        Spacer(modifier = Modifier.height(16.dp))
                        LinearProgressIndicator(
                            modifier = Modifier.fillMaxWidth(),
                            color = KonCallColors.Teal,
                            trackColor = KonCallColors.SurfaceElevated
                        )
                    }
                }
            },
            confirmButton = { },
            containerColor = KonCallColors.SurfaceCard
        )
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { 
                    Text(
                        "Leads",
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
                actions = {
                    IconButton(onClick = viewModel::syncLeadsFromServer) {
                        Icon(Icons.Default.Refresh, contentDescription = "Sync", tint = KonCallColors.Teal)
                    }
                    Box {
                        IconButton(onClick = { showMenu = true }) {
                            Icon(Icons.Default.MoreVert, contentDescription = "More", tint = KonCallColors.TextSecondary)
                        }
                        DropdownMenu(
                            expanded = showMenu,
                            onDismissRequest = { showMenu = false },
                            containerColor = KonCallColors.SurfaceElevated
                        ) {
                            DropdownMenuItem(
                                text = { Text("Import CSV", color = KonCallColors.TextPrimary) },
                                leadingIcon = { 
                                    Icon(Icons.Default.Add, contentDescription = null, tint = KonCallColors.Teal) 
                                },
                                onClick = {
                                    showMenu = false
                                    csvPickerLauncher.launch(arrayOf("text/csv", "text/comma-separated-values", "*/*"))
                                }
                            )
                        }
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = KonCallColors.BackgroundDeep,
                    titleContentColor = KonCallColors.TextPrimary
                )
            )
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = onCreateLead,
                containerColor = KonCallColors.Teal,
                contentColor = Color.White
            ) {
                Icon(Icons.Default.Add, contentDescription = "Add Lead")
            }
        },
        containerColor = KonCallColors.BackgroundDeep
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
                            tint = KonCallColors.SurfaceVariant
                        )
                        Spacer(modifier = Modifier.height(16.dp))
                        Text(
                            text = if (selectedStage != null) "No leads in this stage" else "No leads yet",
                            style = MaterialTheme.typography.bodyLarge,
                            color = KonCallColors.TextSecondary
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        TextButton(onClick = onCreateLead) {
                            Text("Create your first lead", color = KonCallColors.Teal)
                        }
                    }
                }
            } else {
                LazyColumn(
                    modifier = Modifier.fillMaxSize(),
                    contentPadding = PaddingValues(16.dp),
                    verticalArrangement = Arrangement.spacedBy(12.dp)
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
                label = { Text("All") },
                colors = FilterChipDefaults.filterChipColors(
                    selectedContainerColor = KonCallColors.Teal,
                    selectedLabelColor = Color.White,
                    containerColor = KonCallColors.SurfaceCard,
                    labelColor = KonCallColors.TextSecondary
                ),
                border = FilterChipDefaults.filterChipBorder(
                    enabled = true,
                    selected = selectedStage == null,
                    borderColor = Color.Transparent,
                    selectedBorderColor = Color.Transparent
                )
            )
        }
        items(LeadStage.ALL_STAGES) { stage ->
            val count = stageCounts[stage] ?: 0
            val stageColor = getStageColor(stage)
            FilterChip(
                selected = selectedStage == stage,
                onClick = { onStageSelected(if (selectedStage == stage) null else stage) },
                label = { Text("${LeadStage.displayName(stage)} ($count)") },
                colors = FilterChipDefaults.filterChipColors(
                    selectedContainerColor = stageColor.copy(alpha = 0.8f),
                    selectedLabelColor = Color.White,
                    containerColor = KonCallColors.SurfaceCard,
                    labelColor = KonCallColors.TextSecondary
                ),
                border = FilterChipDefaults.filterChipBorder(
                    enabled = true,
                    selected = selectedStage == stage,
                    borderColor = Color.Transparent,
                    selectedBorderColor = Color.Transparent
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
    val stageColor = getStageColor(lead.stage)
    
    Card(
        onClick = onClick,
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = KonCallColors.SurfaceCard)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Avatar
            Surface(
                modifier = Modifier.size(50.dp),
                shape = CircleShape,
                color = stageColor.copy(alpha = 0.15f)
            ) {
                Box(contentAlignment = Alignment.Center) {
                    Text(
                        text = lead.displayName.take(1).uppercase(),
                        style = MaterialTheme.typography.titleLarge,
                        fontWeight = FontWeight.Bold,
                        color = stageColor
                    )
                }
            }
            
            Spacer(modifier = Modifier.width(16.dp))
            
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = lead.displayName,
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.SemiBold,
                    color = KonCallColors.TextPrimary,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
                Text(
                    text = lead.phoneNumber,
                    style = MaterialTheme.typography.bodySmall,
                    color = KonCallColors.TextSecondary
                )
                if (lead.universityName != null) {
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        text = lead.universityName,
                        style = MaterialTheme.typography.labelSmall,
                        color = KonCallColors.Teal
                    )
                }
            }
            
            Column(horizontalAlignment = Alignment.End) {
                // Stage badge
                Surface(
                    shape = RoundedCornerShape(8.dp),
                    color = stageColor.copy(alpha = 0.1f)
                ) {
                    Text(
                        text = LeadStage.displayName(lead.stage),
                        style = MaterialTheme.typography.labelSmall,
                        fontWeight = FontWeight.Medium,
                        color = stageColor,
                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                    )
                }
                
                Spacer(modifier = Modifier.height(8.dp))
                
                // Arrow
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                    contentDescription = null,
                    tint = KonCallColors.TextTertiary,
                    modifier = Modifier.size(20.dp)
                )
            }
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
            title = { Text("Update Stage", color = KonCallColors.TextPrimary) },
            text = {
                Column {
                    LeadStage.ALL_STAGES.forEach { stage ->
                        val stageColor = getStageColor(stage)
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
                                },
                                colors = RadioButtonDefaults.colors(
                                    selectedColor = KonCallColors.Teal,
                                    unselectedColor = KonCallColors.TextSecondary
                                )
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Text(
                                LeadStage.displayName(stage),
                                color = if (lead!!.stage == stage) stageColor else KonCallColors.TextPrimary,
                                fontWeight = if (lead!!.stage == stage) FontWeight.Bold else FontWeight.Normal
                            )
                        }
                    }
                }
            },
            confirmButton = {
                TextButton(onClick = { showStageDialog = false }) {
                    Text("Cancel", color = KonCallColors.TextSecondary)
                }
            },
            containerColor = KonCallColors.SurfaceCard
        )
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(lead?.displayName ?: "Lead Details") },
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
        if (lead == null) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues),
                contentAlignment = Alignment.Center
            ) {
                CircularProgressIndicator(color = KonCallColors.Teal)
            }
        } else {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues)
                    .padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                // Lead Header Card
                Card(
                    shape = RoundedCornerShape(20.dp),
                    colors = CardDefaults.cardColors(containerColor = KonCallColors.SurfaceCard)
                ) {
                    Column(modifier = Modifier.padding(20.dp)) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Surface(
                                modifier = Modifier.size(64.dp),
                                shape = CircleShape,
                                color = getStageColor(lead!!.stage).copy(alpha = 0.15f)
                            ) {
                                Box(contentAlignment = Alignment.Center) {
                                    Text(
                                        text = lead!!.displayName.take(1).uppercase(),
                                        style = MaterialTheme.typography.displaySmall,
                                        fontWeight = FontWeight.Bold,
                                        color = getStageColor(lead!!.stage)
                                    )
                                }
                            }
                            
                            Spacer(modifier = Modifier.width(16.dp))
                            
                            Column(modifier = Modifier.weight(1f)) {
                                Text(
                                    text = lead!!.displayName,
                                    style = MaterialTheme.typography.headlineSmall,
                                    fontWeight = FontWeight.Bold,
                                    color = KonCallColors.TextPrimary
                                )
                                Text(
                                    text = lead!!.phoneNumber,
                                    style = MaterialTheme.typography.bodyLarge,
                                    color = KonCallColors.TextSecondary
                                )
                            }
                        }
                        
                        Spacer(modifier = Modifier.height(20.dp))
                        
                        // Stage Selector
                        Surface(
                            onClick = { showStageDialog = true },
                            shape = RoundedCornerShape(12.dp),
                            color = KonCallColors.SurfaceElevated,
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Row(
                                modifier = Modifier.padding(12.dp),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {
                                Column {
                                    Text(
                                        text = "Current Stage",
                                        style = MaterialTheme.typography.labelSmall,
                                        color = KonCallColors.TextSecondary
                                    )
                                    Text(
                                        text = LeadStage.displayName(lead!!.stage),
                                        style = MaterialTheme.typography.titleMedium,
                                        fontWeight = FontWeight.Bold,
                                        color = getStageColor(lead!!.stage)
                                    )
                                }
                                Icon(
                                    Icons.Default.ArrowDropDown,
                                    contentDescription = "Change",
                                    tint = KonCallColors.TextSecondary
                                )
                            }
                        }
                        
                        Spacer(modifier = Modifier.height(20.dp))
                        
                        GradientButton(
                            onClick = { makeCall() },
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Icon(Icons.Default.Phone, contentDescription = null, tint = Color.White)
                            Spacer(modifier = Modifier.width(8.dp))
                            Text("Call Lead", color = Color.White, fontWeight = FontWeight.Bold)
                        }
                    }
                }
                
                // Details card
                Card(
                    shape = RoundedCornerShape(16.dp),
                    colors = CardDefaults.cardColors(containerColor = KonCallColors.SurfaceCard)
                ) {
                    Column(modifier = Modifier.padding(16.dp)) {
                        Text(
                            "Details",
                            style = MaterialTheme.typography.titleMedium,
                            fontWeight = FontWeight.Bold,
                            color = KonCallColors.TextPrimary
                        )
                        Spacer(modifier = Modifier.height(16.dp))
                        
                        DetailRow("Email", lead!!.email ?: "-")
                        HorizontalDivider(color = KonCallColors.SurfaceElevated, thickness = 1.dp)
                        DetailRow("Alternate Phone", lead!!.alternatePhone ?: "-")
                        HorizontalDivider(color = KonCallColors.SurfaceElevated, thickness = 1.dp)
                        DetailRow("Branch", lead!!.branchName ?: "-")
                        HorizontalDivider(color = KonCallColors.SurfaceElevated, thickness = 1.dp)
                        DetailRow("University", lead!!.universityName ?: "-")
                        HorizontalDivider(color = KonCallColors.SurfaceElevated, thickness = 1.dp)
                        DetailRow("Contact Count", lead!!.contactCount.toString())
                        HorizontalDivider(color = KonCallColors.SurfaceElevated, thickness = 1.dp)
                        DetailRow("Assigned To", lead!!.assignedToName ?: "Unassigned")
                    }
                }
                
                // Notes card
                if (!lead!!.notes.isNullOrBlank()) {
                    Card(
                        shape = RoundedCornerShape(16.dp),
                        colors = CardDefaults.cardColors(containerColor = KonCallColors.SurfaceCard)
                    ) {
                        Column(modifier = Modifier.padding(16.dp)) {
                            Text(
                                "Notes",
                                style = MaterialTheme.typography.titleMedium,
                                fontWeight = FontWeight.Bold,
                                color = KonCallColors.TextPrimary
                            )
                            Spacer(modifier = Modifier.height(8.dp))
                            Text(
                                text = lead!!.notes!!,
                                style = MaterialTheme.typography.bodyMedium,
                                color = KonCallColors.TextSecondary
                            )
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
            .padding(vertical = 12.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = label,
            color = KonCallColors.TextSecondary,
            style = MaterialTheme.typography.bodyMedium
        )
        Text(
            text = value,
            style = MaterialTheme.typography.bodyMedium,
            fontWeight = FontWeight.Medium,
            color = KonCallColors.TextPrimary
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
                        Icon(
                            Icons.Default.Close, 
                            contentDescription = "Cancel",
                            tint = KonCallColors.TextSecondary
                        )
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
                        Text(
                            "Save", 
                            color = if (studentName.isNotBlank() && phoneNumber.isNotBlank()) KonCallColors.Teal else KonCallColors.TextTertiary,
                            fontWeight = FontWeight.Bold
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
                modifier = Modifier.fillMaxWidth(),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = KonCallColors.Teal,
                    unfocusedBorderColor = KonCallColors.SurfaceElevated,
                    focusedTextColor = KonCallColors.TextPrimary,
                    unfocusedTextColor = KonCallColors.TextPrimary,
                    cursorColor = KonCallColors.Teal,
                    focusedLabelColor = KonCallColors.Teal,
                    unfocusedLabelColor = KonCallColors.TextSecondary
                ),
                shape = RoundedCornerShape(12.dp)
            )
            OutlinedTextField(
                value = phoneNumber,
                onValueChange = { phoneNumber = it },
                label = { Text("Phone Number *") },
                modifier = Modifier.fillMaxWidth(),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = KonCallColors.Teal,
                    unfocusedBorderColor = KonCallColors.SurfaceElevated,
                    focusedTextColor = KonCallColors.TextPrimary,
                    unfocusedTextColor = KonCallColors.TextPrimary,
                    cursorColor = KonCallColors.Teal,
                    focusedLabelColor = KonCallColors.Teal,
                    unfocusedLabelColor = KonCallColors.TextSecondary
                ),
                shape = RoundedCornerShape(12.dp)
            )
        }
    }
}

// Stage color helper
@Composable
fun getStageColor(stage: String): Color {
    return when (stage) {
        LeadStage.NEW -> KonCallColors.StageNew
        LeadStage.CONTACTED -> KonCallColors.StageContacted
        LeadStage.INTERESTED -> KonCallColors.StageInterested
        LeadStage.APPLICATION_SUBMITTED -> KonCallColors.StageApplicationSubmitted
        LeadStage.DOCUMENTS_COLLECTED -> KonCallColors.StageDocumentsCollected
        LeadStage.ENROLLED -> KonCallColors.StageEnrolled
        LeadStage.JOINED -> KonCallColors.StageJoined
        else -> KonCallColors.TextSecondary
    }
}
