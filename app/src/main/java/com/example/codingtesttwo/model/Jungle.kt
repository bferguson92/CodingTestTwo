package com.example.codingtesttwo.model

import android.util.Log

class Jungle() {
    val meat = "meat"
    val bugs = "bugs"
    val fish = "fish"
    val grain = "grain"

    fun soundOff(animals: List<Animal>){
        for(i in animals){
            i.makeSound()
            Log.d("TAG:ENERGY","$i.energy")
        }
    }
}