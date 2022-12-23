package com.app.simpleadapter.data

import androidx.annotation.DrawableRes

data class Items(
    val id:Int,
    val name:String,
    @DrawableRes
    val icon:Int,
    val selected:Boolean = false
)