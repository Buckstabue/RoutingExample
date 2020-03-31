package com.vtb.feature.login.presentation

import com.vtb.feature.login.di.LoginFeatureScope
import com.vtb.feature.main.screen.api.MainScreenFeatureStarter
import javax.inject.Inject

@LoginFeatureScope
class LoginViewModel @Inject constructor(
    private val mainScreenFeatureStarter: MainScreenFeatureStarter
) {
    fun onSignInClick() {
        mainScreenFeatureStarter.openMainScreen("Steve Jobs")
    }
}