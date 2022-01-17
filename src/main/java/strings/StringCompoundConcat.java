package strings;

public class StringCompoundConcat {
    public static void main(String[] args) {
        String helloStr = "hello";
        String worldStr = " world";

        // use the compound concat on string literals
        String compoundStr = "hello";
        compoundStr += " world";
        System.out.println("compoundStr = " + compoundStr);

        // use the compound concat on string objects
        String compoundStr2 = "hello";
        compoundStr2 += " world";
        System.out.println("compundStr2 = " + compoundStr);

        // use a null String on the left
        String nullStr = null;
        nullStr += helloStr;
        System.out.println("nullStr = " + nullStr);

        // use a null String on the right
        nullStr = null;
        String compoundStrWNull = helloStr;
        compoundStrWNull += nullStr;
        System.out.println("compoundStrWNull = " + compoundStrWNull);

        // String concat when right-hand object is not a String, but is a CharSequence
        Object charSeqObj = new StringBuilder("testing");
        String compoundStr3 = "charSeqObj ";
        compoundStr3 += charSeqObj;
        System.out.println("compoundStr3 = " + compoundStr3);

        // String concat when left-hand object is not a String, but is a CharSequence
        charSeqObj = new StringBuilder("testing");
        charSeqObj += helloStr;
        System.out.println("charSeqObj = " + charSeqObj);

        // String concatenation when right-hand obj is not a String
        // We created ImmutableString class in the last topic
        Object someOtherObj = new ImmutableString();
        String compoundStr4 = "object ";
        compoundStr4 += someOtherObj; // immutable string displays the package and hashcode then displays the string literal
        System.out.println("compoundStr4 = " + compoundStr4);

        // String concatenation when left-hand obj is not a String
        // We created ImmutableString class in the last topic
        someOtherObj = new ImmutableString();
        someOtherObj += helloStr; // immutable string displays the package and hashcode then displays the string literal
        System.out.println("someOtherObject = " + someOtherObj);
        System.out.println("someOtherObject.toString() = " + someOtherObj.toString());

        int anInt = 100;

        // Valid...
        String compoundStr5 = helloStr;
        compoundStr5 += anInt;
        System.out.println("compoundStr5 = " + compoundStr5);

        // Invalid...
//        anInt += helloStr; // cannot concat with + op cause anInt is an Int and the operator decides
        // whether to override based on the left-hand type
        System.out.println("anInt = " + anInt);

        String mathStr1 = "The value is ";
        mathStr1 += 5 + 7;
        System.out.println("mathStr1 = " + mathStr1);

        // now we will replace the compound concat op with the
        // code it represents, we think...
        String mathStr2 = "The value is ";
        mathStr2 = mathStr2 + 5 + 7;
        System.out.println("mathStr2 = " + mathStr2);
    }
}
