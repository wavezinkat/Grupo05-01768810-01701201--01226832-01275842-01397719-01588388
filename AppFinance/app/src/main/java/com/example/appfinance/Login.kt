package com.example.appfinance

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.appfinance.databinding.ActivityLoginBinding

class Login : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textCadastro.setOnClickListener{
            var intent = Intent(this, Cadastro::class.java)
            startActivity(intent)
        }
        binding.LoginButton.setOnClickListener{
            var intent = Intent(this, Home::class.java)
            startActivity(intent)
        }
    }
}