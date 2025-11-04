package com.lakadgroup.lakad.presentation.tab

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.exclude
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.NavigationBarDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.ScaffoldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.mapbox.maps.extension.compose.MapboxMap

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ExploreTab(modifier: Modifier = Modifier) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text("Explore")
                }
            )
        },
        contentWindowInsets = ScaffoldDefaults.contentWindowInsets.exclude(
            NavigationBarDefaults.windowInsets,
        ),
    ) { innerPadding ->
        Column(
            modifier = modifier.fillMaxSize().padding(innerPadding)
        ) {
            MapboxMap {

            }
        }
    }
}