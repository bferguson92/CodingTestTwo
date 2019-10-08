package com.example.codingtesttwo.model

import android.util.Log

class Snake: Animal {


    override var energy: Int = 10

    override fun makeSound() {
        Log.d("TAG:SOUND", "Snake Sound")
        energy -= 3
    }

    override fun eat(food: String)  {
        energy += 5
    }


    override fun sleep() {
        energy += 10
    }

}
