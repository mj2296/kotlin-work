// Task 8.3: weather station temperature analysis program

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.isEmpty()) {
        println("Error: filename required as a command line argument")
        exitProcess(1)
    }

    val dataset = fetchData(args[0])

    val coldest = dataset.minBy { it.second }
    val warmest = dataset.maxBy { it.second }
    println("Lowest temperature: ${coldest.first}, ${coldest.second}")
    println("Highest temperature: ${warmest.first}, ${warmest.second}")

    // Average using the provided function
    println("Average temperature: %.2f".format(averageTemp(dataset)))

    // Challenge: average in one line, no helper function
    println("Average temperature: %.2f".format(dataset.map { it.second }.average()))
}
