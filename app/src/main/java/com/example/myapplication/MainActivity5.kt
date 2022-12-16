package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity5 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        var textView1 = findViewById<TextView>(R.id.textView１)
        val btn_random = findViewById<Button>(R.id.btn_random)
        val btn_count = findViewById<Button>(R.id.btn_count)
        var money = intent.getStringExtra("overnum")
        var people = intent.getStringExtra("people")
        var peoplenum = Integer.parseInt(people)
        var moneynum = Integer.parseInt(money)



        btn_count.setOnClickListener(){
            if (moneynum>0)
                textView1.text = "每人應收回: ${moneynum/peoplenum}不可整除${moneynum%peoplenum}"
            else
                try {
                    textView1.text = "每人應再付: ${moneynum/peoplenum}不可整除${moneynum%peoplenum}"
                }catch (e:Exception){
                    Toast.makeText(this, "無法計算", Toast.LENGTH_SHORT).show()
            }

        }
        btn_random.setOnClickListener(){
            startActivity(Intent(this,MainActivity6::class.java))
        }
    }

}