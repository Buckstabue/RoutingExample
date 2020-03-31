package com.vtb.feature.splash.di

import com.vtb.feature.splash.SplashFeatureStarterImpl
import com.vtb.feature.splash.api.SplashFeatureStarter
import dagger.Binds
import dagger.Module

@Module
interface SplashModule {

    @Binds
    fun splashFeatureStarter(splashFeatureStarterImpl: SplashFeatureStarterImpl): SplashFeatureStarter
}