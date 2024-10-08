package com.tnbk00.colormyviews

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()

        }

        private fun setListeners() {
            val clickableViews: List<View> = listOf(findViewById(R.id.box_one_text),
                findViewById(R.id.box_two_text), findViewById(R.id.box_three_text), findViewById(R.id.box_four_text),
                findViewById(R.id.box_five_text), findViewById(R.id.constraint_layout))
            for (item in clickableViews) {
                item.setOnClickListener {makeColored(it)}
            }
        }
        private fun makeColored(view: View) {
            when (view.id) {

                // Boxes using Color class colors for background
                R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
                R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)

                // Boxes using Android color resources for background
                R.id.box_three_text -> view.setBackgroundResource(android.R.color.holo_red_dark)
                R.id.box_four_text -> view.setBackgroundResource(android.R.color.holo_green_dark)
                R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_green_light)

                else -> view.setBackgroundColor(Color.LTGRAY)
            }
        }
    }
