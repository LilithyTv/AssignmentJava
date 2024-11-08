package com.calculatorapp;

import com.calculatorapp.calculations.*;
import lombok.Getter;
import lombok.NonNull;
import java.util.Scanner;
import java.util.function.Consumer;

public enum CalculationOption {
    SQUARE(1, "Square of a number", SquareCalculator::calculate),
    SALES_SALARY(2, "Calculate salesperson's salary", SalespersonSalary::calculate),
    TIME_CONVERT(3, "Convert hours to minutes and seconds", TimeConverter::calculate),
    SUM_AVERAGE(4, "Sum and average of three numbers", SumAndAverageCalculator::calculate),
    CURRENCY_CONVERT(5, "Convert SEK to GBP and USD", CurrencyConverter::calculate),
    FUNCTION_CALC(6, "Calculate ax^3 + 7", FunctionCalculator::calculate),
    GASOLINE_COST(7, "Calculate gasoline cost", GasolineCalculator::calculate),
    CIRCLE_CALC(9, "Calculate circle properties", CircleCalculator::calculate),
    TEMP_CONVERT(10, "Convert Fahrenheit to Celsius", TemperatureConverter::calculate);


    @Getter
    private final int choice;
    @Getter
    private final String description;
    private final Consumer<Scanner> action;

    CalculationOption(int choice, @NonNull String description, @NonNull Consumer<Scanner> action) {
        this.choice = choice;
        this.description = description;
        this.action = action;
    }

    public void execute(@NonNull Scanner scanner) {
        action.accept(scanner);
    }

    public static CalculationOption fromChoice(int choice) {
        for (CalculationOption option : values()) {
            if (option.choice == choice) {
                return option;
            }
        }
        return null;
    }
}
