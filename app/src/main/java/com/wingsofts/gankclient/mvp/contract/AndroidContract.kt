package com.wingsofts.gankclient.mvp.contract

import com.wingsofts.gankclient.bean.FuckFood
import com.wingsofts.gankclient.bean.JsonResult
import rx.Observable

/**
 * Created by wing on 16-11-24.
 */
interface AndroidContract {
    interface View {
        fun  setData(results: List<FuckFood>)

    }

    interface Model {

        fun getData(page: Int): Observable<JsonResult<List<FuckFood>>>
    }

    interface Presenter {

        fun getData(page: Int)
    }
}