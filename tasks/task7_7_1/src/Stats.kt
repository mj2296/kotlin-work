// Task 7.7.1: statistics functions

// Median: the middle value of the sorted data, or the mean of the
// two middle values if there is an even number of values
fun median(values: List<Float>): Float {
    val sorted = values.sorted()
    val middle = sorted.size / 2
    return if (sorted.size % 2 == 0) {
        (sorted[middle - 1] + sorted[middle]) / 2
    }
    else {
        sorted[middle]
    }
}

// Prints the minimum, maximum, mean and median of the given values
fun displayStats(values: List<Float>) {
    println("Number of values: ${values.size}")
    println("Minimum: %.3f".format(values.min()))
    println("Maximum: %.3f".format(values.max()))
    println("Mean:    %.3f".format(values.average()))
    println("Median:  %.3f".format(median(values)))
}
