package io.coderunner.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import io.coderunner.swoosh.R
import io.coderunner.swoosh.utility.EXTRA_LEAGUE
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var selectedLeague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun onMensClicked(view: View) {
        btnWomensLeague.isChecked = false
        btnCoedLeague.isChecked = false

        if (!btnMensLeague.isChecked)
            selectedLeague = ""
        else
            selectedLeague = "mens"
    }

    fun onWomensClicked(view: View) {
        btnMensLeague.isChecked = false
        btnCoedLeague.isChecked = false

        if (!btnWomensLeague.isChecked)
            selectedLeague = ""
        else
            selectedLeague = "womens"
    }

    fun onCoedClicked(view: View) {

        btnMensLeague.isChecked = false
        btnWomensLeague.isChecked = false

        if (!btnCoedLeague.isChecked)
            selectedLeague = ""
        else
            selectedLeague = "coed"
    }

    fun leagueNextClicked(view: View) {
        if (selectedLeague != "") {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_LEAGUE, selectedLeague)
            startActivity(skillActivity)
        } else {
            Toast.makeText(this, "Select a league first!", Toast.LENGTH_SHORT).show()
        }
    }
}
