package com.vtb.feature.login.presentation

import android.content.Context
import android.content.Intent
import com.vtb.core.BaseActivityScreen

class LoginScreen : BaseActivityScreen() {
    override fun getActivityIntent(context: Context): Intent {
        return LoginActivity.createIntent(context)
    }
}