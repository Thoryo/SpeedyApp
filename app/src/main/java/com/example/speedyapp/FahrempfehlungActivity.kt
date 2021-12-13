package com.example.speedyapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class FahrempfehlungActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fahrempfehlung)
        val card_fahrempfehlung_metronom: CardView = findViewById(R.id.card_fahrempfehlung_metronom)

        card_fahrempfehlung_metronom.setOnClickListener() {
            val intent = Intent(this, FahrempfmeActivity::class.java)
            startActivity(intent)
        }
        val card_fahrempfehlung_enno: CardView = findViewById(R.id.card_fahrempfehlung_enno)

        card_fahrempfehlung_enno.setOnClickListener() {
            val intent = Intent(this, FahrempfEnnoActivity::class.java)
            startActivity(intent)
        }
    }
}