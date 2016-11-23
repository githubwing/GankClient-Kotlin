package com.wingsofts.gankclient.di.component

import com.wingsofts.gankclient.App
import com.wingsofts.gankclient.di.module.ApiModule
import dagger.Component

/**
 * Created by wing on 16-11-23.
 */
@Component(modules = arrayOf(ApiModule::class))
interface ApiComponent{

    fun inject(app: App)

}

