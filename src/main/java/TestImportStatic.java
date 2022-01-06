import static java.lang.Math.PI;
import static java.lang.Math.sqrt;
// single static import declarations for static method and variable

import static java.lang.Math.*;
// static import on demand declaration for static class members

public class TestImportStatic {
    public static void main(String[] args) {
        int radius = Integer.parseInt(args[0]);

        double circumference = 2 * PI * radius;
        System.out.println("circumference = " + circumference);

        double sqrt = sqrt(Integer.parseInt(args[1]));
        System.out.println("sqrt = " + sqrt);
    }
}
