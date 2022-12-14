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
        var money = intent.getIntExtra("overnum",0)
        var people = intent.getIntExtra("people",0)




        btn_random.setOnClickListener(){

            textView1.text = "每人應收回: ${money/people}"
            //else
                try {
                    textView1.text = "每人應再付: ${money/people}"
                }catch (e:Exception){
                    Toast.makeText(this, "無法計算", Toast.LENGTH_SHORT).show()
            }
            //startActivity(Intent(this,MainActivity6::class.java))
        }
    }

}