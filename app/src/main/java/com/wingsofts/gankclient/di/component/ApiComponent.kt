package com.wingsofts.gankclient.di.component

import com.wingsofts.gankclient.App
import com.wingsofts.gankclient.di.module.ApiModule
import dagger.Component
import javax.inject.Singleton

/**
 * Created by wing on 16-11-23.
 */
@Singleton
@Component(modules = arrayOf(ApiModule::class))
interface ApiComponent{

    fun inject(app: App)


    fun plus(module: FuckGoodsModule):FuckGoodsComponent
    fun plus(module: RandomModule):RandomComponent
}

