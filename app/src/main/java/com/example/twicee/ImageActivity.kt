package com.example.twicee

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class ImageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image)

        val getData = intent.getStringExtra("data")

        val memImg = findViewById<ImageView>(R.id.memImg)

        if(getData == "1"){
            memImg.setImageResource(R.drawable.member_1)
        }
        if(getData == "2"){
            memImg.setImageResource(R.drawable.member_2)
        }
        if(getData == "3"){
            memImg.setImageResource(R.drawable.member_3)
        }
        if(getData == "4"){
            memImg.setImageResource(R.drawable.member_4)
        }
        if(getData == "5"){
            memImg.setImageResource(R.drawable.member_5)
        }
        if(getData == "6"){
            memImg.setImageResource(R.drawable.member_6)
        }
        if(getData == "7"){
            memImg.setImageResource(R.drawable.member_7)
        }
        if(getData == "8"){
            memImg.setImageResource(R.drawable.member_8)
        }
        if(getData == "9"){
            memImg.setImageResource(R.drawable.member_9)
        }
    }
}