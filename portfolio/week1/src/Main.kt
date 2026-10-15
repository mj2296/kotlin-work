// COMP2850 Portfolio: Week 1
// Program to compute area of a triangle

import kotlin.math.sqrt
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    // check if 3 arguments are present and handle issues
    if (args.size != 3){ 
        println("Error: values for a, b, c required on command line")       
        exitProcess(1)  
    }
    
    //assign arguments to vals and convert type
    val firstSide = args[0].toDouble()
    val secondSide = args[1].toDouble()
    val thirdSide = args[2].toDouble()

    //calculate area with herons formula
    val x = ((firstSide + secondSide + thirdSide) / 2)
    val area = sqrt(x * (x - firstSide) * (x-secondSide) * (x - thirdSide))
    
    //print area
    println("Area = %.5f".format(area))
}
