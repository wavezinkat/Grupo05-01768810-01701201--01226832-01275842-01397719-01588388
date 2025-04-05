package com.example.contador_numerico

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompaT
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.floatingactionbutton.FloatingActionButton  // <--- ######## INCLUIR ESTE IMPORT

class MainActivity : AppCompatActivity() {
	 private var count = 0  // <--- ######### INCLUIR VARIAVEL COUNT

    @SuppressLint("MissingInflatedId") // <--- ######### INCLUIR
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


	button.setOnClickListener{    	// <--- ######### INCLUIR
            count++			// <--- ######### INCLUIR
            countText.text = count.toString()	// <--- ######### INCLUIR
        }				// <--- ######### INCLUIR

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
