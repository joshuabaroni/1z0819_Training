package packages_and_imports;

//import packages_and_imports.vegetable.packages_and_imports.VineVegetable; // if we specifically import packages_and_imports.VineVegetable, the local class will conflict.
// however, if type-import-on-demand is used to import the class, the local will override the other declarations of packages_and_imports.VineVegetable
// more specific input is the one that is used when two have the same name

public class TestFQCN {
    public static void main(String[] args) {
        String s = "We are testing ways to import classes";
        System.out.println(s);
        packages_and_imports.garden.vegetable.VineVegetable.main(args);
        VineVegetable.main(args); // will print packages_and_imports.vegetable
    }
}

class VineVegetable {
    public static void main(String[] args) {
        System.out.println("I am packages_and_imports.a local vegetable");
    }
}
