package com.vtb.feature.splash.presentation

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import com.vtb.core.BaseActivity
import com.vtb.feature.splash.R
import com.vtb.feature.splash.di.SplashComponent

class SplashActivity : BaseActivity() {
    companion object {
        fun createIntent(context: Context): Intent {
            return Intent(context, SplashActivity::class.java)
        }
    }

    private lateinit var splashViewModel: SplashViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val splashComponent = SplashComponent()
        splashViewModel = splashComponent.splashViewModel

        findViewById<View>(R.id.login_button).setOnClickListener {
            splashViewModel.onLoginClick()
        }

        findViewById<View>(R.id.main_screen_button).setOnClickListener {
            splashViewModel.onMainScreenClick()
        }
    }
}
