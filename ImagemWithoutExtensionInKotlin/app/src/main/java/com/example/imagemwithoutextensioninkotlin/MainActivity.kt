package com.example.imagemwithoutextensioninkotlin


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Glide.with(this).load("http://d1s5a4e3za7rni.cloudfront.net/Custom/Content/Products/10/13/1013450_purificador-de-agua-electrolux-pc41x-prata_s4_636822411415208179").into(myImageView)

    }
}
