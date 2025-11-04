package com.lakadgroup.lakad

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.lakadgroup.lakad.presentation.navigation.NavigationGraph
import com.lakadgroup.lakad.ui.theme.LakadTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LakadTheme {
                NavigationGraph()
            }
        }
    }
}
