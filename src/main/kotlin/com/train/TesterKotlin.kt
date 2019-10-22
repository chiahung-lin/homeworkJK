package com.train.kt

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    print("Please enter number of tickets:")
    val ticketSum = scanner.nextInt()
    print("How many round-trip tickets:")
    val rtSum = scanner.nextInt()
    var moneySum = (ticketSum-rtSum)*1000+rtSum*1800
    print("Total tickets: $ticketSum Round-trip: $rtSum Total: $moneySum")
}

