package com.lakadgroup.lakad.presentation.navigation

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.navigation.NavController
import androidx.navigation.NavDestination.Companion.hasRoute
import androidx.navigation.compose.currentBackStackEntryAsState

@Composable
fun BottomNavigationBar(
    tabNavController: NavController,
) {
    val currentEntry by tabNavController.currentBackStackEntryAsState()
    val items = listOf(
        NavRoutes.Tabs.Explore,
        NavRoutes.Tabs.Itineraries,
        NavRoutes.Tabs.More,
    )
    currentEntry?.let { currentEntry ->
        NavigationBar {
            items.forEachIndexed { index,route ->
                val isActive = currentEntry.destination.hasRoute(route::class)
                NavigationBarItem(
                    icon = { Icon(route.iconVector, contentDescription = "Button for ${route.label}") },
                    label = { Text(route.label) },
                    selected = isActive,
                    onClick = {
                        if(!isActive) {
                            tabNavController.navigate(route) {
                                launchSingleTop = true
                                popUpTo<NavRoutes.Tabs.Explore> {
                                    saveState = true
                                }
                                restoreState = true
                            }
                        }
                    }
                )
            }
        }
    }

}