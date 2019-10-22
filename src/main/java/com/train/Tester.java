package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number of tickets: ");
        int ticketSum = scanner.nextInt();
        System.out.println("How many round-trip tickets:");
        int rtSum = scanner.nextInt();
        System.out.println("Total tickets: "+ticketSum+" Round-trip: "+
                rtSum+" Total: "+((ticketSum-rtSum)*1000+rtSum*1800));
    }
}
