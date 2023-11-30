/* 9. Properties of Basic Types
Explore the properties of basic types in Kotlin.
Create variables of different types, such as Int, Double, String, and use their properties, like length
for strings or toChar() for numbers, to manipulate and print these values.*/

fun main() {
    val number = 65
    val text = "Kotlin Programming"
    val decimal = 3.14

    println("Character from number: ${number.toChar()}") // Convert a number to a character
    println("Length of the string: ${text.length}") // Length of a string
    println("Text in UPPERCASE: ${text.toUpperCase()}") // Text to uppercase
    println("Text in lowercase: ${text.toLowerCase()}") // Text to lowercase
    println("Substring: ${text.substring(0, 6)}") // Substring of a string

    val character = '8'
    println("Is it a digit?: ${character.isDigit()}") // Check if it's a digit
    println("Is it a letter?: ${character.isLetter()}") // Check if it's a letter

    val numInt = decimal.toInt()
    println("Double to Int: $numInt") // Convert Double to Int

    val condition = true
    println("Not true?: ${!condition}") // Negation of a boolean

    // Other methods and properties
    println("Plus: ${5.plus(3)}") // Sum of two numbers
    println("Minus: ${10.minus(4)}") // Subtraction of two numbers
    println("Times: ${7.times(6)}") // Multiplication of two numbers
    println("Div: ${20.div(4)}") // Division of two numbers
    println("Remainder: ${28.rem(5)}") // Remainder of a division
    println("To Double: ${42.toFloat().toDouble()}") // Conversion to Double
    println("To Float: ${123.toDouble().toFloat()}") // Conversion to Float
    println("To String: ${123.toString()}") // Conversion to String
    println("Trim: ${" Kotlin ".trim()}") // Remove spaces at the start and end
    println("IsNullOrBlank: ${null.isNullOrBlank()}") // Check if a string is null or blank
}



