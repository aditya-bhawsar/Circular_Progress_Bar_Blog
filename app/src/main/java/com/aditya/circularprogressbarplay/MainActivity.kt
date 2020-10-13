package com.aditya.circularprogressbarplay

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun setProgressTo(progress: Int){
        progress_tv.text = "$progress%"
        circular_determinative_pb.progress = progress
    }

    fun setSecondaryProgressTo(progress: Int){
        circular_determinative_pb.secondaryProgress = progress
    }



}