package com.example.diceroller

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
        val rollButton: Button = findViewById(R.id.button_roll)

        rollButton.setOnClickListener { rollDice() }
        /**
         *   val toast = Toast.makeText(this,"Dice Rolled",Toast.LENGTH_SHORT)
         *          toast.show()
         */
    }
    /**
     * Roll the dice and update the screen with the result.
     */
    /**
     *         if(diceRoll==1){
    diceImage.setImageResource(R.drawable.dice_1)
    }
    else if(diceRoll==2){
    diceImage.setImageResource(R.drawable.dice_2)
    }
    else if(diceRoll==3){
    diceImage.setImageResource(R.drawable.dice_3)
    }
    else if(diceRoll==4){
    diceImage.setImageResource(R.drawable.dice_4)
    }
    else if(diceRoll==5){
    diceImage.setImageResource(R.drawable.dice_5)
    }
    else if(diceRoll==6){
    diceImage.setImageResource(R.drawable.dice_6)
    }
     */
    private fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val diceImage: ImageView = findViewById(R.id.imageView)

        /**when(diceRoll){
        1 -> diceImage.setImageResource(R.drawable.dice_1)
        2 ->  diceImage.setImageResource(R.drawable.dice_2)
        3 -> diceImage.setImageResource(R.drawable.dice_3)
        4 -> diceImage.setImageResource(R.drawable.dice_4)
        5 ->  diceImage.setImageResource(R.drawable.dice_5)
        6 ->  diceImage.setImageResource(R.drawable.dice_6)
        }*/
        val drawableResource = when (diceRoll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceImage.setImageResource(drawableResource)
        diceImage.contentDescription = diceRoll.toString()
    }
}

class Dice(private val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}
