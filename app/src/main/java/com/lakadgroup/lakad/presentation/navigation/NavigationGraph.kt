package com.lakadgroup.lakad.presentation.navigation

import android.annotation.SuppressLint
import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.exclude
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBarDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.ScaffoldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@OptIn(ExperimentalMaterial3Api::class)
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
            composable<NavRoutes.TabRoute>(
                enterTransition = { EnterTransition.None },
                exitTransition = { ExitTransition.None },
                popEnterTransition = { EnterTransition.None },
                popExitTransition = { ExitTransition.None }
            ) {
                TabNavigationGraph(rootNavController = navController)
            }
            composable<NavRoutes.OtherRoute>(
                enterTransition = { EnterTransition.None },
                exitTransition = { ExitTransition.None },
                popEnterTransition = { EnterTransition.None },
                popExitTransition = { ExitTransition.None }
            ) {
                Scaffold(
                    topBar = {
                        TopAppBar(
                            title = {
                                Text("Other Route")
                            },
                            navigationIcon = {
                                IconButton(
                                    onClick = {
                                        if(navController.previousBackStackEntry != null)
                                            navController.popBackStack()
                                    }
                                ) {
                                    Icon(Icons.AutoMirrored.Default.ArrowBack, "Back")
                                }
                            }
                        )
                    },
                    contentWindowInsets = ScaffoldDefaults.contentWindowInsets.exclude(
                        NavigationBarDefaults.windowInsets,
                    ),
                ) {
                    Column(modifier = Modifier.padding(it)) {
                        Text("Other Route")
                    }
                }
            }
        }
    }

}