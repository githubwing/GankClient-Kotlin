package com.wingsofts.gankclient.bean

/**
 * Created by wing on 11/23/16.
 */
data class FuckFood(
    val _id: String,
    val createdAt: String,
    val desc: String,
    val images: List<String>,
    val publishedAt: String,
    val source: String,
    val type: String,
    val url: String,
    val used: Boolean,
    val who: String


)