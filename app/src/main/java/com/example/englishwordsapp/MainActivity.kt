package com.example.englishwordsapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.englishwordsapp.databinding.ActivityLearnWordBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLearnWordBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityLearnWordBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.tvQuestionWord.text = "AndroidSprint"
        binding.tvQuestionWord.setTextColor(Color.MAGENTA)
    }
}