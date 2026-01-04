package com.koncall.app.ui.components

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavGraph.Companion.findStartDestination
import com.koncall.app.ui.navigation.BottomNavItem
import com.koncall.app.ui.theme.KonCallColors

@Composable
fun AppBottomBar(
    navController: NavController,
    currentRoute: String?
) {
    val items = listOf(
        BottomNavItem.Dashboard,
        BottomNavItem.CallLogs,
        BottomNavItem.Leads
    )

    NavigationBar(
        containerColor = KonCallColors.SurfaceElevated,
        contentColor = KonCallColors.TextSecondary,
        tonalElevation = 0.dp
    ) {
        items.forEach { item ->
            val isSelected = currentRoute == item.route
            
            NavigationBarItem(
                icon = { 
                    Icon(
                        imageVector = item.icon, 
                        contentDescription = item.title
                    ) 
                },
                label = { 
                    Text(text = item.title) 
                },
                selected = isSelected,
                onClick = {
                    if (currentRoute != item.route) {
                        navController.navigate(item.route) {
                            // Pop up to the start destination of the graph to
                            // avoid building up a large stack of destinations
                            // on the back stack as users select items
                            popUpTo(navController.graph.findStartDestination().id) {
                                saveState = true
                            }
                            // Avoid multiple copies of the same destination when
                            // reselecting the same item
                            launchSingleTop = true
                            // Restore state when reselecting a previously selected item
                            restoreState = true
                        }
                    }
                },
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = KonCallColors.Teal,
                    selectedTextColor = KonCallColors.Teal,
                    indicatorColor = KonCallColors.Teal.copy(alpha = 0.15f),
                    unselectedIconColor = KonCallColors.TextSecondary,
                    unselectedTextColor = KonCallColors.TextSecondary
                )
            )
        }
    }
}
