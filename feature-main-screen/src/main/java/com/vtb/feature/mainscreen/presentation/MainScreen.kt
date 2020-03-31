package com.vtb.feature.mainscreen.presentation

import android.content.Context
import android.content.Intent
import com.vtb.core.BaseActivityScreen

class MainScreen(
    private val username: String
) : BaseActivityScreen() {
    override fun getActivityIntent(context: Context): Intent {
        return MainScreenActivity.createIntent(username, context)
    }
}