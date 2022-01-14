package type_inference;

import java.util.ArrayList;
import java.util.Arrays;

// you can name your class Var
public class Var {
    public static void main(String[] args) {

        // you can name your LVTI variable "var"
        var var = new ArrayList<String>(Arrays.asList("one", "two", "three"));

        // you can name your method var
        var(var);
    }

    // you cannot have a method param of type var, but you can have a method param named var
    public static void var(ArrayList<String> var) {

        // use LVTI to set x to method param named var
        var x = var;

        // Moreso...
        for (var y : x)
            System.out.println("var y = " + y);
    }
}
