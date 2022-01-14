package strings;

public class Recap {
    public static void main(String[] args) {
        equalLiteralReferences();
        stringConstructors();
    }

    public static void equalLiteralReferences() {
        // String literals automatically interned so all "hello" literals
        // point to the same reference in memory in the string pool
        String s1 = "hello";
        String s2 = "hello";
        System.out.println("s1 and s2 are string literals "
                + "assigned to String variables: (s1 == s2) = "
                + ((s1 == s2) ? "true" : "false"));
    }

    public static void stringConstructors() {
        String s1, s2 = s1 = new String("hello");
        String s3 = new String("hello");

        // now when comparating s3, '==' equates to false because the value's address is different
        // s1 and s2 are the same however because they are being declared from the same location

        System.out.println("s1 == s2: " + (s1 == s2));
        System.out.println("s1 == s3: " + (s1 == s3));
        System.out.println("s2 == s3: " + (s2 == s3));

        // String has a method called equals that checks the value of the string directly
        System.out.println("s1.equals(s3): " + s1.equals(s3));
        System.out.println("s2.equals(s3): " + s2.equals(s3));

        // String.intern() adds the String's value to the intern pool and returns the string's literal value
        // this happens by default when declaring a string literal
        System.out.println("s1.intern() == s3.intern(): " + (s1.intern() == s3.intern()));

    }
}
