package com.vigyan.coaching.ui.main

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.vigyan.coaching.databinding.ActivityMainBinding
import com.vigyan.coaching.ui.admin.AdminActivity

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvWelcome.text = "বিজ্ঞান কোচিং সেন্টারে স্বাগতম"
        binding.btnAdmin.setOnClickListener {
            startActivity(Intent(this, AdminActivity::class.java))
        }
    }
}
