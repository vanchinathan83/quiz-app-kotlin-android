package com.vanchi.quizapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.vanchi.quizapp.databinding.ActivityQuizQuestionsBinding

class QuizQuestionsActivity: AppCompatActivity() {

    lateinit var binding: ActivityQuizQuestionsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuizQuestionsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val questionList = Constants.getQuestions()

        val currentQuestion = 1
        val question: Question? = questionList[currentQuestion -1]
        binding.progressBar.progress = currentQuestion
        binding.progressBarText.text = "${currentQuestion}/${binding.progressBar.max}"
        binding.questionImage.setImageResource(question!!.img)
        binding.optionOne.text = question.optionOne
        binding.optionTwo.text = question.optionTwo
        binding.optionThree.text = question.optionThree
        binding.optionFour.text = question.optionFour
    }

}