package id.taufiq

import android.content.Context
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import id.taufiq.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)


        binding.doneButton.setOnClickListener {
            addNickname(it)
        }


    }

    private fun addNickname(view: View) {
        binding.apply {
            nameText.text = nicknameEdit.text
            doneButton.visibility = View.GONE
            nicknameEdit.visibility = View.GONE
            nameText.visibility = View.VISIBLE
        }


        //hide keyboard
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)

    }


}
