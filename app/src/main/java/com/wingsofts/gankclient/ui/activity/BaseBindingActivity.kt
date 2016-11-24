package com.wingsofts.gankclient.ui.activity

import android.databinding.ViewDataBinding
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

/**
 * Created by wing on 16-11-24.
 */
abstract class BaseBindingActivity<B : ViewDataBinding> : AppCompatActivity() {


    lateinit var mBinding: B
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = createDataBinding(savedInstanceState)

        initView()
    }

    abstract fun initView()

    abstract fun  createDataBinding(savedInstanceState: Bundle?): B
}