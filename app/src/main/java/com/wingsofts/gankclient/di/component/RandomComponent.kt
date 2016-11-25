package com.wingsofts.gankclient.di.component

import com.wingsofts.gankclient.mvp.contract.RandomContract
import com.wingsofts.gankclient.ui.activity.MainActivity
import dagger.Module
import dagger.Provides
import dagger.Subcomponent

/**
 * Created by wing on 16-11-25.
 */
@Subcomponent(modules = arrayOf(RandomModule::class))
interface RandomComponent {
    fun inject(activity: MainActivity)
}

@Module
class RandomModule(private val mView: RandomContract.View) {
    @Provides fun getView() = mView
}