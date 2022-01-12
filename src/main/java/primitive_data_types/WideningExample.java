package primitive_data_types;

public class WideningExample {
    public static void main(String[] args) {
        char myChar = 'a';

        // assignments are right to left

        byte myByte = 0; // value in myByte is widened to short when assigned to myShort
        short myShort; // value in myShort is widened to int when assigned to myInt

        // Exact Literal Type Assignment
        int myInt = 0; // value in myInt is widened to long when assigned to myLong
        float myFloat = 0.0f; // value in myLong is widened to float when assigned to myFloat
        double myDouble = 0.0; // value in myFloat is widened to double when assigned to myDouble

        // Widening with literals
        long myLong = 0; // widening an int to a long
        myDouble = 0.0f; // widening a float literal to a double

        // Example of Widening with variables
        myDouble = myFloat = myLong = myInt = myShort = myByte;
//        myByte = myShort = myInt = myLong = myFloat = myDouble; // attempting to narrow the same way throws compiler errors

        System.out.println("Happy Widening");

        myByte = 'a'; // literal char is widened to int then narrowed to byte so this is okay

        // The following conversions combine both widening and narrowing prim conversions:
        //      First, the byte is converted to an int via widening prim conversion (5.1.2),
        //      then the resulting int is converted to a char by narrowing
        //      this does not work for vars because the compiler does not have enough info to determine if the narrowing is valid/safe
//        myChar = myByte;

        // this can be circumvented by casting myByte's value to char, since the cast provides the missing information necessary for the compiler to validate the transaction
        myChar = (char) myByte;

        // short and char are the same width but the char is unsigned, so conversion is not allowed
//        myShort = myChar;
//        myChar = myShort;

        // this can be circumvented by casting myByte's value to char
        myShort = (short) myChar;
        myChar = (char) myShort;
        System.out.println("Short = " + myShort);
        System.out.println("Char = " + myChar);
    }
}
