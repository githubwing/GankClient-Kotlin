package com.wingsofts.gankclient.ui.activity

import android.app.Activity
import android.app.ActivityOptions
import android.content.Context
import android.content.Intent
import android.databinding.DataBindingUtil
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.wingsofts.gankclient.R
import com.wingsofts.gankclient.databinding.ActivityImageBinding

class ImageActivity : BaseBindingActivity<ActivityImageBinding>() {

    override fun initView() {
        mBinding.url = intent.getStringExtra(IMG)
        mBinding.root.setOnClickListener {

            supportFinishAfterTransition()
        }
    }

    override fun createDataBinding(savedInstanceState: Bundle?): ActivityImageBinding {
        return DataBindingUtil.setContentView(this, R.layout.activity_image)
    }

    companion object {
        val IMG = "IMG"
        fun startActivity(context: Context, imageView: ImageView, url: String) {
            val intent = Intent(context, ImageActivity::class.java)
            intent.putExtra(IMG, url)
            if(Build.VERSION.SDK_INT > 21) {
                context.startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(context as Activity, imageView, "img").toBundle())
            }else{
                context.startActivity(intent)
            }
        }

    }
}
