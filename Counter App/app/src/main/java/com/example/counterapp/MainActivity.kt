package com.example.counterapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val counterText = findViewById<TextView>(R.id.counterText)
        val incrementBtn = findViewById<Button>(R.id.incrementBtn)
        val decrementBtn = findViewById<Button>(R.id.decrementBtn)
        val resetBtn = findViewById<Button>(R.id.resetBtn)

        incrementBtn.setOnClickListener { count++
            counterText.text = count.toString()

        }
decrementBtn.setOnClickListener {
    if (count > 0) {
        count--
    }
    counterText.text = count.toString()
}
resetBtn.setOnClickListener { count = 0
    counterText.text=count.toString()

}

    }
}