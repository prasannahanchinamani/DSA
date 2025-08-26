package dsa.exceptionhandling;

import java.util.Scanner;

public class ArithmeticException extends Throwable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer to divide 100: ");
        int input = scanner.nextInt();
        try {
            int result = 100 / input; // May throw ArithmeticException
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Error: Division by zero is not allowed.");
        }
        System.out.println("Program continues after exception handling.");
        scanner.close();
        double x = 10.0 / 0.0;   // Positive infinity
        double y = -10.0 / 0.0;  // Negative infinity
        double z = 0.0 / 0.0;    // NaN

        System.out.println(x); // Infinity
        System.out.println(y); // -Infinity
        System.out.println(z); // NaN
    }
}
