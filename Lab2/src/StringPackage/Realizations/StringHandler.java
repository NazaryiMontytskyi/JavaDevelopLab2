package StringPackage.Realizations;

import java.util.Arrays;
import java.util.Comparator;

import Exceptions.EmptyStringError;

import java.util.*;

import StringPackage.Interfaces.IClearable;
import StringPackage.Interfaces.IDecomposable;
import StringPackage.Interfaces.IMaximazible;

/*
 * Клас, що відповідає за роботу зі строками та текстом
 */

public class StringHandler implements IClearable<String>, IDecomposable<String>, IMaximazible<String> {
    
    public String text;

    /*
     * Конструктор з параметром, що ініціалізує
     * приватне поле класу
     */
    public StringHandler(final String text)
    {
        try{
            if(text == null || text.isEmpty())
            {
                throw new EmptyStringError();
            }
        }
        catch(EmptyStringError e)
        {
            return;
        }

        this.text = text;
    }

    /*
     * Сетер, що ініціалізує приватне поле
     * класу text
     */
    public boolean setText(final String text)
    {
        try{
            if(text == null || text.isEmpty())
            {
                throw new EmptyStringError();
            }
        }
        catch(EmptyStringError e)
        {
            return false;
        }

        this.text = text;
        return true;
    }

    /*
     * Метод гетер для отримання тексту
     */
    public final String getText()
    {
        return this.text;
    }

    /*
     * Перевизначений метод для очистки тексту
     */
    @Override
    public String clear(final String objectToClear)
    {
        String result = objectToClear;
        result = result.trim();
        result = result.replaceAll("[-:;,\"]", "");
        return result;
    }

    /*
     * Метод для пошуку найдовшої строки
     */
    public String longestString(final String[] setOfStrings)
    {
        return Arrays.stream(setOfStrings)
        .sorted(Comparator.reverseOrder())
        .findFirst()
        .orElse("");
}

/*
 * Метод для очистки наявного у класі тексту
 */
    public String clear()
    {
        return this.clear(text);
    }

    /*
     * Перевизначений метод decompose, який 
     * ділить текст на речення
     */
    @Override
    public String[] decompose(final String objectToDecompose)
    {
        String[] result = objectToDecompose.split("[.?!]");
        for(String sentence : result)
        {
            sentence = sentence.trim();
        }
        return result;
    }

    /*
     * Метод, який ділить поточний текст на речення
     */
    public String[] decompose()
    {
        return this.decompose(text);
    }

    /*
     * Отримання максимально довгого речення
     */
    @Override
    public String getMax(final String[] setOfObjects)
    {
        String max = "";
        for(String sentence : setOfObjects)
        {
            if(max.length() < sentence.length())
            {
                max = sentence;
            }
        }
        return max;
    }

    /*
     * Перевірка речення на те, чи є воно паліндромом
     */
    public boolean isPalindrome(final String sentence)
    {
        String operateSentence = sentence;
        operateSentence = operateSentence.replaceAll("[-!;:.,?']", "");
        operateSentence = operateSentence.replaceAll(" ", "");
        operateSentence = operateSentence.trim();
        for(int i = 0; i < operateSentence.length(); i++)
        {
            if(!(operateSentence.toLowerCase().toCharArray()[i]==operateSentence.toLowerCase().toCharArray()[operateSentence.length() - 1 - i]))
            {
                return false;
            }
        }

        return true;
    }

    /*
     * Метод для отримання паліндромів із множини речень (строк)
     */
    public String[] getPalindromes(final String[] setOfSentences)
    {
        List<String> setOfPalindromes = new ArrayList<String>();
        for(String sentence : setOfSentences)
        {
            if(this.isPalindrome(sentence))
            {
                setOfPalindromes.add(sentence);
            }
        }

        return setOfPalindromes.toArray(new String[]{});
    }

}
