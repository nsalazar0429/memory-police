package com.example.memorypolice

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.memorypolice.databinding.ActivityOtherBinding

class OtherActivity : AppCompatActivity(){

    private lateinit var binding: ActivityOtherBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOtherBinding.inflate(layoutInflater)
        binding.otherButton.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }
        setContentView(binding.root)
    }
}