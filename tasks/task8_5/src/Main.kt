// Task 8.5: example of using a higher-order function

fun main() {
    val text = "Hello World! Kotlin 2.0 is Fun."

    println("Text: $text")
    println("Uppercase letters: ${text.howMany { it.isUpperCase() }}")
    println("Lowercase letters: ${text.howMany { it.isLowerCase() }}")
    println("Digits: ${text.howMany { it.isDigit() }}")
    println("Spaces: ${text.howMany { it == ' ' }}")
    println("Vowels: ${text.howMany { it.lowercaseChar() in "aeiou" }}")

    // Same results using the standard library's count()
    println("Uppercase (count): ${text.count { it.isUpperCase() }}")
    println("Vowels (count): ${text.count { it.lowercaseChar() in "aeiou" }}")
}
