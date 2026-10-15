// Task 7.7.1: data handling functions

import kotlin.io.path.Path
import kotlin.io.path.forEachLine

// Reads one floating-point value per line, skipping any blank lines,
// and returns them as an immutable list
fun readData(filename: String) = buildList {
    Path(filename).forEachLine {
        if (it.isNotBlank()) {
            add(it.trim().toFloat())
        }
    }
}
