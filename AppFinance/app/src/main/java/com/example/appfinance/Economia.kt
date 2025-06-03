package com.example.appfinance

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.appfinance.databinding.ActivityEconomiaBinding


class Economia : AppCompatActivity() {
    private lateinit var binding: ActivityEconomiaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



        binding = ActivityEconomiaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.iconePlus.setOnClickListener{
            var intent = Intent(this, IncluirGastoVariado::class.java)
            startActivity(intent)
        }
        binding.iconeHome.setOnClickListener{
            var intent = Intent(this, Home::class.java)
            startActivity(intent)
        }
        binding.iconeGeral.setOnClickListener{
            var intent = Intent(this, Geral::class.java)
            startActivity(intent)
        }
        binding.iconePerfil.setOnClickListener{
            var intent = Intent(this, Perfil::class.java)
            startActivity(intent)
        }


        findViewById<ImageButton>(R.id.edit1).setOnClickListener {
            var DialogBuilder = AlertDialog.Builder(this@Economia)

            DialogBuilder.setMessage("Excluir?")
            DialogBuilder.setCancelable(false)
            DialogBuilder.setPositiveButton("yes") {_,_ ->
                finish()
            }
            DialogBuilder.show()
        }
    }
}