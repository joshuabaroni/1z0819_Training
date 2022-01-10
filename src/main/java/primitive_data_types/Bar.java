package primitive_data_types;

public class Bar {

    // default vals for numeric static vars set to a rep of 0
    static byte staticBarByte;
    static char staticBarChar;
    static short staticBarShort;
    static int staticBarInt;
    static long staticBarLong;
    static float staticBarFloat;
    static double staticBarDouble;

    // default vals for bool static vars set to false;
    static boolean staticBarBoolean;

    // default vals for numeric instance vars set to a rep of 0
    char barChar;
    short barShort;
    int barInt;
    long barLong;
    float barFloat;
    double barDouble;

    boolean barBoolean;

    public static void main(String[] args) {
        Bar bar = new Bar();

        // these class var refs do not produce compiler errs
        System.out.println(staticBarByte);
        System.out.println(bar.staticBarDouble);
        System.out.println(Bar.staticBarBoolean);
    }
}
