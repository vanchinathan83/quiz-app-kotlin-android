package com.vanchi.quizapp

object Constants {

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
        questions.add(q1)
        questions.add(q2)
        questions.add(q3)
        questions.add(q4)
        questions.add(q5)

        return questions
    }
}