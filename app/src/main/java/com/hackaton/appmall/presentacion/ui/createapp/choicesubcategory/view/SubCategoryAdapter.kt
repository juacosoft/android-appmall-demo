package com.hackaton.appmall.presentacion.ui.createapp.choicesubcategory.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hackaton.appmall.R
import com.hackaton.appmall.databinding.ItemSubcategorylistBinding
import com.hackaton.appmall.presentacion.ui.createapp.choicesubcategory.data.SubCategoryItem

class SubCategoryAdapter (
    private val onItemClick: (String) -> Unit,
    private val items: List<SubCategoryItem>
) : RecyclerView.Adapter<SubCategoryAdapter.ViewHolder>() {

    var selectedItem: Int? = null


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
        ViewHolder(
            ItemSubcategorylistBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(holder) {
            val item = items[position]
            textView.text = item.text
            textView.setTextColor(
                if (selectedItem == adapterPosition) {
                    itemView.resources.getColor(R.color.primaryGreen)
                } else {
                    itemView.resources.getColor(R.color.monoGrey)
                }
            )
        }
    }

    override fun getItemCount(): Int = items.size

    inner class ViewHolder(
        private val itemBinding: ItemSubcategorylistBinding
    ): RecyclerView.ViewHolder(itemBinding.root){
        val textView = itemBinding.tvSubcategory
        init {
            itemBinding.root.setOnClickListener {
                onItemClick(items[adapterPosition].text)
                notifyItemChanged(selectedItem?: adapterPosition)
                selectedItem = adapterPosition
                notifyItemChanged(selectedItem?: adapterPosition)
            }
        }

    }
}