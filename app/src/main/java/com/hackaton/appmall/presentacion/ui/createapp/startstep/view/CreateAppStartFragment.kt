package com.hackaton.appmall.presentacion.ui.createapp.startstep.view

import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.hackaton.appmall.databinding.FragmentCreateAppstartBinding
import com.hackaton.appmall.presentacion.BaseFragment
import com.hackaton.appmall.presentacion.ui.createapp.startstep.data.ButtomCreateAction
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CreateAppStartFragment : BaseFragment<FragmentCreateAppstartBinding> (
    FragmentCreateAppstartBinding::inflate
) {

    private val adapterMenuCreate: ItemCreateAppAdapter by lazy {
        ItemCreateAppAdapter { item ->
            when (item.action) {
                ButtomCreateAction.FROM_SCRATCH -> {
                    findNavController().navigate(CreateAppStartFragmentDirections.actionCreateAppStartFragmentToCreateAppChoiceTemFragment())
                }
                ButtomCreateAction.NO_ACTION -> Unit
            }
        }
    }

    override fun onViews() {
        val linearLayoutManager = LinearLayoutManager(context)
        linearLayoutManager.orientation = LinearLayoutManager.VERTICAL
        with(binding.rvCreateApp) {
            adapter = adapterMenuCreate
            layoutManager = linearLayoutManager
        }
    }

    override fun onViewModels() = Unit
}