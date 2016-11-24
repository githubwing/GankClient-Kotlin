@file:JvmName("BindingAdapter")

package com.wingsofts.gankclient.ui

import android.databinding.BindingAdapter
import android.widget.ImageView
import com.bumptech.glide.Glide

/**
 * Created by wing on 11/24/16.
 */
object BindingAdapter {

  @BindingAdapter("load_image")
  @JvmStatic
  fun loadImage(imageView: ImageView, url: String?) = Glide.with(imageView.context).load(url).into(
      imageView)
}