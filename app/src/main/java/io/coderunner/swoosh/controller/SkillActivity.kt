package io.coderunner.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import io.coderunner.swoosh.R
import io.coderunner.swoosh.model.Player
import io.coderunner.swoosh.utility.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    lateinit var player: Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)
        btnBeginnerSkill.performClick()
    }

    fun onBeginnerClicked(view: View) {
        btnBallerSkill.isChecked = false
        if (!btnBeginnerSkill.isChecked)
            player.skill = ""
        else
            player.skill = "beginner"
    }

    fun onBallerClicked(view: View) {
        btnBeginnerSkill.isChecked = false
        if (!btnBallerSkill.isChecked)
            player.skill = ""
        else
            player.skill = "baller"
    }

    fun onFinishSkillClicked(view: View) {
        if (player.skill != "") {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(finishActivity)
        } else {
            Toast.makeText(this, "Select a skill first!", Toast.LENGTH_SHORT).show()
        }
    }
}
