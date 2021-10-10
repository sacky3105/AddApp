package com.example.addapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1)Viewの取得(idで)
        var et1:EditText = findViewById(R.id.et1)
        var et2:EditText = findViewById(R.id.et2)
        var btnAdd:Button = findViewById(R.id.btnAdd)
        var tvAns:TextView = findViewById(R.id.tvAns)
        var btnClear:Button = findViewById(R.id.btnClear)

        //2) クリック処理(足し算)
        btnAdd.setOnClickListener {

            // 条件分岐
            if(et1.text.toString().equals("") || et2.text.toString().equals("")){
                //(4-1)エラー処理:トースト
                Toast.makeText(this,"数字を入力してください",Toast.LENGTH_LONG).show()

                //(4-2)アラートダイアログ
                //AlertDialog.Builder(this)
        //            .setTitle("Error!")
        //            .setMessage("数字を入力してください")
        //            .setPositiveButton("OK",null)
        //            .show()
            }else{
                // edit(編集型) => String(文字)型 => int型
                val sum:Int = et1.text.toString().toInt() + et2.text.toString().toInt()
                tvAns.text = "合計は$sum"
            }

        }

        btnClear.setOnClickListener {
            et1.text.clear()
            et2.text.clear()
            tvAns.text = "答え"
        }
    }
}