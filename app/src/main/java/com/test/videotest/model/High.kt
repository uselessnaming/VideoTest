package com.test.videotest.model

import kotlinx.serialization.Serializable

@Serializable
data class High(
    val height: Int,
    val url: String,
    val width: Int
)