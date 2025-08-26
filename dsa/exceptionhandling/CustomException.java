package dsa.exceptionhandling;

import java.util.Scanner;

    public class CustomException {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            try {
                System.out.println("Enter age");
                int age = scanner.nextInt();
                if (age < 18) {
                    throw new InvalidageException("Age Must Greaterthan 18 to vote");
                }
                System.out.println("Age is valid. Able to Vote.");
            } catch (InvalidageException ive) {
                System.out.println(ive.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
