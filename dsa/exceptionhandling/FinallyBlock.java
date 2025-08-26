package dsa.exceptionhandling;

import java.util.Scanner;

public class FinallyBlock extends Throwable {
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
        finally{//always execeuted irrespective of exception
            System.out.println("Division is Completed.!");
        }
        System.out.println("Program continues after exception handling.");

    }
}

