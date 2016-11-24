package com.wingsofts.gankclient.ui.fragment

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import com.wingsofts.gankclient.R
import com.wingsofts.gankclient.databinding.ViewRecyclerBinding
import kotlinx.android.synthetic.main.view_recycler.*

/**
 *
 * Created by wing on 16-11-24.
 */
class AndroidFragment : BaseBingingFragment<ViewRecyclerBinding>() {

    override fun createDataBinding(inflater: LayoutInflater, container: ViewGroup, savedInstanceState: Bundle): ViewRecyclerBinding {
        return ViewRecyclerBinding.inflate(inflater, container, false)
    }

    override fun initView() {

    }

    companion object{
        fun newInstance():AndroidFragment{
            val fragment = AndroidFragment()
            val bundle = Bundle()
            fragment.arguments = bundle
            return fragment
        }
    }

}