package com.example.testingapplication.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.testingapplication.R

class MainActivity : AppCompatActivity() {

    private lateinit var openMainFragmentBtn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        openMainFragmentBtn = findViewById(R.id.openMainFragmentBtn)
        openMainFragment()
    }

    private fun openMainFragment() {
        openMainFragmentBtn.setOnClickListener {
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragmentContainer, MainFragment()).commit()
            openMainFragmentBtn.visibility = View.GONE
        }
    }
}