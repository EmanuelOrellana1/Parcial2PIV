package com.example.ejerciciop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var tv_mostrar: TextView
    private lateinit var lv_Lista: ListView

    private val animal = arrayOf("Perro", "Oso", "Tigre", "Raton")
    private val especie = arrayOf("Canino", "Salvaje", "Felino", "Roedor")
    private val color = arrayOf("Cafe", "Castaño", "Negro", "Blanco", "")
    private val sexo = arrayOf("Macho", "Hembra")
    private val peso = arrayOf("10.0k", "50.0k", "30.0k", "1.0k")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv_mostrar = findViewById(R.id.tv_mostrar)
        lv_Lista = findViewById(R.id.lv_Lista)

        val adaptador = ArrayAdapter(this, android.R.layout.simple_list_item_1, animal)
        lv_Lista.adapter = adaptador


        lv_Lista.setOnItemClickListener { adapterView, view, i, l ->
            tv_mostrar.setText("El animal que ha selecionado es:  " + lv_Lista.getItemAtPosition(i) + " La especie de el aniamal es: " + especie[i]+ lv_Lista.getItemAtPosition(i)
                    + "El sexo de el aniaml es:" + sexo[i] + lv_Lista.getItemAtPosition(i)+ "El peso del animal es: " +peso[i]+lv_Lista.getItemAtPosition(i))
        }


    }
}