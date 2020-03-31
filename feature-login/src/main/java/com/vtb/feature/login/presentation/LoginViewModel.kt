package com.vtb.feature.login.presentation

import com.vtb.feature.main.screen.api.MainScreenFeatureStarter

class LoginViewModel(
    private val mainScreenFeatureStarter: MainScreenFeatureStarter
) {
    fun onSignInClick() {
        mainScreenFeatureStarter.openMainScreen("Steve Jobs")
    }
}