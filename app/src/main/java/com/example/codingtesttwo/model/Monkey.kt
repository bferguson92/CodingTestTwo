package com.example.codingtesttwo.model

import android.util.Log

class Monkey: Animal {
    override var energy: Int = 10

    override fun makeSound() {
        Log.d("TAG:SOUND", "Monkey Sound")
        energy -= 7
    }

    override fun eat(food: String) {
            energy += 7

    }

    override fun sleep(){
        energy += 15
    }

    fun play(): String{
        if(energy > 8){
            energy -= 8
            return "Oooo Oooo Oooo"
        } else {
            return "Monkey is too tired"
        }
    }
}