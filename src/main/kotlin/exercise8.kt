/*Exercise 8: Standard Input with Java Scanner
Write a program that uses java.util.Scanner to read user input, such as a number or a string,
and then performs some operations or calculations based on that input.*/

import java.util.Scanner
import java.math.BigInteger

fun fibonacci(n: Int): Int {
    if (n <= 1) return n
    var a = 0
    var b = 1
    for (i in 2..n) {
        val sum = a + b
        a = b
        b = sum
    }
    return b
}

fun factorial(number: Int): BigInteger {
    var result = BigInteger.ONE
    for (i in 1..number) {
        result = result.multiply(BigInteger.valueOf(i.toLong()))
    }
    return result
}

fun main() {
    val scanner = Scanner(System.`in`)
    println("Enter a number:")
    val input = scanner.nextLine()

    try {
        val number = input.toInt()
        println("You have entered the number: $number")

        val square = number * number
        println("The square of your number is: $square")

        val fact = factorial(number)
        println("The factorial of your number is: $fact")

        val binary = number.toString(2)
        println("The binary representation of $number is: $binary")

        val fib = fibonacci(number)
        println("The Fibonacci value at position $number is: $fib")
    } catch (e: NumberFormatException) {
        println("Error: '$input' is not a valid number.")
    }
}
