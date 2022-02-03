package operators;

public class BinaryOperator {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 3, d = 4, e = 5, f = 6;

        // multiplicative (* / %) ops are evaluated first
        // before additive ops (+ -)
        // and evaluated left to right

        // Could also be written: a + (e * b) - (f / c) % b;
        int result = a + e * b - f / c % b;
        System.out.println("result for (a + e * b - f / c % b) = " + result);

        // Modulus operator returns remainder of operation. Result is easier
        // to understand when the divisor is greater than the dividend
        System.out.println("result for (11 % 10) = " + (11 % 10));

        // The following code will demonstrate examples where
        // dividend < divisor
        System.out.println("Modulus examples where integeer divisor"
                + " > integer dividend");
        for (int i = 0; i <= 9; i += 3)
            for (int j = 10; j <= 100; j += 30)
                System.out.println("i (" + i + ") % j (" + j + ") = " + (i % j));

        System.out.println("Modulus examples where double divisor "
                + "> double dividend");
        // In C and C++ modulus accepts only integral operands but
        // Java accepts floating point operands as well
        // We see that result still is dividend if divisor > dividend
        for (double i = 0.5; i <= 0.55; i += 0.025)
            for (double j = 10; j <= 100; j += 30.57)
                System.out.println("i (" + i + ") % j (" + j + ") = " + (i % j));

        // Modulus with zero divisor using double operands
        try {
            System.out.println("Modulus with zero divisor (10.0 % 0.0) = " + (10 % 0));
        } catch (ArithmeticException ae) {
            ae.printStackTrace(System.out);
        }

        System.out.println("--- Shift Operators ---");

        // left shift (<<)
        // bit pattern shifted left by 2 places (right operand = 2)
        // 0b0000)0001 becomes 0b0000_0100
        System.out.println("result of left shift ( 00000001 << 2 ) = "
                + String.format("%8s",
                    Integer.toBinaryString(0b00000001 << 2))
                .replace(' ', '0')
        );

        // right shift (>>)
        // bit pattern shifted left by 3 places (right operand = 3)
        // 0b10001000 becomes 0b00010001
        System.out.println("result of right shift ( 10001000 >> 3 ) = "
                + String.format("%8s",
                    Integer.toBinaryString(0b10001000 >> 3))
                .replace(' ', '0')
        );

        // >>> right shift unsigned
        int i = 0b10000010_00000010_00000010_00000010, unsigned = i >>> 1, signed = i >> 1;
        System.out.println("result of unsigned right shift ( " +
                "10000010_00000010_00000010_00000010 >>> 1 ) = "
                + String.format("%32s",
                    Integer.toBinaryString(unsigned))
                .replace(' ', '0')
        );

        // compare right shift unsigned to right shift results
        // signed right shift places a 1 (negative sign) on the end of the shifted integer since our original integer was negative (0b1)
        System.out.println("result of signed right shift ( " +
                "10000010_00000010_00000010_00000010 >>> 1 ) = "
                + String.format("%32s",
                        Integer.toBinaryString(signed))
                .replace(' ', '0')
        );
        System.out.println("i dec = " + i + "\nunsigned dec = " + unsigned + "\nsigned dec = " + signed);
    }
}
