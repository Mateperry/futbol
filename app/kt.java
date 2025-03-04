package com.mateocastro.futbol.RegistroActivity;


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class RegistroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)

        val etNombre = findViewById<EditText>(R.id.etNombre)
                val etEquipo = findViewById<EditText>(R.id.etEquipo)
                val btnRegistrar = findViewById<Button>(R.id.btnRegistrar)

                btnRegistrar.setOnClickListener {
            val nombre = etNombre.text.toString()
            val equipo = etEquipo.text.toString()

            val intent = Intent(this, ConfirmacionActivity::class.java)
            intent.putExtra("NOMBRE", nombre)
            intent.putExtra("EQUIPO", equipo)
            startActivity(intent)
        }
    }
}
