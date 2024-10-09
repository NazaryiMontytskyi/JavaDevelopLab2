package StringPackage.Realizations;

import java.util.Arrays;
import java.util.Comparator;

import Exceptions.EmptyStringError;

import java.util.*;

import StringPackage.Interfaces.IClearable;
import StringPackage.Interfaces.IDecomposable;
import StringPackage.Interfaces.IMaximazible;

public class StringHandler implements IClearable<String>, IDecomposable<String>, IMaximazible<String> {
    
    public String text;

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

    public final String getText()
    {
        return this.text;
    }

    @Override
    public String clear(final String objectToClear)
    {
        String result = objectToClear;
        result = result.trim();
        result = result.replaceAll("[-:;,\"]", "");
        return result;
    }

    public String longestString(final String[] setOfStrings)
    {
        return Arrays.stream(setOfStrings)
        .sorted(Comparator.reverseOrder())
        .findFirst()
        .orElse("");
}

    public String clear()
    {
        return this.clear(text);
    }

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

    public String[] decompose()
    {
        return this.decompose(text);
    }

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
