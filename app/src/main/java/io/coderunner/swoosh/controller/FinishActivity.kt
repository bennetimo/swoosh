package io.coderunner.swoosh.controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import io.coderunner.swoosh.R
import io.coderunner.swoosh.utility.EXTRA_LEAGUE
import io.coderunner.swoosh.utility.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val league = intent.getStringExtra(EXTRA_LEAGUE)
        val skill = intent.getStringExtra(EXTRA_SKILL)

        searchLeaguesText.text = "Looking for a $league $skill league near you..."
    }


}
