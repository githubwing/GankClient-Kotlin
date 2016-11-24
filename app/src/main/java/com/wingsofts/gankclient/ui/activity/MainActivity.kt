package com.wingsofts.gankclient.ui.activity

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentPagerAdapter
import android.view.MenuItem
import com.wingsofts.gankclient.R
import com.wingsofts.gankclient.databinding.ActivityMainBinding
import com.wingsofts.gankclient.ui.fragment.AndroidFragment
import com.wingsofts.gankclient.ui.fragment.FragmentHolder
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : BaseBindingActivity<ActivityMainBinding>() {
    lateinit var mFragments: MutableList<Fragment>
     var mPreItem : MenuItem? = null
    override fun createDataBinding(savedInstanceState: Bundle?): ActivityMainBinding {
        return DataBindingUtil.setContentView(this, R.layout.activity_main)
    }

    override fun initView() {
        initFragments()

        viewPager.adapter = object : FragmentPagerAdapter(supportFragmentManager) {
            override fun getItem(position: Int) = mFragments[position]

            override fun getCount() = mFragments.size

        }


        navigationView.setOnNavigationItemSelectedListener { item ->
            var tab = 0
            when (item.itemId) {
                R.id.menu_android -> tab = 0
                R.id.menu_ios -> tab = 1
                R.id.menu_girl -> tab = 2
                R.id.menu_about -> tab = 3
            }
            viewPager.currentItem = tab
            false
        }


    }

    private fun initFragments() {
        mFragments = ArrayList()

        mFragments.add(AndroidFragment.newInstance())

        mFragments.add(FragmentHolder())

        mFragments.add(FragmentHolder())

        mFragments.add(FragmentHolder())
    }


}
