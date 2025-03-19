package com.test.videotest.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Service {

    private val youtubeInterface: YoutubeInterface

    init{
        val retrofit = Retrofit.Builder()
            .baseUrl(BuildConfig.YOUTUBE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        youtubeInterface = retrofit.create(YoutubeInterface::class.java)
    }
}