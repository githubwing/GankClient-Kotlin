package com.wingsofts.gankclient.ui.activity

import android.content.Intent
import android.content.Intent.ACTION_VIEW
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import android.widget.Toast
import com.wingsofts.gankclient.App
import com.wingsofts.gankclient.R
import com.wingsofts.gankclient.createApi
import com.wingsofts.gankclient.router.GankClientUri
import com.wingsofts.gankclient.router.GankRouter
import com.wingsofts.gankclient.ui.adapter.FuckFoodAdapter
import kotlinx.android.synthetic.main.activity_main.*
import okhttp3.OkHttpClient
import rx.android.schedulers.AndroidSchedulers

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
}
