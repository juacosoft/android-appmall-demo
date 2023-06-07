package com.hackaton.appmall.presentacion.ui.createapp

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.hackaton.appmall.presentacion.ui.createapp.startstep.data.CreateAppSteps
import com.hackaton.appmall.presentacion.ui.createapp.startstep.data.models.FormCreateApp
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CreateAppViewModel @Inject constructor() : ViewModel(){

    private val steps: MutableLiveData<CreateAppSteps> = MutableLiveData()

    val stepsLiveData get() = steps

    private var formCreateApp: FormCreateApp? = null

    init {
        steps.value = CreateAppSteps.CreateAppStart(formCreateApp)
    }

    fun setStep(step: CreateAppSteps){
        steps.value = step
    }
}