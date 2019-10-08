package com.example.codingtesttwo.model

import android.util.Log

class Tiger(energy: Int): Animal {
    override var energy: Int = 10

    override fun makeSound() {
        Log.d("TAG:SOUND", "Tiger Sound")

        energy -= 3
    }

    override fun eat(food: String) {
        if(!food.equals("grain")){
            energy += 5
        }
    }

    override fun sleep(){
        energy += 15
    }
}