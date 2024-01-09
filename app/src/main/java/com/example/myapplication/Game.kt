
package com.example.myapplication

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

/**
 * Creates an Activity that hosts the Game fragment in the app
 */
class Game : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)
        val actionBar = supportActionBar
        actionBar!!.title = "Word Game"

        actionBar.setDisplayHomeAsUpEnabled(true)
        actionBar.setDisplayHomeAsUpEnabled(true)


        actionBar?.setBackgroundDrawable(ColorDrawable(Color.parseColor("#957DAD")))

    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}