package com.example.appfinance

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.appfinance.databinding.ActivityGeralBinding

class Geral : AppCompatActivity() {
    private lateinit var binding: ActivityGeralBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityGeralBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.iconePlus.setOnClickListener{
            var intent = Intent(this, IncluirGastoVariado::class.java)
            startActivity(intent)
        }
        binding.iconeEconomia.setOnClickListener{
            var intent = Intent(this, Economia::class.java)
            startActivity(intent)
        }
        binding.iconeHome.setOnClickListener{
            var intent = Intent(this, Home::class.java)
            startActivity(intent)
        }
        binding.iconePerfil.setOnClickListener{
            var intent = Intent(this, Perfil::class.java)
            startActivity(intent)
        }
    }
}