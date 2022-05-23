package com.example.materialcard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.materialcard.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)


        binding?.card?.setOnLongClickListener{
            binding?.card?.isCheckable = binding?.card?.isChecked!!
            true
        }
    }
}