package com.wingsofts.gankclient.api

import com.wingsofts.gankclient.bean.FuckFood
import com.wingsofts.gankclient.bean.JsonResult
import retrofit2.http.GET
import retrofit2.http.Path
import rx.Observable

/**
 * Created by wing on 11/23/16.
 */
interface GankApi{

  /**
   * Android所有数据
   */
  @GET("data/Android/10/{page}")
  fun getAndroidData(@Path("page") page:Int):Observable<JsonResult<List<FuckFood>>>

}