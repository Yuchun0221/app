package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val textView2 = findViewById<TextView>(R.id.textView2)
        val ed_peoplenum = findViewById<EditText>(R.id.ed_peoplenum)
        val btn_commit1 = findViewById<Button>(R.id.btn_commit1)
        val ed_moneynum = findViewById<EditText>(R.id.ed_moneynum)

        btn_commit1.setOnClickListener(){
            startActivity(Intent(this, MainActivity4::class.java))
        }
    }
}