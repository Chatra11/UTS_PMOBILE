package com.example.utsmobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.utsmobile.Data.DataDino
import com.example.utsmobile.adapter.Dinoadapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mysetdino = DataDino().loadDino()

        val recyclerView = findViewById<RecyclerView>(R.id.recyler_view)
        recyclerView.adapter = Dinoadapter(this, mysetdino)

        recyclerView.setHasFixedSize(true)
    }
}