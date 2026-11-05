// Task 12.8.1: demo program for Day enum class

fun main() {
    print("Enter a day: ")
    val input = readln().trim()

    try {
        val day = Day.valueOf(input)
        println("You entered $day (ordinal ${day.ordinal})")
    }
    catch (error: IllegalArgumentException) {
        println("'$input' is not a valid day.")
        println("Options are: ${Day.entries.joinToString()}")
    }
}
