package io.coderunner.swoosh.controller

import android.content.Intent
import android.os.Bundle
import io.coderunner.swoosh.R
import kotlinx.android.synthetic.main.activity_welcome.*

class WelcomeActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        btnGetStarted.setOnClickListener {
            startActivity(Intent(this, LeagueActivity::class.java))
        }
    }
}
