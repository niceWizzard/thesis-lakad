package com.lakadgroup.lakad.data

import android.util.Log
import androidx.compose.runtime.mutableIntStateOf
import cafe.adriel.voyager.core.model.ScreenModel
import cafe.adriel.voyager.core.model.screenModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class OtherScreenViewModel(
    testApi: TestApi,
) : ScreenModel {

    var counter = mutableIntStateOf(0)

    init {
        screenModelScope.launch {
            Log.d("WOW", "INIT")
            testApi.wow()
            while(true) {
                delay(100)
                counter.intValue += 1
            }
        }
    }



}