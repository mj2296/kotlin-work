// Task 4.2: use of if and ranges

fun main() {
    // Add your code here
    println("Pizza MENU")
    println("a: Margherita")
    println("b: Pepperoni")
    println("c: Hawaiian")
    println("Enter your choice: ")

    val choice = readln().lowercase()

    val message = if (choice.length == 1 && choice[0] in 'a'..'d') {
        "Order accepted"
    } else {
        "Invalid choice!"
    }

    println(message)
}
