/*12.Kotlin Style Guide. Coding Conventions
Create a program following Kotlin's coding conventions.
Pay attention to formatting, variable and function naming, and the general structuring of the code.
 */

// Kotlin Style Guide Example: Demonstrating Kotlin Coding Conventions

fun calculateAreaOfRectangle(length: Int, width: Int): Int {
    return length * width
}

fun main() {
    val rectangleLength = 15
    val rectangleWidth = 10

    // Calculate the area of a rectangle
    val area = calculateAreaOfRectangle(rectangleLength, rectangleWidth)

    // Print the result with a descriptive message
    println("The area of a rectangle with length $rectangleLength and width $rectangleWidth is $area.")
}
