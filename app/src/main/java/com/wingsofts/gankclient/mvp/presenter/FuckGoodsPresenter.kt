package com.wingsofts.gankclient.mvp.presenter

import android.util.Log
import com.wingsofts.gankclient.mvp.contract.FuckGoodsContract
import com.wingsofts.gankclient.mvp.model.FuckGoodsModel
import rx.android.schedulers.AndroidSchedulers
import javax.inject.Inject

/**
 * Created by wing on 16-11-24.
 */
class FuckGoodsPresenter
@Inject constructor(private val mModel: FuckGoodsModel,
    private val mView: FuckGoodsContract.View)
: FuckGoodsContract.Presenter, BasePresenter() {


  override fun getData(page: Int, type: String) {
    addSubscription(mModel.getData(page, type).observeOn(AndroidSchedulers.mainThread())
        .subscribe({

          res ->
          if (!res.error) {
            mView.setData(res.results)
          }

        }, { e -> Log.e("wing", "error android Presenter" + e.message) }))
  }

}