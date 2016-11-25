package com.wingsofts.gankclient.ui.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.wingsofts.gankclient.bean.FuckGoods
import com.wingsofts.gankclient.databinding.ItemFuckgoodsBinding
import com.wingsofts.gankclient.databinding.ItemGirlBinding

/**
 * Created by wing on 16-11-25.
 */
class GirlAdapter(private val mList: List<FuckGoods>) : BaseBindingAdapter<ItemGirlBinding>() {
    override fun getItemCount(): Int {
        return mList.size
    }

    override fun onBindViewHolder(holder: DataBoundViewHolder<ItemGirlBinding>, position: Int) {
        super.onBindViewHolder(holder, position)
        holder.binding.girl = mList[holder.adapterPosition]


        holder.binding.executePendingBindings()
    }

    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int): DataBoundViewHolder<ItemGirlBinding> {
        return DataBoundViewHolder(
                ItemGirlBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }


}