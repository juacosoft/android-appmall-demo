package com.hackaton.appmall.presentacion.ui.createapp.form.view.modal

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.hackaton.appmall.databinding.BottomSheetExpectedcustomerBinding

class ModalExpectedCustomer: BottomSheetDialogFragment() {

    private var listener: ModalExpectedCustomerListener? = null
    private var _binding : BottomSheetExpectedcustomerBinding? = null
    private val binding get() = _binding!!

    private val listExpecteCustomer:MutableList<String> = mutableListOf()

    override fun onAttach(context: Context) {
        super.onAttach(context)
        listener = context as? ModalExpectedCustomerListener
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

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding){
            btnSubmit.setOnClickListener {
                if(cbAge1830.isChecked) {
                    listExpecteCustomer.add(cbAge1830.text.toString())
                }
                if(cbAge3140.isChecked) {
                    listExpecteCustomer.add(cbAge3140.text.toString())
                }
                if(cbAge4150.isChecked) {
                    listExpecteCustomer.add(cbAge4150.text.toString())
                }
                if(cblocalCustomer.isChecked) {
                    listExpecteCustomer.add(cblocalCustomer.text.toString())
                }
                if(cbinternacionalCustomer.isChecked) {
                    listExpecteCustomer.add(cbinternacionalCustomer.text.toString())
                }
                listener?.onClickOk(listExpecteCustomer)
                dismiss()
            }
        }
    }

    companion object {
        const val TAG = "ModalExpectedCustomer"
    }

    interface ModalExpectedCustomerListener {
        fun onClickOk(styleSelected: List<String>)
    }
}