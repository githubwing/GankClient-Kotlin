package com.wingsofts.gankclient.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import com.wingsofts.gankclient.databinding.ViewRecyclerBinding

/**
 * Created by wing on 11/25/16.
 */
class GirlFragment : BaseBingingFragment<ViewRecyclerBinding>(){
  override fun createDataBinding(inflater: LayoutInflater?, container: ViewGroup?,
      savedInstanceState: Bundle?): ViewRecyclerBinding {
    return ViewRecyclerBinding.inflate(inflater,container,false)
  }

  override fun initView() {
  }

}