package com.test.videotest.model

import kotlinx.serialization.Serializable

@Serializable
data class Id(
    val channelId: String,
    val kind: String,
    val playlistId: String,
    val videoId: String
)