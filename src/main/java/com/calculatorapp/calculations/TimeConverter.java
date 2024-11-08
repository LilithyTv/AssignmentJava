package com.calculatorapp.calculations;

import java.util.Scanner;

public class TimeConverter {
    public static void calculate(Scanner scanner) {
        System.out.print("Enter hours: ");
        int hours = scanner.nextInt();
        int minutes = hours * 60;
        int seconds = hours * 3600;
        System.out.println("Minutes: " + minutes + ", Seconds: " + seconds);
    }
}
