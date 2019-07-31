package io.coderunner.swoosh.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import io.coderunner.swoosh.R
import io.coderunner.swoosh.model.Player
import io.coderunner.swoosh.utility.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var player = Player("", "")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun onMensClicked(view: View) {
        btnWomensLeague.isChecked = false
        btnCoedLeague.isChecked = false

        if (!btnMensLeague.isChecked)
            player.league = ""
        else
            player.league = "mens"
    }

    fun onWomensClicked(view: View) {
        btnMensLeague.isChecked = false
        btnCoedLeague.isChecked = false

        if (!btnWomensLeague.isChecked)
            player.league = ""
        else
            player.league = "womens"
    }

    fun onCoedClicked(view: View) {

        btnMensLeague.isChecked = false
        btnWomensLeague.isChecked = false

        if (!btnCoedLeague.isChecked)
            player.league = ""
        else
            player.league = "coed"
    }

    fun leagueNextClicked(view: View) {
        if (player.league != "") {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(skillActivity)
        } else {
            Toast.makeText(this, "Select a league first!", Toast.LENGTH_SHORT).show()
        }
    }
}
