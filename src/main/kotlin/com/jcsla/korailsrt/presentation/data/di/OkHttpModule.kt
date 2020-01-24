package com.jcsla.korailsrt.presentation.data.di

import dagger.Module
import dagger.Provides
import okhttp3.Interceptor
import okhttp3.JavaNetCookieJar
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import java.net.CookieManager
import javax.inject.Singleton

@Module
class OkHttpModule {

    @Provides
    @Singleton
    fun provideOkHttpClient(
        interceptorForHeader: Interceptor,
        interceptorForLogging: HttpLoggingInterceptor,
        cookieJar: JavaNetCookieJar
    ): OkHttpClient {
        return OkHttpClient.Builder()
            .addInterceptor(interceptorForHeader)
            .addInterceptor(interceptorForLogging)
            .cookieJar(cookieJar)
            .build()
    }

    @Provides
    @Singleton
    fun provideInterceptorForHeader(): Interceptor {
        return Interceptor.invoke { chain ->
            val newRequest = chain.request().newBuilder()
                .addHeader("User-Agent", "Dalvik/2.1.0 (Linux; U; Android 5.1.1; Nexus 4 Build/LMY48T)")
                .build()
            chain.proceed(newRequest)
        }
    }

    @Provides
    @Singleton
    fun provideInterceptorForLogging(): HttpLoggingInterceptor {
        return HttpLoggingInterceptor().apply { level = HttpLoggingInterceptor.Level.BODY }
    }

    @Provides
    @Singleton
    fun provideCookieJar(): JavaNetCookieJar {
        return JavaNetCookieJar(CookieManager())
    }
}