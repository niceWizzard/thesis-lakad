package com.lakadgroup.lakad.di

import com.lakadgroup.lakad.data.OtherScreenViewModel
import com.lakadgroup.lakad.data.TestApi
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    single {
        TestApi()
    }

}