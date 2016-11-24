package com.wingsofts.gankclient.mvp.presenter

import android.util.Log
import com.wingsofts.gankclient.mvp.contract.AndroidContract
import com.wingsofts.gankclient.mvp.model.AndroidModel
import rx.android.schedulers.AndroidSchedulers
import javax.inject.Inject

/**
 * Created by wing on 16-11-24.
 */
class AndroidPresenter
@Inject constructor(private val mModel: AndroidModel,
                    private val mView: AndroidContract.View)
    : AndroidContract.Presenter, BasePresenter() {


    override fun getData(page: Int) {
        addSubscription(mModel.getData(page).observeOn(AndroidSchedulers.mainThread())
                .subscribe({

                    res ->
                    if (!res.error) {
                        mView.setData(res.results)
                    }

                }, { e -> Log.e("wing", "error android Presenter" + e.message) }))
    }

}