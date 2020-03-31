package com.vtb

import android.os.Bundle
import com.vtb.core.AppInjector
import com.vtb.core.BaseActivity
import com.vtb.feature.splash.api.SplashFeatureApi

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val splashFeatureApi =
            AppInjector.coreApi.featureApiProvider.provideApi(SplashFeatureApi::class.java)
        val splashFeatureStarter = splashFeatureApi.splashFeatureStarter
        splashFeatureStarter.openSplash()
    }
}
