package com.example.login_cadastro

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.login_cadastro.databinding.ActivityCadastroBinding

class Cadastro : AppCompatActivity() {
    private lateinit var binding: ActivityCadastroBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCadastroBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.returnButton.setOnClickListener{
            var intent = Intent(this, Login::class.java)
            startActivity(intent)
        }

        binding.registerButton.setOnClickListener{
            var intent = Intent(this, Username::class.java)
            startActivity(intent)
        }
    }
}