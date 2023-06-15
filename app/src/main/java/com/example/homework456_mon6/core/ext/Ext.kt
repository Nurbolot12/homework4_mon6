package com.example.homework456_mon6.core.ext

import android.widget.ImageView
import com.bumptech.glide.Glide

fun ImageView.setImage(image:String){
    Glide.with(this).load(image).into(this)
}