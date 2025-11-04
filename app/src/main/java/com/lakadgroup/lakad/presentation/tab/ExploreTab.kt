package com.lakadgroup.lakad.presentation.tab

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.lakadgroup.lakad.presentation.navigation.NavRoutes
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
        }
    ) {
        Column(
            modifier = modifier.padding(it).fillMaxSize()
        ) {
            MapboxMap {

            }
        }
    }
}