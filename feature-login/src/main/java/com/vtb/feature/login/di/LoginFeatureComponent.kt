package com.vtb.feature.login.di

import com.vtb.core.SmartFeatureApiProvider
import com.vtb.core.di.CoreApi
import com.vtb.feature.login.LoginFeatureStarterImpl
import com.vtb.feature.login.api.LoginFeatureApi
import com.vtb.feature.login.presentation.LoginViewModel
import com.vtb.feature.main.screen.api.MainScreenFeatureApi

class LoginFeatureComponent(
    private val coreApi: CoreApi = SmartFeatureApiProvider.provideApi(),
    private val mainScreenFeatureApi: MainScreenFeatureApi = SmartFeatureApiProvider.provideApi()
) : LoginFeatureApi {

    override val loginFeatureStarter by lazy { LoginFeatureStarterImpl(coreApi.cicerone) }

    val loginViewModel: LoginViewModel
        get() = LoginViewModel(mainScreenFeatureApi.mainScreenFeatureStarter)
}