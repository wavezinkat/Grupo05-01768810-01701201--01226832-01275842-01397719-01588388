package com.example.appfinance

import android.app.DatePickerDialog
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.DatePicker
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.appfinance.databinding.ActivityIncluirGastoVariadoBinding
import java.util.Calendar

class IncluirGastoVariado : AppCompatActivity(){
    private lateinit var binding: ActivityIncluirGastoVariadoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIncluirGastoVariadoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setContentView(R.layout.activity_incluir_gasto_variado)

        binding.fixoButton.setOnClickListener{
            var intent = Intent(this, IncluirGastoFixo::class.java)
            startActivity(intent)
            }
            val calendar = Calendar.getInstance()
            val year = calendar.get(Calendar.YEAR)
            val month = calendar.get(Calendar.MONTH)
            val dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH)
            var test = findViewById<EditText>(R.id.campo_data)
            test.setOnClickListener {
                DatePickerDialog(this,{ _: DatePicker, year: Int, monthOfYear: Int, dayOfMonth: Int ->
                    var monthView = if (monthOfYear + 1 < 10) {
                        "0${monthOfYear + 1}"
                    } else {
                        "${monthOfYear + 1}"
                    }

                    val selectedDate = "${if(dayOfMonth < 10) {
                        "0${dayOfMonth}"
                    } else {
                        dayOfMonth
                    }}/$monthView/$year"
                    test.setText(selectedDate)
                }, year, month, dayOfMonth
                    ).show()
            }


    }






}