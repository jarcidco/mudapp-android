package com.jarcidco.mudapp

import dagger.Module
import dagger.Provides
import okhttp3.Call
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import javax.inject.Named
import javax.inject.Singleton


/**
Author: Andres Velasquez
Date: 2019-09-28
 **/
@Module
abstract class NetworkModule {

    @Module
    companion object {

        @JvmStatic
        @Provides
        @Singleton
        fun provideOkHttp(): Call.Factory {
            val loggin = HttpLoggingInterceptor()
            loggin.level = HttpLoggingInterceptor.Level.BASIC

            return OkHttpClient.Builder()
                .addInterceptor(loggin).build()
        }

        @JvmStatic
        @Provides
        @Named("base_url")
        fun provideBaseUrl() = "https://storage.googleapis.com/cdn-og-test-api/test-task/"
    }
}