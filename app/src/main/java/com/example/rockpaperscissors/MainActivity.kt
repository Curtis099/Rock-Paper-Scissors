package com.example.rockpaperscissors

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1: Button = findViewById(R.id.button)
        button1.setOnClickListener {
            mainFunction1()
        }
        mainFunction1()

        val button3: Button = findViewById(R.id.button3)
        button3.setOnClickListener {
            mainFunction2()
        }
        mainFunction2()
    }

    private fun mainFunction1() {

        // PLAYER 1
        val player1 = Players(3)
        val answer1 = player1.roll()

        val imageView1: ImageView = findViewById(R.id.imageView)

        // 1 - Rock, 2 - Paper, 3 - Scissors

        val drawableResource = when (answer1) {
            1 -> R.drawable.rock
            2 -> R.drawable.paper
            else -> R.drawable.scissors
        }
        imageView1.setImageResource(drawableResource)

        imageView1.contentDescription = answer1.toString()
    }

    private fun mainFunction2() {

        //PLAYER 2
        val player2 = Players(3)
        val answer2 = player2.roll()

        val imageView2: ImageView = findViewById(R.id.imageView2)

        // 1 - Rock, 2 - Paper, 3 - Scissors

        val drawableResource2 = when (answer2) {
            1 -> R.drawable.rock
            2 -> R.drawable.paper
            else -> R.drawable.scissors
        }
        imageView2.setImageResource(drawableResource2)

        imageView2.contentDescription = answer2.toString()
    }

    /*private fun announce(num1: Int, num2: Int) {

        val textView1: TextView = findViewById(R.id.textView3)
        val print1 = "PLAYER 1 WON...!"
        val print2 = "PLAYER 2 WON...!"
        val print3 = "Its a Draw..!"

        if (num1 == num2) {
            textView1.text = print3
        } else if (num1 == 1) {
            when (num2) {
                2 -> textView1.text = print2
                3 -> textView1.text = print1
            }
        } else if (num1 == 2) {
            when (num2) {
                1 -> textView1.text = print1
                3 -> textView1.text = print2
            }
        } else if (num1 == 3) {
            when (num2) {
                2 -> textView1.text = print1
                1 -> textView1.text = print2
            }
        }
    }*/

    class Players(private val n: Int) {
        fun roll(): Int {
            return (1..n).random()
        }
    }
}