// Task 12.3.3: blank name should now throw IllegalArgumentException

fun main() {
    val person = Person("   ", "1997-08-23")
    println("Name: ${person.name}")
    println("Born: ${person.birth}")
    println("Married: ${person.isMarried}")
}
