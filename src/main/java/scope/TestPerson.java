package scope;

public class TestPerson {
    public static void main(String[] args) {
        // first we'll create a person using 2args constructor
        Person joe = new Person("JOE", "50");

        // next we'll create a person using 1arg
        Person deb = new Person("DEB", "70");

        // and finally noArgs, using setters
        Person ann = new Person();

        System.out.println(joe);
        System.out.println(deb);
        System.out.println("---ANN BEFORE---");
        System.out.println(ann);
        ann.setAge("20");
        ann.setInstanceName("ANN");

        System.out.println("---ANN AFTER---");
        System.out.println(ann);
    }
}
