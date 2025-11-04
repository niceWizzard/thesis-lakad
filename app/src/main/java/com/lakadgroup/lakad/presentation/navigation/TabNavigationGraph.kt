package com.lakadgroup.lakad.presentation.navigation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
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
            composable<NavRoutes.Tabs.Explore> {
                ExploreTab()
            }
            composable<NavRoutes.Tabs.Itineraries> {
                Text("Itineraries")
            }

            composable<NavRoutes.Tabs.More> {
                Text("More")
            }
        }
        BottomNavigationBar(
            tabNavController = tabNavController,
        )
    }
}