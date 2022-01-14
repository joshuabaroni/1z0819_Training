package type_inference;

import type_inference.wordy_company_name.a_long_package_name.AClassWithAVeryLongName;

public class VarTest {
    public static void main(String[] args) {
        // since the FQCN is very verbose, we can use 'var' to infer class type
        // local variable type inference
        var aClassWithAVeryLongName = new AClassWithAVeryLongName();
        aClassWithAVeryLongName.setName("Testing");
        System.out.println(aClassWithAVeryLongName);

        // adding some other var declarations
        // i is inferred to be an int since it is assigned a literal int
        var i = 1;

        // An array can be assigned to a LVTI variable
        var aVarArray = new int[3];

        // Valid to assign a method return value to a LVTI variable
        var methodVal = aClassWithAVeryLongName.getName();

        // OK to assign a null object to LVTI variable, but you can't assign the literal null directly
        // this is legal because even with null you can infer the class type from the previous variable
        Object nullObj = null;
        var var = nullObj;

        // ================= invalid scenarios below =================

        // cannot use LVTI in a complex statement
//        var j = new String(), k = new String();
//        var m, n = 0;

        // cannot declare a 'var' variable without also initializing it
//        var someObject;

        // cannot assign var to null directly since type cannot be inferred
//        var newVar = null;

        // cannot use array init in var declaration/init
//        var myArray = {"A", "B"};

        // cannot have an array of var
//        var[] newArray = new int[2];
    }
}
