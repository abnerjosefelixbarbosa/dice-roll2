package com.example.diceroll

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import kotlin.random.Random
import kotlin.random.nextInt

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val iv_dice = findViewById<ImageView>(R.id.iv_dice)
        val btn_roll = findViewById<Button>(R.id.btn_roll)

        btn_roll.setOnClickListener() {
            val number = Random.nextInt(5) + 1
            if (number == 1) {
                iv_dice.setImageResource(R.drawable.dice_1)
            }
            if (number == 2) {
                iv_dice.setImageResource(R.drawable.dice_2)
            }
            if (number == 3) {
                iv_dice.setImageResource(R.drawable.dice_3)
            }
            if (number == 4) {
                iv_dice.setImageResource(R.drawable.dice_4)
            }
            if (number == 5) {
                iv_dice.setImageResource(R.drawable.dice_5)
            }
            if (number == 6) {
                iv_dice.setImageResource(R.drawable.dice_6)
            }
            Toast.makeText(this,  "your result is ${number}", Toast.LENGTH_SHORT).show()
        }
    }
}