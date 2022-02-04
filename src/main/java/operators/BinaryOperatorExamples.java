package operators;

public class BinaryOperatorExamples {
    public static void main(String[] args) {
        int e, f;

        // Relationship operators <, <=
        // | - logical or
        // || - conditional or
        System.out.println("\nResults using relationship operators" +
                " and logical or operators (| ||):\n");

        // set vars
        e = 0;
        f = 0;
        System.out.println("Evaluation [(e++ <= f) | (++e < f)]: " + ((e++ <= f) | (++e < f)));
        System.out.println("Logical | (OR) will evaluate both expressions: e = " + e + " and f = " + f + "\n");

        // reset vars
        e = 0;
        f = 0;
        System.out.println("Evaluation [(e++ <= f) | (++e < f)]: " + ((e++ <= f) || (++e < f)));
        System.out.println("Conditional Logical || evaluates only first " +
                "expression if it evaluates to true: e = " +
                e + ", and f = " + f + "\n");

        e = 0;
        f = 0;
        System.out.println("Evaluation [(e++ < f) || (++e <= f)]: " + ((e++ < f) || (++e <= f)));
        System.out.println("Conditional Logical || evaluates next condition if first " +
                "expression evaluates to false: e = " +
                e + ", and f = " + f + "\n");

        // '&' and '&&' behave the same way as above with their respective logic
    }
}