package com.wingsofts.gankclient

import android.content.Context
import com.wingsofts.gankclient.api.GankApi

/**
 * Created by wing on 11/23/16.
 */
fun Context.createApi():GankApi{
  return App.instance.mRetrofit.create(GankApi::class.java)
}