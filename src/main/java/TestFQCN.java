import garden.vegetable.*;
//import nursery.vegetable.VineVegetable; // if we specifically import VineVegetable, the local class will conflict.
// however, if type-import-on-demand is used to import the class, the local will override the other declarations of VineVegetable
// more specific input is the one that is used when two have the same name

public class TestFQCN {
    public static void main(String[] args) {
        String s = "We are testing ways to import classes";
        System.out.println(s);
        garden.vegetable.VineVegetable.main(args);
        VineVegetable.main(args); // will print nursery.vegetable
    }
}

class VineVegetable {
    public static void main(String[] args) {
        System.out.println("I am a local vegetable");
    }
}
