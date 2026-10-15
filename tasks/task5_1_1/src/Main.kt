// Task 5.1.1: main program

import kotlin.system.exitProcess

fun main (args: Array<String>) {
    if (args.size != 2) {
        println("Error: Need to provide two words on the command line.")
        exitProcess(2)
    }

    val anagramStatus = anagrams(args[0], args[1])
    println("Anagram Status: $anagramStatus")
}