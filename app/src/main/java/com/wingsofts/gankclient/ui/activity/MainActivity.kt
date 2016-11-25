package com.wingsofts.gankclient.ui.activity

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentPagerAdapter
import android.view.MenuItem
import com.wingsofts.gankclient.R
import com.wingsofts.gankclient.bean.FuckGoods
import com.wingsofts.gankclient.databinding.ActivityMainBinding
import com.wingsofts.gankclient.di.component.RandomModule
import com.wingsofts.gankclient.getMainComponent
import com.wingsofts.gankclient.mvp.contract.RandomContract
import com.wingsofts.gankclient.mvp.presenter.RandomPresenter
import com.wingsofts.gankclient.router.GankClientUri
import com.wingsofts.gankclient.router.GankRouter
import com.wingsofts.gankclient.toast
import com.wingsofts.gankclient.ui.fragment.AndroidFragment
import com.wingsofts.gankclient.ui.fragment.FragmentHolder
import com.wingsofts.gankclient.ui.fragment.GirlFragment
import com.wingsofts.gankclient.ui.fragment.IOSFragment
import kotlinx.android.synthetic.main.activity_main.*
import java.net.URLEncoder
import java.util.*
import javax.inject.Inject

class MainActivity : BaseBindingActivity<ActivityMainBinding>(),RandomContract.View {


  lateinit var mFragments: MutableList<Fragment>
  @Inject lateinit var mPresenter : RandomPresenter
  override fun createDataBinding(savedInstanceState: Bundle?): ActivityMainBinding {
    return DataBindingUtil.setContentView(this, R.layout.activity_main)
  }

  override fun initView() {
    initFragments()
    getMainComponent().plus(RandomModule(this)).inject(this)
    viewPager.adapter = object : FragmentPagerAdapter(supportFragmentManager) {
      override fun getItem(position: Int) = mFragments[position]
      override fun getCount() = mFragments.size
    }

    viewPager.offscreenPageLimit = 4

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


    floatingButton.setOnClickListener {
      mPresenter.getRandom("Android")
    }

  }
  override fun onRandom(goods :FuckGoods) {

    val url = URLEncoder.encode(goods.url)
    toast("手气不错～")
    GankRouter.router(this,GankClientUri.DETAIL + url)
  }
  private fun initFragments() {
    mFragments = ArrayList()
    mFragments.add(AndroidFragment.newInstance())
    mFragments.add(IOSFragment.newInstance())
    mFragments.add(GirlFragment.newInstance())
    mFragments.add(FragmentHolder())
  }

}
