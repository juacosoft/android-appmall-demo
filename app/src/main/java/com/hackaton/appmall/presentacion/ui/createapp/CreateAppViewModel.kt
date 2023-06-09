package com.hackaton.appmall.presentacion.ui.createapp

import androidx.lifecycle.ViewModel
import com.hackaton.appmall.presentacion.ui.createapp.form.data.StoreLocationModel
import com.hackaton.appmall.presentacion.ui.createapp.startstep.data.models.CategoryApp
import com.hackaton.appmall.presentacion.ui.createapp.startstep.data.models.FormCreateApp
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CreateAppViewModel @Inject constructor() : ViewModel(){

    private var formCreateApp: FormCreateApp.Builder = FormCreateApp.Builder()

    fun setCategoryApp(categoryApp: CategoryApp){
        formCreateApp.setCategoryApp(categoryApp)
    }

    fun setSubCategory(subCategory: String){
        formCreateApp.setSubCategory(subCategory)
    }

    fun setFinishStep(
        storeLocationModel: StoreLocationModel?,
        expectedCustomer: List<String>,
        styleTemplate: String
    ) {
        formCreateApp.setStoreLocation(storeLocationModel)
        formCreateApp.setPublico(expectedCustomer.joinToString(", "))
        formCreateApp.setDiseno(styleTemplate)
    }
}