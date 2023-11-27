/*7. Invoking Functions
Exercise: Create a program that defines some simple functions (for example, a function that doubles a number) and demonstrates how they can be invoked.*/

fun double(num: Int): Int {
  return num * 2
}

fun main() {
   val number = 5
   val result = double(number)
   println("The double of $number is $result")
}