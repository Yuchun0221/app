package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        var textView1 = findViewById<TextView>(R.id.textView１)
        val btn_random = findViewById<Button>(R.id.btn_random)
        var money = intent.getStringExtra("overnum")
        var num = Integer.parseInt(money)
        var people = intent.getStringExtra("people")
        var peoplenum = Integer.parseInt(people)
        var total = num/peoplenum

        if (num>0)
            textView1.text = "每人應收回: ${total}"
        else {
            textView1.text = "每人應再付: ${total}"
        }

        btn_random.setOnClickListener(){
            startActivity(Intent(this,MainActivity6::class.java))
        }
    }

}