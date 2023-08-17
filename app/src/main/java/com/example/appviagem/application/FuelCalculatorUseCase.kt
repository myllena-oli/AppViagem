package com.example.appviagem.application

import com.example.appviagem.domain.model.FuelCalculator

class FuelCalculatorUseCase(private val fuelCalculator: FuelCalculator) {
    fun calculateTotalValue(distance: Float, price: Float, autonomy: Float): Float {
        return fuelCalculator.calculateTotalValue(distance, price, autonomy)
    }
}