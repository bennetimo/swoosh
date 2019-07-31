package io.coderunner.swoosh.controller

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import io.coderunner.swoosh.R
import io.coderunner.swoosh.model.Player
import io.coderunner.swoosh.utility.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

        searchLeaguesText.text = "Looking for a ${player.league} ${player.skill} league near you..."
    }


}
