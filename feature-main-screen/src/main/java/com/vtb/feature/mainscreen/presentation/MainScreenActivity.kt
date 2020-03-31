package com.vtb.feature.mainscreen.presentation

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import com.vtb.core.BaseActivity
import com.vtb.feature.mainscreen.R

class MainScreenActivity : BaseActivity() {
    companion object {
        private const val EXTRA_USERNAME = "username"

        fun createIntent(username: String, context: Context): Intent {
            return Intent(context, MainScreenActivity::class.java)
                .apply {
                    putExtra(EXTRA_USERNAME, username)
                }
        }
    }

    private val username by lazy { intent.extras?.getString(EXTRA_USERNAME) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)

        val greetingTextView = findViewById<TextView>(R.id.greeting_text)
        greetingTextView.text = "Hello $username!"
    }
}
