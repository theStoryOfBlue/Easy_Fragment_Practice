package com.example.fragmentpractice.Fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragmentpractice.R

class SecondFragment : Fragment() {

    init {
        Log.e("TAG", "SecondFragment created", )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_second, container, false)
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.e("TAG", "SecondFragment onDestroy: ", )
    }
}