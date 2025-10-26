package com.example.quizapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val resultText = findViewById<TextView>(R.id.resultText)
        val restartBtn = findViewById<Button>(R.id.restartBtn)

        val score = intent.getIntExtra("score", 0)
        val total = intent.getIntExtra("total", 0)

        resultText.text = "Your Score: $score / $total"

        restartBtn.setOnClickListener {
            finish()
        }
    }
}
