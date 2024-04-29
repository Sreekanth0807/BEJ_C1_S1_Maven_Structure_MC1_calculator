package org.example;
import java.util.Scanner;
import java.util.Scanner;


public class Calculator {
    public void runCalculator() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Select operation:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1 ->{
                System.out.println("Sum: " + add(num1, num2));
            }


            case 2 ->{
                System.out.println("Difference: " + subtract(num1, num2));
            }


            case 3 ->{
                System.out.println("Product: " + multiply(num1, num2));
            }


            case 4 ->{
                System.out.println("Quotient: " + divide(num1, num2));
            }


            default ->{
                System.out.println("Invalid choice");
            }

        }

        scanner.close();
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.runCalculator();
    }
}
