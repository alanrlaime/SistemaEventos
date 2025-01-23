package com.example.mango

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import com.example.mango.databinding.ActivityMainBinding


import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var editTextInput: EditText
    private lateinit var buttonSubmit: Button
    private lateinit var textViewOutput: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inicializar las vistas
        editTextInput = findViewById(R.id.editTextInput)
        buttonSubmit = findViewById(R.id.buttonSubmit)
        textViewOutput = findViewById(R.id.textViewOutput)

        // Configurar el botón para que muestre el texto al hacer clic
        buttonSubmit.setOnClickListener {
            val inputText = editTextInput.text.toString()
            textViewOutput.text = inputText
        }
    }
}
