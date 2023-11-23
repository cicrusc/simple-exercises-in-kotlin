/*1. Introduction to Kotlin
Exercise: Write a simple Kotlin program that prints "Welcome to Kotlin!" and then asks the user to enter their name.
After the user has entered their name, the program should print "Hello, [name]!".*/


fun main() {
    println("Welcome to Kotlin!")
    println("Enter your name:")
    val name = readln().lowercase().replaceFirstChar { it.titlecase() }
    println("Hello, $name!")
}

