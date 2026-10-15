// COMP2850 Portfolio: Week 2
// Functions for working with triangle geometry

import kotlin.math.sqrt

typealias Triangle = Triple<Double,Double,Double>

// Add isValidTriangle() and triangleArea() functions here

fun isValidTriangle(x: Triangle): Boolean {

    val firstSide = x.first
    val secondSide = x.second
    val thirdSide = x.third

    return firstSide < secondSide + thirdSide &&
           secondSide < firstSide + thirdSide &&
           thirdSide < firstSide + secondSide
}



fun triangleArea(x: Triangle): Double {

    //getting the triangle sides out of the triangle

    val firstSide = x.first
    val secondSide = x.second
    val thirdSide = x.third

    //calculate area with herons formula
    val s = ((firstSide + secondSide + thirdSide) / 2)
    val area = sqrt(s * (s - firstSide) * (s - secondSide) * (s - thirdSide))
    
    //print area
    return(area)
}
