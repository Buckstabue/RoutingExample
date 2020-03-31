package com.vtb.feature.splash.presentation

import com.vtb.feature.login.api.LoginFeatureStarter
import com.vtb.feature.main.screen.api.MainScreenFeatureStarter

class SplashViewModel(
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