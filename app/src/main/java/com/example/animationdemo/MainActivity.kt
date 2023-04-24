package com.example.animationdemo

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.animationdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    private lateinit var rocketAnimation: AnimationDrawable
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageView.apply {
            setBackgroundResource(R.drawable.vector_animation)
            rocketAnimation = background as AnimationDrawable
        }
        binding.animate.setOnClickListener {
            rocketAnimation.start()
        }
    }
}