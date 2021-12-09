package com.example.speedyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class FahrempfmeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fahrempfme)

        val card_re2hghh: CardView = findViewById (R.id.card_re2hghh)

        card_re2hghh.setOnClickListener() {
            val intent = Intent(this, Re2HghhActivity::class.java)
            startActivity(intent)
        }
        val card_re2hhhg: CardView = findViewById (R.id.card_re2hhhg)

        card_re2hhhg.setOnClickListener() {
            val intent = Intent(this, Re2hhhgActivity::class.java)
            startActivity(intent)
        }
        val card_re4hbah: CardView = findViewById (R.id.card_re4hbah)

        card_re4hbah.setOnClickListener() {
            val intent = Intent(this, Re4hbahActivity::class.java)
            startActivity(intent)
        }
        val card_re4ahhb: CardView = findViewById (R.id.card_re4ahhb)

        card_re4ahhb.setOnClickListener() {
            val intent = Intent(this, Re4ahhbActivity::class.java)
            startActivity(intent)
        }
        val card_rb41hbah: CardView = findViewById (R.id.card_rb41hbah)

        card_rb41hbah.setOnClickListener() {
            val intent = Intent(this, Rb41hbahActivity::class.java)
            startActivity(intent)
        }
        val card_rb41ahhb: CardView = findViewById (R.id.card_rb41ahhb)

        card_rb41ahhb.setOnClickListener() {
            val intent = Intent(this, Rb41ahhbActivity::class.java)
            startActivity(intent)
        }
        val card_re3ahhu: CardView = findViewById (R.id.card_re3ahhu)

        card_re3ahhu.setOnClickListener() {
            val intent = Intent(this, Re3ahhuActivity::class.java)
            startActivity(intent)
        }
        val card_re3huah: CardView = findViewById (R.id.card_re3huah)

        card_re3huah.setOnClickListener() {
            val intent = Intent(this, Re3huahActivity::class.java)
            startActivity(intent)
        }
        val card_re2hhhu: CardView = findViewById (R.id.card_re2hhhu)

        card_re2hhhu.setOnClickListener() {
            val intent = Intent(this, Re2hhhuActivity::class.java)
            startActivity(intent)
        }
        val card_re2huhh: CardView = findViewById (R.id.card_re2huhh)

        card_re2huhh.setOnClickListener() {
            val intent = Intent(this, Re2huhhActivity::class.java)
            startActivity(intent)
        }
        val card_rb31huah: CardView = findViewById (R.id.card_rb31huah)

        card_rb31huah.setOnClickListener() {
            val intent = Intent(this, Rb31huahActivity::class.java)
            startActivity(intent)
        }
        val card_rb31ahhu: CardView = findViewById (R.id.card_rb31ahhu)

        card_rb31ahhu.setOnClickListener() {
            val intent = Intent(this, Rb31ahhuActivity::class.java)
            startActivity(intent)
        }
    }
}