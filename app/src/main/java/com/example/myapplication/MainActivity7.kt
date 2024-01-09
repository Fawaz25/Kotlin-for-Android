package com.example.myapplication

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main7)
        val actionBar = supportActionBar
        actionBar!!.title = "Project Dogglers App"

        actionBar.setDisplayHomeAsUpEnabled(true)
        actionBar.setDisplayHomeAsUpEnabled(true)
        actionBar?.setBackgroundDrawable(ColorDrawable(Color.parseColor("#957DAD")))

        val navBtn = findViewById<Button>(R.id.button6)
        navBtn.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity8::class.java)
            startActivity(intent)
        })

        val navBtn2 = findViewById<Button>(R.id.button7)
        navBtn2.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, GridListActivity::class.java)
            startActivity(intent)
        })

        val navBtn3 = findViewById<Button>(R.id.button8)
        navBtn3.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, HorizontalListActivity::class.java)
            startActivity(intent)
        })
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                onBackPressed()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

//    button6
}