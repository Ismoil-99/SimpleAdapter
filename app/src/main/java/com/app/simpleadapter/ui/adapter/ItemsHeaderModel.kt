package com.app.simpleadapter.ui.adapter

import com.app.simpleadapter.R
import com.app.simpleadapter.data.ItemsHeader
import com.app.simpleadapter.databinding.HeaderItemBinding
import com.app.simpleadapter.epoxy.ViewBindingKotlinModel

class ItemsHeaderModel(
    val headers:ItemsHeader
):ViewBindingKotlinModel<HeaderItemBinding>(R.layout.header_item) {
    override fun HeaderItemBinding.bind() {
        nameHeader.text = headers.nameHeader
        headerLogo.setImageResource(headers.logo)
    }
}