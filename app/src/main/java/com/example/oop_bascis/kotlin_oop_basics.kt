package com.example.oop_bascis

fun  main() {
   // Creating Instances of Classes
    var ali = Person(firstName = "Ahmed" , lastName = "Ali" , age = 25)
    var m = Person()
    ali.age = 24
    println("Ali is ${ali.age} years old")
    m.hobby="pigeon"
    m.stateHobby()
    var arslan = Person(lastName = "Arslan")
    myFunction(a=5)
    ///////////////////
    var myCar = Car()
    myCar.maxSpeed = 200
    println("brand is : ${myCar.myBrand}")
    println("Max Speed is : ${myCar.maxSpeed}")
    println("Model is ${myCar.myModel}")
}

class Person(firstName: String = "M" , lastName: String = "Ali") {

    var hobby : String ="Cricket"
    var age : Int? = null
    var firstName : String? = null

    init {
        this.firstName = firstName
        println("Initialized a new Person object with firstName = $firstName and lastName = $lastName")
    }

    //Member secondary constructor
    constructor(firstName: String , lastName: String , age: Int)
            : this(firstName,lastName){
                this.age = age
        println("Initialized a new Person object with firstName = $firstName and lastName = $lastName and age $age")
            }
    fun stateHobby(){
        println("$firstName\'s hobby is $hobby")
    }
}

fun myFunction(a:Int){
    var a = 4
    println("a is $a")
}

class  Car(){
    lateinit var owner : String

    val myBrand: String = "BMW"
        // Custom getter
    get() {
        return field.toLowerCase()
    }
    var maxSpeed: Int = 250
    get() = field
    set(value) {
        field = if (value > 0) value else throw java.lang.IllegalArgumentException("Maxspeed cannot be less than 0")
    }
    var myModel : String ="M5"
    private set
    init {
        this.myModel = "M3"
        this.owner = "Ali"
    }
}

