package com.example.dogglers.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes


data class Dogglers(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
)
