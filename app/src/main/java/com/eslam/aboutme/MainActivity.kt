package com.eslam.aboutme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.databinding.DataBindingUtil
import com.eslam.aboutme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var mainBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        mainBinding.btnNickName.setOnClickListener {
            setUserNickName(it)
        }


    }

    private fun setUserNickName(view: View){

        mainBinding.nickNameText.text = mainBinding.nickNameInput.text
        mainBinding.nickNameInput.visibility = View.GONE
        mainBinding.nickNameText.visibility = View.VISIBLE
        view.visibility = View.GONE

        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)

    }
}