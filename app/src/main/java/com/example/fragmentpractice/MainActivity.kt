package com.example.fragmentpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragmentpractice.Fragment.FirstFragment
import com.example.fragmentpractice.Fragment.SecondFragment
import com.example.fragmentpractice.Fragment.ThirdFragment
import com.example.fragmentpractice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var first = FirstFragment()
    private var second = SecondFragment()
    private var third = ThirdFragment()

    private val binding : ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.frameLayout, first)
                .addToBackStack(null)
                .show(first)
                .commit()
        }

        binding.button2.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.frameLayout, second)
                .addToBackStack(null)
                .show(second)
                .commit()
        }
        binding.button4.setOnClickListener{
            supportFragmentManager.beginTransaction().hide(first).commit()
            supportFragmentManager.beginTransaction().hide(second).commit()
        }

        /*supportFragmentManager.beginTransaction()
            .replace(R.id.frameLayout, first)
            .addToBackStack(null)
            .commit()

        supportFragmentManager.beginTransaction()
            .replace(R.id.frameLayout2, second)
            .addToBackStack(null)
            .commit()

        supportFragmentManager.beginTransaction()
            .replace(R.id.frameLayout3, third)
            .addToBackStack(null)
            .commit()

         */
    }
}