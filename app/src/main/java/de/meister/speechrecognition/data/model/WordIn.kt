package de.meister.speechrecognition.data.model

import java.io.Serializable

data class WordIn(
    val name: String,
    val pricePerSay: Double,
    val count: Number,
    val totalPrice: Double
) : Serializable
