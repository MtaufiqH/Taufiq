package id.taufiq

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


/**
 * coloring My Apps Project
 * */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListener()

    }

    private fun setListener() {
        val clickAbleView: List<View> =
            listOf(
                box_one_id, box_two, box_three, box_four, box_five, parent_layout,
                red_id, green_id, blue_id
            )

        for (item in clickAbleView) {
            item.setOnClickListener { makeColored(it) }
        }
    }

    private fun makeColored(view: View) {
        view.apply {
            when (id) {
                // colored with Color class
                R.id.box_one_id -> setBackgroundColor(Color.DKGRAY)
                R.id.box_two -> setBackgroundColor(Color.GRAY)
                R.id.box_three -> setBackgroundColor(Color.CYAN)
                R.id.box_four -> setBackgroundColor(Color.YELLOW)

                // with background Resources
                R.id.box_five -> setBackgroundResource(android.R.color.holo_green_dark)

                // with Color Resource in the project
                R.id.red_id -> box_three.setBackgroundResource(R.color.red_color)
                R.id.green_id -> box_four.setBackgroundResource(R.color.green_color)
                R.id.blue_id -> box_five.setBackgroundResource(R.color.blue_color)
                else -> setBackgroundResource(android.R.color.holo_purple)
            }
        }

    }

}
