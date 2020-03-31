package com.vtb.feature.mainscreen.di

import com.vtb.core.di.CoreApi
import com.vtb.feature.main.screen.api.MainScreenFeatureApi
import dagger.Component

@MainScreenScope
@Component(
    modules = [MainScreenFeatureModule::class],
    dependencies = [CoreApi::class]
)
interface MainScreenComponent : MainScreenFeatureApi
