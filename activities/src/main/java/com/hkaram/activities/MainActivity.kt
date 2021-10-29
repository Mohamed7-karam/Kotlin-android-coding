package com.hkaram.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.hkaram.activities.databinding.ActivityMainBinding
import org.w3c.dom.Text

open class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var nbClick = 0





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        if (nbClick == 0){
            binding.text.text = ""
        }

        binding.btnClickMe.setOnClickListener {
            nbClick++
          //  val newText = "Cliquez moi $nbClick"
         //   clickButton.text = newText
            val msg = "Vous avez cliquez $nbClick fois"
            binding.text.text= msg
            if (nbClick == 5){

                binding.btnClickMe.isEnabled = false
            }

        }

        binding.btnCompute.setOnClickListener {
            val intent = Intent(baseContext, ComputeActiviy::class.java)
            startActivity(intent)
        }

    }
}