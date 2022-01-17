package strings;

public class StringConstructor {
    public static void main(String[] args) {
        int alphabet_len = 26;
        char[] alphabet = new char[alphabet_len];
        int[] integers = new int[alphabet_len];
        byte[] bytes = new byte[alphabet_len];

        for (char c = 'a', i = 0; c < 'a' + alphabet_len; c++, i++) {
            // Create character array containing the english alphabet a-z
            alphabet[i] = c;

            // create an int arr, casting alphabet to ints
            integers[i] = c;

            // Create a byte array, casting alphabet char to bytes
            bytes[i] = (byte) c;
        }

        // create a string from char array
        String charString = new String(alphabet);
        System.out.println("charString = " + charString);

        // create a string from byte array
        String byteString = new String(bytes);
        System.out.println("raw byte array = " + rawByteArray(bytes));
        System.out.println("byteString = " + byteString);

        // Create a string from integer array
        // Note here: You cannot create a String with integer array with a
        // simple one args constructor, so we'll use offset = 0 and
        // length = the length of array to get the full alphabet
        int offset = 5; // start from e
        int last = 'z' - 'k'; // end at z, offset from letter
        String intString = new String(integers, offset, alphabet_len - offset - last);
        System.out.println("raw int array = " + rawIntArray(integers));
        System.out.println("intString = " + intString);
    }

    private static String rawByteArray(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte i = 0; i < bytes.length; i++)
            sb.append(bytes[i] + " ");
        return sb.toString();
    }

    private static String rawIntArray(int[] ints) {
        StringBuilder sb = new StringBuilder();
        for (byte i = 0; i < ints.length; i++)
            sb.append(ints[i] + " ");
        return sb.toString();
    }
}
