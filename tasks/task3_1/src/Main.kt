// Task 3.1: command line arguments

import kotlin.system.exitProcess
fun main(args: Array<String>) {
    if (args.size >= 2) {
        val firstArg = args[0]
        val secondArg = args[1]
        
        println("First argument: $firstArg")
        println("Second argument: $secondArg")
    } else if (args.size != 1) {
        println("Error: filename required as sole argument")
        exitProcess(1)
    }

     else {
        println("Error: two command line arguments must be provided.")
    }
}