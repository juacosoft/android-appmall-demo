package com.hackaton.appmall.presentacion.ui.createapp.choicesubcategory.view

import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.hackaton.appmall.databinding.FragmentCreateappChoicesubcategoryBinding
import com.hackaton.appmall.presentacion.BaseFragment
import com.hackaton.appmall.presentacion.ui.createapp.CreateAppViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CreateAppChoiceSubCategoryFragment : BaseFragment<FragmentCreateappChoicesubcategoryBinding>(
    FragmentCreateappChoicesubcategoryBinding::inflate
) {

    private val viewModel: CreateAppViewModel by activityViewModels()

    private var subCategorySelected: String? = null

    private val adapter: SubCategoryAdapter by lazy {
        SubCategoryAdapter{
            subCategorySelected = it
        }
    }

    override fun onViews() {
        binding.rvSubcategory.adapter = adapter
        binding.btnSubmit.setOnClickListener {
            subCategorySelected?.let {
                viewModel.setSubCategory(it)
                findNavController().navigate(
                    CreateAppChoiceSubCategoryFragmentDirections
                        .actionCreateAppChoiceSubCategoryFragmentToFormCreateAppFragment()
                )
            }
        }
    }

    override fun onViewModels() {

    }
}