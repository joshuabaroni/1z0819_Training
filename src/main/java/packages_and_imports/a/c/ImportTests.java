package packages_and_imports.a.c;

import java.lang.*; // this is redundant but OK, always included

import packages_and_imports.a.b.PackageTests;
import packages_and_imports.a.*; // includes classes defined in packages_and_imports.a but not packages_and_imports.a.b or packages_and_imports.a.c

public class ImportTests {
    public static void main(String[] args) {
        System.out.println(new SomeClass().hello);
        System.out.println("Import tests");
        PackageTests.main(args);
    }
}
