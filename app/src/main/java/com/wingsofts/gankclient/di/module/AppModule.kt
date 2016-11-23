package com.wingsofts.gankclient.di.module

import android.content.Context
import dagger.Module
import dagger.Provides

/**
 * Created by wing on 16-11-23.
 */
@Module
class AppModule(private val context: Context){
    @Provides fun provideContext() = context
}
