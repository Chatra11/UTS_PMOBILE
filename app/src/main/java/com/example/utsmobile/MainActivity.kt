package com.example.utsmobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.utsmobile.adapter.Dinoadapter
import com.example.utsmobile.databinding.ActivityMainBinding
import com.example.utsmobile.dinoViewHolder.MyDinoViewHolder
import com.example.utsmobile.model.dino
import java.io.Serializable



class MainActivity : AppCompatActivity() , LifecycleOwner{
    private lateinit var binding: ActivityMainBinding
    private lateinit var newDinoarraylist : ArrayList<dino>
    private lateinit var recyclerView: RecyclerView
    var recyclerViewAdapter: Dinoadapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        recyclerView = binding.recylerView

        var viewModel =ViewModelProvider(this).get(MyDinoViewHolder::class.java)
        viewModel?.dinoMutableLiveData.observe(this ,dinoListUpdateObserver)

//        var adapter = Dinoadapter(this,newDinoarraylist)
//        recyclerView.adapter = adapter
//
//        adapter.setOnClickListener(object : Dinoadapter.onItemClickListener{
//            override fun onItemClick(posisi: Int) {
//                val intent = Intent(this@MainActivity,deskripsi_dino::class.java)
//                intent.putExtra("deskripsi",newDinoarraylist[posisi] as Serializable)
//                startActivity(intent)
//            }
//        })

        recyclerView.setHasFixedSize(true)
    }
    var dinoListUpdateObserver : Observer<ArrayList<dino>?> =
        Observer<ArrayList<dino>?> { dinoArrayList ->
            recyclerViewAdapter = Dinoadapter(this@MainActivity, dinoArrayList)
            recyclerView!!.layoutManager = LinearLayoutManager(this@MainActivity)
            recyclerView!!.adapter = recyclerViewAdapter
        }
}