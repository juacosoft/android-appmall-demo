package com.hackaton.appmall.presentacion.ui.createapp.form.view.modal

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.hackaton.appmall.databinding.BottomSheetChoicestyleBinding
import com.hackaton.appmall.presentacion.ui.createapp.choicesubcategory.data.SubCategoryItem
import com.hackaton.appmall.presentacion.ui.createapp.choicesubcategory.view.SubCategoryAdapter

class ModalChoiceStyle : BottomSheetDialogFragment() {

    private var _binding : BottomSheetChoicestyleBinding? = null
    private val binding get() = _binding!!
    private var listener : ModalChoiceStyleListener? = null
    private var styleSelected:String? = null
    private val adapter: SubCategoryAdapter by lazy {
        SubCategoryAdapter(onItemClick = {
            styleSelected = it
        }, items = listOf(
            SubCategoryItem("Material Design"),
            SubCategoryItem("Flat Design"),
            SubCategoryItem("Neumorphism"),
            SubCategoryItem("Skeumorphism"),
            SubCategoryItem("Minimalist Design"),
            SubCategoryItem("Classic")
        ))
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        listener = context as? ModalChoiceStyleListener
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
        _binding = BottomSheetChoicestyleBinding.inflate(
            LayoutInflater.from(context)
        )
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.rvStorelocation.adapter = adapter
        binding.btnSubmit.setOnClickListener {
            styleSelected?.let {
                listener?.onClick(it)
            }
            dismiss()
        }
    }

    companion object {
        const val TAG = "ModalChoiceStyle"
    }

    interface ModalChoiceStyleListener {
        fun onClick(style: String)
    }
}