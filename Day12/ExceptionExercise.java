package java_journey.Day12;
class InvalidAgeException extends Exception
{

  public InvalidAgeException() {
  }

  public InvalidAgeException(String message) {
    super(message);
  }

  public InvalidAgeException(Throwable cause) {
    super(cause);
  }

  public InvalidAgeException(String message, Throwable cause) {
    super(message, cause);
  }

  public InvalidAgeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }
  
}


public class ExceptionExercise {
    
    public static void checkAge(int age) throws InvalidAgeException {
        // TODO: Throw custom exception if age < 18, else print "Access granted"
        if(age<18)
          {
            System.out.println("Exception caught: Age must be 18 or older");
          }
        else
          {
            System.out.println("Access granted");
          }
        
    }
    
    public static void main(String[] args) {
        // TODO: Call checkAge(16) and checkAge(21) inside separate try-catch blocks

        try
        {
          checkAge(16);
        }
        catch(InvalidAgeException e)
        {
          System.out.println("Exception caught: Age ust be 18 or older");
        }
        try
        {
          checkAge(21);
        }
        catch(InvalidAgeException e)
        {
          System.out.println("Access granted");
        }
        
    }

}

