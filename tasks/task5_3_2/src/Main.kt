// Task 5.3.2: main program

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Error: dice specification required, e.g. 3d8")
        exitProcess(1)
    }

    val parts = args[0].lowercase().split("d")
    if (parts.size != 2) {
        println("Error: invalid dice specification: ${args[0]}")
        exitProcess(1)
    }

    val numberOfDice = parts[0].toIntOrNull()
    val numberOfSides = parts[1].toIntOrNull()
    if (numberOfDice == null || numberOfSides == null) {
        println("Error: invalid dice specification: ${args[0]}")
        exitProcess(1)
    }

    rollDice(sides = numberOfSides, dice = numberOfDice)
}
