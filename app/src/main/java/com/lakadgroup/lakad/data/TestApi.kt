package com.lakadgroup.lakad.data

import android.util.Log
import kotlinx.coroutines.delay

class TestApi {

    suspend fun wow() {
        delay(100)
        Log.d("WOW", "DELAYED")

        delay(500)
        Log.d("WOW", "DELAYED")


    }
}