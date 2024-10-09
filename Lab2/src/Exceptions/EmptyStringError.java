package Exceptions;

public class EmptyStringError extends Exception {
    
    public EmptyStringError()
    {
        super("Your text is empty or you've given null object");
    }

}
