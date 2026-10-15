// Task 4.3: grade calculation using a when expression

import kotlin.system.exitProcess
import kotlin.math.roundToInt

fun main(args: Array<String>) {

    if (args.size != 3) {
        println("Error: Three marks required on command line")
        exitProcess(1)
    }
    
    val first = args[0].toInt()
    val second = args[1].toInt()
    val third = args[2].toInt()
    
    val mark = ((first + second + third) / 3.0).roundToInt()

    val grade = when (mark) {
        in 0..39 -> "Fail"
        in 40..69 -> "Pass"
        in 70..100 -> "Distinction"
        else -> "?"
    }
    
    println("Average mark: $mark")
    println("Grade: $grade")
}