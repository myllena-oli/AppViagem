package com.example.appviagem.application

import com.example.appviagem.domain.model.FuelStation

class FuelStationUseCase (private val fuelStation: FuelStation){

    fun addFuelStation(fuelStationObject: FuelStation, fuelStationList: MutableList<FuelStation>): MutableList<FuelStation>{
        return fuelStation.addFuelStation(fuelStationObject, fuelStationList)
    }
}