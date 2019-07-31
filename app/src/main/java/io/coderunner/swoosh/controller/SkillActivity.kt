package io.coderunner.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import io.coderunner.swoosh.R
import io.coderunner.swoosh.utility.EXTRA_LEAGUE
import io.coderunner.swoosh.utility.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_league.*
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    var league = ""
    var skill = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE)
        btnBeginnerSkill.performClick()
    }

    fun onBeginnerClicked(view: View) {
        btnBallerSkill.isChecked = false
        if (!btnBeginnerSkill.isChecked)
            skill = ""
        else
            skill = "beginner"
    }

    fun onBallerClicked(view: View) {
        btnBeginnerSkill.isChecked = false
        if (!btnBallerSkill.isChecked)
            skill = ""
        else
            skill = "baller"
    }

    fun onFinishSkillClicked(view: View) {
        if (skill != "") {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_LEAGUE, league)
            finishActivity.putExtra(EXTRA_SKILL, skill)
            startActivity(finishActivity)
        } else {
            Toast.makeText(this, "Select a skill first!", Toast.LENGTH_SHORT).show()
        }
    }
}
