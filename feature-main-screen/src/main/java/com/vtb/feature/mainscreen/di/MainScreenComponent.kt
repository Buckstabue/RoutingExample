package com.vtb.feature.mainscreen.di

import com.vtb.core.SmartFeatureApiProvider
import com.vtb.core.di.CoreApi
import com.vtb.feature.main.screen.api.MainScreenFeatureApi
import com.vtb.feature.mainscreen.MainScreenFeatureStarterImpl

class MainScreenComponent(
    private val coreApi: CoreApi = SmartFeatureApiProvider.provideApi()
) : MainScreenFeatureApi {
    override val mainScreenFeatureStarter by lazy { MainScreenFeatureStarterImpl(coreApi.cicerone) }
}
