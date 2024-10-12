package Exceptions;

/*
 * Ексепшен, який спрацьовує у випадку порушення
 * меж. Наприклад, якщо число виходить за певний діапазон
 */
public class BoundaryErrorException extends Exception {
    
    public BoundaryErrorException()
    {
        super("Your number doesn't please the borders.");
    }

}
