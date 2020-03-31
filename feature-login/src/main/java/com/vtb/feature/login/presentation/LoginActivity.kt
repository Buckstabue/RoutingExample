package com.vtb.feature.login.presentation

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import com.vtb.core.AppInjector
import com.vtb.core.BaseActivity
import com.vtb.core.di.CoreApi
import com.vtb.feature.login.R
import com.vtb.feature.login.di.DaggerLoginFeatureComponent
import com.vtb.feature.main.screen.api.MainScreenFeatureApi
import javax.inject.Inject

class LoginActivity : BaseActivity() {
    companion object {
        fun createIntent(context: Context): Intent {
            return Intent(context, LoginActivity::class.java)
        }
    }

    @Inject
    lateinit var loginViewModel: LoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val featureApiProvider = AppInjector.featureApiProvider

        val loginComponent = DaggerLoginFeatureComponent.builder()
            .coreApi(featureApiProvider.provideApi(CoreApi::class.java))
            .mainScreenFeatureApi(featureApiProvider.provideApi(MainScreenFeatureApi::class.java))
            .build()
        loginComponent.inject(this)

        findViewById<View>(R.id.sign_in_button).setOnClickListener {
            loginViewModel.onSignInClick()
        }
    }
}