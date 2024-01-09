package com.example.myapplication

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityMain4Binding
import java.text.NumberFormat

class MainActivity4 : AppCompatActivity() {
    private lateinit var binding: ActivityMain4Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain4Binding.inflate(layoutInflater)
        setContentView(binding.root)

//        setSupportActionBar(binding.toolbar)
        supportActionBar?.apply {
            title = "Calculator"
            setDisplayHomeAsUpEnabled(true)
            setDisplayShowHomeEnabled(true)
            setBackgroundDrawable(ColorDrawable(Color.parseColor("#957DAD")))
        }

        // Now you can use binding to access your views
        binding.calculateButton.setOnClickListener { calculateTip() }
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

//    fun calculateTip() {
//        val stringInTextField = binding.costOfService.text.toString()
//        val cost = stringInTextField.toDouble()
//        val selectedId = binding.tipOptions.checkedRadioButtonId
//        val tipPercentage = when (selectedId) {
//            R.id.option_twenty_percent -> 0.20
//            R.id.option_eighteen_percent -> 0.18
//            else -> 0.15
//        }
//        var tip = tipPercentage * cost
//        val roundUp = binding.roundUpSwitch.isChecked
//        if (roundUp) {
//            tip = kotlin.math.ceil(tip)
//        }
//        val formattedTip = NumberFormat.getCurrencyInstance().format(tip)
//        binding.tipResult.text = getString(R.string.tip_amount, formattedTip)
//    }

    fun calculateTip() {
        val stringInTextField = binding.costOfService.text.toString()
        val cost = stringInTextField.toDouble()
        val selectedId = binding.tipOptions.checkedRadioButtonId
        val tipPercentage = when (selectedId) {
            R.id.option_twenty_percent -> 0.20
            R.id.option_eighteen_percent -> 0.18
            else -> 0.15
        }
        var tip = tipPercentage * cost
        val roundUp = binding.roundUpSwitch.isChecked
        if (roundUp) {
            tip = kotlin.math.ceil(tip)
        }
        val formattedTip = NumberFormat.getCurrencyInstance().format(tip)
        binding.tipResult.text = getString(R.string.tip_amount, formattedTip)
    }
}
