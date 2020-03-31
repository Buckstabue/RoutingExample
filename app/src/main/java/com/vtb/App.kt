package com.vtb

import android.app.Application
import com.vtb.core.AppInjector
import com.vtb.core.di.CoreComponent
import ru.terrakok.cicerone.Cicerone

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        AppInjector.setCoreApi(
            CoreComponent(
                featureApiProvider = FeatureApiProviderImpl(),
                cicerone = Cicerone.create()
            )
        )
    }
}