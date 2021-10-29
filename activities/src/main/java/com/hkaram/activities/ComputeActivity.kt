package com.hkaram.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.hkaram.activities.databinding.ActivityMainBinding
import com.hkaram.activities.databinding.ComputeActivityBinding

class ComputeActiviy : AppCompatActivity(){
    private lateinit var binding: ComputeActivityBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ComputeActivityBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)




        binding.btnCalculer.setOnClickListener {
            binding.resultat.text = (binding.field1.text.toString().toDouble() + binding.field2.text.toString().toDouble()).toString()
        }



    }

}