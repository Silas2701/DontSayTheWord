package de.meister.speechrecognition.data.repository

import com.google.firebase.firestore.FirebaseFirestore
import de.meister.speechrecognition.domain.dao.FirestoreRepository
import de.meister.speechrecognition.domain.entity.UserDomain

class FirestoreRepositoryImpl : FirestoreRepository {

    private val db: FirebaseFirestore by lazy { FirebaseFirestore.getInstance() }

    override suspend fun getUsers(): List<UserDomain> {
        val users =
        db.collection("users")
            .get()
            .addOnSuccessListener {

            }
        throw NotImplementedError();
    }
}