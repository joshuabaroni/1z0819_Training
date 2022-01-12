package primitive_data_types;

public class NarrowExample {
    public static void main(String[] args) {
        System.out.println("Byte range: [" + Byte.MIN_VALUE + ", " + Byte.MAX_VALUE + "]");

        // unicode ranges and int ranges
        System.out.println("Char (numeric) range: [" + (int) Character.MIN_VALUE + ", " + (int) Character.MAX_VALUE + "]");
        System.out.println("Char (unicode) range: [" + String.format("\\u%04x to \\u%04x", (int) Character.MIN_VALUE, (int) Character.MAX_VALUE) + "]");
        System.out.println("Short range: [" + Short.MIN_VALUE + ", " + Short.MAX_VALUE + "]");
        System.out.println("Int range: [" + Integer.MIN_VALUE + ", " + Integer.MAX_VALUE + "]");
        System.out.println("Long range: [" + Long.MIN_VALUE + ", " + Long.MAX_VALUE + "]");

        System.out.println("Float range: [" + Float.MIN_VALUE + ", " + Float.MAX_VALUE + "]");
        System.out.println("Double range: [" + Double.MIN_VALUE + ", " + Double.MAX_VALUE + "]");

        // We will set each var to its max value in its value range
        byte b = 127;
        char c = 65535;
        short s = 32767;

        int i = 1;

        // can narrow manually with typecasting; cannot implicitly narrow
        b = (byte) i;
        c = (char) i;
        s = (short) i;

        // implicit narrowing can no longer occur because the literal does not fit the bounds of its declared prim type when it has a decimal
//        byte b = 128;
//        char c = 65536;
//        short s = 32768;

//        float f2 = 0.0;
//        byte b2 = 0.0;
//        char c2 = 0.0;
//        short s2 = 0.0;
//        int i2 = 0.0;
//        long l2 = 0.0;

        // below code does not compile because the compiler doesn't inherently know what the value of each var is; it only sees the type
        int myIntVar = 1;

//        byte b2 = myIntVar;
//        char c2 = myIntVar;
//        short s2 = myIntVar;
    }
}
