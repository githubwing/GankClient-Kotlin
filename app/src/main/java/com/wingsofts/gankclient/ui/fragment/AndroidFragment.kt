package com.wingsofts.gankclient.ui.fragment

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import com.wingsofts.gankclient.R
import com.wingsofts.gankclient.bean.FuckFood
import com.wingsofts.gankclient.databinding.ViewRecyclerBinding
import com.wingsofts.gankclient.di.component.AndroidModule
import com.wingsofts.gankclient.di.component.DaggerApiComponent
import com.wingsofts.gankclient.getMainComponent
import com.wingsofts.gankclient.mvp.contract.AndroidContract
import com.wingsofts.gankclient.mvp.presenter.AndroidPresenter
import com.wingsofts.gankclient.toast
import com.wingsofts.gankclient.ui.adapter.FuckFoodAdapter
import kotlinx.android.synthetic.main.view_recycler.*
import rx.android.schedulers.AndroidSchedulers
import java.util.*
import javax.inject.Inject

/**
 *
 * Created by wing on 16-11-24.
 */
class AndroidFragment : BaseBingingFragment<ViewRecyclerBinding>(),AndroidContract.View {

    private var mList = ArrayList<FuckFood>()
    private lateinit var mAdapter : FuckFoodAdapter
    private var mPage = 0
    @Inject lateinit var mPresenter : AndroidPresenter
    override fun createDataBinding(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): ViewRecyclerBinding {
        return ViewRecyclerBinding.inflate(inflater, container, false)
    }

    override fun initView() {
        mAdapter = FuckFoodAdapter(mList)
        context.getMainComponent().plus(AndroidModule(this)).inject(this)
        with(mBinding!!){
            recyclerView.adapter = mAdapter
            recyclerView.layoutManager = LinearLayoutManager(context)
            mPresenter.getData(mPage)
        }


    }

    override fun setData(results: List<FuckFood>) {
        mList.addAll(results)
        mAdapter.notifyDataSetChanged()
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