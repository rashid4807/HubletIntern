package com.hublet.hubletintern.basic


fun main(){
    val basicDataType = BasicDataType()

    println("Person: ${basicDataType.person} ? ${basicDataType.person.name}")

    println("Persons: ${basicDataType.getAllPersons()}")

    println("Add Person: ")
//    val person1 = Person("Jawad", 2)
//    basicDataType.addPerson(person1)
//    println("Add Person: ")
//    val person2 = Person("Marzia", 20)
//    basicDataType.addPerson(person2)
//    println("Add Person: ")
//    val person3 = Person("Rashid", 18)
//    basicDataType.addPerson(person3)

    for (i in 1..20){
        val person = Person("Jawad $i", 2+i)
        basicDataType.addPerson(person)
    }

    println("Persons: ${basicDataType.getAllPersons().get(0).name}")

//    basicDataType.removePerson(person1)
//    println("Persons: ${basicDataType.getAllPersons()}")
}
class BasicDataType {
    val person = Person("Marzia", 20)
    val personList : ArrayList<Person> = ArrayList()

    fun addPerson( person: Person){
        personList.add(person)
    }

    fun removePerson(person: Person): Boolean {
        return this.personList.remove(person)
    }


    fun getAllPersons(): ArrayList<Person>{
        return this.personList
    }

    fun getName(): String{
        return person.name
    }

    fun setAge(age: Int){
        person.age = age
    }

    fun getAge(): Int{
        return person.age
    }
}
class Person(val name: String, var age: Int)