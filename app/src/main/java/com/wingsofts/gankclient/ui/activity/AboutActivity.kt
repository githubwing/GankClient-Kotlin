package com.wingsofts.gankclient.ui.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.airbnb.deeplinkdispatch.DeepLink
import com.wingsofts.gankclient.R
import com.wingsofts.gankclient.router.GankClientUri

@DeepLink(GankClientUri.ABOUT)
class AboutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

    }
}
