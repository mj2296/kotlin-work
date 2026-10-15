// Task 7.7.2: phone book simulator

const val CSV_FILENAME = "phone.csv"

fun main() {
    val database = createDatabase()
    database.load(CSV_FILENAME)

    println("Phone book loaded: ${database.size} contacts")
    println("Enter a name to look up (type quit, or press Enter on an empty line, to stop)")

    while (true) {
        print("\nName: ")
        val name = readlnOrNull()?.trim() ?: break
        if (name.isEmpty() || name.equals("quit", ignoreCase = true)) {
            break
        }
        if (',' in name) {
            println("Names can't contain commas - try again.")
            continue
        }

        val number = database[name]
        if (number != null) {
            println("$name: $number")
        }
        else {
            println("$name isn't in the phone book yet.")
            val newNumber = readPhoneNumber(name)
            database[name] = newNumber
            database.save(CSV_FILENAME)
            println("Saved $name: $newNumber")
        }
    }

    println("Goodbye!")
}

// Keeps asking until the user enters a non-empty string of digits
fun readPhoneNumber(name: String): String {
    while (true) {
        print("Enter phone number for $name: ")
        val input = readln().trim()
        if (input.isNotEmpty() && input.all { it.isDigit() }) {
            return input
        }
        println("Phone number must contain digits only - try again.")
    }
}
