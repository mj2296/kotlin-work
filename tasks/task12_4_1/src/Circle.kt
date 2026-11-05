// Task 12.4.1: Circle class

import kotlin.math.PI

class Circle(val centre: Point, val radius: Double) {
    init {
        require(radius > 0.0) { "Radius must be greater than zero" }
    }

    fun area() = PI * radius * radius

    fun perimeter() = 2.0 * PI * radius

    infix fun contains(point: Point) = centre.distanceTo(point) <= radius
}
