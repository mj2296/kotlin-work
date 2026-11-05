// Task 9.6: application to compute dataset variance

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Error: filename required as a command line argument")
        exitProcess(1)
    }

    try {
        val data = readData(args[0])
        println("Dataset size: ${data.size}")
        println("Variance: %.5f".format(variance(data)))
    }
    catch (error: Exception) {
        println("Error: ${error.message}")
        exitProcess(2)
    }
}
