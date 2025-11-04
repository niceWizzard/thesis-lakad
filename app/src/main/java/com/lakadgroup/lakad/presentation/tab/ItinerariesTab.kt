package com.lakadgroup.lakad.presentation.tab

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import cafe.adriel.voyager.navigator.tab.Tab
import cafe.adriel.voyager.navigator.tab.TabOptions

object ItinerariesTab : Tab {
    override val options: TabOptions
        @Composable
        get() {
            val icon = rememberVectorPainter(Icons.Default.AccountCircle)
            return TabOptions(
                index = 1u,
                title = "Itineraries",
                icon = icon,
            )
        }
    @Composable
    override fun Content() {
        Text("Wow!")
    }
}