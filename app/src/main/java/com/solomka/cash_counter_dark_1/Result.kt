package com.solomka.cash_counter_dark_1

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.system.exitProcess


class Result : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        
        //go back wit botton edit
        val btn_edit:TextView = findViewById(R.id.btn_edit)
        btn_edit.setOnClickListener() {
            onBackPressed()
        }


        //restart calculations for new results
        val btn_new:TextView = findViewById(R.id.btn_new)
        btn_new.setOnClickListener() {
            val intent = Intent(this@Result, MainActivity::class.java)
            startActivity(intent);
        }


        //exit pressing the button EXIT
        val btn_exit  :TextView = findViewById(R.id.btn_exit)
        btn_exit.setOnClickListener() {
            this@Result.finish()
            finishAffinity()
        }

        //get data from MainActivity
        val total = intent.getStringExtra("Total")

        //form text view for result
        val txt_total:TextView = findViewById(R.id.txt_total)
        txt_total.text = total
    }
}