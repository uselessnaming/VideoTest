package com.test.videotest.model

import kotlinx.serialization.Serializable

@Serializable
data class PageInfo(
    val resultsPerPage: Int,
    val totalResults: Int
)