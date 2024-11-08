package com.calculatorapp.calculations;
import java.util.Scanner;

public class CircleCalculator {
    public static void calculate(Scanner scanner) {
        System.out.print("Enter radius: ");
        double radius = scanner.nextDouble();
        double diameter = 2 * radius;
        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;
        System.out.println("Diameter: " + diameter + ", Circumference: " + circumference + ", Area: " + area);
    }
}
