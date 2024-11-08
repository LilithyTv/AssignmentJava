package com.calculatorapp.calculations;

import java.util.Scanner;

public class GasolineCalculator {
    public static void calculate(Scanner scanner) {
        System.out.print("Enter liters: ");
        double liters = scanner.nextDouble();
        System.out.print("Enter price per liter: ");
        double pricePerLiter = scanner.nextDouble();
        System.out.print("Enter discount percentage: ");
        double discount = scanner.nextDouble();
        double totalCost = liters * pricePerLiter * (1 - discount / 100);
        System.out.println("Total cost: " + totalCost);
    }
}
