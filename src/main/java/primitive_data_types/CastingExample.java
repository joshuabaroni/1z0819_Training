package primitive_data_types;

public class CastingExample {
    public static void main(String[] args) {
        int loopIterations = 0;
        short s2;

        // our loop condition variable is an int, so this is widening
        int minValue = Short.MIN_VALUE;
        int maxValue = Short.MAX_VALUE;

        // the following underflows a short by 1, so the sign bit gets toggled and now is == short.MAX_VALUE
//        int minValue = Short.MIN_VALUE - 1;
        // the following overflows a short by 1, so the sign bit gets toggled and now is == short.MIN_VALUE
//        int maxValue = Short.MAX_VALUE + 1;

        // when you add or subtract inside a prim in such a way that the storage width is exceeded, the operation flips as many bits as it can to complete the operation at the risk of the data

        // We are forcing the for loop to stay in the valid range of a short
        for (int i = minValue; i <= maxValue; i++) {

            // We know because of the way we've written the code that i will never be outside
            // the range of a short, so we confidently cast i to s2 as a short
            s2 = (short) i;

            // We'll print stuff out at the first and last increment of loop
            if (i == minValue) System.out.println("Minimum Short value = " + s2);
            if (i == maxValue) System.out.println("Maximum Short value = " + s2);

            // We need to pas a short to the method we've created
            // so we pass s2, not our loop variable i
            callAMethodWithParam((loopIterations + 1), s2);
            loopIterations++;
        }

        System.out.println("loopIterations = " + loopIterations);
    }

    private static void callAMethodWithParam(int i, short s) {
        if (s == Short.MAX_VALUE) System.out.println("Iteration " + i + " had the max value, my type is short");
    }
}
