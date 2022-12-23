package com.app.simpleadapter.ui.adapter

import com.app.simpleadapter.R
import com.app.simpleadapter.data.Items
import com.app.simpleadapter.databinding.ListLaligaBinding
import com.app.simpleadapter.epoxy.ViewBindingKotlinModel

data class ItemsLaLigaClubs(
    val items: Items,
    val onClicked:(Items) -> Unit
): ViewBindingKotlinModel<ListLaligaBinding>(R.layout.list_laliga){
    override fun ListLaligaBinding.bind() {
        nameClub.text = items.name
        logo.apply {
            setImageResource(items.icon)
            setOnClickListener {
                onClicked.invoke(items)
            }
        }
    }
}