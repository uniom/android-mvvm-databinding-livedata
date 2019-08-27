package com.example.viewmodelsample.ui.main

import android.util.Log
import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    // TODO: Implement the ViewModel
    val userName: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }

    fun changeName(view: View) {
        userName.value = "Changed user's name!"
    }
}
