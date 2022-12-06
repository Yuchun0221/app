package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.TextView
import android.widget.*
import android.annotation.SuppressLint
import android.database.sqlite.SQLiteDatabase

class MainActivity4 : AppCompatActivity() {
    private lateinit var dbrw: SQLiteDatabase
    private var items: ArrayList<String> = ArrayList()
    private lateinit var adapter: ArrayAdapter<String>

    @SuppressLint("MissingInflatedId")
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
        val listView = findViewById<ListView>(R.id.listView)

        btn_total.setOnClickListener(){
            startActivity(Intent(this,MainActivity5::class.java))
        }
        adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, items)
        listView.adapter = adapter
        //取得資料庫實體
        dbrw = MySQLiteOpenHelper(this).writableDatabase

        btn_query.setOnClickListener {
            val c = dbrw.rawQuery(
                if (ed_pay.length()<1) "SELECT * FROM Phone"
                else "SELECT * FROM Phone WHERE id LIKE '${ed_pay.text}'", null)
            //從第一筆開始輸出
            c.moveToFirst()
            //清空舊資料
            items.clear()
            showToast("共有${c.count}筆資料")
            for (i in 0 until c.count) {
                items.add("編號:${c.getString(0)}\n姓名:${c.getString(1)}\n手機:${c.getString(2)}\n地址:${c.getString(3)}\n備註:${c.getString(4)}")
                //移動到下一張
                c.moveToNext()
            }
            //更新列表資料
            adapter.notifyDataSetChanged()
            //關閉Cursor
            c.close()
        }

    }
}