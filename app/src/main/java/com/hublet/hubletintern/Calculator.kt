package com.hublet.hubletintern

import android.annotation.SuppressLint
import kotlin.random.Random


fun main(){
    println("Calculator")
    println("Value for calculator:")
    val firstNumber = 10
    val secondNumber = 2
    println("$firstNumber , $secondNumber")

    println("Add Number: ${Calculator().addNumber(firstNumber,secondNumber)}")
    println("Subtract Number: ${Calculator().subNumber(firstNumber,secondNumber)}")
    println("Multiply Number: ${Calculator().mulNumber(firstNumber,secondNumber)}")
    println("Devide Number: ${Calculator().devNumber(firstNumber,secondNumber)}")
    println("Mod of Numbers: ${Calculator().modNumber(firstNumber,secondNumber)}")


    //list
    val readOnlyShapes = listOf("Triangle","Rectangle","Circle")
    println(readOnlyShapes)
    val shape : MutableList <String> = mutableListOf("Triangle" ,"Rectangle","Circle")
    println(shape)
    println("The first item of the list: ${readOnlyShapes.first()},${readOnlyShapes.last()}")
    println("There are : ${readOnlyShapes.count()} items in the list")
    println("Circle" in readOnlyShapes)
    shape.add("pentagon")
    println(shape)
    shape.remove("Rectangle")
    println(shape)

    //Set
    val readOnlyFruit = setOf("apple","banana","cherry","cherry")
    println(readOnlyFruit)
    val fruit: MutableSet<String> = mutableSetOf("apple","banana","cherry","grapes")
    println(fruit)
    println("The first item of the list: ${readOnlyFruit.first()},${readOnlyFruit.last()}")
    println("There are : ${readOnlyFruit.count()} items in the set")
    println("grapes" in readOnlyShapes)
    fruit.add("Pineapple")
    println(fruit)
    fruit.remove("banana")
    println(fruit)

    //Map
    val readOnlyjuiceMenu = mapOf("apple" to 100, "papaya" to 200, "Kiwi" to 300)
    println(readOnlyjuiceMenu)
    val juiceMenu: MutableMap<String,Int> = mutableMapOf("apple" to 400,"banana" to 500,"mango" to 600)
    println(juiceMenu)
    println( "The value of apple in juice menu is: ${juiceMenu["apple"]}")
    println("mango" in juiceMenu)
    println( 500 in juiceMenu.values)

 //range
    val firstResult = Random.nextInt(6)
    val secondResult = Random.nextInt(6)
    println( "Second value $secondResult" )
    println( "Winner $firstResult" )
    if (firstResult == secondResult ){
        println("You Win")
    }
    else {
        println("You Lose")
    }
}

class Calculator {

    fun addNumber(firstNumber: Int, secondNumber: Int): Int {
        return (firstNumber + secondNumber)
    }

    fun subNumber(firstNumber: Int, secondNumber: Int): Int {
        return (firstNumber - secondNumber)

    }

    fun mulNumber(firstNumber: Int, secondNumber: Int): Int {
        return (firstNumber * secondNumber)

    }

    fun devNumber(firstNumber: Int, secondNumber: Int): Int {
        return (firstNumber / secondNumber)
    }

    fun modNumber(firstNumber: Int, secondNumber: Int): Int {
        return (firstNumber % secondNumber)
    }

    fun incNumber(firstNumber: Int): Int {
        var number = firstNumber + 1
        return ++number
    }

    fun decNumber(firstNumber: Int): Int {
        var i = firstNumber
        return (--i)
    }
}





