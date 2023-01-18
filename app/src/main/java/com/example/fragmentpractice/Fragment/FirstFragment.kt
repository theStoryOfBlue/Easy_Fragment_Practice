package com.example.fragmentpractice.Fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.fragmentpractice.Fragment.adapter.FragmentAdapter
import com.example.fragmentpractice.Fragment.viewModel.FragmentViewModel
import com.example.fragmentpractice.MainViewModel
import com.example.fragmentpractice.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {
    init {
        Log.e("TAG", "FirstFragment created", )
    }
    private val activityViewModel : MainViewModel by activityViewModels()
    private val fragmentViewModel : FragmentViewModel by viewModels()
    private val adapter = FragmentAdapter()

    private val binding : FragmentFirstBinding by lazy {
        FragmentFirstBinding.inflate(layoutInflater)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        fragmentViewModel.fragmentViewModelTest()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding.recycler.layoutManager = LinearLayoutManager(this.context)
        binding.recycler.adapter = adapter
        adapter.dataList = fragmentViewModel.recyclerInit()
        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("TAG", "FirstFragment onDestroy: ", )
    }
}