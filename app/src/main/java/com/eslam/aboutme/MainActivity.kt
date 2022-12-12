package com.eslam.aboutme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val nickNameBtn = findViewById<Button>(R.id.btnNickName)

        nickNameBtn.setOnClickListener {
            setUserNickName(it)
        }


    }

    fun setUserNickName(view: View){
        val nickNameInput = findViewById<EditText>(R.id.nickNameInput)
        val nickNameText = findViewById<TextView>(R.id.nickNameText)

        nickNameText.text = nickNameInput.text
        nickNameInput.visibility = View.GONE
        nickNameText.visibility = View.VISIBLE
        view.visibility = View.GONE

        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)

    }
}