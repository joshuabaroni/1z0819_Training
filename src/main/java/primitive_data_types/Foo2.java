package primitive_data_types;

public class Foo2 {

    public static void main(String[] args) {
        // set init to 127, in range for all prims except bool
        byte b = 127;
        char c = 127;
        short s = 127;
        int i = 127;
        long l = 127;
        float f = 127;
        double d = 127;

        // since 127 is odd, we will set to false
        boolean isTrue = false;

        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("s = " + s);
        System.out.println("i = " + i);
        System.out.println("l = " + l);
        System.out.println("f = " + f);
        System.out.println("d = " + d);
        System.out.println("isTrue = " + isTrue);

        long l1 = 127l, l2 = 127L;
        System.out.println("l1 = " + l1 + "\nl2 = " + l2);

        float f1 = 127f, f2 = 127F;
        System.out.println("f1 = " + f1 + "\nf2 = " + f2);

        double d1 = 127d, d2 = 127D;
        System.out.println("d1 = " + d1 + "\nd2 = " + d2);

        float f3 = 1.27e02f;
        double d3 = 1.27e02;
        System.out.println("f3 = " + f3 + "\nd3 = " + d3);

        byte b1 = 0b1111111; // binary 127 prefix 0b
        System.out.println("b1 = " + b1);

        short s1 = 0177; // octal 127 - octal prefix 0 only
        System.out.println("s1 = " + s1);

        int i1 = 0x007F; // hexadecimal 127 - hex prefix 0x
        System.out.println("i1 = " + i1);

        // char literals
        byte b2 = 'a';
        char c1 = 'a', c2 = 97;
        double d4 = 'a';

        System.out.println("b2 = " + b2 + "\nc1 = " + c1 + "\nc2 = " + c2 + "\nd4 = " + d4);

        // uni code representation for any numerics
        byte b3 = '\u007F';
        char c3 = '\u007f';

        System.out.println("b3 = " + b3);
        System.out.println("c3 = " + c3);
    }

}
