// Task 5.2.1: main program

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Error: exactly one number for circle radius must be provided on the command line.")
        exitProcess(1)
    }

    val circleRadius = args[0].toDouble()
    val areaOfCircle = circleArea(circleRadius)
    val perimeterOfCircle = circlePerimeter(circleRadius)

    println("Circle area is: ${"%.4f".format(areaOfCircle)}")
    println("Circle perimeter is: ${"%.4f".format(perimeterOfCircle)}")
}