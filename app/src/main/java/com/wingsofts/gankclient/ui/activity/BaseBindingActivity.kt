package com.wingsofts.gankclient.ui.activity

import android.databinding.ViewDataBinding
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.MenuItem
import com.wingsofts.gankclient.R

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


    fun setupToolbar(toolbar: Toolbar){
        toolbar.title = ""
        toolbar.setNavigationIcon(R.drawable.icon_back)
        setSupportActionBar(toolbar)

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> onBackPressed()
        }
        return super.onOptionsItemSelected(item)
    }

}