package com.hackaton.appmall.presentacion.ui.createapp.form.view

import androidx.fragment.app.activityViewModels
import com.hackaton.appmall.databinding.FragmentFormCreateAppBinding
import com.hackaton.appmall.presentacion.BaseFragment
import com.hackaton.appmall.presentacion.ui.createapp.CreateAppViewModel
import com.hackaton.appmall.presentacion.ui.createapp.form.data.StoreLocationModel
import com.hackaton.appmall.presentacion.ui.createapp.form.view.modal.ModalChoiceStyle
import com.hackaton.appmall.presentacion.ui.createapp.form.view.modal.ModalExpectedCustomer
import com.hackaton.appmall.presentacion.ui.createapp.form.view.modal.ModalStoreLocation
import com.hackaton.appmall.presentacion.ui.selecttemplate.view.SelectTemplateActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FormCreateAppFragment :BaseFragment<FragmentFormCreateAppBinding>(
    FragmentFormCreateAppBinding::inflate
), ModalStoreLocation.OnModalStoreLocationListener,
    ModalExpectedCustomer.ModalExpectedCustomerListener,
    ModalChoiceStyle.ModalChoiceStyleListener {

    private val createAppViewModel: CreateAppViewModel by activityViewModels()

    private var storeLocationModel: StoreLocationModel? = null
    private var expectedCustomer: List<String>? = null
    private var styleSelected: String? = null

    override fun onViews() {
        with(binding){
            btnStoreLocation.setOnClickListener {
                ModalStoreLocation().show(childFragmentManager, ModalStoreLocation.TAG)
            }
            btnExpectedTypeOfCustomers.setOnClickListener {
                ModalExpectedCustomer().show(childFragmentManager, ModalExpectedCustomer.TAG)
            }

            btnChooseAStyle.setOnClickListener {
                ModalChoiceStyle().show(childFragmentManager, ModalChoiceStyle.TAG)
            }
            binding.btnSubmit.setOnClickListener {
                createAppViewModel.setFinishStep(
                    storeLocationModel = storeLocationModel,
                    expectedCustomer = expectedCustomer?: emptyList(),
                    styleTemplate = styleSelected?: ""
                )
                requireActivity().startActivity(SelectTemplateActivity.createIntent(requireContext()))
            }
        }

    }

    override fun onViewModels() {

    }

    override fun onClickOk(data: StoreLocationModel) {
        storeLocationModel = data
    }

    override fun onClickOk(styleSelected: List<String>) {
        expectedCustomer = styleSelected
    }

    override fun onClick(style: String) {
        styleSelected = style
    }
}