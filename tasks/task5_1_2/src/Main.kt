// Task 5.1.2: main program

import kotlin.system.exitProcess

fun main (args: Array<String>) {
    if (args.size != 1) {
        println("Error: exactly one number for dice sides must be provided on the command line.")
        exitProcess(1)
    }

    val numberOfSides = args[0].toInt()
    val randomNumber = rollDie(numberOfSides)
    println("Number rolled: $randomNumber")
}