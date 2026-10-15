// Task 7.7.1: program to compute stats for a numeric dataset

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Error: data filename required as sole argument")
        exitProcess(1)
    }

    val data = readData(args[0])

    if (data.isEmpty()) {
        println("Error: no values found in ${args[0]}")
        exitProcess(1)
    }

    displayStats(data)
}
