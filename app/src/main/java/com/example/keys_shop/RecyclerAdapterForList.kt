package com.example.keys_shop

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapterForList(
    private val namesOfGame: Array<String>,
    private val pricesOfKey: Array<String>
) : RecyclerView.Adapter<RecyclerAdapterForList.ViewHolder>() {
    var onClickListener: ((Int) -> Unit)? = null
    private var imagesOfGame = intArrayOf(R.drawable.gta5, R.drawable.er, R.drawable.minecraft,
        R.drawable.cofd)

    override fun getItemCount(): Int {
        return namesOfGame.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
            ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(
                R.layout.list_item, parent,
                false
            )
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.nameOfGame.text = namesOfGame[position]
        holder.priceOfGame.text = pricesOfKey[position]
        holder.pictureOfGame.setImageResource(imagesOfGame[position])
        holder.container.setOnClickListener {
            onClickListener?.invoke(position)
        }
    }

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val container = view.findViewById<View>(R.id.list_item) as
                ConstraintLayout
        val nameOfGame = view.findViewById<View>(R.id.gameName) as TextView
        val priceOfGame = view.findViewById<View>(R.id.price) as TextView
        val pictureOfGame = view.findViewById<View>(R.id.pictureGame) as
                ImageView
    }
}
