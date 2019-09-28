package com.jarcidco.mudapp.di.component.application

import com.jarcidco.mudapp.application.MudappApplication
import com.jarcidco.mudapp.di.component.api.APIServiceModule
import com.jarcidco.mudapp.di.component.network.ServiceModule
import dagger.Component
import javax.inject.Singleton


/**
Author: Andres Velasquez
Date: 2019-09-28
 **/
@Singleton
@Component(modules = [ApplicationModule::class, APIServiceModule::class, ServiceModule::class])
interface ApplicationComponent {

    fun inject(application: MudappApplication)

    //fun getFixtureAPI(): UserAPI
}