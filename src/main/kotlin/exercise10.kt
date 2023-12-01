/*10. Data Types
Create a program that demonstrates the use of various data types in Kotlin, including integers,
floating-point numbers, booleans, and characters. Show how they can be converted and manipulated.*/

fun main() {

    // Integers
    val myInt: Int = 10
    println("Integer: $myInt")

    // Floating point number
    val myDouble: Double = 3.14
    println("Double: $myDouble")

    // Boolean
    val myBoolean: Boolean = true
    println("Boolean: $myBoolean")

    // Character
    val myChar: Char = 'A'
    println("Char: $myChar")

    // String
    val myString: String = "Hello, Kotlin!"
    println("String: $myString")

    // Conversion
    val doubleFromInt: Double = myInt.toDouble()
    println("Double from Int: $doubleFromInt")

    val intFromDouble: Int = myDouble.toInt()
    println("Int from Double: $intFromDouble")

    val stringFromInt: String = myInt.toString()
    println("String from Int: $stringFromInt")
}

