package com.wingsofts.gankclient.mvp.model

import com.wingsofts.gankclient.api.GankApi
import com.wingsofts.gankclient.bean.FuckGoods
import com.wingsofts.gankclient.bean.JsonResult
import com.wingsofts.gankclient.mvp.contract.FuckGoodsContract
import com.wingsofts.gankclient.ui.fragment.AndroidFragment
import com.wingsofts.gankclient.ui.fragment.GirlFragment
import com.wingsofts.gankclient.ui.fragment.IOSFragment
import rx.Observable
import javax.inject.Inject

/**
 * Created by wing on 16-11-24.
 */
class FuckGoodsModel
@Inject constructor(private val api: GankApi) : FuckGoodsContract.Model {

  override fun getData(page: Int, type: String): Observable<JsonResult<List<FuckGoods>>> {
    when (type) {
      AndroidFragment.ANDROID -> return api.getAndroidData(page)
      IOSFragment.IOS -> return api.getiOSData(page)
      GirlFragment.GIRL -> return api.getGirlData(page)
      else -> return api.getAndroidData(page)
    }
  }
}
