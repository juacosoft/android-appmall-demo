package com.hackaton.appmall.presentacion.ui.createapp.startstep.data.models

class FormCreateApp private constructor(
    private val categoryApp: CategoryApp,
    private val nameShop: String,
    private val tags: List<String>,
    private val publico: String?,
    private val pais: String,
    private val diseno: String,
    private val subCategory: String
) {

    class Builder(
        var nameShop: String? = null,
        var categoryApp: CategoryApp? = null,
        var tags: List<String>? = null,
        var publico: String? = null,
        var pais: String? = null,
        var diseno: String? = null,
        var subCategory: String? = null
    ){
        fun setNameShop(nameShop: String) = apply { this.nameShop = nameShop }

        fun setCategoryApp(categoryApp: CategoryApp) = apply { this.categoryApp = categoryApp }

        fun setTags(tags: List<String>) = apply { this.tags = tags }

        fun setPublico(publico: String) = apply { this.publico = publico }

        fun setPais(pais: String) = apply { this.pais = pais }

        fun setDiseno(diseno: String) = apply { this.diseno = diseno }

        fun setSubCategory(subCategory: String) = apply { this.subCategory = subCategory }

        fun build(): FormCreateApp {
            return FormCreateApp(
                categoryApp = categoryApp?: CategoryApp("No Selected", 0),
                nameShop = nameShop?: "",
                tags = tags?: listOf(),
                publico = publico?: "",
                pais = pais?: "",
                diseno = diseno?: "",
                subCategory = subCategory?: ""
            )
        }
    }


}


data class CategoryApp (
    private val name:String,
    private val id: Int
        )
