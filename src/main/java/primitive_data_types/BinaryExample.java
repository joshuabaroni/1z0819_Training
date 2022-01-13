package primitive_data_types;

public class BinaryExample {
    static byte b1 = 123;
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
        int i4 = 0B00000000_00000000_00000000_00000101; // 5

        // A 64-bit long. Note the "L" suffix:
        // -6825872339779608251
        long long1 = 0b10100001_01000101_10100001_01000101_10100001_01000101_10100001_01000101L;
        // 5
        long long2 = 0B00000000_00000000_00000000_00000000_00000000_00000000_00000000_00000101;

        System.out.println("byte1 = " + b1);
        System.out.println("byte1 static = " + BinaryExample.b1);

        System.out.println("byte2 = " + b2);
        System.out.println("byte3 = " + b3);

        String s = " ";
        String s5 = b1+++s;

        System.out.println("b1+++s= " + s5 + "hello\nbyte 1 ++ + byte 2 (string append)= " + b1++ + b2);
        System.out.println("short1 = " + s1);

        System.out.println("int1 = " + i1);
        System.out.println("int2 = " + i2);
        System.out.println("int3 = " + i3);
        System.out.println("int4 = " + i4);

        System.out.println("long1 = " + long1);
        System.out.println("long2 = " + long2);
    }
}
