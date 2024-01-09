package com.example.bottomNavigation

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.cupcake.CupcakeMain
import com.example.myapplication.R

class OneFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_one, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Find the button by its ID
        val button = view.findViewById<Button>(R.id.cupcakebtn)

        // Set an OnClickListener on the button
        button.setOnClickListener {
            // Create an Intent to navigate to the NewActivity
            val intent = Intent(activity, CupcakeMain::class.java)

            // Start the NewActivity
            startActivity(intent)
        }
    }




}