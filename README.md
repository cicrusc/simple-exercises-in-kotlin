# simple-exercises-in-kotlin
A collection of Kotlin exercises with the best solutions I know

---

## Overview
This repository contains a series of exercises in Kotlin, aimed at strengthening the understanding of the language and its key features. Each exercise is designed to practice specific Kotlin concepts in a simple and effective way.

## Exercises Example

### Exercise 1: Introduction to Kotlin
**File**: `Exercise1.kt`

**Description**:
A simple program that introduces basic input/output in Kotlin. This exercise prints a welcome message, asks the user to enter their name, and then greets the user with their name. The program demonstrates the use of print and read functions in Kotlin, as well as string manipulation.

**What You'll Learn**:
- Using `println` for output.
- Reading user input with `readln()`.
- String manipulation: converting to lowercase and capitalizing.

**Code**:
```kotlin
fun main() {
    println("Welcome to Kotlin!")
    println("Enter your name:")
    val name = readln().lowercase().replaceFirstChar { it.titlecase() }
    println("Hello, $name!")
}
```

## How to Use This Repository
You can clone this repository and run each exercise file to see how it works. Each `.kt` file represents a separate exercise.

## Contributing
Feel free to explore, use, and contribute to this repository. If you have suggestions or improvements, feel free to open a pull request or an issue.

---