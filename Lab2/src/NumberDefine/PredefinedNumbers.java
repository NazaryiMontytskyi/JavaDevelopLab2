package NumberDefine;

public enum PredefinedNumbers {
    
    C3(3),
    C17(17);
    
    private int number;

    private PredefinedNumbers(final int number)
    {
        this.number = number;
    }

    public final int value()
    {
        return this.number;
    }
}
