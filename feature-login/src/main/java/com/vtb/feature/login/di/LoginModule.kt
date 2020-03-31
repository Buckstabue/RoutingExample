package com.vtb.feature.login.di

import com.vtb.feature.login.LoginFeatureStarterImpl
import com.vtb.feature.login.api.LoginFeatureStarter
import dagger.Binds
import dagger.Module

@Module
interface LoginModule {
    @Binds
    fun loginFeatureStarter(loginFeatureStarter: LoginFeatureStarterImpl): LoginFeatureStarter
}