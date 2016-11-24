package com.wingsofts.gankclient.di.component

import com.wingsofts.gankclient.mvp.contract.AndroidContract
import com.wingsofts.gankclient.ui.fragment.AndroidFragment
import dagger.Module
import dagger.Provides
import dagger.Subcomponent

/**
 * Created by wing on 16-11-24.
 */
@Subcomponent(modules = arrayOf(AndroidModule::class))
interface AndroidComponent {
    fun inject(fragment: AndroidFragment)
}

@Module
class AndroidModule(private val mView: AndroidContract.View){
    @Provides fun getView() = mView
}