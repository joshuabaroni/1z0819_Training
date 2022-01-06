# 1z0819_Training
## Why Java?
### Java is based off of C and C++
* Java was initially started to enhance the C++ language, which is the OOP extension of the C language
* C and C++ languages are compiled into machine specific assembly language, but Java was designed as a "write once, run anywhere" language since its initial goal was to be deployed on multiple non-pc devices
* Java code is compiled into bytecode, which is interpreted by the JVM then translated to be exec on the host machine
* The architects of Java eliminated more complicated features such as pointers, operator overloading, multiple class inheritance, and destructors
* They added garbage collection for automated memory management and the ability to write a multi-threaded application as well as library support for network programming
### Java is Architecture Neutral/Platform Independent
* An app dev can write Java code without knowing or caring what hardware platform(s) the application will be deployed to
* Java compiles source code into Java bytecode `.class` which is interpreted by the JVM using _just in time_ compilation to optimize and run the app on the target machine
### Java is OO
* Java is a class-based Object Oriented Language
* From an OOP theorist's point of view, Java is not pure OOP since it supports primitive types for optimization of performance
* Java allows precise access control of class members, supporting _encapsulation_ of data
* You can hide both data and impl details from other classes, which use or extend the class you create
* Java supports _dynamic binding_ which delays the determination of the code to be executed for a specific method until runtime, which supports _polymorphism_
* Java supports both overloaded and overridden methods
  * _method overloading_ - allows a class to have more than one method having the same name, if their argument lists are different
    * number of parameters
      * Ex: add(int) and add(int, int)
    * data type of parameters
      * Ex: add(int, String) and add(String, String)
    * sequence of data types of parameters
      * Ex: add(int, String) and add(String, int)
  * _method overriding_ - allows a subclass or child class to provide a specific implementation of a method that is already provided by one of its super-classes or parent classes
    * Ex: Human -> Child and ```Human.sound() { sout("speak"); }```
    , ```@Override Child.sound() { sout("cry"); }```
* When you override a method, you are using _polymorphism, declaring that the class has its own custom behavior for a particular method or added behavior to its extended class
* This behavior will exec at runtime when the object's runtime type is fully known
* _dynamic binding_ - runtime binding, occurs with overriding
* _static binding_ - compile time binding (no polymorphism)
* Java supports the _inheritance feature_ of an OOP language by allowing classes to extend or be subtypes of other classes
  * This is the "\<x\> IS A  \<y\>" feature of OOP
* Java also supports the _composition feature_ of an OOP language by allowing class data to be of any other defined class type
  * This is the "\<x\> HAS A \<y\>" feature of OOP
* Java supports a _Single Inheritance Class Structure_ - a class can only extend one class/have one parent class in its hierarchy
### Types of Inheritance
| Type of Inheritance                    | Java supports multiple inheritance                                                                 |
|----------------------------------------|----------------------------------------------------------------------------------------------------|
| Multiple Inheritance of State          | NO - State is inherited from supertype and classes can only have 1 supertype                       |
| Multiple Inheritance of Implementation | NO - Here impl means inheriting method defs from a supertype and classes can only have 1 supertype |
|  Multiple Inheritance of Type          | YES - Java allows classes to extend their types as well as impl other types                        |
### Java is Statically Typed
* _statically typed_ - requires you to declare data types of your vars before you use them
* _dynamically typed_ - checked at runtime, no prior declaration needed
* Every var in Java must be declared with a type
* Java is considered more strongly typed than C and C++ because it eliminated pointer arithmetic
* It is not as strongly typed as some langs cause it performs implicit type conversions to cut down programmer effort
### Java is a Dynamic Programming Language
* Allows user to
  * Add new code
  * Extend objects and definitions
  * Modify the type system
* Java is statically typed, but is dynamic because
  * ENV is dynamically extensible, whereby classes are loaded on the fly as required
  * The language supports _reflection_ - allows objects to be queried and manipulated at runtime
  * Java supports _class extension_ and _inheritance_ - allows behavior to be altered at runtime
  * Low-level ops are dynamically executed by the JVM
### Java Supports Multi-Threaded Processing
* threading is **not** automatic
* from the app programmer's PoV, you start with just one thread, called the main thread
* this thread has the ability to spin up additional threads through programming constructs
### Distributed Computing is Supported by Java
* In addition to the JVM's portability to many hardware platforms across a distro env, Java supports comms across distro systems
* Java contains extensive TCP/IP networking facilities
* Library routines support protocols, such as HTTP and File transfer protocol (FTP)
### Memory Management is Handled by the Java Env and not the Developer
* Java was written to take the work of mem management out of the hands of the developer, who no longer has to write destructors to destroy and deallocate objects
* Instead, Java provides a garbage collection mechanism
* The Oracle docs describe _automatic garbage collection_ as the process of looking at heap memory, identifying which objects are in use and which are not, and deleting the unused objects
  * The underlying mem is reclaimed and reused for future object allocation
  * An _in-use_ object or _referenced object_ means that some part of your program still maintains a pointer or reference to that object
* 4 supported garbage collection alternatives
  * All except _serial collector_ work in parallel to improve performance
* For apps which manip large datasets, garbage collection could have a detrimental effect on an app's performance since garbage collection could tie up much needed resources while executing
### Java Environment
* JDK contains the following tools
  * Compiler
  * Debugger
  * Class Inspector and Doc Generator
  * JRE to run apps
* JRE includes only the class libraries and execs required to run a Java program
* a Java app does not need the full JDK to run
* Java is **WORA** (Write once, Run anywhere)
  * Platform independent
  * Portable code converted into `.class` files interpreted by the JVM
* JVM interacts with host OS, interpreting the class files, and performing **JIT**(Just in Time) compilation to specific machine code.
  * This approach optimizes the code for the env it is exec on
* A Java program never natively executes on the host machine
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