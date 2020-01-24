package com.jcsla.korailsrt.di

import dagger.Component
import com.jcsla.korailsrt.data.api.KorailApi
import com.jcsla.korailsrt.data.di.ApiModule
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