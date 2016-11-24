package com.wingsofts.gankclient.ui.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.wingsofts.gankclient.bean.FuckFood
import com.wingsofts.gankclient.databinding.ActivityMainBinding
import com.wingsofts.gankclient.databinding.ItemFuckfoodBinding

/**
 * Created by wing on 11/23/16.
 */
class FuckFoodAdapter(private val mList: List<FuckFood>) : RecyclerView.Adapter<DataBoundViewHolder<ItemFuckfoodBinding>>() {
  override fun getItemCount(): Int {
    return mList.size
  }

  override fun onBindViewHolder(holder: DataBoundViewHolder<ItemFuckfoodBinding>, position: Int) {
    holder.binding.fuckfood = mList[position]
  }

  override fun onCreateViewHolder(parent: ViewGroup,
      viewType: Int): DataBoundViewHolder<ItemFuckfoodBinding> {
    return DataBoundViewHolder(
            ItemFuckfoodBinding.inflate(LayoutInflater.from(parent.context), parent, false))
  }
}