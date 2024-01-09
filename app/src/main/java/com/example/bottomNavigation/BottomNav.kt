package com.example.bottomNavigation

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI.setupWithNavController
import com.example.myapplication.R
import com.example.myapplication.databinding.ActivityBottomNavBinding

class BottomNav : AppCompatActivity() {

    private lateinit var binding: ActivityBottomNavBinding
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityBottomNavBinding.inflate(layoutInflater)
        setContentView(binding.root)

        navController= Navigation.findNavController(this,R.id.activity_main_nav_host_fragment)
        setupWithNavController(binding.bottomNavigationView,navController)

        val actionBar = supportActionBar
        actionBar!!.title = "Bottom Nav"
        actionBar.setDisplayHomeAsUpEnabled(true)
        actionBar.setDisplayHomeAsUpEnabled(true)
        actionBar?.setBackgroundDrawable(ColorDrawable(Color.parseColor("#957DAD")))

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}