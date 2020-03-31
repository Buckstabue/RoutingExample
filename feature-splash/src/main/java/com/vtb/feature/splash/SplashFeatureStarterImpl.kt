package com.vtb.feature.splash

import com.vtb.feature.splash.api.SplashFeatureStarter
import com.vtb.feature.splash.presentation.SplashScreen
import ru.terrakok.cicerone.Cicerone
import ru.terrakok.cicerone.Router

class SplashFeatureStarterImpl(
    private val cicerone: Cicerone<Router>
) : SplashFeatureStarter {
    override fun openSplash() {
        cicerone.router.navigateTo(SplashScreen())
    }
}