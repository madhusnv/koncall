package com.koncall.app.ui.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.List
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNavItem(
    val route: String,
    val title: String,
    val icon: ImageVector
) {
    object Dashboard : BottomNavItem(
        route = Screen.Dashboard.route,
        title = "Home",
        icon = Icons.Default.Home
    )

    object CallLogs : BottomNavItem(
        route = Screen.CallLogs.route,
        title = "Logs",
        icon = Icons.AutoMirrored.Filled.List
    )

    object Leads : BottomNavItem(
        route = Screen.Leads.route,
        title = "Leads",
        icon = Icons.Default.Person
    )
}
