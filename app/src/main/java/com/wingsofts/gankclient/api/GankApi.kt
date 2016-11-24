package com.wingsofts.gankclient.api

import com.wingsofts.gankclient.bean.FuckFood
import com.wingsofts.gankclient.bean.JsonResult
import retrofit2.http.GET
import rx.Observable

/**
 * Created by wing on 11/23/16.
 */
interface GankApi{
  @GET("random/data/Android/20")
  fun getData():Observable<JsonResult<List<FuckFood>>>
}