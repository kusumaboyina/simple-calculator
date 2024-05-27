package com.example.simplecalculator

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addingtwonumbers()
}


fun addingtwonumbers()
{
   var num1 = findViewById<EditText>(R.id.number1)
    var num2 = findViewById<EditText>(R.id.number2)
    var button1 = findViewById<Button>(R.id.addition)
    var button5 = findViewById<Button>(R.id.clearbutton)
    var button2 = findViewById<Button>(R.id.subtract)
    var button3 = findViewById<Button>(R.id.multiply)
    var button4 = findViewById<Button>(R.id.divide)

    button1.setOnClickListener {
        var addnum1 = num1.text.toString().toInt()
        var addnum2 = num2.text.toString().toInt()
        var result = addnum1 + addnum2
        Toast.makeText(this,"$result",Toast.LENGTH_SHORT).show()

    }

    button2.setOnClickListener {
        var addnum1 = num1.text.toString().toInt()
        var addnum2 = num2.text.toString().toInt()
        var result = addnum1 - addnum2
        Toast.makeText(this,"$result",Toast.LENGTH_SHORT).show()

    }

    button3.setOnClickListener {
        var addnum1 = num1.text.toString().toInt()
        var addnum2 = num2.text.toString().toInt()
        var result = addnum1 * addnum2
        Toast.makeText(this,"$result",Toast.LENGTH_SHORT).show()
    }

    button4.setOnClickListener {
        var addnum1 = num1.text.toString().toInt()
        var addnum2 = num2.text.toString().toInt()
        var result = addnum1 % addnum2
        Toast.makeText(this,"$result",Toast.LENGTH_SHORT).show()
    }
    button5.setOnClickListener {
        num1.setText("");
        num2.setText("");
        Toast.makeText(this ,"Cleared",Toast.LENGTH_SHORT).show()

    }


    }
}
