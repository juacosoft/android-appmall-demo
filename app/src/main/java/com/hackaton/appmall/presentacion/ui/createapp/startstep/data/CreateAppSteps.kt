package com.hackaton.appmall.presentacion.ui.createapp.startstep.data

import com.hackaton.appmall.presentacion.ui.createapp.startstep.data.models.FormCreateApp

sealed class CreateAppSteps (private val data: FormCreateApp?) {
    class CreateAppStart (data: FormCreateApp?) : CreateAppSteps(data)
    class SelectCategories (data: FormCreateApp) : CreateAppSteps(data)
    class SelectSubCategory (data: FormCreateApp) : CreateAppSteps(data)
    class FormCreateTemplate (data: FormCreateApp) : CreateAppSteps(data)
}