package exceptions.customexception.checked;

public class InvalidAgeException extends Exception {
   public InvalidAgeException(String message){
       super(message);
   }
}
