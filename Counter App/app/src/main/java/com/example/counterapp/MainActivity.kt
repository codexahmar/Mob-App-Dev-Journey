package com.example.counterapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var  scoreA=0
        var  scoreB=0

        val scoreATextView=findViewById<TextView>(R.id.scoreA)
        val scoreBTextView=findViewById<TextView>(R.id.scoreB)

        val btnPlusA=findViewById<Button>(R.id.btnPlusA)
        val btnPlusB=findViewById<Button>(R.id.btnPlusB)

        val btnMinusA=findViewById<Button>(R.id.btnMinusA)
        val btnMinusB=findViewById<Button>(R.id.btnMinusB)

        val resetBtn=findViewById<Button>(R.id.resetBtn)

        btnPlusA.setOnClickListener {
            scoreA++
            scoreATextView.text=scoreA.toString()

        }

        btnPlusB.setOnClickListener {
            scoreB++
            scoreBTextView.text=scoreB.toString()
        }

        btnMinusA.setOnClickListener {
            if (scoreA>0){
                scoreA--
                scoreATextView.text=scoreA.toString()
            }
        }

        btnMinusB.setOnClickListener {
            if (scoreB>0){
                scoreB--
                scoreBTextView.text=scoreB.toString()
            }
        }
resetBtn.setOnClickListener {
    scoreA=0
    scoreB=0
    scoreATextView.text=scoreA.toString()
    scoreBTextView.text=scoreB.toString()
}

    }
}
