package com.koncall.app.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.koncall.app.service.AppCallTracker
import com.koncall.app.ui.auth.LoginScreen
import com.koncall.app.ui.auth.LoginViewModel
import com.koncall.app.ui.auth.OrgCodeScreen
import com.koncall.app.ui.auth.PermissionsScreen
import com.koncall.app.ui.calllogs.CallLogDetailScreen
import com.koncall.app.ui.calllogs.CallLogDetailViewModel
import com.koncall.app.ui.calllogs.CallLogsScreen
import com.koncall.app.ui.calllogs.CallLogsViewModel
import com.koncall.app.ui.dashboard.DashboardScreen
import com.koncall.app.ui.dashboard.DashboardViewModel
import com.koncall.app.ui.leads.CreateLeadScreen
import com.koncall.app.ui.leads.LeadDetailScreen
import com.koncall.app.ui.leads.LeadsScreen
import com.koncall.app.ui.leads.LeadsViewModel
import com.koncall.app.ui.settings.SettingsScreen
import com.koncall.app.ui.settings.SettingsViewModel
import com.koncall.app.ui.settings.recording.RecordingSettingsScreen
import javax.inject.Inject

@Composable
fun KonCallNavGraph(
    navController: NavHostController,
    startDestination: String,
    appCallTracker: AppCallTracker
) {
    NavHost(
        navController = navController,
        startDestination = startDestination
    ) {
        // Auth flow
        composable(Screen.OrgCode.route) {
            OrgCodeScreen(
                onOrgCodeSubmit = { orgCode ->
                    navController.navigate(Screen.Login.route + "?orgCode=$orgCode")
                }
            )
        }
        
        composable(
            route = Screen.Login.route + "?orgCode={orgCode}",
            arguments = listOf(navArgument("orgCode") { defaultValue = "" })
        ) { backStackEntry ->
            val viewModel: LoginViewModel = hiltViewModel()
            val orgCode = backStackEntry.arguments?.getString("orgCode") ?: ""
            LoginScreen(
                viewModel = viewModel,
                orgCode = orgCode,
                onLoginSuccess = {
                    navController.navigate(Screen.Permissions.route) {
                        popUpTo(Screen.OrgCode.route) { inclusive = true }
                    }
                }
            )
        }
        
        composable(Screen.Permissions.route) {
            PermissionsScreen(
                onPermissionsGranted = {
                    navController.navigate(Screen.Dashboard.route) {
                        popUpTo(Screen.Permissions.route) { inclusive = true }
                    }
                }
            )
        }
        
        // Main screens
        composable(Screen.Dashboard.route) {
            val viewModel: DashboardViewModel = hiltViewModel()
            DashboardScreen(
                viewModel = viewModel,
                onNavigateToCallLogs = { navController.navigate(Screen.CallLogs.route) },
                onNavigateToLeads = { navController.navigate(Screen.Leads.route) },
                onNavigateToSettings = { navController.navigate(Screen.Settings.route) },
                onNavigateToNeverAttended = { navController.navigate(Screen.NeverAttended.route) },
                onNavigateToNotPickedUp = { navController.navigate(Screen.NotPickedUp.route) }
            )
        }
        
        composable(Screen.NeverAttended.route) {
            val viewModel: com.koncall.app.ui.analytics.NeverAttendedViewModel = hiltViewModel()
            com.koncall.app.ui.analytics.NeverAttendedScreen(
                viewModel = viewModel,
                onNavigateBack = { navController.popBackStack() },
                onCreateLead = { phoneNumber ->
                    navController.navigate(Screen.CreateLead.route + "?phone=$phoneNumber")
                }
            )
        }
        
        composable(Screen.NotPickedUp.route) {
            val viewModel: com.koncall.app.ui.analytics.NotPickedUpViewModel = hiltViewModel()
            com.koncall.app.ui.analytics.NotPickedUpScreen(
                viewModel = viewModel,
                onNavigateBack = { navController.popBackStack() }
            )
        }
        
        composable(Screen.CallLogs.route) {
            val viewModel: CallLogsViewModel = hiltViewModel()
            CallLogsScreen(
                viewModel = viewModel,
                onCallLogClick = { callId ->
                    navController.navigate(Screen.CallDetail.createRoute(callId))
                },
                onNavigateBack = { navController.popBackStack() }
            )
        }
        
        composable(
            route = Screen.CallDetail.route,
            arguments = listOf(navArgument("callId") { type = NavType.StringType })
        ) {
            val viewModel: CallLogDetailViewModel = hiltViewModel()
            CallLogDetailScreen(
                viewModel = viewModel,
                onNavigateBack = { navController.popBackStack() },
                onCreateLead = { phoneNumber ->
                    navController.navigate(Screen.CreateLead.route + "?phone=$phoneNumber")
                }
            )
        }
        
        composable(Screen.Leads.route) {
            val viewModel: LeadsViewModel = hiltViewModel()
            LeadsScreen(
                viewModel = viewModel,
                onLeadClick = { leadId ->
                    navController.navigate(Screen.LeadDetail.createRoute(leadId))
                },
                onCreateLead = { navController.navigate(Screen.CreateLead.route) },
                onNavigateBack = { navController.popBackStack() }
            )
        }
        
        composable(
            route = Screen.LeadDetail.route,
            arguments = listOf(navArgument("leadId") { type = NavType.StringType })
        ) { backStackEntry ->
            val viewModel: LeadsViewModel = hiltViewModel()
            val leadId = backStackEntry.arguments?.getString("leadId") ?: return@composable
            LeadDetailScreen(
                leadId = leadId,
                viewModel = viewModel,
                appCallTracker = appCallTracker,
                onNavigateBack = { navController.popBackStack() }
            )
        }
        
        composable(Screen.CreateLead.route) {
            val viewModel: LeadsViewModel = hiltViewModel()
            CreateLeadScreen(
                viewModel = viewModel,
                onNavigateBack = { navController.popBackStack() },
                onLeadCreated = { navController.popBackStack() }
            )
        }
        
        composable(Screen.Settings.route) {
            val viewModel: SettingsViewModel = hiltViewModel()
            SettingsScreen(
                viewModel = viewModel,
                onLogout = {
                    navController.navigate(Screen.OrgCode.route) {
                        popUpTo(0) { inclusive = true }
                    }
                },
                onNavigateBack = { navController.popBackStack() },
                onNavigateToRecordingSettings = { navController.navigate(Screen.RecordingSettings.route) }
            )
        }
        
        composable(Screen.RecordingSettings.route) {
            RecordingSettingsScreen(
                onNavigateBack = { navController.popBackStack() }
            )
        }
        
    }
}
