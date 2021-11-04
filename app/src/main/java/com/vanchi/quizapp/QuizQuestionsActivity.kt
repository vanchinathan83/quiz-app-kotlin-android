package com.vanchi.quizapp

import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.vanchi.quizapp.databinding.ActivityQuizQuestionsBinding

class QuizQuestionsActivity: AppCompatActivity(), OnClickListener{

    lateinit var binding: ActivityQuizQuestionsBinding
    private var mCurrentPostion : Int = 1
    private var mQuestionList: ArrayList<Question>? = null
    private var mSelectedOptionPostion: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuizQuestionsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mQuestionList = Constants.getQuestions()

        setQuestion()
        binding.optionOne.setOnClickListener(this)
        binding.optionTwo.setOnClickListener(this)
        binding.optionThree.setOnClickListener(this)
        binding.optionFour.setOnClickListener(this)
    }

    private fun QuizQuestionsActivity.setQuestion() {
        val question: Question? = mQuestionList!![mCurrentPostion - 1]
        binding.progressBar.progress = mCurrentPostion
        binding.progressBarText.text = "${mCurrentPostion}/${binding.progressBar.max}"
        binding.questionImage.setImageResource(question!!.img)
        binding.optionOne.text = question.optionOne
        binding.optionTwo.text = question.optionTwo
        binding.optionThree.text = question.optionThree
        binding.optionFour.text = question.optionFour
    }

    private fun defaultOptionsView(){
        val options = ArrayList<TextView>()
        options.add(binding.optionOne)
        options.add(binding.optionTwo)
        options.add(binding.optionThree)
        options.add(binding.optionFour)

        for(option in  options){
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(
                    this,
                    R.drawable.option)
        }
    }

    override fun onClick(view: View?) {
        defaultOptionsView()
        when(view?.id){
            R.id.optionOne -> {
                selectedOptionsView(binding.optionOne,1)
            }
            R.id.optionTwo -> {
                selectedOptionsView(binding.optionTwo,2)
            }
            R.id.optionThree -> {
                selectedOptionsView(binding.optionThree,3)
            }
            R.id.optionFour -> {
                selectedOptionsView(binding.optionFour,4)
            }
        }
    }

    private fun selectedOptionsView(tv: TextView, selectedOptionNum: Int) {
        mSelectedOptionPostion = selectedOptionNum
        tv.setTextColor(Color.parseColor("#363A43"))
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(
                this,
                R.drawable.selected_option)
    }
}