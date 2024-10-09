package NumberDefine;

import Exceptions.BoundaryErrorException;

public class TargetNumberDefiner {
    
    private int targetNumber;

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

    public final int getC3()
    {
        return this.targetNumber % 3;
    }

    public final int getC17()
    {
        return this.targetNumber % 17;
    }

    @Override
    public String toString()
    {
        String result = "";
        result += "C3: " + this.getC3() + "\n" +
        "C17: " +  this.getC17();

        return result;
    }

}
