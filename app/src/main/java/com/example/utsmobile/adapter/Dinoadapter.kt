package com.example.utsmobile.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.utsmobile.R
import com.example.utsmobile.model.dino

//private lateinit var myListener : Dinoadapter.onItemClickListener
class Dinoadapter(
    context: Context?,
    dinoArrayList: ArrayList<dino>
): RecyclerView.Adapter<Dinoadapter.ItemViewHolder>(){
    var context: Context? = context
    var dinolist: ArrayList<dino> = dinoArrayList


//    interface onItemClickListener{
//        fun onItemClick(posisi : Int)
//    }
//    fun setOnClickListener(listener : onItemClickListener){
//        myListener = listener
//    }

    class ItemViewHolder(private val view: View): RecyclerView.ViewHolder(view) {
        val NamadinotextView: TextView = view.findViewById(R.id.dinotitle)
        val imageView: ImageView = view.findViewById(R.id.gambardino)
//        val descdinotextView: TextView =view.findViewById(R.id.dinodesc)
//
//        init{
//            itemView.setOnClickListener{
//                isLitener.onItemClick(adapterPosition)
//            }
//        }

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        // create a new view
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)

        return ItemViewHolder(adapterLayout)
    }
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dinolist[position]
        holder.NamadinotextView.text = item.namadino
        holder.imageView.setImageResource(item.gambardino)
//        holder.descdinotextView.text = context.resources.getString(item.descdino)
    }

    override fun getItemCount(): Int {
        return dinolist.size
    }
}