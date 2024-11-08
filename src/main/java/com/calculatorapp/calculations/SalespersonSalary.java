package com.calculatorapp.calculations;

import java.util.Scanner;

public class SalespersonSalary {
    public static void calculate(Scanner scanner) {
        System.out.print("Enter sales amount: ");
        double sales = scanner.nextDouble();
        double salary = 8000 + 0.09 * sales;
        System.out.println("Total salary: " + salary);
    }
}
