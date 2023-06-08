package com.hackaton.appmall.presentacion.ui.createapp.form.view

import com.hackaton.appmall.databinding.FragmentFormCreateAppBinding
import com.hackaton.appmall.presentacion.BaseFragment
import com.hackaton.appmall.presentacion.ui.createapp.form.view.modal.ModalExpectedCustomer
import com.hackaton.appmall.presentacion.ui.createapp.form.view.modal.ModalStoreLocation
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FormCreateAppFragment :BaseFragment<FragmentFormCreateAppBinding>(
    FragmentFormCreateAppBinding::inflate
){
    override fun onViews() {
        with(binding){
            btnStoreLocation.setOnClickListener {
                ModalStoreLocation().show(childFragmentManager, ModalStoreLocation.TAG)
            }
            btnExpectedTypeOfCustomers.setOnClickListener {
                ModalExpectedCustomer().show(childFragmentManager, ModalExpectedCustomer.TAG)
            }
        }

    }

    override fun onViewModels() {

    }
}