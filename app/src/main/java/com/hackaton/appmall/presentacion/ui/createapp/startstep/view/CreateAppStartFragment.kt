package com.hackaton.appmall.presentacion.ui.createapp.startstep.view

import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.hackaton.appmall.databinding.FragmentCreateAppstartBinding
import com.hackaton.appmall.presentacion.BaseFragment
import com.hackaton.appmall.presentacion.ui.createapp.CreateAppViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CreateAppStartFragment : BaseFragment<FragmentCreateAppstartBinding> (
    FragmentCreateAppstartBinding::inflate
) {

    private val activityViewModel: CreateAppViewModel by activityViewModels()

    private val adapterMenuCreate: ItemCreateAppAdapter by lazy {
        ItemCreateAppAdapter()
    }

    override fun onViews() {
        val linearLayoutManager = LinearLayoutManager(context)
        linearLayoutManager.orientation = LinearLayoutManager.VERTICAL
        with(binding.rvCreateApp) {
            adapter = adapterMenuCreate
            layoutManager = linearLayoutManager
        }

    }

    override fun onViewModels() {

    }
}