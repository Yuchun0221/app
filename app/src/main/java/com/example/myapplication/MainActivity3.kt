package com.example.myapplication

import android.app.Activity
import android.app.Activity.RESULT_OK
import android.app.appsearch.AppSearchResult.RESULT_OK
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContract

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val textView2 = findViewById<TextView>(R.id.textView2)
        val ed_peoplenum = findViewById<EditText>(R.id.ed_peoplenum)
        val btn_commit1 = findViewById<Button>(R.id.btn_commit1)
        val ed_moneynum = findViewById<EditText>(R.id.ed_moneynum)


        btn_commit1.setOnClickListener() {
            if (ed_peoplenum.length() < 1)
                Toast.makeText(this, "請輸入人數", Toast.LENGTH_SHORT).show()
            else {
                var bundle = Bundle()
                bundle.putString("people",ed_peoplenum.text.toString())
                val intent = Intent()
                intent.putExtras(bundle)
                setResult(Activity.RESULT_OK, intent)
                finish()
            }
            startActivity(Intent(this, MainActivity4::class.java))
        }


    }

}
