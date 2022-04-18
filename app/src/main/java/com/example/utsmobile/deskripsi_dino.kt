package com.example.utsmobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.utsmobile.model.dino

class deskripsi_dino : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_deskripsi_dino)
        val judul = findViewById<TextView>(R.id.dino_title)
        val gambar = findViewById<ImageView>(R.id.gambar_dino)
        val desc = findViewById<TextView>(R.id.dinodesc)

        var mydata = intent.getSerializableExtra("deskripsi") as dino
        gambar.setImageResource(mydata?.gambardino!!)
        judul.text = mydata?.namadino.toString()
        desc.text = mydata?.descdino.toString()
    }
}