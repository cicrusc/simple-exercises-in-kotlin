fun menu(): Int {
    println("\nMenu:")
    println("1. Show the seats")
    println("2. Buy a ticket")
    println("0. Exit")
    return readln().toInt()
}


fun main() {
    println("Enter the number of rows:")
    val rows = readln().toInt()
    println("Enter the number of seats in each row:")
    val seatsInRow = readln().toInt()

    val cinema = MutableList(rows) { MutableList(seatsInRow) { "S" } }

    fun printCinema() {
        println("\nCinema:")
        print("  ")
        for (seat in 1..seatsInRow) {
            print("$seat ")
        }
        println()
        for (i in 0 until rows) {
            print("${i + 1} ")
            println(cinema[i].joinToString(" "))
        }
    }

    while (true) {
        val choice = menu()
        when (choice) {
            1 -> printCinema()
            2 -> {
                // Codice per acquistare un biglietto
                println("Enter a row number:")
                val choiceRow = readln().toInt()
                println("Enter a seat number in that row:")
                val choiceSeat = readln().toInt()

                cinema[choiceRow - 1][choiceSeat - 1] = "B"

                val totalSeats = rows * seatsInRow
                val frontHalfRows = rows / 2
                val backHalfRows = rows - frontHalfRows

                val ticketPrice = if (totalSeats <= 60) 10
                else if (choiceRow <= frontHalfRows) 10
                else 8

                println("Ticket Price: $$ticketPrice")
            }
            0 -> {
                println("Exiting...")
                break
            }
            else -> println("Invalid choice. Please try again.")
        }
    }
}


