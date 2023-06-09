package com.hackaton.appmall.presentacion.ui.createapp.form.view.modal

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.hackaton.appmall.databinding.BottomSheetStorelocationBinding
import com.hackaton.appmall.presentacion.ui.createapp.form.data.StoreLocationModel

class ModalStoreLocation : BottomSheetDialogFragment() {

    private var listener: OnModalStoreLocationListener? = null

    private var _binding: BottomSheetStorelocationBinding? = null
    private val binding get() = _binding!!

    override fun onAttach(context: Context) {
        super.onAttach(context)
        listener = context as? OnModalStoreLocationListener
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
        _binding = BottomSheetStorelocationBinding.inflate(
            LayoutInflater.from(context)
        )
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnSubmit.setOnClickListener {
            val storeLocationModel = StoreLocationModel(
                country = binding.tfcountry.editText?.text.toString(),
                city = binding.tfCity.editText?.text.toString(),
                address = binding.tfaddress.editText?.text.toString(),
                zipCode = binding.tfZipCode.editText?.text.toString(),
                email = binding.tfEmail.editText?.text.toString(),
                webSite = binding.tfWebSite.editText?.text.toString(),
                isGlobal = binding.cbIsGlobal.isChecked
            )
            listener?.onClickOk(storeLocationModel)
            dismiss()
        }
    }

    companion object {
        const val TAG = "ModalStoreLocation"
    }

    interface OnModalStoreLocationListener {
        fun onClickOk(data: StoreLocationModel)

    }
}