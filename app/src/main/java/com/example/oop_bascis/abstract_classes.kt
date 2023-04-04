package com.example.oop_bascis

abstract class Shape {
    abstract fun area() : Double
    abstract fun display()
}
class Circle(val radius:Double) : Shape() {
    override fun area(): Double = Math.PI*radius*radius


    override fun display() {
       println("Circle is getting display")
    }
}

fun main(){
    val circle = Circle(4.0)
    println(circle.area())
    circle.display()
}