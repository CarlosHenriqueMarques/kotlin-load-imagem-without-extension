package com.example.imagemwithoutextensioninkotlin


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //Funciona
        //Picasso.get().load("https://i.imgur.com/H981AN7.jpg").into(myImageView)

        //Não funciona
        //Picasso.get().load("http://d1s5a4e3za7rni.cloudfront.net/Custom/Content/Products/10/13/1013450_purificador-de-agua-electrolux-pc41x-prata_s4_636822411415208179").into(myImageView)

        Glide.with(this).load("http://d1s5a4e3za7rni.cloudfront.net/Custom/Content/Products/10/13/1013450_purificador-de-agua-electrolux-pc41x-prata_s4_636822411415208179").into(myImageView)

    }
}
