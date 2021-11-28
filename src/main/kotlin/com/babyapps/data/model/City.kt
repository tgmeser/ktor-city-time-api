package com.babyapps.data.model

import kotlinx.serialization.Serializable

@Serializable
data class City(
    val id: Int,
    val name: String,
    val colorName: String,
    val colorCode: String,
    val timeDifference: String,
)
