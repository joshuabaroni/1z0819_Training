package packages_and_imports.a;

//import java.lang.Number; // not only is this unnecessary, but number becomes packages_and_imports.a defined entity so we can't make packages_and_imports.a locally defined class called number
import java.lang.*; // unnecessary, but doesn't create packages_and_imports.a conflict with the classname

public class Number {
    Number number; // you can name your class the same name as another declared class.
    // follow the order of priority to retrieve the class you want.
    java.lang.Number numberj;

    Number(java.lang.Number number) {
        this.numberj = number;
        System.out.println("Constructor for java.lang.number");
    }

    Number(Number number) {
        this.number = number;
        System.out.println("Constructor for packages_and_imports.a.Number");
    }

    public static void main(String[] args) {
        Number n = new Number(10);
        Number n2 = new Number(n);
    }
}
