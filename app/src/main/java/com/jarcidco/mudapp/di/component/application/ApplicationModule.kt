package com.jarcidco.mudapp.di.component.application

import android.app.Application
import com.jarcidco.mudapp.application.MudappApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


/**
Author: Andres Velasquez
Date: 2019-09-28
 **/
@Module
class ApplicationModule(private val myApplication: MudappApplication) {

    @Provides
    @Singleton
    fun provideApplication(): Application {
        return myApplication
    }
}