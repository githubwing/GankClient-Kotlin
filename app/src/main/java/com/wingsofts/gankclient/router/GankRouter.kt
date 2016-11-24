package com.wingsofts.gankclient.router

import android.content.Context
import android.content.Intent
import android.net.Uri

/**
 * Created by wing on 16-11-24.
 */
object GankRouter{
    fun router(context: Context,url : String){
        val intent = Intent()
        intent.data = Uri.parse(url)
        intent.action = Intent.ACTION_VIEW
        context.startActivity(intent)
    }

}