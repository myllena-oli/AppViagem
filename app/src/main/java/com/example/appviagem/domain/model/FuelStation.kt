package com.example.appviagem.domain.model

class FuelStation() {
    lateinit var name: String
    var price = 0.0
    lateinit var city: String

    constructor(name: String, price: Double, city: String) : this() {
        this.name = name
        this.price = price
        this.city = city
    }

    fun addFuelStation(
        fuelStation: FuelStation,
        fuelStationList: MutableList<FuelStation>
    ): Boolean {
        return fuelStationList.add(fuelStation)
    }
}