package com.test.videotest.model

import kotlinx.serialization.Serializable

@Serializable
data class Thumbnails(
    val default: Default,
    val high: High,
    val medium: Medium
)