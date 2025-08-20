package com.example.mango

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var buttonSubmit: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Asegúrate de que este es el layout correcto

        // Inicializa el botón
        buttonSubmit = findViewById(R.id.buttonSubmit)

        // Configura el listener para el botón
        buttonSubmit.setOnClickListener {
            // Acción al hacer clic
            Toast.makeText(this, "Botón presionado", Toast.LENGTH_SHORT).show()
        }
    }
}
