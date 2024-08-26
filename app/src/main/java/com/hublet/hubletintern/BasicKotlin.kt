package com.hublet.hubletintern

import android.util.Log

// Variable
//Class
// Function
// Function with param
// Function with return  sum(x: Int, y: Int) -----[: Int]
class BasicKotlin {
    var custome: Int = 30
    var customers: Float =  30.35f
    var customer = 57
    val details: String = "Hello, world!"
    val e : Boolean = false

    val findGreaterNumber = "Find Greater Number"
    val matchString = "Match String"
    val stringMessage = "Hello"

    fun findGreaterNumber(first: Int, second: Int) {
        Log.d("BasicKotlin","${if(first>second) first else second}" )
    }

    fun matchString(message: String) {
        //when condition
        when (message){
            "1" ->  Log.d("BasicKotlin","one")
            "Hello" -> Log.d("BasicKotlin","Greetings!")
            else -> Log.d("BasicKotlin","unknown")
        }
    }

    fun printNumber(){
        for (number in 1..5){
            Log.d("BasicKotlin","number: $number")
        }
    }

    fun sum(x: Int, y: Int): Int {
        return x + y
    }

}





















