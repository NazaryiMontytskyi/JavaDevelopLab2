package Exceptions;

/*
 * Якщо введена або передана строка буде порожньою,
 * то цей ексепшен спрацьовує
 */
public class EmptyStringError extends Exception {
    
    public EmptyStringError()
    {
        super("Your text is empty or you've given null object");
    }

}
