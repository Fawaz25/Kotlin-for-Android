package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.bottomNavigation.BottomNav
import com.example.myapplication.databinding.DashboardBinding

//private const val TAG = "MainActivity"

class DashboardActivity : AppCompatActivity() {
    private lateinit var binding: DashboardBinding
//    private lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DashboardBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        setContentView(R.layout.dashboard)
//        logging()
//        division()
//        navController = Navigation.findNavController(this, R.id.activity_main_nav_host_fragment)
//        setupWithNavController(binding.bottomNavigationView,navController)

//        val navHostFragment = supportFragmentManager.findFragmentById(R.id.activity_main_nav_host_fragment) as NavHostFragment
//        val navController = navHostFragment.findNavController()
//        binding.bottomNavigationView.setupWithNavController(navController)

//        button.setOnClickListener {
//            findNavController().navigate(R.id.action_fragment1_to_fragment2)
//        }

        val navBtn = findViewById<Button>(R.id.btn)
        navBtn.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        })

        val navBtn2 = findViewById<Button>(R.id.lemonade_button)
        navBtn2.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        })

        val navBtn3 = findViewById<Button>(R.id.btn3)
        navBtn3.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)
        })

        val navBtn4 = findViewById<Button>(R.id.btn4)
        navBtn4.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity5::class.java)
            startActivity(intent)
        })

        val navBtn5 = findViewById<Button>(R.id.btn2)
        navBtn5.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity6::class.java)
            startActivity(intent)
        })

        val navBtn6 = findViewById<Button>(R.id.btn5)
        navBtn6.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity7::class.java)
            startActivity(intent)
        })

        val navBtn7 = findViewById<Button>(R.id.btn6)
        navBtn7.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, wordsActivity::class.java)
            startActivity(intent)
        })

        val navBtn8 = findViewById<Button>(R.id.btn7)
        navBtn8.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, Game::class.java)
            startActivity(intent)
        })


    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.actionbarmenu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_next_page -> {
                // Code to navigate to the next page
                val intent = Intent(this, BottomNav::class.java)
                startActivity(intent)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }


    fun showToast(view: View) {
        Toast.makeText(applicationContext,"Hi, I am a toast message",Toast.LENGTH_LONG).show()
    }
//    fun division() {
//        val numerator = 60
//        var denominator = 4
//        repeat(4) {
//            Log.d(TAG, "$denominator")
//            Log.v(TAG, "${numerator / denominator}")
//            denominator--
//        }
//    }
//
//    fun logging() {
//        Log.e(TAG, "ERROR: a serious error like an app crash")
//        Log.w(TAG, "WARN: warns about the potential for serious errors")
//        Log.i(TAG, "INFO: reporting technical information, such as an operation succeeding")
//        Log.d(TAG, "DEBUG: reporting technical information useful for debugging")
//        Log.v(TAG, "VERBOSE: more verbose than DEBUG logs")
//    }




}