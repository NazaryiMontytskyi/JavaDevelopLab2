
import Executable.*;
import StringPackage.Realizations.StringHandler;

public class App {
    public static void main(String[] args) throws Exception {

        StringHandler stringHandler = new StringHandler(null);
        ExecutableClass executableClass = new ExecutableClass()
        .setClearManager(stringHandler)
        .setDecomposeManager(stringHandler)
        .setMaximizeManager(stringHandler)
        .setStringHandler(stringHandler);
        
        executableClass.run();
    }
}
