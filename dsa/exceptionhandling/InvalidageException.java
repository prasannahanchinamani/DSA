package dsa.exceptionhandling;

public class InvalidageException extends Exception {
    public InvalidageException(String message) {
        System.out.println(message);
    }
}