package com.vtb.feature.splash.presentation

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import com.vtb.core.AppInjector
import com.vtb.core.BaseActivity
import com.vtb.core.di.CoreApi
import com.vtb.feature.login.api.LoginFeatureApi
import com.vtb.feature.main.screen.api.MainScreenFeatureApi
import com.vtb.feature.splash.R
import com.vtb.feature.splash.di.DaggerSplashComponent
import javax.inject.Inject

class SplashActivity : BaseActivity() {
    companion object {
        fun createIntent(context: Context): Intent {
            return Intent(context, SplashActivity::class.java)
        }
    }

    @Inject
    lateinit var splashViewModel: SplashViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val featureApiProvider = AppInjector.featureApiProvider

        val splashComponent = DaggerSplashComponent.builder()
            .coreApi(featureApiProvider.provideApi(CoreApi::class.java))
            .loginFeatureApi(featureApiProvider.provideApi(LoginFeatureApi::class.java))
            .mainScreenFeatureApi(featureApiProvider.provideApi(MainScreenFeatureApi::class.java))
            .build()

        splashComponent.inject(this)

        findViewById<View>(R.id.login_button).setOnClickListener {
            splashViewModel.onLoginClick()
        }

        findViewById<View>(R.id.main_screen_button).setOnClickListener {
            splashViewModel.onMainScreenClick()
        }
    }
}
