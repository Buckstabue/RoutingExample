package com.vtb.core

import android.content.Context
import android.content.Intent
import androidx.fragment.app.Fragment
import ru.terrakok.cicerone.android.support.SupportAppScreen

abstract class BaseActivityScreen : SupportAppScreen() {

    final override fun getFragment(): Fragment? {
        return null
    }

    abstract override fun getActivityIntent(context: Context): Intent
}