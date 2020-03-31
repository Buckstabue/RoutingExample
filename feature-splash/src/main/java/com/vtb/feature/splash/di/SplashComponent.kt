package com.vtb.feature.splash.di

import com.vtb.core.SmartFeatureApiProvider
import com.vtb.core.di.CoreApi
import com.vtb.feature.login.api.LoginFeatureApi
import com.vtb.feature.main.screen.api.MainScreenFeatureApi
import com.vtb.feature.splash.SplashFeatureStarterImpl
import com.vtb.feature.splash.api.SplashFeatureApi
import com.vtb.feature.splash.presentation.SplashViewModel

class SplashComponent(
    private val coreApi: CoreApi = SmartFeatureApiProvider.provideApi(),
    private val loginFeatureApi: LoginFeatureApi = SmartFeatureApiProvider.provideApi(),
    private val mainScreenFeatureApi: MainScreenFeatureApi = SmartFeatureApiProvider.provideApi()
) : SplashFeatureApi {
    override val splashFeatureStarter by lazy { SplashFeatureStarterImpl(coreApi.cicerone) }

    val splashViewModel: SplashViewModel
        get() = SplashViewModel(
            loginFeatureStarter = loginFeatureApi.loginFeatureStarter,
            mainScreenFeatureStarter = mainScreenFeatureApi.mainScreenFeatureStarter
        )
}
