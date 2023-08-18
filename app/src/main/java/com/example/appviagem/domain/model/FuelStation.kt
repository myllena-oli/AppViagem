package com.example.appviagem.domain.model

class FuelStation () {
    private lateinit var name : String
    private var price = 0.0
    private  lateinit var city: String
    constructor(name : String, price : Double, city : String) : this(){
        this.name = name
        this.price = price
        this.city = city
    }
}