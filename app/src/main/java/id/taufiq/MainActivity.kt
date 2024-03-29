package id.taufiq

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*



/*Create by Taufiq
* Roll Dice App
* */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btn_roll.setOnClickListener {
            rollDice()
        }


    }

    private fun rollDice() {

        val generateRandomNumber = Random().nextInt(6) + 1

        val myDice = when(generateRandomNumber){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.empty_dice
        }

        myDiceId.setImageResource(myDice)
    }
}
