package a.c;

import java.lang.*; // this is redundant but OK, always included

import a.b.PackageTests.*; // this means nothing because PackageTests is not a package
import a.b.PackageTests;
import a.c.ImportTests; // this is redundant but OK, code will compile
import a.*; // includes classes defined in a but not a.b or a.c

public class ImportTests {
    public static void main(String[] args) {
        System.out.println(new SomeClass().hello);
        System.out.println("Import tests");
        PackageTests.main(args);
    }
}
