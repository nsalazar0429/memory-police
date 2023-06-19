package com.example.memorypolice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.memorypolice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .add(binding.mainContainer.id,MainFragment.newInstance()).commit()
        }

        setContentView(view)
    }
}