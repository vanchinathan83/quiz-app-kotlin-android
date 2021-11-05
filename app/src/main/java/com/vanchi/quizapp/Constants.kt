package com.vanchi.quizapp

object Constants {
    const val USER_NAME = "user_name"
    const val TOTAL_QUESTIONS = "total_questions"
    const val CORRECT_ANSWERS = "correct_answers"

    fun getQuestions() : ArrayList<Question> {
        val questions = ArrayList<Question>()

        val q1 = Question(
            1,
            "What country does the flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina",
            "Australia",
            "Croatia",
            "South Africa",
            1
            )
        val q2 = Question(
            2,
            "What country does the flag belong to?",
            R.drawable.ic_flag_of_india,
            "Argentina",
            "India",
            "Germany",
            "Afghanistan",
            2
        )
        val q3 = Question(
            3,
            "What country does the flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "Lithuania",
            "Hungary",
            "Italy",
            "Belgium",
            4
        )
        val q4 = Question(
            4,
            "What country does the flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "Columbia",
            "Paraguay",
            "Brazil",
            "Japan",
            3
        )
        val q5 = Question(
            1,
            "What country does the flag belong to?",
            R.drawable.ic_flag_of_new_zealand,
            "Australia",
            "United Kingdom",
            "Canada",
            "New Zealand",
            4
        )
        val q6 = Question(
                1,
                "What country does the flag belong to?",
                R.drawable.ic_flag_of_denmark,
                "Vietnam",
                "United Kingdom",
                "Denmark",
                "Namibia",
                3
        )
        val q7 = Question(
                1,
                "What country does the flag belong to?",
                R.drawable.ic_flag_of_fiji,
                "Bolivia",
                "Guatamala",
                "Lithuania",
                "Fiji",
                4
        )
        val q8 = Question(
                1,
                "What country does the flag belong to?",
                R.drawable.ic_flag_of_kuwait,
                "Kuwait",
                "Egypt",
                "Iran",
                "New Zealand",
                1
        )
        val q9 = Question(
                1,
                "What country does the flag belong to?",
                R.drawable.ic_flag_of_germany,
                "Belgium",
                "Germany",
                "Uganda",
                "New Zealand",
                2
        )
        val q10 = Question(
                1,
                "What country does the flag belong to?",
                R.drawable.ic_flag_of_australia,
                "Australia",
                "New Zealand",
                "Canada",
                "Virgin Islands",
                1
        )
        questions.add(q1)
        questions.add(q2)
        questions.add(q3)
        questions.add(q4)
        questions.add(q5)
        questions.add(q6)
        questions.add(q7)
        questions.add(q8)
        questions.add(q9)
        questions.add(q10)
        questions.shuffle()
        return questions
    }
}