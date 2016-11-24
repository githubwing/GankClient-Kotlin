package com.wingsofts.gankclient.ui.fragment

import android.app.Fragment
import android.databinding.ViewDataBinding
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by wing on 16-11-24.
 */
abstract class BaseBingingFragment<B:ViewDataBinding> : Fragment(){
    private lateinit var mBinding : B
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup, savedInstanceState: Bundle): View {
        mBinding = createDataBinding(inflater,container,savedInstanceState)
        initView()
        return mBinding.root

    }

    abstract fun  createDataBinding(inflater: LayoutInflater, container: ViewGroup, savedInstanceState: Bundle): B

    abstract fun initView()

}