package strings;

public class ImmutableString {
    public static void main(String[] args) {
        // Hello exists on the string pool, s1 gets a reference to it
        String s1 = "Hello";

        /*
        The following code does not change the value of "Hello" on the string pool.
        Rather, it creates a new String with value "Hello World" and passes the reference to this new string to s1.

        "Hello World" is not added to the string pool unless intern() is called
         */
        s1 = s1 + " World";

        System.out.println(s1);

        // Let's reset s1 and show another example using String's concat method
        s1 = "Hello";

        // concat returns a pointer to the concatenated string, but does not change the value of the instance that calls it
        s1.concat(" World");

        System.out.println(s1);
    }
}
