package com.wingsofts.gankclient.ui.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.wingsofts.gankclient.App
import com.wingsofts.gankclient.R
import com.wingsofts.gankclient.createApi
import okhttp3.OkHttpClient
import rx.android.schedulers.AndroidSchedulers

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        createApi().getData().observeOn(AndroidSchedulers.mainThread())
        .subscribe(
            {    Toast.makeText(this,"成功",Toast.LENGTH_SHORT).show()},
            {e-> Log.e("wing",e.message)}
        )

    }
}
