package com.example.dogglers.data

import com.example.dogglers.model.Dogglers
import com.example.myapplication.R


class Datasource {

    fun loadDogglers(): List<Dogglers> {
        return listOf<Dogglers>(
            Dogglers(R.string.doggler1, R.drawable.dg1),
            Dogglers(R.string.doggler2, R.drawable.dg2),
            Dogglers(R.string.doggler3, R.drawable.dg3),
            Dogglers(R.string.doggler4, R.drawable.dg4),
            Dogglers(R.string.doggler5, R.drawable.dg5),
            Dogglers(R.string.doggler6, R.drawable.dg6),
            Dogglers(R.string.doggler7, R.drawable.dg7),
            Dogglers(R.string.doggler8, R.drawable.dg8),
            Dogglers(R.string.doggler9, R.drawable.dg9),
            Dogglers(R.string.doggler10, R.drawable.dg10)

        )
    }
}