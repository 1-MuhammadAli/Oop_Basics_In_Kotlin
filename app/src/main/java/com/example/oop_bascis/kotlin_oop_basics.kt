package com.example.oop_bascis

fun  main() {
   // Creating Instances of Classes
    var ali = Person("Ahmed" , "Ali")
    var m = Person()
    var arslan = Person(lastName = "Arslan")
    myFunction(a=5)
}

class Person(firstName: String = "M" , lastName: String = "Ali") {

    init {
        println("Initialized a new Person object with firstName = $firstName and lastName = $lastName")
    }
}

fun myFunction(a:Int){
    var a = 4
    println("a is $a")
}

