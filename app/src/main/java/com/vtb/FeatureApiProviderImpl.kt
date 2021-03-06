package com.vtb

import com.vtb.core.AppInjector
import com.vtb.core.FeatureApiProvider
import com.vtb.core.di.CoreApi
import com.vtb.feature.login.api.LoginFeatureApi
import com.vtb.feature.login.di.DaggerLoginFeatureComponent
import com.vtb.feature.main.screen.api.MainScreenFeatureApi
import com.vtb.feature.mainscreen.di.DaggerMainScreenComponent
import com.vtb.feature.splash.api.SplashFeatureApi
import com.vtb.feature.splash.di.DaggerSplashComponent

class FeatureApiProviderImpl : FeatureApiProvider {

    @Suppress("IMPLICIT_CAST_TO_ANY", "UNCHECKED_CAST")
    override fun <T : Any> provideApi(clazz: Class<out T>): T {
        return when (clazz) {
            CoreApi::class.java -> AppInjector.coreApi
            LoginFeatureApi::class.java -> createLoginFeatureApi()
            SplashFeatureApi::class.java -> createSplashFeatureApi()
            MainScreenFeatureApi::class.java -> createMainScreenFeatureApi()
            else -> throw IllegalStateException("Cannot provide api for feature class: ${clazz.name}")
        } as T
    }

    private fun createMainScreenFeatureApi(): MainScreenFeatureApi {
        return DaggerMainScreenComponent.builder()
            .coreApi(provideFeatureApi())
            .build()
    }

    private fun createLoginFeatureApi(): LoginFeatureApi {
        return DaggerLoginFeatureComponent.builder()
            .coreApi(provideFeatureApi())
            .mainScreenFeatureApi(provideFeatureApi())
            .build()
    }

    private fun createSplashFeatureApi(): SplashFeatureApi {
        return DaggerSplashComponent.builder()
            .coreApi(provideFeatureApi())
            .mainScreenFeatureApi(provideFeatureApi())
            .loginFeatureApi(provideFeatureApi())
            .build()
    }

    private inline fun <reified T : Any> provideFeatureApi(): T {
        return provideApi(T::class.java)
    }
}