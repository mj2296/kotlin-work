// Task 5.1.1: anagrams() function

infix fun String.anagramOf(other: String): Boolean {
    if (this.length != other.length) {
        return false
    }

    val firstChars = this.lowercase().toList().sorted()
    val secondChars = other.lowercase().toList().sorted()
    return firstChars == secondChars
}