package com.test.videotest.model

import kotlinx.serialization.Serializable

@Serializable
data class Item(
    val etag: String,
    val id: Id,
    val kind: String,
    val snippet: Snippet
)