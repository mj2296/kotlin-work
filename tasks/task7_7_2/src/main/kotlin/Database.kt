// Task 7.7.2: database-handling functions

import kotlin.io.path.Path
import kotlin.io.path.exists
import kotlin.io.path.forEachLine
import kotlin.io.path.writer

typealias Database = MutableMap<String,String>

fun createDatabase() = mutableMapOf<String,String>()

fun Database.load(filename: String) {
    val path = Path(filename)
    if (!path.exists()) {
        return    // no file yet, so start with an empty database
    }
    path.forEachLine { line ->
        val parts = line.split(",", limit = 2)
        if (parts.size == 2) {
            this[parts[0].trim()] = parts[1].trim()
        }
    }
}

fun Database.save(filename: String) {
    Path(filename).writer().use { out ->
        for ((name, number) in this) {
            out.write("$name,$number\n")
        }
    }
}
