package com.calculatorapp.calculations;

import java.util.Scanner;

public class TemperatureConverter {
    public static void calculate(Scanner scanner) {
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("Celsius: " + celsius);
    }

}