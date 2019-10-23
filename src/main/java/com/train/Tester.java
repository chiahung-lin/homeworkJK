package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number of tickets: ");
        int ticketSum = scanner.nextInt();
        System.out.println("How many round-trip tickets:");
        int rtSum = scanner.nextInt();
        Ticket ticketV1 = new Ticket();
        System.out.println("V1 Total tickets: "+ticketSum+" Round-trip: "+
                rtSum+" Total: "+ticketV1.moneySumV1(ticketSum,rtSum));
        Ticket ticketV2 = new Ticket(ticketSum,rtSum);
        System.out.println("V2 Total tickets: "+ticketSum+" Round-trip: "+
                rtSum+" Total: "+ticketV2.moneySumV2());
    }
}
