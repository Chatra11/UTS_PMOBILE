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


class Dinoadapter(
    private val context: Context,
    private val setdino: List<dino>
): RecyclerView.Adapter<Dinoadapter.ItemViewHolder>(){

    private lateinit var myListener : onItemClickListener

    interface onItemClickListener{
        fun onItemClick(posisi : Int)
    }
    fun setOnClickListener(listener : onItemClickListener){
        myListener = listener
    }

    class ItemViewHolder(private val view: View , isLitener:onItemClickListener): RecyclerView.ViewHolder(view) {
        val NamadinotextView: TextView = view.findViewById(R.id.dinotitle)
        val imageView: ImageView = view.findViewById(R.id.gambardino)
//        val descdinotextView: TextView =view.findViewById(R.id.dinodesc)

        init{
            itemView.setOnClickListener{
                isLitener.onItemClick(adapterPosition)
            }
        }

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        // create a new view
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)

        return ItemViewHolder(adapterLayout,myListener)
    }
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = setdino[position]
        holder.NamadinotextView.text = item.namadino
        holder.imageView.setImageResource(item.gambardino)
//        holder.descdinotextView.text = context.resources.getString(item.descdino)
    }

    override fun getItemCount(): Int {
        return setdino.size
    }
}