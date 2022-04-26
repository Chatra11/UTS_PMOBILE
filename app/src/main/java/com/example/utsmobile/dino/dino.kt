package com.example.utsmobile.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import java.io.Serializable

data class dino(
    var namadino: String,
    @DrawableRes var  gambardino: Int,
    var descdino: String,
): Serializable