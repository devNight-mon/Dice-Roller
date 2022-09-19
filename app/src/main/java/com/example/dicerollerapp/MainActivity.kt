package com.example.dicerollerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

   private lateinit var diceImage: ImageView
   private lateinit var diceImage2: ImageView
   private  lateinit var resultText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.btn_Roll)


        resultText = findViewById(R.id.txt_result)
        diceImage = findViewById(R.id.diceImage)
        diceImage2 = findViewById(R.id.diceImage2)

        rollButton.setOnClickListener {
         rollDice()


            //resultText.text = "Dice Rolled!"


            //resultText.text = randomInt.toString()
        }
    }

    private fun rollDice(){
       // Toast.makeText(this, "Button Clicked!", Toast.LENGTH_SHORT).show()

        val randomInt = (1..6).random()
        val drawableResource = when(randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        val randomInt2 = (1..6).random()
        val drawableResource2 = when(randomInt2){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_1
            3 -> R.drawable.dice_1
            4 -> R.drawable.dice_1
            5 -> R.drawable.dice_1
            else -> R.drawable.dice_6
        }

        if (drawableResource == drawableResource2){
            resultText.text = "Excellent"
        }else{
            resultText.text = "Try Again"
        }
        diceImage.setImageResource(drawableResource)
        diceImage2.setImageResource(drawableResource2)


    }
}