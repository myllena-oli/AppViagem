package com.example.appviagem.domain.model

class FuelCalculator {
    fun calculateTotalValue(distance: Float, price: Float, autonomy: Float): Float {
        return (distance * price) / autonomy
    }
}