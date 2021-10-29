package com.hkaram.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ComputeActiviy : AppCompatActivity(){
    private lateinit var boutonCalculer: Button
    private lateinit var textView: TextView
    private lateinit var editText1: EditText
    private lateinit var editText2: EditText



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.compute_activity)

        boutonCalculer = findViewById(R.id.btn_calculer)
        textView = findViewById(R.id.resultat)
        editText1 = findViewById(R.id.field_1)
        editText2 = findViewById(R.id.field_2)
        boutonCalculer.isEnabled = false


        editText2.setOnClickListener {
            boutonCalculer.isEnabled = true
        }

        boutonCalculer.setOnClickListener {
            textView.text = (editText1.text.toString().toDouble() + editText2.text.toString().toDouble()).toString()
        }



    }

}