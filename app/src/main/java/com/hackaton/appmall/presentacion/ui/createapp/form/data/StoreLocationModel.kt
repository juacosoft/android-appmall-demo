package com.hackaton.appmall.presentacion.ui.createapp.form.data

data class StoreLocationModel(
    val country: String,
    val city: String,
    val address: String,
    val zipCode: String,
    val email: String,
    val webSite: String,
    val isGlobal: Boolean = false
)
