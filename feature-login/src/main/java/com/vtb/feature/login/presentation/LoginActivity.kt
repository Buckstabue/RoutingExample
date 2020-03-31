package com.vtb.feature.login.presentation

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import com.vtb.core.BaseActivity
import com.vtb.core.SmartFeatureApiProvider
import com.vtb.feature.login.R
import com.vtb.feature.login.di.LoginFeatureComponent

class LoginActivity : BaseActivity() {
    companion object {
        fun createIntent(context: Context): Intent {
            return Intent(context, LoginActivity::class.java)
        }
    }

    lateinit var loginViewModel: LoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val loginComponent = LoginFeatureComponent(
            coreApi = SmartFeatureApiProvider.provideApi(),
            mainScreenFeatureApi = SmartFeatureApiProvider.provideApi()
        )
        loginViewModel = loginComponent.loginViewModel

        findViewById<View>(R.id.sign_in_button).setOnClickListener {
            loginViewModel.onSignInClick()
        }
    }
}