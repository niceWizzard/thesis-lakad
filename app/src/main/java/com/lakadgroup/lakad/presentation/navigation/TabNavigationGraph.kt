package com.lakadgroup.lakad.presentation.navigation

import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavDestination.Companion.hasRoute
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.lakadgroup.lakad.presentation.tab.ExploreTab

@Composable
fun TabNavigationGraph(rootNavController: NavController) {
    val tabNavController = rememberNavController()
    Column(modifier = Modifier.fillMaxSize()) {
        NavHost(
            navController = tabNavController,
            modifier = Modifier.weight(1f),
            startDestination = NavRoutes.Tabs.Explore,
        ) {
            composable<NavRoutes.Tabs.Explore>(
                enterTransition = { EnterTransition.None },
                exitTransition = { ExitTransition.None },
                // Disable backward navigation (pop) transitions
                popEnterTransition = { EnterTransition.None },
                popExitTransition = { ExitTransition.None },
            ) { backStackEntry ->
                ExploreTab(
                    rootNavController
                )
            }
            composable<NavRoutes.Tabs.Itineraries>(
                enterTransition = { EnterTransition.None },
                exitTransition = { ExitTransition.None },
                // Disable backward navigation (pop) transitions
                popEnterTransition = { EnterTransition.None },
                popExitTransition = { ExitTransition.None },
            ) {
                Text("Itineraries")
                LazyColumn {
                    items(100) {
                        Text("Item $it")
                    }
                }
            }
            composable<NavRoutes.Tabs.More>(
                enterTransition = { EnterTransition.None },
                exitTransition = { ExitTransition.None },
                // Disable backward navigation (pop) transitions
                popEnterTransition = { EnterTransition.None },
                popExitTransition = { ExitTransition.None },
            ) {
                Text("More")
            }
        }
        BottomNavigationBar(
            tabNavController = tabNavController,
        )
    }
}