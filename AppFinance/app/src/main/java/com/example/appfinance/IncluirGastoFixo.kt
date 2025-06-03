package com.example.appfinance

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.appfinance.databinding.ActivityIncluirGastoFixoBinding

class IncluirGastoFixo : AppCompatActivity() {
    private lateinit var binding: ActivityIncluirGastoFixoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIncluirGastoFixoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setContentView(R.layout.activity_incluir_gasto_fixo)

        binding.variadoButton.setOnClickListener{
            var intent = Intent(this, IncluirGastoVariado::class.java)
            startActivity(intent)
        }
    }
}

