package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        val textView1 = findViewById<TextView>(R.id.textView１)
        val btn_random = findViewById<Button>(R.id.btn_random)

        btn_random.setOnClickListener(){
            startActivity(Intent(this,MainActivity6::class.java))
        }
    }
}