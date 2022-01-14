package type_inference;

public class VarLoops {
    public static void main(String[] args) {

        // use LVTI var in a regular for loop
        for (var i = 0; i < 10; i++) // type is inferred from declaration
            System.out.println("i was inferred to be an int, value = " + i);

        for (var arg : args) { // type is inferred from string array args
            System.out.println("arg inferred to be a String: " + arg);
        }
    }
}
