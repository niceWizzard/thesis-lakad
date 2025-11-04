package com.lakadgroup.lakad.presentation.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.ui.graphics.vector.ImageVector
import kotlinx.serialization.Serializable

object NavRoutes {
    @Serializable
    object TabRoute

    sealed interface Tabs {

        val label : String

        val iconVector : ImageVector

        @Serializable
        object Explore : Tabs {
            override val label: String
                get() = "Explore"
            override val iconVector: ImageVector
                get() = Icons.Default.LocationOn
        }
        @Serializable
        object Itineraries : Tabs {
            override val label: String
                get() = "Itineraries"
            override val iconVector: ImageVector
                get() = Icons.Default.Home
        }
        @Serializable
        object More : Tabs {
            override val label: String
                get() = "More"
            override val iconVector: ImageVector
                get() = Icons.Default.MoreVert
        }
    }

    @Serializable
    object OtherRoute

}