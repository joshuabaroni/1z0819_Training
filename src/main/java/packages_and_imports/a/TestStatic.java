package packages_and_imports.a;

import packages_and_imports.a.d.StaticImportTest1;
import static packages_and_imports.a.d.StaticImportTest1.*;
import packages_and_imports.a.e.StaticImportTest2; // by removing StaticImportTest2's direct import, we will not be able to call the class itself
//import static packages_and_imports.a.e.StaticImportTest2.*; // causes ambiguous error because both import static statements were pulling variables of the same names
import static packages_and_imports.a.e.StaticImportTest2.APP_NAME; // resolves to the most specific static import; this only grabs the var and not the whole class

public class TestStatic {
    public static void main(String[] args) {
        System.out.println("APP_NAME = " + APP_NAME);

        log("This is StaticImportTest");

        new StaticImportTest1().printUniqueStatement();

        System.out.println("APP_NAME = " + StaticImportTest2.APP_NAME);

        StaticImportTest2.log("This is StaticImportTest");

        new StaticImportTest2().printUniqueStatement();
    }
}
