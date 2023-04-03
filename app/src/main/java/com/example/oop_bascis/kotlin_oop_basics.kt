package com.example.oop_bascis

fun  main() {
   // Creating Instances of Classes
    var ali = Person("Ahmed" , "Ali")
    var m = Person()
    var arslan = Person(lastName = "Arslan")

}

class Person(firstName: String = "M" , lastName: String = "Ali") {

    init {
        println("Initialized a new Person object with firstName = $firstName and lastName = $lastName")
    }
}