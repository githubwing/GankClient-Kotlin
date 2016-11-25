
package com.wingsofts.gankclient.ui

import android.databinding.BindingAdapter
import android.widget.ImageView
import com.bumptech.glide.Glide

/**
 * Created by wing on 11/24/16.
 */

  @BindingAdapter("load_image")
  fun loadImage(imageView: ImageView, url: String?) =
      Glide.with(imageView.context).load(url)
          .crossFade()
          .into(imageView)




  @BindingAdapter("load_asset")
  fun loadAsset(imageView: ImageView, id:Int) =
          Glide.with(imageView.context).load(id).into(imageView)
