/*13.Naming Variables
Create a program following Kotlin's coding conventions.
Pay attention to formatting, variable and function naming, and the general structuring of the code.
 */

fun main() {
    val maximumSpeed = 120 // Maximum allowed speed in km/h
    var currentSpeed = 80 // Current speed of the vehicle
    val vehicleName = "Smart" // Name of the vehicle

    println("Vehicle: $vehicleName")
    println("Maximum allowed speed: $maximumSpeed km/h")

    // Updating the current speed
    currentSpeed += 20
    println("Current speed: $currentSpeed km/h")

    // Calculating the possible distance
    val fuelInTank = 50 // Fuel in the tank in liters
    val fuelEfficiency = 15 // Fuel efficiency in km/liter
    val distancePossible = fuelInTank * fuelEfficiency // Possible distance to travel

    println("The $vehicleName can travel up to $distancePossible km with the remaining fuel.")
}
