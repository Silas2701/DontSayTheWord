package de.meister.speechrecognition.ui.model

import de.meister.speechrecognition.domain.entity.WordDomain

data class User(
    val name: String,
    val wordsNotToSay: List<Word>
)