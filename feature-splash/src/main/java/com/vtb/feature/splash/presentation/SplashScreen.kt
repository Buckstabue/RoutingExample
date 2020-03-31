package com.vtb.feature.splash.presentation

import android.content.Context
import android.content.Intent
import com.vtb.core.BaseActivityScreen

class SplashScreen : BaseActivityScreen() {
    override fun getActivityIntent(context: Context): Intent {
        return SplashActivity.createIntent(context)
    }
}