package com.example.appviagem.application.viewmodel

import com.example.appviagem.application.FuelStationUseCase
import com.example.appviagem.domain.model.FuelStation

class FuelStationViewModel(private val useCase: FuelStationUseCase) {
    private var fuelStationList = mutableListOf<FuelStation>()

    fun addFuelStation(name : String, price : Double, city : String){
        val fuelStationObject = FuelStation(name, price, city)

        useCase.addFuelStation(fuelStationObject, fuelStationList)

    }

    fun viewListFuelStation(list: MutableList<FuelStation>){
        for (item in list){
            println("nome: ${item.name}, preço: ${item.price}, cidade: ${item.city}")
        }
    }
}