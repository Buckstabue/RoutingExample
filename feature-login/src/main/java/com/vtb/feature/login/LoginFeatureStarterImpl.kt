package com.vtb.feature.login

import com.vtb.feature.login.api.LoginFeatureStarter
import com.vtb.feature.login.presentation.LoginScreen
import ru.terrakok.cicerone.Cicerone
import ru.terrakok.cicerone.Router

class LoginFeatureStarterImpl(
    private val cicerone: Cicerone<Router>
) : LoginFeatureStarter {
    override fun openLoginScreen() {
        cicerone.router.navigateTo(LoginScreen())
    }
}