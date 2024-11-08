package com.calculatorapp;

import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nSelect a calculation:");
            for (CalculationOption option : CalculationOption.values()) {
                System.out.println(option.getChoice() + ". " + option.getDescription());
            }
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            CalculationOption selectedOption = CalculationOption.fromChoice(choice);
            if (selectedOption != null) {
                selectedOption.execute(scanner);
            } else if (choice == 0) {
                break;
            } else {
                System.out.println("Invalid choice, please try again.");
            }

        } while (choice != 0);

        scanner.close();
    }
}

