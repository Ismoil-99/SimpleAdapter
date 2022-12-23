package com.app.simpleadapter.data

import androidx.annotation.DrawableRes

data class ItemsHeader(
    val id:Int,
    val nameHeader: String,
    @DrawableRes
    val logo:Int
)