// Task 5.4.1: main program

fun main() {
    val tests = listOf(
        "",
        "Hello",
        "exactly twenty chars",
        "exactly twenty chars!",
        "this string is definitely too long"
    )

    for (text in tests) {
        println("\"$text\" has length ${text.length}, isTooLong = ${text.isTooLong}")
    }
}