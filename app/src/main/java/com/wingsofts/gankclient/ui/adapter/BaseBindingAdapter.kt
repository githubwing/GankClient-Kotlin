package com.wingsofts.gankclient.ui.adapter

import android.databinding.ViewDataBinding
import android.support.v7.widget.RecyclerView
import android.view.ViewGroup

/**
 * Created by wing on 16-11-25.
 */
abstract class BaseBindingAdapter<B : ViewDataBinding> : RecyclerView.Adapter<DataBoundViewHolder<B>>() {
    var mListener: ((pos: Int) -> Unit)? = null

    override fun onBindViewHolder(holder: DataBoundViewHolder<B>, position: Int) {
        holder.binding.root.setOnClickListener {
            mListener?.invoke(holder.adapterPosition)
        }
    }

    fun setOnItemClickListener(listener: ((pos: Int) -> Unit)) {
        mListener = listener
    }

}