package strings;

public class StringComparison {
    public static void main(String[] args) {
        testEqIgnCaseMethod("hello", "hello");
    }

    public static void testEqIgnCaseMethod(String firstString, String secondObject) {
        try {
            System.out.println(String.format("%s.equalsIgnoreCase(%s) = " + (firstString.equalsIgnoreCase(secondObject)), firstString, secondObject));
        } catch (Exception e) {
            System.out.println(String.format("Error occurred with %s.equals(%s) : %s", firstString, secondObject, e.getClass().getName()));
        }
    }
}
