package com.vtb.feature.login

import com.vtb.feature.login.api.LoginFeatureStarter
import com.vtb.feature.login.di.LoginFeatureScope
import com.vtb.feature.login.presentation.LoginScreen
import ru.terrakok.cicerone.Cicerone
import ru.terrakok.cicerone.Router
import javax.inject.Inject

@LoginFeatureScope
class LoginFeatureStarterImpl @Inject constructor(
    private val cicerone: Cicerone<Router>
) : LoginFeatureStarter {
    override fun openLoginScreen() {
        cicerone.router.navigateTo(LoginScreen())
    }
}