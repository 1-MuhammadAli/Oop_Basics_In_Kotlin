package com.example.oop_bascis

interface Draggable{
    fun drag()
}
abstract class Shapes : Draggable {
    abstract fun area() : Double
}
class Circle1(val radius:Double) : Shapes() {
    override fun area(): Double = Math.PI*radius*radius
    override fun drag() = println("Circle is dragging")

}
class Square(val side:Double) : Shapes() {
    override fun area(): Double = Math.PI*side*side
    override fun drag() = println("Square is dragging")

}
class Player(val name: String) :Draggable{
    override fun drag() = println("$name is dragging")
}
fun dragObjects(objects: Array<Draggable>){
    for(obj:Draggable in objects){
        obj.drag()
    }
}

fun main(){
    dragObjects(arrayOf(Circle1(4.0),Square(4.0),Player("Triangle")))
}