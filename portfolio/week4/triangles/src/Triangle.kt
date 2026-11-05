// COMP2850 Portfolio: Week 4
// Triangle class

import kotlin.math.sqrt

class Triangle(val sideA: Double, val sideB: Double, val sideC: Double) {
    
    init {
        require(
            sideA > 0 && sideB > 0 && sideC> 0 &&
            sideA < sideB + sideC &&
            sideB < sideA + sideC &&
            sideC < sideA + sideB
        ) { "Values for the triangles side are invalid."}
    }

    val perimeter get() = sideA + sideB + sideC
    val semiPerimeter get() = perimeter / 2
    val area get() = sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC))

    override fun toString() = "Triangle($sideA, $sideB, $sideC)"
}
    
