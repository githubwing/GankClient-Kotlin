package com.wingsofts.gankclient.mvp.model

import com.wingsofts.gankclient.api.GankApi
import com.wingsofts.gankclient.bean.FuckGoods
import com.wingsofts.gankclient.bean.JsonResult
import com.wingsofts.gankclient.mvp.contract.RandomContract
import rx.Observable
import javax.inject.Inject

/**
 * Created by wing on 16-11-25.
 */
class RandomModel
@Inject constructor(private val api:GankApi) :RandomContract.Model{

    override fun getRandom(type:String): Observable<JsonResult<List<FuckGoods>>> {
        return api.getRandom(type)
    }
}
