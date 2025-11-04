package com.lakadgroup.lakad.presentation.screen

import androidx.compose.foundation.layout.consumeWindowInsets
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.tab.CurrentTab
import cafe.adriel.voyager.navigator.tab.TabNavigator
import com.lakadgroup.lakad.presentation.navigation.BottomNavigationBar
import com.lakadgroup.lakad.presentation.tab.ExploreTab


object TabScreen : Screen {
    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    override fun Content() {
        TabNavigator(
            tab = ExploreTab,
            disposeNestedNavigators = false,
        ) {
            Scaffold(
                bottomBar = {
                    BottomNavigationBar()
                },
            ) {
                Surface(
                    modifier = Modifier.padding(it)
                        .consumeWindowInsets(it)
                ) {
                    CurrentTab()
                }
            }
        }
    }
}

