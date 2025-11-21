package com.example.flashcardapp2

import android.opengl.Visibility
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val flashcardQuestion = findViewById<TextView>(R.id.Flashcardquestions)
        val flashcardAnswer = findViewById<TextView>(R.id.Flashcardanswer)

        flashcardQuestion . setOnClickListener {
            flashcardQuestion . visibility = View . INVISIBLE
            flashcardAnswer . visibility = View . VISIBLE

        }
        flashcardAnswer.setOnClickListener {
            flashcardQuestion.visibility= View.VISIBLE
            flashcardAnswer.visibility= View.INVISIBLE


        }
    }
}

