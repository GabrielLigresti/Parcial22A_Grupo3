package com.challenge.parcial22a_grupo3.activities

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.TaskStackBuilder
import androidx.core.view.GravityCompat
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.challenge.parcial22a_grupo3.R
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_login.*


class HomeActivity : AppCompatActivity(){
    private lateinit var navController : NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }

    override fun onStart() {
        super.onStart()

        navController = Navigation.findNavController(this, R.id.nav_host_fragment)

        nav_view.setupWithNavController(navController)


        NavigationUI.setupActionBarWithNavController(this,navController, drawer_layout_id)

        nav_view.setNavigationItemSelectedListener { menuItem ->
            val id = menuItem.itemId
            if (id == R.id.login_screen) {
                startActivity(Intent(this@HomeActivity, LoginActivity::class.java))
            }
            if(id == R.id.activity_settings){
                startActivity(Intent(this@HomeActivity, SettingsActivity::class.java))
            }
            true
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        return NavigationUI.navigateUp(navController, drawer_layout_id)
    }

}