package com.example.appfinance

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.appfinance.databinding.ActivityCadastroBinding

class Cadastro : AppCompatActivity() {
    private lateinit var binding: ActivityCadastroBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityCadastroBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textLogin.setOnClickListener{
            var intent = Intent(this, Cadastro::class.java)
            startActivity(intent)
        }
        binding.registerButton.setOnClickListener{
            var intent = Intent(this, Home::class.java)
            startActivity(intent)

        }
    }
}