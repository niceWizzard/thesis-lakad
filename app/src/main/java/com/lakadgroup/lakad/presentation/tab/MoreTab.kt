package com.lakadgroup.lakad.presentation.tab

import androidx.compose.foundation.layout.exclude
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.NavigationBarDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.ScaffoldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import cafe.adriel.voyager.navigator.tab.Tab
import cafe.adriel.voyager.navigator.tab.TabOptions

object MoreTab : Tab {
    override val options: TabOptions
        @Composable
        get() {
            val icon = rememberVectorPainter(Icons.Default.MoreVert)
            return TabOptions(
                index = 2u,
                title = "More",
                icon = icon,
            )
        }
    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    override fun Content() {
        Scaffold(
            topBar = {
                TopAppBar(
                    title = {
                        Text("More")
                    },
                )
            },
            contentWindowInsets = ScaffoldDefaults.contentWindowInsets.exclude(
                NavigationBarDefaults.windowInsets,
            ),
        ) {
            LazyColumn(
                modifier = Modifier.padding(it).fillMaxSize()
            ) {
                item {
                    Text("More")
                }
                items(100) {
                    Text("Item $it")
                }
            }
        }
    }
}