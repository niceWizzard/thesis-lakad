package com.lakadgroup.lakad.presentation.navigation

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun NavigationGraph() {
    val navController = rememberNavController()
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    Scaffold(
        modifier = Modifier.fillMaxSize(),
    ) { innerPadding ->
        NavHost(
            navController = navController,
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