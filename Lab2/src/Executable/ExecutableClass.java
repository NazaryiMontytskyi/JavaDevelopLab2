package Executable;

import StringPackage.Realizations.*;
import NumberDefine.TargetNumberDefiner;
import StringPackage.Interfaces.*;


/*
 * Виконавчий клас, що реалізовує всю логіку програми
 */
public class ExecutableClass {
    
    String text;                            //текст
    IClearable<String> clearManager;        //інтерфейс, що відповідає за очистку
    IDecomposable<String> decomposeManager; //інтерфейс, що відповідає за розділення речення на слова
    IMaximazible<String> maximizeManager;   //інтерфейс, що відповідає за пошук максимального значення
    StringHandler stringManager;            //клас, що відповідає за роботу зі строками

    /*
     * Порожній конструктор
     */
    public ExecutableClass()
    {
        
    }

    /*
     * Нижче використано патерн Builder для створення об'єкту
     * класу ExecutableClass
     */

     //сетер, що повертає сам об'єкт для інтерфейсу очистки
    public ExecutableClass setClearManager(IClearable<String> clearable)
    {
        this.clearManager = clearable;
        return this;
    }

    //сетер для інтерфейсу розділення
    public ExecutableClass setDecomposeManager(IDecomposable<String> decomposable)
    {
        this.decomposeManager = decomposable;
        return this;
    }


    //сетер для інтерфейсу пошуку найбільшого значення
    public ExecutableClass setMaximizeManager(IMaximazible<String> maximazible)
    {
        this.maximizeManager = maximazible;
        return this;
    }

    //сетер для класу, що відповідає за роботу зі строками
    public ExecutableClass setStringHandler(StringHandler handler)
    {
        this.stringManager = handler;
        return this;
    }

    /*
     * Ініціалізація тексту
     */
    private void initSentence()
    {
        this.text = """
                On a calm evening, Eve sat by the window. A man, a plan, a canal, Panama! She looked out at the setting sun, thinking about her day. In the quiet of the night, she whispered to herself, "Was it a car or a cat I saw?" The soft breeze carried the scent of flowers through the air. Madam, in Eden, I'm Adam. As the stars began to twinkle, Eve smiled, feeling at peace. Everything around her seemed to align perfectly, as if the universe itself was in balance. She closed her eyes, letting the stillness embrace her. Life, after all, was full of beautiful symmetries.
                """;
    }

    /*
     * Головний виконавчий метод, у якому міститься вся логіка програми
     */
    public void run()
    {
        System.out.println((new TargetNumberDefiner(13)));

        this.initSentence();
        System.out.println("TEXT:");
        System.out.println(text);

        System.out.println("SENTENCES:");

        String[] sentences = this.decomposeManager.decompose(
            this.clearManager.clear(text)
        );

        for(String sentence : sentences)
        {
            System.out.println(sentence);
        }

        System.out.println("PALINDROMES IN TEXT:");
        
        String[] palindromes = this.stringManager.getPalindromes(sentences);
        
        for(String palindrome : palindromes)
        {
            System.out.println(palindrome);
        }

        System.out.println("THE LONGEST PALINDROME: ");

        System.out.println(this.stringManager.getMax(palindromes));
        

    }

}
