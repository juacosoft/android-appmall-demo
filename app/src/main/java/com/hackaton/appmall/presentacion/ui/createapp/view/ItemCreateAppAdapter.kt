package com.hackaton.appmall.presentacion.ui.createapp.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hackaton.appmall.data.mock.MockMenusCreateButton
import com.hackaton.appmall.databinding.ItemButtonCreateappstartBinding
import com.hackaton.appmall.presentacion.ui.createapp.data.models.ItemButtonsCreate

class ItemCreateAppAdapter: RecyclerView.Adapter<ItemCreateAppAdapter.ItemsViewHolder>(){

    private var items: List<ItemButtonsCreate> = MockMenusCreateButton.getMenus()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemsViewHolder =
        ItemsViewHolder(
            ItemButtonCreateappstartBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    override fun onBindViewHolder(holder: ItemsViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int = items.size

    inner class ItemsViewHolder (
        private var itemBinding: ItemButtonCreateappstartBinding
    ) : RecyclerView.ViewHolder(itemBinding.root) {
        fun bind(item: ItemButtonsCreate) {
            item.image?.let {
                itemBinding.BCimageView.setImageResource(it)
            }
            itemBinding.tvTitleCreateAnApp.text = item.title
            itemBinding.tvParagraphCreateAnApp.text = item.subTitle
        }
    }
}