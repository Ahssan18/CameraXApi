package com.example.cameraxapi

import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.cameraxapi.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {
    private lateinit var binding: ActivityProfileBinding
    private lateinit var uriImage: Uri
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initViews()
        clickListener()
    }

    private fun clickListener() {
    }

    private fun initViews() {
        val uriString = intent.extras?.getString("imageUri")
        uriImage = Uri.parse(uriString)
        binding.profile.setImageURI(uriImage)
    }
}