package com.hackaton.appmall.presentacion.ui.createapp.startstep.data.models

import com.hackaton.appmall.presentacion.ui.createapp.form.data.StoreLocationModel

class FormCreateApp private constructor(
    private val categoryApp: CategoryApp,
    private val nameShop: String,
    private val tags: List<String>,
    private val publico: String?,
    private val diseno: String,
    private val subCategory: String,
    private val storeLocationModel: StoreLocationModel?
) {

    class Builder(
        var nameShop: String? = null,
        var categoryApp: CategoryApp? = null,
        var tags: List<String>? = null,
        var publico: String? = null,
        var diseno: String? = null,
        var subCategory: String? = null,
        var storeLocationModel: StoreLocationModel? = null
    ){
        fun setNameShop(nameShop: String) = apply { this.nameShop = nameShop }

        fun setCategoryApp(categoryApp: CategoryApp) = apply { this.categoryApp = categoryApp }

        fun setTags(tags: List<String>) = apply { this.tags = tags }

        fun setPublico(publico: String) = apply { this.publico = publico }

        fun setDiseno(diseno: String) = apply { this.diseno = diseno }

        fun setSubCategory(subCategory: String) = apply { this.subCategory = subCategory }

        fun setStoreLocation(storeLocationModel: StoreLocationModel?) = apply { this.storeLocationModel = storeLocationModel }

        fun build(): FormCreateApp {
            return FormCreateApp(
                categoryApp = categoryApp?: CategoryApp("No Selected", 0),
                nameShop = nameShop?: "",
                tags = tags?: listOf(),
                publico = publico?: "",
                diseno = diseno?: "",
                subCategory = subCategory?: "",
                storeLocationModel = storeLocationModel
            )
        }
    }


}


data class CategoryApp (
    private val name:String,
    private val id: Int
        )
