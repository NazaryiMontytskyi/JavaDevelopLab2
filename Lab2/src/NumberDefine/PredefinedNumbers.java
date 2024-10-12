package NumberDefine;


/*
 * Enum для обчислення констант C3 та С17
 */
public enum PredefinedNumbers {
    
    C3(3),      //константа для обчислення С3
    C17(17);    //константа для обчислення С17
    
    private int number; //приватний атрибут номеру

    //приватний конструктор з параметром
    //для ініціалізації поля
    private PredefinedNumbers(final int number)
    {
        this.number = number;
    }

    //гетер для отримання значення
    public final int value()
    {
        return this.number;
    }
}
