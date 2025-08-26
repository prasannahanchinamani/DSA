package dsa.exceptionhandling;

import java.lang.ArithmeticException;
import java.util.Scanner;

public class ExceptionHierarchyDemo {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter First Number");
            int number = scanner.nextInt();
            System.out.println("Enter Second  Number");
            int number2 = scanner.nextInt();
            String str = null;
            System.out.println(str.length());
        }
        catch (ArithmeticException ae) {
            System.out.println("Arithmetic Exception caught: " + ae.getMessage());
        }
        catch (NullPointerException npe){
            System.out.println("Null Pointer Exception caught: " + npe.getMessage());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
       finally {
            System.out.println("Program execution completed.");
        }
    }
}
