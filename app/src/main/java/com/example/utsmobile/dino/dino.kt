package com.example.utsmobile.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import java.io.Serializable

data class dino(
    val namadino: String,
    @DrawableRes val gambardino: Int,
    val descdino: String,
): Serializable