// Task 3.5: simple file I/O

import kotlin.io.path.Path
import kotlin.io.path.appendText
import kotlin.io.path.readText
import kotlin.io.path.writeText

fun main() {
    // Add your code here
    val path = Path("test.txt")
    val content = "words"
    val contentUpdate = "other words"
    path.writeText(content)
    path.appendText(contentUpdate)
    val fileContents = path.readText()
    print(fileContents)
}
