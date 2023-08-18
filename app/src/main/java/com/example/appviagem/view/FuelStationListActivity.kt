package com.example.appviagem.view
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.example.appviagem.R
import com.example.appviagem.application.viewmodel.FuelStationViewModel
import com.example.appviagem.domain.model.FuelStation

class FuelStationListActivity : AppCompatActivity() {
private val fuelStationViewModel = FuelStationView()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fuel_station_list)

        val listView: ListView = findViewById(R.id.listView)
        var fuelStationList = mutableListOf<FuelStation>()
        fuelStationList = fuelStationViewModel.viewAddFuelStation(fuelStationList)

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, fuelStationList)
        listView.adapter = adapter
    }
}

