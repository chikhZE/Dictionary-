package com.example.dictionary

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.dictionary.databinding.ActivityInfoBinding

class Info : AppCompatActivity() {
    lateinit var binding: ActivityInfoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInfoBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.searchedTxt.text = intent.getStringExtra("searchedTxt")
        binding.phonetic.text = intent.getStringExtra("phonetic")
        binding.definition.text = intent.getStringExtra("definition")
        binding.partOfSpeech.text = intent.getStringExtra("partOfSpeech")

    }
}