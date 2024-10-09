package Executable;

import StringPackage.Realizations.*;
import NumberDefine.TargetNumberDefiner;
import StringPackage.Interfaces.*;


public class ExecutableClass {
    
    String text;
    IClearable<String> clearManager;
    IDecomposable<String> decomposeManager;
    IMaximazible<String> maximizeManager;
    StringHandler stringManager;

    public ExecutableClass()
    {
        
    }

    public ExecutableClass setClearManager(IClearable<String> clearable)
    {
        this.clearManager = clearable;
        return this;
    }

    public ExecutableClass setDecomposeManager(IDecomposable<String> decomposable)
    {
        this.decomposeManager = decomposable;
        return this;
    }

    public ExecutableClass setMaximizeManager(IMaximazible<String> maximazible)
    {
        this.maximizeManager = maximazible;
        return this;
    }

    public ExecutableClass setStringHandler(StringHandler handler)
    {
        this.stringManager = handler;
        return this;
    }

    private void initSentence()
    {
        this.text = """
                On a calm evening, Eve sat by the window. A man, a plan, a canal, Panama! She looked out at the setting sun, thinking about her day. In the quiet of the night, she whispered to herself, "Was it a car or a cat I saw?" The soft breeze carried the scent of flowers through the air. Madam, in Eden, I'm Adam. As the stars began to twinkle, Eve smiled, feeling at peace. Everything around her seemed to align perfectly, as if the universe itself was in balance. She closed her eyes, letting the stillness embrace her. Life, after all, was full of beautiful symmetries.
                """;
    }

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
