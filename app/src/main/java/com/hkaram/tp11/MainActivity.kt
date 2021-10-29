package com.hkaram.tp11

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.squareup.picasso.Picasso


class MainActivity : AppCompatActivity(), View.OnClickListener {
        private lateinit var imageView: ImageView
        private lateinit var button: Button

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
            imageView = findViewById(R.id.image_view)
            button = findViewById(R.id.myButton)
            button.setOnClickListener(this)
            loadImage(url = "https://goo.gl/gEgYUd")
        }
        private fun loadImage(url: String) {
            Picasso.get()
                .load(url)
                .resize(500, 500)
                .centerCrop()
                .into(imageView)
        }

        private override fun onClick(view: View?) {
            val link = "https://www.vectorkhazana.com/assets/images/products/Smelly-Cat.jpg"
            loadImage(link)
            Toast.makeText(this, "You click me", Toast.LENGTH_LONG).show()
        }

//      Glide.with(activity = this)
//            .load(string="url")
//            .fallback(R.drawable.ic_launcher_background)
//            .into(imageView)
    }