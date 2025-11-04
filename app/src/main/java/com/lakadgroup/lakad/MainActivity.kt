package com.lakadgroup.lakad

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.consumeWindowInsets
import androidx.compose.foundation.layout.exclude
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.NavigationBarDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.ScaffoldDefaults
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import cafe.adriel.voyager.navigator.Navigator
import cafe.adriel.voyager.navigator.NavigatorDisposeBehavior
import cafe.adriel.voyager.transitions.SlideTransition
import com.lakadgroup.lakad.presentation.screen.TabScreen
import com.lakadgroup.lakad.ui.theme.LakadTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LakadTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    contentWindowInsets = ScaffoldDefaults.contentWindowInsets.exclude(
                        NavigationBarDefaults.windowInsets,
                    ),
                ) {
                    Surface(
                        modifier = Modifier
                            .padding(it)
                            .consumeWindowInsets(it)
                    ) {
                        Navigator(
                            screen = TabScreen,
                            disposeBehavior = NavigatorDisposeBehavior(
                                disposeNestedNavigators = false,
                                disposeSteps = true
                            )
                        ) { navigator ->
                            SlideTransition(navigator)
                        }
                    }
                }
            }
        }
    }
}
