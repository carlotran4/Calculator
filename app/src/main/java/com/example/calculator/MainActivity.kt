package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import java.nio.file.Files.delete
import java.util.logging.Logger.global

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button1 = findViewById<Button>(R.id.one_button)
        val button2 = findViewById<Button>(R.id.two_button)
        val button3 = findViewById<Button>(R.id.three_button)
        val button4 = findViewById<Button>(R.id.four_button)
        val button5 = findViewById<Button>(R.id.five_button)
        val button6 = findViewById<Button>(R.id.six_button)
        val button7 = findViewById<Button>(R.id.seven_button)
        val button8 = findViewById<Button>(R.id.eight_button)
        val button9 = findViewById<Button>(R.id.nine_button)
        val button0 = findViewById<Button>(R.id.zero_button)
        val buttonPlus = findViewById<Button>(R.id.plus_button)
        val buttonMinus = findViewById<Button>(R.id.minus_button)
        val buttonTimes = findViewById<Button>(R.id.multiplication_button)
        val buttonBackspace = findViewById<ImageButton>(R.id.delete_button)
        val buttonDivide = findViewById<Button>(R.id.divide_button)
        val buttonEquals = findViewById<Button>(R.id.equals_button)
        val resultText = findViewById<TextView>(R.id.result_text)
        var text = ""

        fun displayResult() {
            TODO("Not yet implemented")
        }

        fun calculateResult() {
            TODO("Not yet implemented")
        }

        fun removeText(i: Int) {
            //TODO: implement
        }

        fun addToText(i: String) {
            if("=" in text ){
                removeText(text.length)
            }
            text+=i
            resultText.text = text
        }

        button1.setOnClickListener {
            addToText("1")
        }
        button2.setOnClickListener {
            addToText("2")
        }
        button3.setOnClickListener {
            addToText("3")
        }
        button4.setOnClickListener {
            addToText("4")
        }
        button5.setOnClickListener {
            addToText("5")
        }
        button6.setOnClickListener {
            addToText("6")
        }
        button7.setOnClickListener {
            addToText("7")
        }
        button8.setOnClickListener {
            addToText("8")
        }
        button9.setOnClickListener {
            addToText("9")
        }
        button0.setOnClickListener {
            addToText("0")
        }
        buttonPlus.setOnClickListener {
            addToText("+")
        }
        buttonMinus.setOnClickListener {
            addToText("-")
        }
        buttonDivide.setOnClickListener {
            addToText("/")
        }
        buttonTimes.setOnClickListener {
            addToText("*")
        }
        buttonBackspace.setOnClickListener{
            removeText(1)
        }
        buttonEquals.setOnClickListener {
            calculateResult()
            displayResult()
        }

    }




}