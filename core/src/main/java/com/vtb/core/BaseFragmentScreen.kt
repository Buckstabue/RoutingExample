package com.vtb.core

import android.content.Context
import android.content.Intent
import androidx.fragment.app.Fragment
import ru.terrakok.cicerone.android.support.SupportAppScreen

abstract class BaseFragmentScreen : SupportAppScreen() {

    final override fun getActivityIntent(context: Context?): Intent {
        return super.getActivityIntent(context)
    }

    abstract override fun getFragment(): Fragment
}