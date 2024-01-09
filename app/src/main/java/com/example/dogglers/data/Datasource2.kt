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
package com.example.dogglers.data

import com.example.dogglers.model.Dog
import com.example.myapplication.R

/**
 * An object to generate a static list of dogs
 */
object DataSource2 {

    val dogs: List<Dog> = listOf(
        Dog(
            R.drawable.dg1,
            "Tzeitel",
            "7",
            "sunbathing"
        ),
        Dog(
            R.drawable.dg2,
            "Leroy",
            "4",
            "sleeping in dangerous places"
        ),
        Dog(
            R.drawable.dg3,
            "Frankie",
            "2",
            "stealing socks"
        ),
        Dog(
            R.drawable.dg4,
            "Nox",
            "8",
            "meeting new animals"
        ),
        Dog(
            R.drawable.dg5,
            "Faye",
            "8",
            "Digging in the garden"
        ),
        Dog(
            R.drawable.dg6,
            "Bella",
            "14",
            "Chasing sea foam"
        )
    )
}
