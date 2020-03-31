package com.vtb.feature.splash.presentation

import com.vtb.feature.login.api.LoginFeatureStarter
import com.vtb.feature.main.screen.api.MainScreenFeatureStarter
import com.vtb.feature.splash.di.SplashFeatureScope
import javax.inject.Inject

@SplashFeatureScope
class SplashViewModel @Inject constructor(
    private val loginFeatureStarter: LoginFeatureStarter,
    private val mainScreenFeatureStarter: MainScreenFeatureStarter
) {
    fun onLoginClick() {
        loginFeatureStarter.openLoginScreen()
    }

    fun onMainScreenClick() {
        mainScreenFeatureStarter.openMainScreen("Bill Gates")
    }
}