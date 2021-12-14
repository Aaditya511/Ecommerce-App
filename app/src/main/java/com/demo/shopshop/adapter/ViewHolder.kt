package com.demo.shopshop

import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val  bookImg = itemView.findViewById<ImageView>(R.id.imageViewBook)
}