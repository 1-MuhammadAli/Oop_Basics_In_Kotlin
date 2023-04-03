package com.example.oop_bascis


open class Bus(val name: String, val brand: String){
    open var range: Double = 0.0

    fun extendRange(amount: Double){
        if (amount > 0)
            range +=amount
    }

    open fun drive(distance: Double){
        println("Drove for $distance KM")
    }

    fun drive(){
        println("Drove for $range KM on electricity")
    }

}
class  ElectricBus(name: String, brand: String, batteryLife: Double) : Bus(name, brand){

    override var range = batteryLife * 6
    override  fun drive(distance: Double){
        println("Drove for $distance KM on electricity")
    }
}

fun main(){
    var audiA3 = Bus(name = "A3", brand = "Audi")
    var teslaS = ElectricBus(name = "S-Model", brand = "Tesla", batteryLife = 90.0)

    teslaS.extendRange(amount = 200.0)

    teslaS.drive()

    // polymorphism
    audiA3.drive(distance = 200.0)
    teslaS.drive(distance = 200.0)

}