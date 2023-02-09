package com.example.ezquiz_kate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main10.*
import kotlinx.android.synthetic.main.activity_main_finish.*

class MainActivityFinish : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_finish)

        fin.setOnClickListener {
            val intent = Intent(this@MainActivityFinish, MainActivity::class.java)
            startActivity(intent)
        }
    }
}