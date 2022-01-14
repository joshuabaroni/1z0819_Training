package scope;

public class Person {

    static String name = "UNKNOWN";
    static String maxAge = "120";
    static int GEN_GAP_YEARS = 20;

    String instanceName = "UNKNOWN";
    String age = "25";

    // Noo Args Constructor
    public Person() {

    }

    // Single Param Constructor
    public Person(String age) {
        // in this constructor, the person instance age does not get set at all, because age is not qualified by 'this'
        // when two vars have identical names, the var defaults to the lowest scope var with that name
        // therefore, in this declaration the parameter 'age' from the constructor is being assigned to itself
        age = age;
    }

    public Person(String name, String age) {
        // constructor params are named and typed the same as the
        // class var 'name' and instance var 'age'

        // Correctly setting object's age using 'this' qualifier
        this.age = age;

        // instanceName is an instance var and has a different name from the parameter which will be assigned to it
        // so this is not required, but it is good practice naming static and instance vars something different

        // also setting static var name in the same assignment statement
        this.instanceName = Person.name = name;
    }

    public void setAge(String age) {
        // method sets instance var 'age' to the parameter 'age' passed through the method
        this.age = age;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    // this method tests local variable declaration in if/else blocks
    public String getAgeGroupClassification() {

        // Declaring a local var ageClassification, initializing to "GenY"
        String ageClassification = "GenY";

        // This local variable age 'shadows' the instance variable age
        int age = Integer.parseInt(this.age);

        String[] genList = {
                "The Greatest Generation",
                "The Silent Generation",
                "Baby Boomer",
                "GenX",
                "Millenial",
                "GenZ"
        };

        // the categorization algorithm (optimized for 2020s)
        for (int i = Integer.parseInt(maxAge), j = 0; i >= age; i -= GEN_GAP_YEARS, ++j) {
            if (i < age + GEN_GAP_YEARS || i == age)
                ageClassification = genList[j];
        }

        return ageClassification;
    }

    public String getDecade(int age) {
        String decadeString = "";
//        int age = Integer.parseInt(this.age) / 10; // this name is clashing with the method declaration age
        // the above does not class with the age global var because global vars can be qualified with the 'this' keyword

        // this variable holds the max decade
        int decadeNumber = age / 10;

        int j = 0;
        // add var j
//        for (int i = 0, j = 0;) invalid, j is redeclared due to the int declaration
        for (int i = j = 0; i < (decadeNumber + 1); i++, j++) {
            String decade = "Decade " + (age / 10);
            if (i == (decadeNumber)) {
                decadeString = decade;
//                int i = 1; // compiler unable to distinguish between this 'i' and the for loop outer 'i'
            }
        }
        int modYear = age % 10;
        for (j = 0; j < modYear; j++) // valid, not redeclaring j
//            i++; // invalid, no longer in scope
            System.out.println("this is the second j loop [" + (j + 1) + "]");
        return decadeString;
    }

    @Override
    public String toString() {
        return "Person{" +
                "instanceName='" + instanceName + '\'' +
                ", age='" + age + '\'' +
                ", ageGroupClassification='" + getAgeGroupClassification() + '\'' +
                ", getDecade='" + getDecade(Integer.parseInt(this.age)) + '\'' +
                '}';
    }
}
