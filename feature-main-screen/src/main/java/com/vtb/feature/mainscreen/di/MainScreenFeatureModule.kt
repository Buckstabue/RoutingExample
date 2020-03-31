package com.vtb.feature.mainscreen.di

import com.vtb.feature.main.screen.api.MainScreenFeatureStarter
import com.vtb.feature.mainscreen.MainScreenFeatureStarterImpl
import dagger.Binds
import dagger.Module

@Module
interface MainScreenFeatureModule {

    @Binds
    fun mainScreenFeatureStarter(
        mainScreenFeatureStarter: MainScreenFeatureStarterImpl
    ): MainScreenFeatureStarter

}