package com.example.fragmentpractice.Fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragmentpractice.R
import com.example.fragmentpractice.databinding.FragmentFirstBinding
import com.example.fragmentpractice.databinding.FragmentThirdBinding

class ThirdFragment : Fragment() {
    init {
        Log.e("TAG", "ThirdFragment created", )
    }

    private val binding : FragmentThirdBinding by lazy {
        FragmentThirdBinding.inflate(layoutInflater)
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
        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("TAG", "ThirdFragment onDestroy: ", )
    }


}