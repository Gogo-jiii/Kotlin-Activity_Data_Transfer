package com.example.activitydatatransfer

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnGotoSecondActivity.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("name", "IT wala")
            val intent = Intent(this@MainActivity, SecondActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }
    }
}