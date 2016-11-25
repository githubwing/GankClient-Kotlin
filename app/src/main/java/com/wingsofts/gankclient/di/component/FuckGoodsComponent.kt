package com.wingsofts.gankclient.di.component

import com.wingsofts.gankclient.mvp.contract.FuckGoodsContract
import com.wingsofts.gankclient.ui.fragment.AndroidFragment
import com.wingsofts.gankclient.ui.fragment.GirlFragment
import com.wingsofts.gankclient.ui.fragment.IOSFragment
import dagger.Module
import dagger.Provides
import dagger.Subcomponent

/**
 * Created by wing on 16-11-24.
 */
@Subcomponent(modules = arrayOf(FuckGoodsModule::class))
interface FuckGoodsComponent {
    fun inject(fragment: AndroidFragment)
    fun inject(fragment: IOSFragment)

    fun inject(fragment: GirlFragment)
}

@Module
class FuckGoodsModule(private val mView: FuckGoodsContract.View){
    @Provides fun getView() = mView
}