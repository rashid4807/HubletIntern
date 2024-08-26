package com.hublet.hubletintern.basic.kotlinClass


fun main() {
    val classLearning = ClassLearning("Jenny", 29)
    classLearning.speak()

    //creating Car class object c1
    val c1 = Car()
    c1.brand = "Ford"
    c1.color = "Black "
    c1.year = 1997

    println("The brand name of car c1 is ${c1.brand}")
    println("The model name of car c1 is ${c1.color}")
    println("The year name of car c1 is ${c1.year}")

    //creating another car class object
    val c2 = Car()
    c2.brand = "BMW"
    c2.color = "White "
    c2.year = 2024

    println("The brand name of car c2 is ${c2.brand}")
    println("The model name of car c2 is ${c2.color}")
    println("The year name of car c2 is ${c2.year}")

    //class with constructor
    val c3 = Car2("BMW", " Gray", 2021)
    val c4 = Car2("Ford", " Yellow", 1887)
    println(c3.brand)
    println(c1.color)
    println(c4.year)
//class function and passing parameter
    c3.drive()
    c3.speed(120)


    //superclass subclass
    val myobj = myChildClass()
    myobj.myfunction()

    UseAbstract().dressUp()
    UseAbstract().internalOrganWorks()
}


class ClassLearning(val name: String, val age: Int) {
    fun speak() {
        println("hello my name is $name and my age is $age")
    }
}

//class
class Car {
    var brand = ""
    var color = ""
    var year = 0
}

//class with constructor
// class with function inside
class Car2(var brand: String, var color: String, var year: Int) {
    fun drive() {
        println("Drive faster!")
    }

    fun speed(maxspeed: Int) {
        println("maximum speed is, ${maxspeed}")
    }
}

//superclass subclass
open class myParentClass {
    val x = 5
}

class myChildClass : myParentClass() {
    fun myfunction() {
        println(x)
    }
}

abstract class ChildClass() {
    fun internalOrganWorks() {
        println("Test function")
    }

    abstract fun dressUp()
}

class UseAbstract : ChildClass() {
    override fun dressUp() {
        println("Abstract function")
    }
}