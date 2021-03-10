package com.solomka.cash_counter_dark_1

import java.math.BigDecimal
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlin.text.toInt as textToInt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_Cash_Counter_Dark_1)
        setContentView(R.layout.activity_main)

        sumClick()


    }

    private fun sumClick() {

        val btntotal:Button = findViewById(R.id.btn_total)
        val input500: TextView = findViewById(R.id.input500)
        val input200: TextView = findViewById(R.id.input200)
        val input100: TextView = findViewById(R.id.input100)
        val input50: TextView = findViewById(R.id.input50)
        val input20: TextView = findViewById(R.id.input20)
        val input10: TextView = findViewById(R.id.input10)
        val input5: TextView = findViewById(R.id.input5)
        val input2: TextView = findViewById(R.id.input2)
        val input1: TextView = findViewById(R.id.input1)
        val input050: TextView = findViewById(R.id.input0_50)
        val input020: TextView = findViewById(R.id.input0_20)
        val input010: TextView = findViewById(R.id.input0_10)
        val input005: TextView = findViewById(R.id.input0_05)
        val input002: TextView = findViewById(R.id.input0_02)
        val input001: TextView = findViewById(R.id.input0_01)

        btntotal.setOnClickListener() {

            val mon500: Int = if (input500.text.toString().isBlank()) 0 else (input500.text.toString()).textToInt() * 500
            val mon200: Int = if (input200.text.toString().isBlank()) 0 else (input200.text.toString()).textToInt() * 200
            val mon100: Int = if (input100.text.toString().isBlank()) 0 else (input100.text.toString()).textToInt() * 100
            val mon50: Int = if (input50.text.toString().isBlank()) 0 else (input50.text.toString()).textToInt() * 50
            val mon20: Int = if (input20.text.toString().isBlank()) 0 else (input20.text.toString()).textToInt() * 20
            val mon10: Int = if (input10.text.toString().isBlank()) 0 else (input10.text.toString()).textToInt() * 10
            val mon5: Int = if (input5.text.toString().isBlank()) 0 else (input5.text.toString()).textToInt() * 5
            val mon2: Int = if (input2.text.toString().isBlank()) 0 else (input2.text.toString()).textToInt() * 2
            val mon1: Int = if (input1.text.toString().isBlank()) 0 else (input1.text.toString()).textToInt() * 1
            val mon05: Double = if (input050.text.toString().isBlank()) 0.0 else (input050.text.toString()).textToInt() * 0.5
            val mon02: Double = if (input020.text.toString().isBlank()) 0.0 else (input020.text.toString()).textToInt() * 0.2
            val mon01: Double = if (input010.text.toString().isBlank()) 0.0 else (input010.text.toString()).textToInt() * 0.1
            val mon005: Double = if (input005.text.toString().isBlank()) 0.0 else (input005.text.toString()).textToInt() * 0.05
            val mon002: Double = if (input002.text.toString().isBlank()) 0.0 else (input002.text.toString()).textToInt() * 0.02
            val mon001: Double = if (input001.text.toString().isBlank()) 0.0 else (input001.text.toString()).textToInt() * 0.01
            val semitotal = (mon500 + mon200 + mon100 + mon50 + mon20 + mon10 + mon5 + mon2 + mon1 + mon05 + mon02 + mon01 + mon005 + mon002 + mon001).toDouble()
            val total = BigDecimal(semitotal).setScale(2, BigDecimal.ROUND_HALF_UP).toString()


            //pass data to new activity
            val intent = Intent(this@MainActivity,Result::class.java)
            intent.putExtra("Total", total)
            startActivity(intent)
        }
    } 
}