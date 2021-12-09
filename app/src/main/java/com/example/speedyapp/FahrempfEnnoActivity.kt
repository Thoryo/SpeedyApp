package com.example.speedyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class FahrempfEnnoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fahrempf_enno)
        val enno_hhihwob: CardView = findViewById (R.id.enno_hhihwob)

        enno_hhihwob.setOnClickListener() {
            val intent = Intent(this, Re50hhihwobActivity::class.java)
            startActivity(intent)
        }
        val enno_hhhwob: CardView = findViewById (R.id.enno_hhhwob)

        enno_hhhwob.setOnClickListener() {
            val intent = Intent(this, Re30hhhwobActivity::class.java)
            startActivity(intent)
        }
        val enno_hwobhhi: CardView = findViewById (R.id.enno_hwobhhi)

        enno_hwobhhi.setOnClickListener() {
            val intent = Intent(this, Re50hwobhhiActivity::class.java)
            startActivity(intent)
        }
        val enno_hwobhh: CardView = findViewById (R.id.enno_hwobhh)

        enno_hwobhh.setOnClickListener() {
            val intent = Intent(this, Re30hwobhhActivity::class.java)
            startActivity(intent)
        }
    }
}