package com.vtb.feature.login.di

import com.vtb.core.di.CoreApi
import com.vtb.feature.login.api.LoginFeatureApi
import com.vtb.feature.login.presentation.LoginActivity
import com.vtb.feature.main.screen.api.MainScreenFeatureApi
import dagger.Component

@Component(
    dependencies = [CoreApi::class, MainScreenFeatureApi::class],
    modules = [LoginModule::class]
)
@LoginFeatureScope
interface LoginFeatureComponent : LoginFeatureApi {
    fun inject(loginActivity: LoginActivity)
}