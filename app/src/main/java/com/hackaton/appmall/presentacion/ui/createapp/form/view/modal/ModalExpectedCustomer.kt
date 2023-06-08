package com.hackaton.appmall.presentacion.ui.createapp.form.view.modal

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.hackaton.appmall.databinding.BottomSheetExpectedcustomerBinding

class ModalExpectedCustomer: BottomSheetDialogFragment() {

    private var listener: ModalStoreLocationListener? = null
    private var _binding : BottomSheetExpectedcustomerBinding? = null
    private val binding get() = _binding!!

    override fun onAttach(context: Context) {
        super.onAttach(context)
        listener = context as? ModalStoreLocationListener
    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding  = BottomSheetExpectedcustomerBinding.inflate(
            LayoutInflater.from(context)
        )
        return binding.root
    }

    companion object {
        const val TAG = "ModalStoreLocation"
    }
}