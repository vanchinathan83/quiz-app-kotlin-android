package com.vanchi.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.vanchi.quizapp.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    private lateinit var binding: ActivityResultBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val correctAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS,0)
        val totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 10)
        val userName = intent.getStringExtra(Constants.USER_NAME)
        binding.tvUsername.text = userName
        binding.tvResultText.text = "You got $correctAnswers out of $totalQuestions"
        binding.btnFinish.setOnClickListener { view ->
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}