package strings;

public class StringConcat {
    public static void main(String[] args) {
        String helloStr = "hello", worldStr = "world";

        // firstStr will be "hello world", concats 3 string literals
        String firstStr = helloStr + " " + worldStr;
        System.out.println("firstStr = " + firstStr);

        Object nullObj = null; // string representation of object null is "null"
        // secondStr will be "null hello"
        String secondStr = nullObj + " " + helloStr;
        System.out.println("secondStr = " + secondStr);

        int i = 10;
        // thirdStr will be "10 hello"
        String thirdStr = i + " " + helloStr; // toString() of boxed Integer wrapper is called
        System.out.println("thirdStr = " + thirdStr);

        // concatenating to an object (not null)
        Object ourObject = new OurSimpleClass();

        // fourthStr will be "hello our simple class"
        String fourthStr = helloStr + " " + ourObject;
        System.out.println("fourthStr = " + fourthStr);

        int j = 10;
        // adds the first two as ints, then since the operation sees the string literal in the
        // 3rd position it assumes the 4th and 5th positions are also strings
        String resultStr = i + j + " = " + i + j;
        System.out.println("resultStr is: " + resultStr);

        String resultStrMath = i + j + " = " + (i + j);
        String resultStrConcat = "" + i + j + " = " + i + j;
        System.out.println("resultStrMath is: " + resultStrMath
                + "\nresultStrConcat is: " + resultStrConcat);
    }
}

class OurSimpleClass {
    public OurSimpleClass() {}
    public String toString() {
        return "Our Simple Class";
    }
}
