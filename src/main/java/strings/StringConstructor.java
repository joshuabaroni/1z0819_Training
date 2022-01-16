package strings;

public class StringConstructor {
    public static void main(String[] args) {
        int alphabet_len = 26;
        char[] alphabet = new char[alphabet_len];
        int[] integers = new int[alphabet_len];
        byte[] bytes = new byte[alphabet_len];

        for (char c = 'a', i = 0; c <= 'z'; c++, i++) {
            // Create character array containing the english alphabet a-z
            alphabet[i] = c;

            // create an int arr, casting alphabet to ints
            integers[i] = (int) c;

        }
    }
}
