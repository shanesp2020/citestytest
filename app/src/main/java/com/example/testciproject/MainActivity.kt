package com.example.testciproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private val stateList = arrayListOf<State>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val states = resources.getStringArray(R.array.states_array)

        for (i in states) {
            val state = State(i)
            stateList.add(state)
        }

        button.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v) {
            button -> {
                val random =Random.nextInt(0, stateList.size)
                textView.text = stateList[random].name
            }
        }
    }
}
