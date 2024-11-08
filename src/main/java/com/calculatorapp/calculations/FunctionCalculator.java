package com.calculatorapp.calculations;

import java.util.Scanner;

public class FunctionCalculator {
    public static void calculate(Scanner scanner) {
        System.out.print("Enter value for a: ");
        int a = scanner.nextInt();
        System.out.print("Enter value for x: ");
        int x = scanner.nextInt();
        System.out.println("Result: " + (a * x * x * x + 7));
    }

}
