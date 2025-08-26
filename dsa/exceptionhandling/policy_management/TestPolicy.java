package dsa.exceptionhandling.policy_management;

import dsa.exceptionhandling.InvalidageException;

import java.util.Scanner;

public class TestPolicy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PolicyApplication policyApplication = new PolicyApplication();
        try {
            System.out.print("Enter age: ");
            int age = scanner.nextInt();

            System.out.print("Enter number of accidents: ");
            int accidents = scanner.nextInt();

            System.out.print("Enter Year of Experinence: ");
            int experience = scanner.nextInt();

            System.out.print("Any serious health issues? (true/false): ");
            boolean hasHealthIssue = scanner.nextBoolean();
            policyApplication.applyForPolicy(age, experience,accidents, hasHealthIssue);
        } catch (InvalidageException | PoorDrivingRecordException|HealthIssueException e){
            System.out.println("Application rejected: " + e.getMessage());
            // Log the error (for demonstration, printing to console)
            System.err.println("Error logged: " + e);
        }
        finally {
            System.out.println("Application Process is Completed.!");
        }
    }
}
