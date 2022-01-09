package packages_and_imports.a.e;

public class StaticImportTest2 {

    public static final String APP_NAME = "Second";

    public static void log(String statement) {
        System.out.println("Second Logger Statement: " + statement);
    }

    public void printUniqueStatement() {
        System.out.println("I am Second");
    }
}
