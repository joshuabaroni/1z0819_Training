# 1z0819_Training

## Packages and Imports
### Package Nuances
* *package* - namespace that organizes a set of related classes and interfaces
* the package statement is used to group classes into a logical set of classes that have some commonality
* similar to different folders on a computer
* _FQCN_ - Fully Qualified Class Name
* only one package can be declared in a .java source file
* the package statement must be the first line of code (excluding comments and empty lines). This is in order for the compiler to know which classes to grab in the order of operations
* no package statement makes the class or type you define belong to an unnamed class
### Import Nuances
* *import* - provide FQCN from a class in another package; increases readability compared to vanilla FQCN
* *type-import-on-demand* - using _*_ to import general classes; discouraged due to ambiguity
* Import priority: FQCN > direct import > type-import-on-demand
* if we specifically ```import garden.vegetable.VineVegetable```, the local class will conflict. 
* however, if type-import-on-demand is used to import the class ```import garden.vegetable.*```, the local will override the other declarations of VineVegetable and be counted as valid.
* in the case of ```garden.vegetable.VineVegetable;```, if we ```import garden.*;``` this will only import class files directly in the `garden` package and not class files in its subdirectories
* import statements are used to inform the compiler where the classes outside of the current package are defined while allowing easier readability
* you could write all the code without a single import statement using just FQCN but this approach reduces readability
  * you can have 0 to N import names
  * import statements must follow the package statement and precede any other code (excluding comments and empty lines)
* imports required if not using a FQCN
* you cannot use a class if you do not have either a FQCN or import statement
*java.lang.{classname} is implied when you use any java.lang class
  * i.e. String, Math, etc.
### Static imports
* *static imports* - using _static_ keyword to pull in static members of a class without referencing the declared type
* Static imports don't import classes at all. They import the methods or attributes directly (since they have no interrelation to the parent instance)
* Items to look for on the exam:
  * Multiple package statements
  * A Package statement that is not the first line of code
  * Import statement not in the correct order, must be after a package statement if one exists and before any other code
  * Import static statement used in place of an import statement
  * Import statement using a higher level package with a wildcard `*`; a wildcard does not include classes in other packages.
    * Ex: import a.* does not also mean import a,b.* for example
  * A misplaced wildcard, for example the * at the end of a class name or a partial class name
### Compiling
* *javac* - compile command that creates .class files from java file
* by default, *javac* creates class file in the same directory as the original java class
* using the *-d* flag with the *javac* command, we can specify an output directory such as **out** or **build**
### Executing
* To execute *java* on the command line, we must have a class file containing a run method or runnable thread
* using the *-cp* flag, we can specify the _.class_ file path which we desire to run