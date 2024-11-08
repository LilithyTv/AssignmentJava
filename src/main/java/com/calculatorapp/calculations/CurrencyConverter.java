package com.calculatorapp.calculations;

import java.util.Scanner;

public class CurrencyConverter {
    public static void calculate(Scanner scanner) {
        System.out.print("Enter amount in SEK: ");
        int sek = scanner.nextInt();
        System.out.println("GBP: " + (sek / 10.0) + ", USD: " + (sek / 6.0));
    }
}
