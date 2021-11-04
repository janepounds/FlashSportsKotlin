package com.example.flashsportskotlin.utils

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView

@BindingAdapter("imageSrc")
fun ImageView.loadImageSrc(imageSrc: Any?) {
    imageSrc?.let { this.loadImage(imageSrc) }
}

@BindingAdapter("circleImageSrc")
fun ImageView.loadCircleImageSrc(imageSrc: Any?) {
    imageSrc?.let { this.loadCircleImage(imageSrc) }
}

@BindingAdapter("setAdapter")
fun RecyclerView.bindRecyclerViewAdapter(recyclerViewAdapter: RecyclerView.Adapter<*>) {
    this.apply {
        val topSpacingItemDecoration = TopSpacingItemDecoration(30)
        addItemDecoration(topSpacingItemDecoration)
        adapter = recyclerViewAdapter
    }
}