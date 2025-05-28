package com.example.dictionary
import android.media.MediaPlayer
import android.util.Log

import android.os.Bundle
import android.widget.Toast
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
        binding.soundBtn.setOnClickListener {
            playAudio(intent.getStringExtra("sound").toString())
        }

    }
    private var mediaPlayer: MediaPlayer? = null
    fun playAudio(audioPath: String) {
        try {
            mediaPlayer?.release()
            mediaPlayer = MediaPlayer().apply {
                setDataSource(audioPath)
                prepare()
                start()
            }
        } catch (e: Exception) {

        }
    }
}