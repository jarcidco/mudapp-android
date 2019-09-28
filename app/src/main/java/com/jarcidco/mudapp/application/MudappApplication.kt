package com.jarcidco.mudapp.application

import android.app.Application
import com.jarcidco.mudapp.di.component.application.ApplicationComponent
import com.jarcidco.mudapp.di.component.application.ApplicationModule
import com.jarcidco.mudapp.di.component.application.DaggerApplicationComponent
import timber.log.BuildConfig
import timber.log.Timber


/**
Author: Andres Velasquez
Date: 2019-09-28
 **/
class MudappApplication : Application() {

    private lateinit var component: ApplicationComponent

    override fun onCreate() {
        super.onCreate()

        instance = this
        setup()

        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }

    fun setup() {
        component = DaggerApplicationComponent.builder()
            .applicationModule(ApplicationModule(this)).build()
        component.inject(this)
    }

    fun getApplicationComponent(): ApplicationComponent {
        return component
    }

    companion object {
        lateinit var instance: MudappApplication private set
    }
}