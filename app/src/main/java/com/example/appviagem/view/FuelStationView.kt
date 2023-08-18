package com.example.appviagem.view

import com.example.appviagem.application.viewmodel.FuelStationViewModel
import com.example.appviagem.domain.model.FuelStation

class FuelStationView() {

    private lateinit var fuelStationViewModel: FuelStationViewModel

    fun viewAddFuelStation(fuelStationMutableList: MutableList<FuelStation>): MutableList<FuelStation>{
        fuelStationViewModel.addFuelStation("Posto Energia",5.53, "São Paulo-SP")
        fuelStationViewModel.addFuelStation("AutoPetro",5.53, " Rio de Janeiro-RJ")
        fuelStationViewModel.addFuelStation("SuperGasolina",5.53, "Belo Horizonte-MG")
        fuelStationViewModel.addFuelStation("Combustível Rápido",5.53, "Curitiba-PR")
        fuelStationViewModel.addFuelStation("EcoFlex Postos",5.53, "Porto Alegre-RS")
        fuelStationViewModel.addFuelStation("CombustívelTop",5.53, "Fortaleza-CE")
        fuelStationViewModel.addFuelStation("PetroBrasilia",5.53, " Brasília-DF")
        fuelStationViewModel.addFuelStation("Posto Vitória",5.53, "Recife-PE")
        fuelStationViewModel.addFuelStation("Abastecimento Total",5.53, "Salvador-BA")
        fuelStationViewModel.addFuelStation("Posto Solar",5.53, " Florianópolis-SC")
        return fuelStationMutableList
    }
}