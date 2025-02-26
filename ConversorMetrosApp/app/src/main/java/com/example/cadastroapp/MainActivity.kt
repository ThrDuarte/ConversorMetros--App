package com.example.cadastroapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val tmetros = findViewById<EditText>(R.id.edtmetros)
        val btnEnviar = findViewById<Button>(R.id.btnEnviar)
        val tvTxv = findViewById<TextView>(R.id.tv_txv) // Adicionando TextView para exibir os dados

        btnEnviar.setOnClickListener {
            // Obtendo os valores inseridos nos EditTexts
            val metros = Integer.parseInt(tmetros.text.toString())

            val cm = metros * 100


            // Exibindo os dados no TextView
            tvTxv.text = "Centímetros: ${cm}"
        }
    }
}


