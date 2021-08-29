package de.meister.speechrecognition.domain.dao

import de.meister.speechrecognition.domain.entity.UserDomain


interface FirestoreRepository {

    suspend fun getUsers(): List<UserDomain>
}