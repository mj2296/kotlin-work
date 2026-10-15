// Task 4.5: summing odd integers with a for loop

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    //add your code here
    if (args.size != 1) {
        println("Error: one upper limit required on command line")
        exitProcess(1)
    }

    val limit = args[0].toLong()
    var sum = 0L

    for (n in 1L..limit step 2) {
        sum += n
    }

    println("Sum of odd integers from 1 to $limit is $sum")
}