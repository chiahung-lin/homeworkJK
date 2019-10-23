package com.train.kt

class Ticket(var ticketSum: Int=0,var rtSum: Int=0) {
    fun moneySumV1(ticketSum: Int, rtSum: Int): Int {
        return (ticketSum-rtSum)*1000+rtSum*1800
    }
    fun moneySumV2(): String {
        return if (ticketSum<rtSum) "Input error ticket number!!"
                else ((ticketSum-rtSum)*1000+rtSum*1800).toString()
    }
}