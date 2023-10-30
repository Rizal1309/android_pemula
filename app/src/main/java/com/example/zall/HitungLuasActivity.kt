package com.example.zall

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText




class HitungLuasActivity : AppCompatActivity() {
    private lateinit var lebarEditText :TextInputEditText
    private lateinit var panjangEditText: TextInputEditText
    private lateinit var tinggiEditText: TextInputEditText
    private lateinit var hitungButton : Button
    private lateinit var hasilTextView : TextView

    private fun initKomponen(){
        lebarEditText = findViewById(R.id.lebarEditText)
        panjangEditText = findViewById(R.id.panjangEditText)
        tinggiEditText = findViewById(R.id.tinggiEditText)
        hitungButton = findViewById(R.id.hitungButton)
        hasilTextView = findViewById(R.id.hasilTextView)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hitung_luas)
        initKomponen()
        hitungButton.setOnClickListener{
            val lebar = lebarEditText.text.toString().toInt()
            val panjang = panjangEditText.text.toString().toInt()
            val tinggi = tinggiEditText.text.toString().toInt()

            val hasil = panjang * lebar * tinggi
            hasilTextView.text = hasil.toString()
        }

    }
}