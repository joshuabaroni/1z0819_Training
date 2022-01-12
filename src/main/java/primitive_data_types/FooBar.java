package primitive_data_types;

public class FooBar {
    public static void main(String[] args) {
        int p, q, r; // uninit local var
        boolean myBoolean = false;

        // if/else satisfies compiler's full init check
        if (myBoolean) p = 1; // if init is inside one condition but not made in another and accessed outside the condition, this is a partial init
        else p = 2;

        System.out.println("p is " + p);

        if (true) // this compiles with just if since statement is always true
            q = 1;

        System.out.println("q is " + q);

        int testInt = '\u007F';

        switch(testInt) {
            case 0:
            case 1:
            case 2:
                r = 1;
                break;
            case 3:
            case 4:
            case 5:
                r = 2;
                break;
            default:
                r = 3;
        }
        System.out.println("r is " + r); // r is now fully init, since all switch outcomes set r

        int s, t = 0;
        do {
            s = t++;
        } while (t < 1);
        System.out.println("s is " + s);

        // while statement satisfies compiler's full init
        // check only if condition is statically known
        int u, v = 0;
//        while(v < 1) { fails since not guaranteed
        while(true) {
            u = ++v;
            break;
        }
        System.out.println("u is " + u);
    }
}
