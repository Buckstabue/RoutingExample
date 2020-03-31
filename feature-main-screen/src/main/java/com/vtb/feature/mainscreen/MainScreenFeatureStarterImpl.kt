package com.vtb.feature.mainscreen

import com.vtb.feature.main.screen.api.MainScreenFeatureStarter
import com.vtb.feature.mainscreen.di.MainScreenScope
import com.vtb.feature.mainscreen.presentation.MainScreen
import ru.terrakok.cicerone.Cicerone
import ru.terrakok.cicerone.Router
import javax.inject.Inject

@MainScreenScope
class MainScreenFeatureStarterImpl @Inject constructor(
    private val cicerone: Cicerone<Router>
) : MainScreenFeatureStarter {
    override fun openMainScreen(username: String) {
        cicerone.router.navigateTo(
            MainScreen(username)
        )
    }
}