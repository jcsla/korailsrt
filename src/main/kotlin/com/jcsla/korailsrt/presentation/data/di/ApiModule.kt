package com.jcsla.korailsrt.presentation.data.di

import dagger.Module
import dagger.Provides
import com.jcsla.korailsrt.presentation.data.api.KorailApi
import retrofit2.Retrofit
import javax.inject.Singleton

@Module(includes = [RetrofitModule::class])
class ApiModule {

    @Provides
    @Singleton
    fun provideKorailApi(retrofit: Retrofit): KorailApi {
        return retrofit.create(KorailApi::class.java)
    }
}