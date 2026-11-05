// Task 9.6: variance() function

fun variance(data: List<Double>): Double {
    require(data.size >= 2) { "Dataset must contain at least two values" }
    val mean = data.average()
    val sumOfSquares = data.sumOf { (it - mean) * (it - mean) }
    return sumOfSquares / (data.size - 1)
}
