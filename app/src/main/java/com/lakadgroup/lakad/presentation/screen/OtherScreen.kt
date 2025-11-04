package com.lakadgroup.lakad.presentation.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.exclude
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
import cafe.adriel.voyager.core.model.rememberScreenModel
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import com.lakadgroup.lakad.data.OtherScreenViewModel

class OtherScreen : Screen {
    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    override fun Content() {
        val navigator = LocalNavigator.currentOrThrow
        val otherScreenViewModel = rememberScreenModel { OtherScreenViewModel() }
        Scaffold(
            topBar = {
                TopAppBar(
                    title = {
                        Text("Other Route")
                    },
                    navigationIcon = {
                        IconButton(
                            onClick = {
                                if(navigator.canPop)
                                    navigator.pop()
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
                Text("Counter: ${otherScreenViewModel.counter.intValue}")
            }
        }
    }
}