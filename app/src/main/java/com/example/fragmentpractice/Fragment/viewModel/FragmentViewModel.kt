package com.example.fragmentpractice.Fragment.viewModel

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel

/**
 * 2023-01-18
 * pureum
 */
class FragmentViewModel(
    application: Application
): AndroidViewModel(application) {
    private var dataList = arrayListOf<String>()
    init {
        Log.e("TAG", "FragmentViewModel created", )
    }
    fun fragmentViewModelTest(){
        Log.e("TAG", "fragmentViewModelTest: test", )
    }

    fun recyclerInit() : ArrayList<String>{
        dataList.add("gimotti1")
        dataList.add("gimotti2")
        dataList.add("gimotti3")
        dataList.add("gimotti4")
        dataList.add("gimotti5")
        dataList.add("gimotti6")
        dataList.add("gimotti7")
        dataList.add("gimotti8")
        dataList.add("gimotti9")
        dataList.add("gimotti10")
        dataList.add("gimotti11")
        dataList.add("gimotti12")
        dataList.add("gimotti13")
        dataList.add("gimotti14")
        dataList.add("gimotti15")
        return dataList
    }


    override fun onCleared() {
        super.onCleared()
        Log.e("TAG", "FragmentViewModel onCleared: ", )
    }
}