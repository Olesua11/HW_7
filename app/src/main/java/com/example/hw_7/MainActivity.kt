package com.example.hw_7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val topFragment = TopFragment()
        val bottomFragment = BottomFragment()

        supportFragmentManager.beginTransaction()
            .replace(R.id.topContainer, topFragment)
            .replace(R.id.bottomContainer, bottomFragment)
            .commit()
    }
}
