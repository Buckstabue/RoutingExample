package com.vtb

import android.app.Application
import com.vtb.core.AppInjector
import com.vtb.core.di.DaggerCoreComponent
import ru.terrakok.cicerone.Cicerone

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        AppInjector.setCoreApi(
            DaggerCoreComponent.factory()
                .create(FeatureApiProviderImpl(), Cicerone.create())
        )
    }
}