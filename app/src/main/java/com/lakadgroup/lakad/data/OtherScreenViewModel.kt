package com.lakadgroup.lakad.data

import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import cafe.adriel.voyager.core.model.ScreenModel
import cafe.adriel.voyager.core.model.screenModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class OtherScreenViewModel : ScreenModel {

    var counter = mutableIntStateOf(0)

    init {
        screenModelScope.launch {
            while(true) {
                delay(100)
                counter.intValue += 1
            }
        }
    }



}