// Task 12.3.3: Person class with initializer block

import kotlinx.datetime.LocalDate

class Person(var name: String, val birth: LocalDate) {
    var isMarried = false

    init {
        require(name.isNotBlank()) { "Name cannot be blank" }
    }

    constructor(name: String, birth: String) : this(name, LocalDate.parse(birth))
}
