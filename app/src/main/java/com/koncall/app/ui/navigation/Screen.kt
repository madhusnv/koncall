package com.koncall.app.ui.navigation

sealed class Screen(val route: String) {
    // Auth
    object Login : Screen("login")
    object OrgCode : Screen("org_code")
    object Permissions : Screen("permissions")
    
    // Main
    object Dashboard : Screen("dashboard")
    object CallLogs : Screen("call_logs")
    object CallDetail : Screen("call_logs/{callId}") {
        fun createRoute(callId: String) = "call_logs/$callId"
    }
    object Leads : Screen("leads")
    object LeadDetail : Screen("leads/{leadId}") {
        fun createRoute(leadId: String) = "leads/$leadId"
    }
    object CreateLead : Screen("leads/create")
    object NeverAttended : Screen("analytics/never_attended")
    object NotPickedUp : Screen("analytics/not_picked_up")
    object Settings : Screen("settings")
    object RecordingSettings : Screen("settings/recording")
}
