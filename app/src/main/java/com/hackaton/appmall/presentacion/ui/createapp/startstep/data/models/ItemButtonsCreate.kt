package com.hackaton.appmall.presentacion.ui.createapp.startstep.data.models

import android.graphics.drawable.Drawable
import androidx.annotation.DrawableRes
import com.hackaton.appmall.presentacion.ui.createapp.startstep.data.ButtomCreateAction

data class ItemButtonsCreate(
    val title: String,
    val subTitle: String,
    @DrawableRes
    val image: Int? = null,
    val action: ButtomCreateAction
)
