package com.jcsla.korailsrt.presentation.di

import dagger.Component
import com.jcsla.korailsrt.presentation.data.api.KorailApi
import com.jcsla.korailsrt.presentation.data.di.ApiModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        ApiModule::class
    ]
)
interface Component {

    fun korailApi(): KorailApi
}