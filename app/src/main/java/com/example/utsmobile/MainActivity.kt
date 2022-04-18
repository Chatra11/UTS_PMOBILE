package com.example.utsmobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.utsmobile.Data.DataDino
import com.example.utsmobile.adapter.Dinoadapter
import java.io.Serializable

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mysetdino = DataDino.dataDino
        val recyclerView = findViewById<RecyclerView>(R.id.recyler_view)
        var adapter  = Dinoadapter(this, mysetdino)
        recyclerView.adapter = adapter

        adapter.setOnClickListener(object : Dinoadapter.onItemClickListener{
            override fun onItemClick(posisi: Int) {
                val intent = Intent(this@MainActivity,deskripsi_dino::class.java)
                intent.putExtra("deskripsi",mysetdino[posisi] as Serializable)
                startActivity(intent)
            }

        })
        recyclerView.setHasFixedSize(true)

    }
}