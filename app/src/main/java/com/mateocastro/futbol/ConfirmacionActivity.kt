package com.mateocastro.futbol

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class ConfirmacionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirmacion)

        val tvMensaje = findViewById<TextView>(R.id.tvMensaje)

        val nombre = intent.getStringExtra("NOMBRE")
        val equipo = intent.getStringExtra("EQUIPO")

        tvMensaje.text = "¡Bienvenido, $nombre!\nTu equipo es: $equipo"
    }
}
