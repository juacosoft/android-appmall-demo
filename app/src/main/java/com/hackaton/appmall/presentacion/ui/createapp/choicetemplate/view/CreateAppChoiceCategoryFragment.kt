package com.hackaton.appmall.presentacion.ui.createapp.choicetemplate.view

import com.hackaton.appmall.databinding.FragmentCreateappChoiceCategoryBinding
import com.hackaton.appmall.presentacion.BaseFragment
import com.hackaton.appmall.presentacion.ui.createapp.startstep.data.models.CategoryApp
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CreateAppChoiceCategoryFragment : BaseFragment<FragmentCreateappChoiceCategoryBinding> (
    FragmentCreateappChoiceCategoryBinding::inflate
) {

    private val categories = listOf(
        CategoryApp("Tienda", 1),
        CategoryApp("Restaurante", 2),
        CategoryApp("Servicios", 3),
        CategoryApp("Otros", 4)
    )

    override fun onViews() {

    }

    override fun onViewModels() {

    }
}