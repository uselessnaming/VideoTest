package com.test.videotest.network

import com.test.videotest.model.YoutubeSearchResponseDto
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface YoutubeInterface {
    @GET
    fun searchYoutube(
        @Query("part") part: String = "snippet",
        @Query("maxResult") maxResult: Int = 1,
        @Query("regionCode") regionCode: String = "kr",
        @Query("q") keyword: String
    ): Call<YoutubeSearchResponseDto>
}