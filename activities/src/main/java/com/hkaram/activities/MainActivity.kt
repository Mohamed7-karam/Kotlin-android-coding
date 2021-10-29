package com.hkaram.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

open class MainActivity : AppCompatActivity() {

    private lateinit var clickButton: Button
    private var nbClick = 0
    private lateinit var text: TextView
    private lateinit var click1Button: Button




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        clickButton = findViewById(R.id.btn_click_me)
        click1Button = findViewById(R.id.btn_compute)

        text = findViewById(R.id.text)
        if (nbClick == 0){
            text.text = ""
        }

        clickButton.setOnClickListener {
            nbClick++
          //  val newText = "Cliquez moi $nbClick"
         //   clickButton.text = newText
            val msg = "Vous avez cliquez $nbClick fois"
            text.text= msg
            if (nbClick == 5){

                clickButton.isEnabled = false
            }

        }

        click1Button.setOnClickListener {
            val intent = Intent(baseContext, ComputeActiviy::class.java)
            startActivity(intent)
        }

    }
}