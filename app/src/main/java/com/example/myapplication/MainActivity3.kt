package com.example.myapplication

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity3 : AppCompatActivity() {
    private lateinit var lemonTree: ImageView
    private var isImage1Displayed = true
    private lateinit var resultTextView2: TextView
        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        val actionBar = supportActionBar
        actionBar!!.title = "Lemonade"

        actionBar.setDisplayHomeAsUpEnabled(true)
        actionBar.setDisplayHomeAsUpEnabled(true)
        actionBar?.setBackgroundDrawable(ColorDrawable(Color.parseColor("#957DAD")))
//        actionBar?.setTitleTextColor(Color.BLACK)
//        actionBar?.titleTextColor = Color.BLACK
//        val actionBar = supportActionBar

        resultTextView2 = findViewById(R.id.textView4)
        resultTextView2.text = "Click to select a lemon"

        lemonTree = findViewById(R.id.tree)
        lemonTree.setImageResource(R.drawable.lemonplant)

        lemonTree.setOnClickListener {
//            if (isImage1Displayed) {

            lemonTree.setImageResource(R.drawable.lemons)
            var num =  (1..5).random()

            resultTextView2.text = "Click $num times to squeeze the Lemon"

            var clickCount = 0
            lemonTree.setOnClickListener {
                    clickCount++
                    if (clickCount == num) {
                        lemonTree.setImageResource(R.drawable.juice)
                        resultTextView2.text = "Enjoy your Juice!"


                    }


            }
//
            isImage1Displayed = !isImage1Displayed
        }
    }



    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}






