package com.hackaton.appmall.data.mock

import com.hackaton.appmall.R
import com.hackaton.appmall.presentacion.ui.createapp.data.ButtomCreateAction
import com.hackaton.appmall.presentacion.ui.createapp.data.models.ItemButtonsCreate

object MockMenusCreateButton {

    fun getMenus() = listOf(
        ItemButtonsCreate(
            title = "Start from scratch",
            subTitle = "All you need is a blank canvas.",
            image = R.drawable.ic_add,
            action = ButtomCreateAction.FROM_SCRATCH
        ),
        ItemButtonsCreate(
            title = "Use a template",
            subTitle = "Choose from over 300 pre-made apps.",
            action = ButtomCreateAction.NO_ACTION
        ),
        ItemButtonsCreate(
            title = "Clone an existing app",
            subTitle = "Make a copy of your existing apps.",
            action = ButtomCreateAction.NO_ACTION
        ),
        ItemButtonsCreate(
            title = "Build a store",
            subTitle = "Receive orders through your online store.",
            action = ButtomCreateAction.NO_ACTION
        )
    )
}