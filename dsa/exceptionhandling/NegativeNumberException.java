package dsa.exceptionhandling;


import java.util.Scanner;

class NegativeNumber extends RuntimeException {
    public NegativeNumber(String str) {
        super(str);
        System.out.println(str);

    }
}

public class NegativeNumberException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Number");
        int number = scanner.nextInt();
        if (number < 0) {
            throw new NegativeNumber("Number must be Greater Than 1");
        }
        System.out.println(number);

    }
}
