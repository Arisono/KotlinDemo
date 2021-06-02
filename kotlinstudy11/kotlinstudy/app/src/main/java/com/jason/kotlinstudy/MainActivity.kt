package com.jason.kotlinstudy

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
//import kotlinx.android.synthetic.main.activity_main.*


/**
 *
 * @author ningchuanqi
 * @version V1.0
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val nameTextView = findViewById<TextView>(R.id.nameTextView)
        nameTextView.text = "Jack"
        val submitButton = findViewById<Button>(R.id.submitButton)
        /*submitButton.setOnClickListener(View.OnClickListener {

        })*/
        submitButton.setOnClickListener{
            Log.d("jason","onClick")
        }
    }

}