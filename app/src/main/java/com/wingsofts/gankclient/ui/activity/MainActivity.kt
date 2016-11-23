package com.wingsofts.gankclient.ui.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.wingsofts.gankclient.R
import okhttp3.OkHttpClient

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        OkHttpClient.Builder().build()
    }
}
