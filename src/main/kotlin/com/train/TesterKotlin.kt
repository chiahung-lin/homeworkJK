package com.train.kt

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    print("Please enter number of tickets:")
    val ticketSum = scanner.nextInt()
    print("How many round-trip tickets:")
    val rtSum = scanner.nextInt()
    var moneySum = (ticketSum-rtSum)*1000+rtSum*1800
    println("V0 Total tickets: $ticketSum Round-trip: $rtSum Total: $moneySum")
    var ticket=Ticket()
    println("V1 Total tickets: $ticketSum Round-trip: $rtSum Total: ${ticket.moneySumV1(ticketSum,rtSum)}")
    var ticketV2=Ticket(ticketSum,rtSum)
    println("V2 Total tickets: $ticketSum Round-trip: $rtSum Total: ${ticketV2.moneySumV2()}")
}

