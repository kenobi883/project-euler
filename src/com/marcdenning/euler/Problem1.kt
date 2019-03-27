package com.marcdenning.euler

fun main() {
    var sum = 0
    val numbers = 3..999

    sum = numbers
        .filter { it % 3 == 0 || it % 5 == 0}
        .sum()
//    for (i in 3..999) {
//        if (i % 3 == 0 || i % 5 == 0)
//            sum += i
//    }
    println(sum)
}
