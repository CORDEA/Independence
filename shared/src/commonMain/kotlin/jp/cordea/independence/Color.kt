package jp.cordea.independence

import kotlinx.serialization.Serializable

@Serializable
data class Color(
    val name: String,
    val code: String
)
