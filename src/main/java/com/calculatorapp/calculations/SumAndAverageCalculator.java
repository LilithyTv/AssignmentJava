package com.calculatorapp.calculations;

import java.util.Scanner;

public class SumAndAverageCalculator {

    public static void calculate(Scanner scanner) {
        if (scanner == null) {
            scanner = new Scanner(System.in); // Create a new scanner if null is passed
        }

        System.out.print("Enter three numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int sum = num1 + num2 + num3;
        double average = sum / 3.0;

        System.out.println("Sum: " + sum + ", Average: " + average);
    }
}
