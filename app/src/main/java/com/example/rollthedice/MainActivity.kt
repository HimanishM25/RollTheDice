package com.example.rollthedice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener{
            val toast = Toast.makeText(this,rollDice(),Toast.LENGTH_SHORT)
            toast.show()
    }
    }


    private fun rollDice(): String{
        val luckyRoll = (1..6).random()
        val diceRoll = (1..6).random()
        val luckyNo: TextView = findViewById(R.id.textView4)
        luckyNo.text = luckyRoll.toString()
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = diceRoll.toString()
        val diceImage: ImageView = findViewById(R.id.imageView)

        when (diceRoll) {
            1 -> diceImage.setImageResource(R.drawable.dice_1)
            2 -> diceImage.setImageResource(R.drawable.dice_2)
            3 -> diceImage.setImageResource(R.drawable.dice_3)
            4 -> diceImage.setImageResource(R.drawable.dice_4)
            5 -> diceImage.setImageResource(R.drawable.dice_5)
            6 -> diceImage.setImageResource(R.drawable.dice_6)
        }

        if (luckyRoll == diceRoll){
            return "You got lucky!!"
        }
        return "Try rolling again :("
    }
}

