package Exceptions;

public class BoundaryErrorException extends Exception {
    
    public BoundaryErrorException()
    {
        super("Your number doesn't please the borders.");
    }

}
