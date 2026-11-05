// Task 12.9: demo of companion object factory

import kotlinx.datetime.LocalDate

fun main() {
    // val bad = Person("Sarah", LocalDate(2005, 7, 16))   // compiler error: constructor is private

    val p = Person.create("Sarah", LocalDate(2005, 7, 16))
    println("Created ${p.name}, born ${p.birth}")

    val q = Person.create("Sarah", LocalDate(2001, 1, 1))   // run-time error: name not unique
    println("Created ${q.name}")
}
