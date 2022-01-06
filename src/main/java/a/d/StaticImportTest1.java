package a.d;

public class StaticImportTest1 {

    public static final String APP_NAME = "First";

    public static void log(String statement) {
        System.out.println("First Logger Statement: " + statement);
    }

    public void printUniqueStatement() {
        System.out.println("I am first");
    }
}
