package com.lakadgroup.lakad.presentation.navigation

import androidx.compose.foundation.layout.RowScope
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import cafe.adriel.voyager.navigator.tab.LocalTabNavigator
import cafe.adriel.voyager.navigator.tab.Tab
import com.lakadgroup.lakad.presentation.tab.ExploreTab
import com.lakadgroup.lakad.presentation.tab.ItinerariesTab
import com.lakadgroup.lakad.presentation.tab.MoreTab


@Composable
fun BottomNavigationBar() {
    NavigationBar{
        TabItem(ExploreTab)
        TabItem(ItinerariesTab)
        TabItem(MoreTab)
    }
}

@Composable
fun RowScope.TabItem(tab: Tab) {
    val navigator = LocalTabNavigator.current

    NavigationBarItem(
        selected = navigator.current == tab,
        onClick = { navigator.current = tab },
        label = {
            Text(
                text = tab.options.title
            )
        },
        icon = {
            tab.options.icon?.let {
                Icon(
                    painter = it,
                    contentDescription = tab.options.title,
                )
            }
        }
    )
}