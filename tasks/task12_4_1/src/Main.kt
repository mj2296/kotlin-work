// Task 12.4.1: main program

fun main() {
    val circle = Circle(Point(0.0, 0.0), 2.0)
    println("Area: %.3f".format(circle.area()))
    println("Perimeter: %.3f".format(circle.perimeter()))

    val inside = Point(1.0, 1.0)
    val outside = Point(3.0, 0.0)
    println("Contains (1.0, 1.0)? ${circle contains inside}")
    println("Contains (3.0, 0.0)? ${circle contains outside}")

    // Uncomment to check that a negative radius is rejected
    // val bad = Circle(Point(0.0, 0.0), -1.0)
}
