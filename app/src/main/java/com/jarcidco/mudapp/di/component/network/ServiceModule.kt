package com.jarcidco.mudapp.di.component.network

import com.jarcidco.mudapp.NetworkModule
import dagger.Module
import dagger.Provides
import okhttp3.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Named
import javax.inject.Singleton


/**
Author: Andres Velasquez
Date: 2019-09-28
 **/
@Module(includes = [NetworkModule::class])
abstract class ServiceModule {

    @Module
    companion object {
        @JvmStatic
        @Provides
        @Singleton
        fun provideRetrofit(callFactory: Call.Factory, @Named("base_url") baseUrl: String): Retrofit {

            return Retrofit.Builder()
                .callFactory(callFactory)
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(baseUrl)
                .build()
        }
    }
}