// Task 12.5.2: demo program for class with custom getter

import kotlinx.datetime.LocalDate

fun main() {
    val person = Person("Joe Bloggs", LocalDate(1997, 8, 23))
    println(person.name)   // prints JOE BLOGGS
}
