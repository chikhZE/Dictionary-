package com.example.dictionary

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.dictionary.databinding.ActivityMainBinding
import org.json.JSONArray
import java.net.HttpURLConnection
import java.net.URL

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.searchBtn.setOnClickListener {
            if(binding.searchBar.text.toString().trim() != "") {
                fetchData("https://api.dictionaryapi.dev/api/v2/entries/en/${binding.searchBar.text.toString()}")
            }

        }

    }
    private fun fetchData(urlString: String) {
        Thread{
            try {
                val url = URL(urlString)
                val connection = url.openConnection() as HttpURLConnection
                connection.requestMethod = "GET"
                connection.connect()

                val responseText = connection.inputStream.bufferedReader().readText()
                val jsonArray = JSONArray(responseText)
                var phonetic = jsonArray.getJSONObject(0).getJSONArray("phonetics").getJSONObject(1).getString("text")
                var partOfSpeech = jsonArray.getJSONObject(0).getJSONArray("meanings").getJSONObject(0).getString("partOfSpeech")
                var definition = jsonArray.getJSONObject(0).getJSONArray("meanings").getJSONObject(0).getJSONArray("definitions").getJSONObject(0).getString("definition")
                var sound = jsonArray.getJSONObject(0).getJSONArray("phonetics").getJSONObject(1).getString("audio")
                runOnUiThread{
                    var i = Intent(this,Info::class.java)
                    i.putExtra("searchedTxt",binding.searchBar.text.toString())
                    i.putExtra("phonetic",phonetic)
                    i.putExtra("partOfSpeech",partOfSpeech)
                    i.putExtra("definition",definition)
                    i.putExtra("sound",sound)

                    startActivity(i)

                }

            }catch(e: Exception) {
                runOnUiThread {
                    Toast.makeText(this, "No definition found, try another word.", Toast.LENGTH_SHORT).show()
                }
            }
        }.start()
    }
}