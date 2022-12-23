package com.app.simpleadapter.ui.adapter

import com.app.simpleadapter.R
import com.app.simpleadapter.data.Items
import com.app.simpleadapter.databinding.ListPriemerBinding
import com.app.simpleadapter.epoxy.ViewBindingKotlinModel

data class ItemsEpoxyModel(
    val items: Items,
    val onClicked:(Items) -> Unit
):ViewBindingKotlinModel<ListPriemerBinding>(R.layout.list_priemer){
    override fun ListPriemerBinding.bind() {
        name.text = items.name
        iconsClubs.apply {
            setImageResource(items.icon)
            setOnClickListener {
                onClicked.invoke(items)
            }
        }
    }
}