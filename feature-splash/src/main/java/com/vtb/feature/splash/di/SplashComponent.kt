package com.vtb.feature.splash.di

import com.vtb.core.di.CoreApi
import com.vtb.feature.login.api.LoginFeatureApi
import com.vtb.feature.main.screen.api.MainScreenFeatureApi
import com.vtb.feature.splash.api.SplashFeatureApi
import com.vtb.feature.splash.presentation.SplashActivity
import dagger.Component

@SplashFeatureScope
@Component(
    modules = [SplashModule::class],
    dependencies = [CoreApi::class, LoginFeatureApi::class, MainScreenFeatureApi::class]
)
interface SplashComponent : SplashFeatureApi {
    fun inject(splashActivity: SplashActivity)
}
