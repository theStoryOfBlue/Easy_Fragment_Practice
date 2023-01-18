package com.example.fragmentpractice

import android.util.Log
import androidx.lifecycle.ViewModel

/**
 * 2023-01-18
 * pureum
 */
class MainViewModel:ViewModel() {
    init {
        Log.e("TAG", "MainViewModel created", )
    }
    fun mainViewModelTest(){
        Log.e("TAG", "mainViewModelTest: test ", )
    }

    override fun onCleared() {
        super.onCleared()
        Log.e("TAG", "MainViewModel onCleared: ", )
    }
}