package com.app.simpleadapter.ui.adapter

import com.airbnb.epoxy.CarouselModel_
import com.airbnb.epoxy.EpoxyController
import com.app.simpleadapter.data.Items
import com.app.simpleadapter.data.ItemsHeader

class EpoxyItemsController(
    private val onClicked:(Items) ->Unit,
):EpoxyController() {


    var club: List<Items> = emptyList()
        set(value){
            field = value
            requestModelBuild()
        }

    var players : List<Items> = emptyList()
        set(value){
            field = value
            requestModelBuild()
        }

    var header : List<ItemsHeader> = emptyList()
        set(value){
            field = value
            requestModelBuild()
        }

    override fun buildModels() {
        header.filter { it.id == 0 }.map { ItemsHeaderModel(it).id(it.id).addTo(this) }
        club.map { ItemsEpoxyModel(it, onClicked).id(it.id).addTo(this) }
        header.filter { it.id == 1 }.map { ItemsHeaderModel(it).id(it.id).addTo(this) }
        val laLiga = players.map { ItemsLaLigaClubs(it, onClicked).id(it.id) }
        CarouselModel_()
            .id("Players")
            .models(laLiga)
            .addTo(this)
    }
}