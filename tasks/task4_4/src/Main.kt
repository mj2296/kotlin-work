// Task 4.4: temperature conversion using a while loop

import kotlin.system.exitProcess

import com.github.ajalt.mordant.rendering.AnsiLevel
import com.github.ajalt.mordant.rendering.TextAlign
import com.github.ajalt.mordant.rendering.TextColors.*
import com.github.ajalt.mordant.table.table
import com.github.ajalt.mordant.terminal.Terminal

fun main(args: Array<String>) {
    if (args.size != 3) {
        println("Error: start, maximum and increment required on command line")
        exitProcess(1)
    }

    val start = args[0].toDouble()
    val maximum = args[1].toDouble()
    val increment = args[2].toDouble()

    if (increment <= 0.0) {
        println("Error: increment must be greater than zero")
        exitProcess(1)
    }

    println("%10s %12s".format("Celsius", "Fahrenheit"))

    var celsius = start
    while (celsius <= maximum) {
        val fahrenheit = celsius * 9.0 / 5.0 + 32.0
        println("%10.1f %12.1f".format(celsius, fahrenheit))
        celsius += increment
    }
}