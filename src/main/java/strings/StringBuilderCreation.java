package strings;

public class StringBuilderCreation {
    public static void main(String[] args) {

        // creates empty builder
        // An empty StringBuilder has initCapacity == 16
        StringBuilder sb = new StringBuilder();

        // adds 5 character string at the beginning
        sb.append("hello");
        System.out.println("sb.length = " + sb.length());
        System.out.println("sb.capacity = " + sb.capacity());

        StringBuilder sb2 = new StringBuilder("Hello");
        System.out.println("sb2.length = " + sb2.length());

        // Capacity is the initCapacity (16) + "Hello".length()
        System.out.println("sb2.capacity = " + sb2.capacity());

        StringBuilder sb3 = new StringBuilder();
        // Add 26char string at beginning, which
        // exceeds initCapacity of 16
        sb3.append("abcdefghijklmnopqrstuvwxyz");
        System.out.println("sb3.length = " + sb3.length());
        System.out.println("sb3.capacity = " + sb3.capacity());

        // you can set initCapacity manually\
        StringBuilder sb4 = new StringBuilder(26);
        sb4.append("abcdefghijklmnopqrstuvwxyz");
        System.out.println("sb4.length = " + sb4);
        System.out.println("sb4.capacity = " + sb4.capacity());
    }
}
