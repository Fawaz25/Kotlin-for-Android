package com.example.myapplication

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


private const val TAG = "MainActivity"

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)



        val actionBar = supportActionBar
        actionBar!!.title = "Dice Roll"

        actionBar.setDisplayHomeAsUpEnabled(true)
        actionBar.setDisplayHomeAsUpEnabled(true)


        actionBar?.setBackgroundDrawable(ColorDrawable(Color.parseColor("#957DAD")))

//        val editText = findViewById<EditText>(R.id.name)
//        val submitButton = findViewById<Button>(R.id.button2)

//        submitButton.setOnClickListener {
//            val userInput = editText.text.toString()
//
//            if (validateInput(userInput)) {
//                // Show a toast
//                Toast.makeText(this, "Input is valid!", Toast.LENGTH_SHORT).show()
//            } else {
//                // Show a toast
//                Toast.makeText(this, "Input is not valid!", Toast.LENGTH_SHORT).show()
//            }
//        }

        val rollButton: Button = findViewById(R.id.roll)

        rollButton.setOnClickListener {
            rollDice()
        }
        rollDice()

//        val navBtn = findViewById<Button>(R.id.roll)
//        navBtn.setOnClickListener(View.OnClickListener {
//            val intent = Intent(this, MainActivity3::class.java)
//            startActivity(intent)
//        })
    }

    private fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val resultTextView: TextView = findViewById(R.id.textView3)
        resultTextView.text = diceRoll.toString()

        val diceImage: ImageView = findViewById(R.id.d1)
        diceImage.setImageResource(R.drawable.d4)

        val drawableResource = when (diceRoll) {
            1 -> R.drawable.d1
            2 -> R.drawable.d2
            3 -> R.drawable.d3
            4 -> R.drawable.d4
            5 -> R.drawable.d5
            else -> R.drawable.d6
        }

        diceImage.setImageResource(drawableResource)
        diceImage.contentDescription = diceRoll.toString()
    }

    private fun validateInput(userInput: String): Boolean {
        // Here's a simple example that checks if the input is not empty
        return userInput.isNotEmpty()
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }




}

class Dice(val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}