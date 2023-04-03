package com.example.oop_bascis

data class User(val id: Long, val name: String)

fun main(){
    val user1 = User(id = 1, name = "Ali")
    //val name = user1.name
    //println(name)
    val user2 = User(id = 1, name="Ahmed")

    println(user1 == user2)
    println("User Details: $user1")
    val updatedUser = user1.copy(name = "M Ali")
    println(user1)
    println(updatedUser)

    println(updatedUser.component1()) // prints 1
    println(updatedUser.component2()) // prints M Ali

    val (id,name) = updatedUser
    println("id=$id, name=$name")
}