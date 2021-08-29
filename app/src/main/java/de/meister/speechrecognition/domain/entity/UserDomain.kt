package de.meister.speechrecognition.domain.entity

import java.io.Serializable

data class UserDomain(
    val name: String,
    val wordsNotToSay: List<WordDomain>
)