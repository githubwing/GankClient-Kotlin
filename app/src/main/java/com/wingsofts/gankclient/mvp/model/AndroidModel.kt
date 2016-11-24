package com.wingsofts.gankclient.mvp.model

import com.wingsofts.gankclient.api.GankApi
import com.wingsofts.gankclient.bean.FuckFood
import com.wingsofts.gankclient.bean.JsonResult
import com.wingsofts.gankclient.mvp.contract.AndroidContract
import rx.Observable
import javax.inject.Inject

/**
 * Created by wing on 16-11-24.
 */
class AndroidModel

@Inject constructor(private val api : GankApi)    : AndroidContract.Model{
    override fun getData(page:Int): Observable<JsonResult<List<FuckFood>>> {
        return api.getAndroidData(page)
    }
}
