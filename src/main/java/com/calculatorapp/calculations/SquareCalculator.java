package com.calculatorapp.calculations;

import java.util.Scanner;

public class SquareCalculator {
    public static void calculate(Scanner scanner) {
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("Square: " + (number * number));
    }
}