package de.meister.speechrecognition.domain.entity

import java.io.Serializable

data class WordDomain(
    val name: String,
    val pricePerSay: Double,
    val count: Number,
    val totalPrice: Double
)