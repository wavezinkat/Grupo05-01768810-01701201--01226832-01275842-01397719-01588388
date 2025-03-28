package com.example.login_cadastro

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.login_cadastro.databinding.ActivityUsernameBinding

class Username : AppCompatActivity() {
    private lateinit var binding: ActivityUsernameBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityUsernameBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.addButton.setOnClickListener{
            var intent = Intent(this, Create::class.java)
            startActivity(intent)
        }
        binding.buttonLogout.setOnClickListener{
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        }
    }
