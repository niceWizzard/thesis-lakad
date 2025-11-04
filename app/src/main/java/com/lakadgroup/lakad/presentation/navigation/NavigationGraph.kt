package com.lakadgroup.lakad.presentation.navigation

import androidx.compose.foundation.layout.exclude
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.NavigationBarDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.ScaffoldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun NavigationGraph() {
    val navController = rememberNavController()
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        contentWindowInsets = ScaffoldDefaults.contentWindowInsets.exclude(
            NavigationBarDefaults.windowInsets
        ),
    ) { innerPadding ->
        NavHost(
            navController = navController,
            modifier = Modifier.padding(innerPadding),
            startDestination = NavRoutes.TabRoute,
        ) {
            composable<NavRoutes.TabRoute> {
                TabNavigationGraph(rootNavController = navController)
            }

            composable<NavRoutes.OtherRoute> {
                Text("Other Route")
            }
        }
    }

}