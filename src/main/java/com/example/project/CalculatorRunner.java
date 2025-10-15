package com.example.project;

public class CalculatorRunner {
    public static void main(String[] args) {

        // 1. Create an instance of the Calculator class
        Calculator myCalc = new Calculator("TI-84");

        // 2. Call methods of that class to test
        System.out.println("Model Info: " + myCalc.info());

        // Test performOperation
        System.out.println("5 + 3 = " + myCalc.performOperation("+", 5, 3));
        System.out.println("10 - 7 = " + myCalc.performOperation("-", 10, 7));
        System.out.println("4 * 6 = " + myCalc.performOperation("*", 4, 6));
        System.out.println("8 / 2 = " + myCalc.performOperation("/", 8, 2));
        System.out.println("Division by zero: " + myCalc.performOperation("/", 8, 0));
        System.out.println("Invalid operation: " + myCalc.performOperation("%", 5, 2));

        // Test divisibleBy
        System.out.println("10 divisible by 2? " + myCalc.divisibleBy(10, 2));
        System.out.println("10 divisible by 3? " + myCalc.divisibleBy(10, 3));
        System.out.println("Divide by zero check: " + myCalc.divisibleBy(10, 0));

        // Test coordinatePair
        System.out.println("Coordinate pair: " + myCalc.coordinatePair(4, 7));

        // Test absoluteValue
        System.out.println("Absolute value of 10 - 4: " + myCalc.absoluteValue(10, 4));
        System.out.println("Absolute value of 4 - 10: " + myCalc.absoluteValue(4, 10));

        // Test average
        System.out.println("Average of 5 and 9: " + myCalc.average(5, 9));
        System.out.println("Average of 2 and 3: " + myCalc.average(2, 3));
        System.out.println("Average of 1 and 2: " + myCalc.average(1, 2));
    }
}
