package com.example.codingtesttwo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnAnswer2.setOnClickListener(this)

        val numArray = intArrayOf(1,3,6,7,2,4)
        sortArray(numArray)

    }

    //QUESTION 1
    private fun sortArray(numArray: IntArray){
        numArray.sort()
        tvAnswer1.text = numArray.joinToString()
        Log.d("TAG:SORT", numArray.joinToString())
    }

    //QUESTION 2
    private fun removeLetters(text: String){
        var answer = text
        var removeText: String = etAnswer2Part2.text.toString()

        if(text.contains(removeText)) {
            for(i in removeText.indices){
                 answer = answer.replace(removeText[i], ' ')
            }
        }

        answer = answer.replace("\\s".toRegex(), "")
        tvAnswer2.text = answer
    }

    //QUESTION 3
    private fun duplicateItems(compareArray: Array<Array<String>>): List<String>{

        val duplicates = mutableListOf<String>()
        for(i in compareArray){
            for(j in i){

            }
        }

        return duplicates
    }

    override fun onClick(view: View?) {
        removeLetters(etAnswer2Part1.text.toString())
    }
}
