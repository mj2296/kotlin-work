// Task 5.1.2: main program

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    val randomNumber = if (args.isEmpty()) {
        rollDie()
    } else {
        rollDie(args[0].toInt())
    }
    println("Number rolled: $randomNumber")
}