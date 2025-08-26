package dsa.exceptionhandling;

import java.lang.ArithmeticException;
import java.util.InputMismatchException;
import java.util.Scanner;
import  java.lang.*;

public class MultipleCatchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Take first integer input
            System.out.print("Enter the first integer: ");
            int num1 = scanner.nextInt();

            // Take second integer input
            System.out.print("Enter the second integer: ");
            int num2 = scanner.nextInt();

            // Perform division
            int result = num1 / num2;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");

        } catch (InputMismatchException ime) {
            System.out.println("Error: Invalid input. Please enter integers only.");

        } finally {
            System.out.println("Program execution completed.");
            scanner.close();
        }
    }
}
