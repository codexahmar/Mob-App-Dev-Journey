package com.example.quizapp

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class QuizActivity : AppCompatActivity() {

    // Question data
    private val questions = arrayOf(
        "Which programming language is mainly used for Android development?",
        "What is the name of the file that defines the UI layout?",
        "Which component is used to display text on the screen?",
        "Which Android file stores app permissions?",
        "What is the function of an Activity in Android?",
        "Which folder contains image resources like icons?",
        "What does the findViewById() function do?",
        "Which layout arranges views in a single column or row?",
        "Which keyword is used to navigate to another screen?",
        "Which file contains the app name and package name?"
    )

    private val options = arrayOf(
        arrayOf("Swift", "Kotlin", "C#", "Python"),
        arrayOf("MainActivity.kt", "AndroidManifest.xml", "activity_main.xml", "build.gradle"),
        arrayOf("Button", "TextView", "EditText", "ImageView"),
        arrayOf("gradle.properties", "AndroidManifest.xml", "strings.xml", "activity_main.xml"),
        arrayOf("To store data", "To define logic for one screen", "To show ads", "To manage database"),
        arrayOf("drawable", "layout", "manifest", "values"),
        arrayOf("Deletes a view", "Finds a view by its ID", "Creates new layout", "Starts another activity"),
        arrayOf("RelativeLayout", "ConstraintLayout", "LinearLayout", "FrameLayout"),
        arrayOf("startIntent", "Intent", "goto", "navigateTo"),
        arrayOf("strings.xml", "build.gradle", "AndroidManifest.xml", "colors.xml")
    )

    private val correctAnswers = arrayOf(1, 2, 1, 1, 1, 0, 1, 2, 1, 2)

    private var currentQuestion = 0
    private var score = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        // UI components
        val questionText = findViewById<TextView>(R.id.question)
        val option1 = findViewById<RadioButton>(R.id.option1)
        val option2 = findViewById<RadioButton>(R.id.option2)
        val option3 = findViewById<RadioButton>(R.id.option3)
        val option4 = findViewById<RadioButton>(R.id.option4)
        val optionsGroup = findViewById<RadioGroup>(R.id.optionsGroup)
        val nextBtn = findViewById<Button>(R.id.nextBtn)

        // Function to show current question
        fun loadQuestion() {
            if (currentQuestion < questions.size) {
                questionText.text = questions[currentQuestion]
                option1.text = options[currentQuestion][0]
                option2.text = options[currentQuestion][1]
                option3.text = options[currentQuestion][2]
                option4.text = options[currentQuestion][3]
                optionsGroup.clearCheck()
            } else {
                // Move to result screen
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("score", score)
                intent.putExtra("total", questions.size)
                startActivity(intent)
                finish()
            }
        }

        // Check selected answer
        fun checkAnswer() {
            val selectedId = optionsGroup.checkedRadioButtonId
            if (selectedId == -1) {
                Toast.makeText(this, "Please select an answer!", Toast.LENGTH_SHORT).show()
                return
            }

            val selectedOption = when (selectedId) {
                R.id.option1 -> 0
                R.id.option2 -> 1
                R.id.option3 -> 2
                R.id.option4 -> 3
                else -> -1
            }

            if (selectedOption == correctAnswers[currentQuestion]) {
                score++
            }

            currentQuestion++
            loadQuestion()
        }

        // Button click
        nextBtn.setOnClickListener {
            checkAnswer()
        }

        // Show first question
        loadQuestion()
    }
}
