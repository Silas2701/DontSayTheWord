package de.meister.speechrecognition.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.ktx.Firebase

@HiltViewModel
class MainViewModel @Inject constructor(): ViewModel() {

    val db: FirebaseFirestore

    init {
        db = FirebaseFirestore.getInstance()
    }

    var switchIsChecked: MutableLiveData<Boolean> = MutableLiveData(false)

    fun activateSpeechRecognition() {

    }

    fun deactivateSpeechRecognition() {

    }
}