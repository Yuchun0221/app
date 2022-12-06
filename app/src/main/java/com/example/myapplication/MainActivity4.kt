package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        val ed_itemName = findViewById<EditText>(R.id.ed_itemName)
        val ed_pay = findViewById<EditText>(R.id.ed_pay)
        val textView3 = findViewById<TextView>(R.id.textView3)
        val textView4 = findViewById<TextView>(R.id.textView4)
        val btn_commit2 = findViewById<Button>(R.id.btn_commit2)
        val btn_total = findViewById<Button>(R.id.btn_total)
        val btn_query = findViewById<Button>(R.id.btn_query)

        btn_total.setOnClickListener(){
            startActivity(Intent(this,MainActivity5::class.java))
        }


    }
}