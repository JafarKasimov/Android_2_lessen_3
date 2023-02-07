package com.example.android_2_lessen_3.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.example.android_2_lessen_3.databinding.ActivityMainBinding
import com.example.android_2_lessen_3.ui.adapter.TabLayoutAdapter
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewPager: ViewPager
    private lateinit var tabLayoutAdapter: TabLayoutAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = TabLayoutAdapter(supportFragmentManager, lifecycle)
        binding.viewPager.adapter = adapter

        TabLayoutMediator(binding.tabLayout, binding.viewPager) { tab, position ->
            when (position) {
                0 -> {
                    tab.text = "First"
                }
                1 -> {
                    tab.text = "Second"
                }
            }
        }.attach()
    }
}