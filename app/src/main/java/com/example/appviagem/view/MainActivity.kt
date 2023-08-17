package com.example.appviagem.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.appviagem.R
import com.example.appviagem.application.FuelCalculatorUseCase
import com.example.appviagem.application.viewmodel.FuelCalculatorViewModel
import com.example.appviagem.databinding.ActivityMainBinding
import com.example.appviagem.domain.model.FuelCalculator

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onClick(view: View) {
        if (view.id == R.id.buton_calculate) {
            calculate()
        }
    }
//
    private fun isValid(): Boolean {
        return (binding.distance.text.toString() != ""
                && binding.editPrince.text.toString() != ""
                && binding.editAutonomy.text.toString() != ""
                && binding.editAutonomy.text.toString().toFloat() != 0f)
    }

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: FuelCalculatorViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fuelCalculator = FuelCalculator()
        val fuelCalculatorUseCase = FuelCalculatorUseCase(fuelCalculator)
        viewModel = FuelCalculatorViewModel(fuelCalculatorUseCase)

        binding.butonCalculate.setOnClickListener {
            calculate()
        }

        viewModel.totalValue.observe(this) { totalValue ->
            binding.textTotalValue.text = totalValue
        }
    }

    private fun calculate() {
        if (isValid()) {
            val distance = binding.distance.text.toString().toFloat()
            val price = binding.editPrince.text.toString().toFloat()
            val autonomy = binding.editAutonomy.text.toString().toFloat()

            viewModel.calculateTotalValue(distance, price, autonomy)
        } else {
            Toast.makeText(this, R.string.validation, Toast.LENGTH_SHORT).show()
        }
    }

}