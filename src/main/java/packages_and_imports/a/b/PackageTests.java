//package; // packages_and_imports.a class with no package declaration is part of the unnamed package declaration
//package default; // default is not packages_and_imports.a valid package

//package PackageTests; create packages_and_imports.a directory structure that matches your package statement
package packages_and_imports.a.b; // only one package statement is supported

public class PackageTests {
    public static void main(String[] args) {
        System.out.println("Package Tests");
    }
}
