// Task 12.5.3: demo program for class with custom setter

import kotlinx.datetime.LocalDate

fun main() {
    val person = Person("Joe Bloggs", LocalDate(1997, 8, 23))
    println(person.name)
    person.name = ""       // should crash with IllegalArgumentException
    println(person.name)
}
