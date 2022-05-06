package com.example.activitydatatransfer

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val bundle = intent.extras
        if (bundle != null) {
            val name = bundle.getString("name")
            Toast.makeText(this, name, Toast.LENGTH_SHORT).show()
        }
    }
}