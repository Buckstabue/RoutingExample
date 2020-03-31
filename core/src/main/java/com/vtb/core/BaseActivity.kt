package com.vtb.core

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import ru.terrakok.cicerone.android.support.SupportAppNavigator

abstract class BaseActivity : AppCompatActivity() {
    private val navigator = SupportAppNavigator(this, 0)

    private val navigatorHolder = AppInjector.coreApi.cicerone().navigatorHolder

    // Переопределено финальным, чтобы случайно не переопредилить в подклассах
    final override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
    }

    override fun onResume() {
        super.onResume()
        navigatorHolder.setNavigator(navigator)
    }

    override fun onPause() {
        super.onPause()
        navigatorHolder.removeNavigator()
    }
}