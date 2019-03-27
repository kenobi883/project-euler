package com.marcdenning.euler

import kotlin.system.measureTimeMillis

fun main() {
    val duration = measureTimeMillis {
        println(
            generateFibonacciNumbers(4000000)
            .filter { it % 2 == 0 }
            .map { it.toLong() }
            .sum())
    }
    println("In $duration ms")
}

fun generateFibonacciNumbers(max: Int): List<Int> {
    val numbers = mutableListOf(1, 2)
    var prev = 1
    var current = 2

    while (current < max) {
        val prev2 = prev

        numbers.add(current + prev)
        prev = current
        current += prev2
    }
    return numbers
}