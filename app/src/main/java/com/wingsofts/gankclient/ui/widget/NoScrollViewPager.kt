package com.wingsofts.gankclient.ui.widget

import android.content.Context
import android.support.v4.view.ViewPager
import android.util.AttributeSet
import android.view.MotionEvent



/**
 * Created by wing on 16-11-24.
 */
class NoScrollViewPager : ViewPager {

    private val isPagingEnabled = false

    constructor(context: Context) : super(context) {
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        return this.isPagingEnabled && super.onTouchEvent(event)
    }

    override fun onInterceptTouchEvent(event: MotionEvent): Boolean {
        return this.isPagingEnabled && super.onInterceptTouchEvent(event)
    }

    override fun scrollTo(x: Int, y: Int) {
        super.scrollTo(x, y)
    }
}