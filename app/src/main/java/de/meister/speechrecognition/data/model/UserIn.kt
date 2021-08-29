package de.meister.speechrecognition.data.model

data class UserIn(
    val name: String,
    val wordsNotToSay: List<WordIn>
)