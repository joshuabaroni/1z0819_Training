package primitive_data_types;

public class BinaryExample {
    public static void main(String[] args) {

        // 8-bit byte values
        byte b1 = (byte) 0b01111111; // 127
        byte b2 = (byte) 0b10000000; // -128
        byte b3 = (byte) 0b00100001; // 33

        // A 16-bit 'short' value
        short s1 = (short) 0b10100001_01000101; // -24251

        // Some 32-bit 'int' values
        int i1 = 0b10100001_01000101__10100001_01000101; /// -1589272251

        // The B in literal can be upper or lowercase
        int i2 = 0b101; // 5
        int i3 = 0B101; // 5
    }
}
