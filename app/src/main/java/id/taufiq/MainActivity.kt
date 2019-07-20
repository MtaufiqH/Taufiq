package id.taufiq

import android.content.Context
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


/*Create by Taufiq
* Roll Dice App
* */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        done_button.setOnClickListener { addNickname(it) }


    }

    private fun addNickname(view: View){
        nickname.text = nickname_edit.text

        view.visibility = View.GONE
        nickname_edit.visibility = View.GONE
        nickname.visibility = View.VISIBLE


        //hide keyboard
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken,0)

    }


}
