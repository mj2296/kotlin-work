// Task 4.7: finding the longest line in a file

import kotlin.io.path.Path
import kotlin.io.path.exists
import kotlin.io.path.forEachLine
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Error: path to a text file required on command line")
        exitProcess(1)
    }

    val filePath = Path(args[0])

    if (!filePath.exists()) {
        println("Error: file not found: ${args[0]}")
        exitProcess(1)
    }

    var lineNumber = 0
    var longestLineNumber = 0
    var longestLength = 0

    filePath.forEachLine {
        lineNumber++
        if (it.length > longestLength) {
            longestLength = it.length
            longestLineNumber = lineNumber
        }
    }

    if (lineNumber == 0) {
        println("The file is empty")
    } else {
        println("Line $longestLineNumber is the longest (length = $longestLength)")
    }
}