package type_inference;

public class VarDonts {
    // static variables cannot be declared with 'var'
//        static var classVariable = 10;

    // class instance variables cannot be declared with 'var'
//        var instanceVariable = 20;

    public static void main(String[] args) {

    }

    // invalid, cannot have a method type return of 'var'
    /*
    public static var returnThis(String[] args) {
        return args;
    }

    // invalid, cannot have method param of var
    public static String[] returnThat(var args) {
        return args;
    }
     */
}
