package NumberDefine;

import Exceptions.BoundaryErrorException;

/*
 * Клас для обчислення констант C3 та С17
 */
public class TargetNumberDefiner {
    
    private int targetNumber;   //порядковий номер студента

    public TargetNumberDefiner(final int targetNumber)
    {
        try{
            if(targetNumber <= 0)
            {
                throw new BoundaryErrorException();
            }
        }
        catch(BoundaryErrorException e)
        {
            return;
        }

        this.targetNumber = targetNumber;
    }

    //Метод сетер для ініціалізації поля класу
    public boolean setTargetNumber(final int targetNumber)
    {
        try{
            if(targetNumber <= 0)
            {
                throw new BoundaryErrorException();
            }
        }
        catch(BoundaryErrorException e)
        {
            return false;
        }

        this.targetNumber = targetNumber;
        return true;
    }

    //Обчислення константи С3
    public final int getC3()
    {
        return this.targetNumber % 3;
    }

    //Обчислення константи С17
    public final int getC17()
    {
        return this.targetNumber % 17;
    }

    //Реалізація методу toString
    //успадкованого з класу Object
    @Override
    public String toString()
    {
        String result = "";
        result += "C3: " + this.getC3() + "\n" +
        "C17: " +  this.getC17();

        return result;
    }

}
