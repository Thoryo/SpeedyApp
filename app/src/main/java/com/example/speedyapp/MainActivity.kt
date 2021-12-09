package com.example.speedyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val card_important_note: CardView = findViewById (R.id.card_important_note)

        card_important_note.setOnClickListener() {
            val intent = Intent(this, ImportantNoteActivity::class.java)
            startActivity(intent)
        }
        val card_grund: CardView = findViewById (R.id.card_grund)

        card_grund.setOnClickListener() {
            val intent = Intent(this, GrundActivity::class.java)
            startActivity(intent)
        }
        val card_messstelle: CardView = findViewById (R.id.card_messstelle)

        card_messstelle.setOnClickListener() {
            val intent = Intent(this, MessstelleActivity::class.java)
            startActivity(intent)
        }
        val card_klima: CardView = findViewById (R.id.card_klima)

        card_klima.setOnClickListener() {
            val intent = Intent(this, KlimaActivity::class.java)
            startActivity(intent)
        }
        val card_beleuchtung: CardView = findViewById (R.id.card_beleuchtung)

        card_beleuchtung.setOnClickListener() {
            val intent = Intent(this, BeleuchtungActivity::class.java)
            startActivity(intent)
        }
        val card_fahrempfehlung: CardView = findViewById (R.id.card_fahrempfehlung)

        card_fahrempfehlung.setOnClickListener() {
            val intent = Intent(this, FahrempfehlungActivity::class.java)
            startActivity(intent)
        }
        val card_reduzierung: CardView = findViewById (R.id.card_reduzierung)

        card_reduzierung.setOnClickListener() {
            val intent = Intent(this, ReduzierungActivity::class.java)
            startActivity(intent)
        }
        val speedyapp: ImageView = findViewById (R.id.speedyapp)

        speedyapp.setOnClickListener() {
            val intent = Intent(this, ImpressumActivity::class.java)
            startActivity(intent)
        }

    }
}