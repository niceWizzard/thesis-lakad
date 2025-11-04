package com.lakadgroup.lakad.presentation.tab

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.exclude
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.NavigationBarDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.ScaffoldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.lakadgroup.lakad.presentation.navigation.NavRoutes
import com.mapbox.geojson.Point
import com.mapbox.maps.extension.compose.MapboxMap
import com.mapbox.maps.extension.compose.animation.viewport.rememberMapViewportState

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ExploreTab(
    rootNavController: NavController,
) {
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
            modifier = Modifier.fillMaxSize().padding(innerPadding)
        ) {
            Button(
                onClick = {
                    rootNavController.navigate(NavRoutes.OtherRoute)
                }
            ) {
                Text("Other Screen")
            }
            MapboxMap(
                Modifier.fillMaxSize(),
                mapViewportState = rememberMapViewportState {
                    setCameraOptions {
                        center(Point.fromLngLat(120.8092, 14.8605))
                        zoom(15.0)
                    }
                }
            )
        }
    }
}