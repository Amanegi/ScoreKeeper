package com.example.scorekeeper

import android.graphics.drawable.AnimationDrawable
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val animationDrawable : AnimationDrawable = mLayout.background as AnimationDrawable
        animationDrawable.setEnterFadeDuration(4000)
        animationDrawable.setExitFadeDuration(4000)
        animationDrawable.start()
    }

    fun decreaseScore(v: View) {
        when (v) {
            t1BtnMinus -> if (t1Score.text != "0") t1Score.text = (t1Score.text.toString().toInt() - 1).toString()
            t2BtnMinus -> if (t2Score.text != "0") t2Score.text = (t2Score.text.toString().toInt() - 1).toString()
        }
    }

    fun increaseScore(v: View) {
        when (v) {
            t1BtnPlus -> t1Score.text = (t1Score.text.toString().toInt() + 1).toString()
            t2BtnPlus -> t2Score.text = (t2Score.text.toString().toInt() + 1).toString()
        }
    }

}
