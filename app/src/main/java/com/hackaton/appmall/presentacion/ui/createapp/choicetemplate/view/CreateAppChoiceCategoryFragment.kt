package com.hackaton.appmall.presentacion.ui.createapp.choicetemplate.view

import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.AdapterView.OnItemSelectedListener
import android.widget.ArrayAdapter
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.hackaton.appmall.databinding.FragmentCreateappChoiceCategoryBinding
import com.hackaton.appmall.presentacion.BaseFragment
import com.hackaton.appmall.presentacion.ui.createapp.CreateAppViewModel
import com.hackaton.appmall.presentacion.ui.createapp.startstep.data.models.CategoryApp
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CreateAppChoiceCategoryFragment : BaseFragment<FragmentCreateappChoiceCategoryBinding> (
    FragmentCreateappChoiceCategoryBinding::inflate
) {

    private val activityViewModel: CreateAppViewModel by activityViewModels()

    val listSpinner = listOf(
        "No Selected",
        "Retail",
        "Delivery",
        "Streaming",
        "Gaming",
        "FSMP"
    )

    override fun onViews() {
        val adapterSpinner = ArrayAdapter(requireContext(), android.R.layout.simple_spinner_item, listSpinner)
        with(binding) {
            spCateogry.adapter = adapterSpinner
            spCateogry.onItemSelectedListener = object : OnItemSelectedListener {
                override fun onItemSelected(
                    parent: AdapterView<*>?,
                    view: View?,
                    position: Int,
                    id: Long
                ) {
                    btnSubmit.isEnabled = position != 0
                    Log.d(TAG, "onItemSelected: ${listSpinner[position]}")
                }

                override fun onNothingSelected(parent: AdapterView<*>?) = Unit
            }
            btnSubmit.setOnClickListener {
                val position = spCateogry.selectedItemPosition
                val categorySelected = CategoryApp(
                    name = listSpinner[position],
                    id = position
                )
                activityViewModel.setCategoryApp(categorySelected)
                findNavController().navigate(CreateAppChoiceCategoryFragmentDirections.actionCreateAppChoiceTemFragmentToCreateAppChoiceSubCategoryFragment())
            }
        }
    }

    override fun onViewModels() {

    }

    companion object {
        private const val TAG = "CreateAppChoiceCategor"
    }
}