package com.wingsofts.gankclient.api

import com.wingsofts.gankclient.bean.FuckFood
import com.wingsofts.gankclient.bean.JsonResult
import retrofit2.http.GET
import rx.Observable

/**
 * Created by wing on 11/23/16.
 */
interface GankApi{

  /**
   * 手气不错 随机接口
   */
  @GET("random/data/福利/20")
  fun getData():Observable<JsonResult<List<FuckFood>>>
}