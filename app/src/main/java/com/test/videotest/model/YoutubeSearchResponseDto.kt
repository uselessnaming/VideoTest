package com.test.videotest.model

import kotlinx.serialization.Serializable

@Serializable
data class YoutubeSearchResponseDto(
    val etag: String,
    val items: List<Item>,
    val kind: String,
    val nextPageToken: String,
    val pageInfo: PageInfo,
    val regionCode: String
)