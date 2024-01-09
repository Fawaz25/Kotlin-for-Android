/*
* Copyright (C) 2021 The Android Open Source Project.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package com.example.dogglers.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.dogglers.cons.Layout
import com.example.dogglers.data.DataSource2
import com.example.dogglers.model.Dog
import com.example.myapplication.R

/**
 * Adapter to inflate the appropriate list item layout and populate the view with information
 * from the appropriate data source
 */
class DogCardAdapter(
    private val context: Context?,
    private val layout: Int
): RecyclerView.Adapter<DogCardAdapter.DogCardViewHolder>() {

    // TODO: Initialize the data using the List found in data/DataSource
    private val data: List<Dog> = DataSource2.dogs

    /**
     * Initialize view elements
     */
    class DogCardViewHolder(private val view: View): RecyclerView.ViewHolder(view) {
        // TODO: Declare and initialize all of the list item UI components
        val dogImage: ImageView = view.findViewById(R.id.dog_image)
        val dogName: TextView = view.findViewById(R.id.dog_name)
        val dogAge: TextView = view.findViewById(R.id.dog_age)
        val dogHobbies: TextView = view.findViewById(R.id.dog_hobbies)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogCardViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view: View = when (layout) {
            Layout.GRID -> inflater.inflate(R.layout.grid_item, parent, false)
            else -> inflater.inflate(R.layout.vertical_horizontal_list_item, parent, false)
        }
        return DogCardViewHolder(view)
    }


    override fun getItemCount(): Int = data.size // TODO: return the size of the data set instead of 0

    override fun onBindViewHolder(holder: DogCardViewHolder, position: Int) {
        val dog: Dog = data[position]
        val resources = context?.resources

        // Set the image resource for the current dog
        holder.dogImage.setImageResource(dog.imageResourceId)

        // Set the text for the current dog's name
        holder.dogName.text = dog.name

        // Set the text for the current dog's age
        val ageString = resources?.getString(R.string.dog_age, dog.age)
        holder.dogAge.text = ageString

        // Set the text for the current dog's hobbies
        val hobbiesString = resources?.getString(R.string.dog_hobbies, dog.hobbies)
        holder.dogHobbies.text = hobbiesString
    }

}
