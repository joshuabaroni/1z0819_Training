# 1z0819_Training
## Why Java?
### Java is based off of C and C++
* Java was initially started to enhance the C++ language, which is the OOP extension of the C language
* C and C++ languages are compiled into machine specific assembly language, but Java was designed as packages_and_imports.a "write once, run anywhere" language since its initial goal was to be deployed on multiple non-pc devices
* Java code is compiled into bytecode, which is interpreted by the JVM then translated to be exec on the host machine
* The architects of Java eliminated more complicated features such as pointers, operator overloading, multiple class inheritance, and destructors
* They added garbage collection for automated memory management and the ability to write packages_and_imports.a multi-threaded application as well as library support for network programming
### Java is Architecture Neutral/Platform Independent
* An app dev can write Java code without knowing or caring what hardware platform(s) the application will be deployed to
* Java compiles source code into Java bytecode `.class` which is interpreted by the JVM using _just in time_ compilation to optimize and run the app on the target machine
### Java is OO
* Java is packages_and_imports.a class-based Object Oriented Language
* From an OOP theorist's point of view, Java is not pure OOP since it supports primitive types for optimization of performance
* Java allows precise access control of class members, supporting _encapsulation_ of data
* You can hide both data and impl details from other classes, which use or extend the class you create
* Java supports _dynamic binding_ which delays the determination of the code to be executed for packages_and_imports.a specific method until runtime, which supports _polymorphism_
* Java supports both overloaded and overridden methods
  * _method overloading_ - allows packages_and_imports.a class to have more than one method having the same name, if their argument lists are different
    * number of parameters
      * Ex: add(int) and add(int, int)
    * data type of parameters
      * Ex: add(int, String) and add(String, String)
    * sequence of data types of parameters
      * Ex: add(int, String) and add(String, int)
  * _method overriding_ - allows packages_and_imports.a subclass or child class to provide packages_and_imports.a specific implementation of packages_and_imports.a method that is already provided by one of its super-classes or parent classes
    * Ex: Human -> Child and ```Human.sound() { sout("speak"); }```
    , ```@Override Child.sound() { sout("cry"); }```
* When you override packages_and_imports.a method, you are using _polymorphism, declaring that the class has its own custom behavior for packages_and_imports.a particular method or added behavior to its extended class
* This behavior will exec at runtime when the object's runtime type is fully known
* _dynamic binding_ - runtime binding, occurs with overriding
* _static binding_ - compile time binding (no polymorphism)
* Java supports the _inheritance feature_ of an OOP language by allowing classes to extend or be subtypes of other classes
  * This is the "\<x\> IS A  \<y\>" feature of OOP
* Java also supports the _composition feature_ of an OOP language by allowing class data to be of any other defined class type
  * This is the "\<x\> HAS A \<y\>" feature of OOP
* Java supports packages_and_imports.a _Single Inheritance Class Structure_ - packages_and_imports.a class can only extend one class/have one parent class in its hierarchy
### Types of Inheritance
| Type of Inheritance                    | Java supports multiple inheritance                                                                                      |
|----------------------------------------|-------------------------------------------------------------------------------------------------------------------------|
| Multiple Inheritance of State          | NO - State is inherited from supertype and classes can only have 1 supertype                                            |
| Multiple Inheritance of Implementation | NO - Here impl means inheriting method defs from packages_and_imports.a supertype and classes can only have 1 supertype |
| Multiple Inheritance of Type           | YES - Java allows classes to extend their types as well as impl other types                                             |
### Java is Statically Typed
* _statically typed_ - requires you to declare data types of your vars before you use them
* _dynamically typed_ - checked at runtime, no prior declaration needed
* Every var in Java must be declared with packages_and_imports.a type
* Java is considered more strongly typed than C and C++ because it eliminated pointer arithmetic
* It is not as strongly typed as some langs cause it performs implicit type conversions to cut down programmer effort
### Java is packages_and_imports.a Dynamic Programming Language
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
* In addition to the JVM's portability to many hardware platforms across packages_and_imports.a distro env, Java supports comms across distro systems
* Java contains extensive TCP/IP networking facilities
* Library routines support protocols, such as HTTP and File transfer protocol (FTP)
### Memory Management is Handled by the Java Env and not the Developer
* Java was written to take the work of mem management out of the hands of the developer, who no longer has to write destructors to destroy and deallocate objects
* Instead, Java provides packages_and_imports.a garbage collection mechanism
* The Oracle docs describe _automatic garbage collection_ as the process of looking at heap memory, identifying which objects are in use and which are not, and deleting the unused objects
  * The underlying mem is reclaimed and reused for future object allocation
  * An _in-use_ object or _referenced object_ means that some part of your program still maintains packages_and_imports.a pointer or reference to that object
* 4 supported garbage collection alternatives
  * All except _serial collector_ work in parallel to improve performance
* For apps which manip large datasets, garbage collection could have packages_and_imports.a detrimental effect on an app's performance since garbage collection could tie up much needed resources while executing
### Java Environment
* JDK contains the following tools
  * Compiler
  * Debugger
  * Class Inspector and Doc Generator
  * JRE to run apps
* JRE includes only the class libraries and execs required to run packages_and_imports.a Java program
* packages_and_imports.a Java app does not need the full JDK to run
* Java is **WORA** (Write once, Run anywhere)
  * Platform independent
  * Portable code converted into `.class` files interpreted by the JVM
* JVM interacts with host OS, interpreting the class files, and performing **JIT**(Just in Time) compilation to specific machine code.
  * This approach optimizes the code for the env it is exec on
* A Java program never natively executes on the host machine
## Packages and Imports
### Package Nuances
* *package* - namespace that organizes packages_and_imports.a set of related classes and interfaces
* the package statement is used to group classes into packages_and_imports.a logical set of classes that have some commonality
* similar to different folders on packages_and_imports.a computer
* _FQCN_ - Fully Qualified Class Name
* only one package can be declared in packages_and_imports.a .java source file
* the package statement must be the first line of code (excluding comments and empty lines). This is in order for the compiler to know which classes to grab in the order of operations
* no package statement makes the class or type you define belong to an unnamed class
### Import Nuances
* *import* - provide FQCN from packages_and_imports.a class in another package; increases readability compared to vanilla FQCN
* *type-import-on-demand* - using _*_ to import general classes; discouraged due to ambiguity
* Import priority: FQCN > direct import > type-import-on-demand
* if we specifically ```import packages_and_imports.vegetable.packages_and_imports.VineVegetable```, the local class will conflict. 
* however, if type-import-on-demand is used to import the class ```import packages_and_imports.vegetable.*```, the local will override the other declarations of packages_and_imports.VineVegetable and be counted as valid.
* in the case of ```packages_and_imports.vegetable.packages_and_imports.VineVegetable;```, if we ```import garden.*;``` this will only import class files directly in the `garden` package and not class files in its subdirectories
* import statements are used to inform the compiler where the classes outside of the current package are defined while allowing easier readability
* you could write all the code without packages_and_imports.a single import statement using just FQCN but this approach reduces readability
  * you can have 0 to N import names
  * import statements must follow the package statement and precede any other code (excluding comments and empty lines)
* imports required if not using packages_and_imports.a FQCN
* you cannot use packages_and_imports.a class if you do not have either packages_and_imports.a FQCN or import statement
*java.lang.{classname} is implied when you use any java.lang class
  * i.e. String, Math, etc.
### Static imports
* *static imports* - using _static_ keyword to pull in static members of packages_and_imports.a class without referencing the declared type
* Static imports don't import classes at all. They import the methods or attributes directly (since they have no interrelation to the parent instance)
* Items to look for on the exam:
  * Multiple package statements
  * A Package statement that is not the first line of code
  * Import statement not in the correct order, must be after packages_and_imports.a package statement if one exists and before any other code
  * Import static statement used in place of an import statement
  * Import statement using packages_and_imports.a higher level package with packages_and_imports.a wildcard `*`; packages_and_imports.a wildcard does not include classes in other packages.
    * Ex: import packages_and_imports.a.* does not also mean import packages_and_imports.a,b.* for example
  * A misplaced wildcard, for example the * at the end of packages_and_imports.a class name or packages_and_imports.a partial class name
### Compiling
* *javac* - compile command that creates .class files from java file
* by default, *javac* creates class file in the same directory as the original java class
* using the *-d* flag with the *javac* command, we can specify an output directory such as **out** or **build**
### Executing
* To execute *java* on the command line, we must have packages_and_imports.a class file containing packages_and_imports.a run method or runnable thread
* using the *-cp* flag, we can specify the _.class_ file path which we desire to run

## Primitive Data Types
### Recap
* Java supports two types of data: _reference_ data types and _primitive_ data types
* The data value of packages_and_imports.a primitive is stored in memory directly and is not packages_and_imports.a location reference to the data
* This makes accessing primitive data types faster and leads to more efficient performance
* Unlike C#, primitives are not objects (C# is strictly OOP, while Java uses primitives to optimize where needed)

### 8 primitive data types
* 8 main primitives in Java
* byte, char, short, int, and long are in 2's complement format (leftmost bit is +/-)
* char is the only unsigned prim

| Primitive Data Type | Storage in bits(width) | Range of Values                        | Wrapper   |
|---------------------|------------------------|----------------------------------------|-----------|
| byte                | 8                      | -128:127                               | Byte      |
| char                | 16                     | \u0000:\uFFFF                          | Character |
| short               | 16                     | (-2<sup>15</sup>):(2<sup>15</sup> - 1) | Short     |
| int*                | 32                     | (-2<sup>31</sup>):(2<sup>31</sup> - 1) | Integer   |
| long                | 64                     | (-2<sup>63</sup>):(2<sup>63</sup> - 1) | Long      |
| float               | 32                     | ~3.4028235<sup>38</sup>                | Float     |  
| double*             | 64                     | ~1.7976931348623157<sup>308</sup>      | Double    |
| boolean             | 1                      | true, false                            | Boolean   |

### Declaring Primitive Types
* _declaration_ - consists of data types and variable names
* variable name must be packages_and_imports.a valid identifier
* Java allows for multiple variable declarations on the same line as long as they are of the same type
* data in the form of literals can be assigned to primitives
* Valid literals are numeric values in base<sub>10</sub>, base<sub>8</sub>, or base<sub>16</sub> forms
* An unmodified integer value is assumed to be 32bit int prim
* A value containing a decimal point is assumed to be 64bit double
* 'A'.class is Character, but "A".class is String

| Literal Types | Valid Literal Examples | Declared Type                                   |
|---------------|------------------------|-------------------------------------------------|
| numeric       | 400                    | 32 bit signed int prim                          |
| numeric       | -6000                  | 32 bit signed int prim                          |
| numeric       | 5280L or 5280l         | declared long                                   |
| numeric       | 0xC0FFEE               | base<sub>16</sub> prim                          |
| numeric       | 010                    | base<sub>8</sub> prim                           |
| numeric       | 5.077                  | assumed double                                  |
| numeric       | 5.077F or 5.077f       | declared float                                  |
| numeric       | 3_000_000              | integer, Java 7 added to improve readability    |
| numeric       | 0b00100001             | binary literal introduced in Java 7             |
| char          | '\u0041'               | unicode for 'A'                                 |
| char          | 65                     | decimal value for letter 'A'                    |
| char          | 'A'                    | --                                              |
| char          | '\n'                   | (escape chars with '\\' - represents line feed) |
| boolean       | true                   | --                                              |
| boolean       | false                  | --                                              |

### Suffix and Prefix Modifiers
* in some cases, numeric literals will have a suffix
* valid suffixes exist for *long*, *float*, and *double* and the case of the suffix does not matter
* this forces the literal value assigned to the var to be the type specified in the suffix
* _binary_ - binary number with prefix "0b"
* _octal_ - octal number with prefix "0"
* _hexadecimal_ - hex number with prefix "0x"
* _char literals_ - char is translated from ascii value to numeric for numeric prims
  * numeric val for char type is translated to ascii char value
* _unicode_ - prefixed with \u
* underscores can be used to improve readability as long as they are not at the beginning, end, or up against a modifier

### Initialization
* Java default initializes global prims to values of 0 for numerics, false for bool
* Java requires local prims to be initialized before use
* if the var is **unused**, no compiler error will be thrown
* _partial initialization_ - init does not occur in all possible condition outcomes and accessed outside the condition
  * Init in an _if_ statement block without a corresponding else block
  * Init in a _switch_ statement, but not the default statement
  * Init in a _while_ loop (note that do/while loop is okay since it is always exec at least once)

| Type of Init or Assignment                                                                                                                | Example                                                                                                                             | Notes                                                                                                                                |
|-------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------|
| To a literal as described in the previous section                                                                                         | int i1 = 10; // decimal integer <br/> int i2 = 012; // octal <br/> int i3 = 0xA; // hexadecimal <br/> int i4 = 0b00001010 // binary | All of these set the decimal representation of 10 to an int prim type                                                                |
| To a variable of same data type                                                                                                           | int i1 = 10;<br/>int i2 = i1;                                                                                                       | Assigned to another int variable                                                                                                     |
| To a variable of smaller data type                                                                                                        | short s1 = 10;<br/>int i2 = s1;                                                                                                     | Assigned to a smaller prim data variable                                                                                             | 
| To a wrapper class which will automatically do casting as long as wrapper's data type size is <= other variable's declared data type size | Short s1Wrap = 10;<br/>Integer i1Wrap = 10;<br/>int i1 = i1Wrap, i2 = s1Wrap;                                                       | Assigned to a wrapper class for a smaller primitive data type                                                                        |
| To a casted variable or literal                                                                                                           | int i1 = (int) 100L;                                                                                                                | 100L is a literal for a long. The cast takes preference over the literal suffix                                                      |
| To an instance variable of an object or class as long as the above rules apply and access modifier allows it                              | Foo foo = new Foo();<br/>int i1 = foo.myInteger;                                                                                    | Assume foo class exists and has a myInteger instance variable attr                                                                   |
| To a return value of a method in scope, as long as the above rules apply                                                                  | Foo foo = new Foo();<br/>int i1 = foo.getMethod();                                                                                  | Assume foo class exists and has a method getMethod() which returns an int or wrapper int or any data type as described in this table |

### Data Type Mismatches
* _narrowing_ - assign a larger prim data literal or variable to a smaller one
* _widening_ - assign a smaller prim data literal or variable to a larger one
  * compiler is more forgiving on widening attempts than narrowing attempts
* Every numeric val literal that does not contain a decimal point is a 32bit _int_ by default
* Every numeric literal with a decimal defaults to _double_
* There are times when you want to force the compiler to overlook its narrowing and widening checks
  * you have the knowledge of the actual values occurring in the program during execution
* _casting_ - reference the type you want to be widened or narrowed to in parenthesis preceding the var or val that is to be converted
  * cast to a larger sized var (widening) - this is the most common case and poses less risk since there is no risk of loss of value
  * cast to a smaller var (narrowing)
    * case: perhaps you want to use a method that requires a smaller var type
    * assumption: you know your val will not exceed the smaller variable range at the time of execution
* The problem with casting is that if your value does not fall into the valid value range, your data may **underflow** or **overflow**
  * _underflow_ - defining or casting a value < MIN_VALUE for the data type
  * _overflow_ - defining or casting a value > MAX_VALUE for the data type
* In some cases you might want to cast from a more precise data type (float) to a less precise one (int)
  * This truncates the number to a whole number
* You can always force the compiler's hand and use a cast, but you should always ask yourself why you need a cast and evaluate the risks associated with casting and try to code in defense of those risks
### Declaring and Initializing Variables
* Literals with decimal default to double, not float
* Doubles and floats do **not** overflow, since they are approximated
* Local variable primitives are not initialized
* Class static and instance members are initialized
* Null is **not** a valid value for a primitive data type 
### Unicode Character Representations
* The char data type is based on the original Unicode specification, which defined characters as fixed-width 16-bit entities
* The unicode Standard has since been changed to allow for characters whose representation requires more than 16 bits
* The range of legal code points is now **U+0000, U+10FFFF, known as Unicode scalar value
* The java platform uses _UTF-16_ representation in char arrays and in String and String-related classes
* In this representation, supplementary characters are represented as a pair of char values
  * Range: (_High Surrogates_ - \uD800-\uDBFF, _Low Surrogates_ - \uDC00-\uDFFF)
### Scope
* _**scope** of a declaration_ - the region of the program within which the entity declared by the declaration can be referred to using a simple name, assuming it is visible
* local variables, formal parameters, exception parameters, and local classes can only be referred to using a simple name, not a qualified name
  * because of this, some declarations are not permitted within the scope of these elements
* if you **cannot qualify** a variable name in its **current** scope, you **cannot create** another local variable in a more **limited** scope

| scope                           | Qualifier          |
|---------------------------------|--------------------|
| Class                           | {DefinedClassType} |
| Instance                        | this               | 
| Method                          | none               |
| Loop                            | none               |
| Loop Block                      | none               |
| Block Including Exception Block | none               |

* The best way to quickly see if your local var definition is going to raise a compile error is to ask yourself if you can **qualify** it by its _instance_
* If you cannot, and it has already been defined in an outer scope, it will cause an error
* This is especially hard to spot in for loop initialization statements
* _shadowing_ - a local variable is legally declared, but another declaration that can be qualified is not used or accessed because the local var takes precedence
* You can define a nested or inner class within a method which seems to break the local var rule we learned
### Local variable type inference
* _'var' keyword_ - a **shorthand** statement to reduce the verbosity of code
* 'var' is **not**
  * a data type. The data type must be able to be inferred by the compiler when using it
  * a keyword. You can use the text 'var' as an identifier
* Can only be used inside methods for local variables, and the variable type on the right side of the declaration must be inferable by compiler to avoid compilation errors
* var is **not** to be confused with variable type
* just because you define a local variable with the var designation, it does not mean it is a variable type
* the type is inferred by its initialization and cannot be changed
* all the narrowing/widening rules for the inferred type apply
* you **cannot** use LVTI for:
  * class or instance vars
  * method return types
  * method params
  * constructor params
  * the class name (lowercase 'var')
* you **can** use LVTI for:
  * local variables in methods and code blocks
  * loop variables
  
| Valid uses of LVTI (Assuming local vars) | Explanation                                                                                                                           |
|------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------|
| `var i = 1;`                             | Since the literal 1 is an int, var i is inferred to be an int                                                                         |
| `var j = 1.0f/2;`                        | j is inferred to be a float                                                                                                           |
| `short s = 1;<br/>var k = s+;`           | k is inferred to be an int (not a short) since the operator + (which doesn't change the value of 1) forces s to be promoted to an int |
| `var list = new ArrayList<>();`          | This is ok because ArrayList does not need to be typed to be initialized                                                              |
| `var myArray = new String[5];`           | This is ok because type is inferred to be an array of String                                                                          |

| Invalid uses of LVTI (Assuming local vars) | Explanation                                                                                  |
|--------------------------------------------|----------------------------------------------------------------------------------------------|
| `var i = 1, i = 2;`                        | var cannot be used in compound statement                                                     |
| `var i,j = 1;`                             | var cannot be used in compound statement                                                     |
| `var integer`                              | integer here is a variable name and therefore type cannot be inferred without an initializer |
| `var myObject = null;`                     | var variable cannot be initialized to null, type cannot be inferred                          |
| `var myArray = {"a", "b"}`                 | This looks legal since array of String, but var variable cannot be init with an array init   |

## Strings
* A String in java is an object of class java.lang.String and represents an array or series of characters, but is NOT an array of the primitive data type 'char'
* _interning_ - when a String is created without a constructor (not using 'new') the string is stored in a special area of the heap called the string pool, whose purpose is to maintain a set of unique strings
* you can manually intern using String.intern()
* when you assign two variables to the same string literal, these strings are considered equal and the comparator '==' evaluates to true
* Strings are _immutable_ - they cannot be changed
* once you create a String with a string literal (for example "Hello") that string remains ("Hello") on the string pool with a single reference to it
* if you do a string concatenation, you are not changing the current String, but creating a new String object with the concatenated strings added to it
* Literal strings have their own special area of the heap memory called the string pool
* any assignment of a literal will refer to the same String in this pool
* you can force a String to be added to the pool by calling the intern() method on the string object
* Strings are immutable, any methods that seem to op on a string are actually creating new strings and making pointers to those strings in the string pool

| String Creation Method                                                                                                                                                                                                                                                                                    | Examples                                                                                                                                                                                                                                                   |
|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Assign string literal to a String variable. A string literal is contained in double quotes                                                                                                                                                                                                                | `String s = "hello";`                                                                                                                                                                                                                                      |
| String constructors (there are several). It is important to note that String constructors for<br/> byte[] char[] and int[] take a second param <br/>which represents the starting index and the third param is a count of elements which <br/>will be copied from the array, raather than an ending index | `String s1 = new String("hello");`<br/> `byte[] bytes = {'a','b','c'}; String s2 = new String(bytes);`<br/>`char[] chars = {'a','b','c'}; String s3 = new String(chars);`<br/>`StringBuilder sb = new StringBuilder("hello"); String s4 = new String(sb);` |
| String concatenation                                                                                                                                                                                                                                                                                      | `String s5 = "hello" + " world " + getMethodString();`                                                                                                                                                                                                     |

### Creating Strings
* _inclusive offset_ - you set the value of the new string to some substring of the param string passed, including the character at the start index provided
* for constructors, the param after the starting index param is not an ending index param, but rather a count of chars to be included at the beginning offset
* If this count + offset exceeds num chars, we get a runtime error
* Ex: Hello World -> Wor
  * `String str = "Hello World"; `
### String Concatenation
* plus operator `+` is overloaded for String to represent the String.concat function
* When you concat a str to a ref variable, if the ref var is a reference type, the toString() method on the object is called
* If the variable is a primitive data type, the var is boxed to a wrapper and its toString() method is called
### Manipulating Strings
* The index of the first character is always 0 and the index of the last char is (string.length() - 1)
* Many string methods use a starting and ending index to copy, replace, or search through the string
* _inclusive_ - the method will use the character at that beginning index
  * the beginning index for string methods is inclusive
* _exclusive_ - the method will not use the character at the end index
  * to use the last character in your string, your ending index would be string.length()

| Comparison       | Text Searches    | Text Manipulation           | Text Transformation               |
|------------------|------------------|-----------------------------|-----------------------------------|
| equals           | contains         | concat                      | chars (introduced in Java 9)      |
| equalsIgnoreCase | equalsIgnoreCase | join (introduced in Java 8) | codePoints (introduced in Java 9) |
| contentEquals    | endsWith         | replace                     | format                            |
| compareTo        | indexOf          | replaceAll                  | lines (introduced in Java 11)     |
| isEmpty          | lastIndexOf      | replaceFirst                | repeat (introduced in Java 11)    |
| isBlank          | matches          | split                       | strip                             |
|                  | startsWith       | substring                   | stripLeading                      |
|                  |                  | subSequence                 | stripTrailing                     |
|                  |                  |                             | toCharArray                       |
|                  |                  |                             | toLowerCase                       |
|                  |                  |                             | toUpperCase                       |
|                  |                  |                             | trim                              |
|                  |                  |                             | valueOf                           |

### StringBuilder
* StringBuilder objects, unlike strings, are not immutable
* They are lighter weight memory wise, so when assigning and reassigning or manipulating strings, opt for StringBuilder to save memory
* Strings should be used unless StringBuilder offers an advantage in terms of simpler code or better performance
* Ex: concatenation of a large number of strings or dynamic XML/HTML
* Every StringBuilder has a capacity which is the number of char spaces alloted to it
* Capacity is automatically extended as additions are made to the StringBuilder object
* Constructors:

| Constructor                    | Description                                                                                                | Capacity         |
|--------------------------------|------------------------------------------------------------------------------------------------------------|------------------|
| StringBuilder()                | Empty StringBuilder Object with default capacity                                                           | 16 (default)     |
| StringBuilder(CharSequence cs) | StringBuilder Object with same chars as the specified CharSequence plus default capacity trailing elements | cs.length() + 16 |
| StringBuilder(String s)        | StringBuilder Object with specified initial capacity                                                       | initCapacity     |

## Operators
* _unary operator_ - operates on 1 variable
* _binary operator_ - operates on 2 vars: a left and a right variable

| Category                      | Symbol                               | Simple Description                                                          | Notes                                                                                                                                                                       |
|-------------------------------|--------------------------------------|-----------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Multiplicative Operations     | *<br/>/<br/>%                        | Multiplication<br/>Division<br/>Modulus                                     | Precedence equal among them, group left to right                                                                                                                            |
| Additive Operators            | +<br/>-                              | Addition<br/>Subtraction                                                    | Precedence equal among them, group left to right                                                                                                                            |
| Shift Operators               | <<<br/>>><br/>>>>                    | left shift<br/>signed right shift<br/>unsigned right shift                  | The left hand Op of a shift Op is the value to be shifted<br/>The right hand Op specified the shift distance in bits<br/>Precedence equal among them, grouped left to right |
| Relational Operators          | <<br/><=<br/>><br/>>=<br/>instanceof | less than<br/>less than or equal<br/>greater than<br/>greater than or equal | Precedence equal among them, group left to right                                                                                                                            |
| Equality Operators            | ==<br/>!=                            | equals<br/>not equals                                                       |                                                                                                                                                                             |
| Bitwise and Logical Operators | &<br/>^<br/>&#124;                   | AND<br/>XOR<br/>NOR                                                         | These operators have different precedence, with & having the highest precedence and &#124; the lowest precedence                                                            |                                                                                                                                                                             |

* Numeric promotion
  * For a _unary operator_ that is not the pre/post dec Op, if the type of Op is smaller than an int, the Op will automatically be promoted to an int
  * For a _binary operator_, both Ops are promoted to int if they are smaller than an int, but if any of the Ops >intCapacity it is promoted to the smallest type that can hold it
    * This does not occue, however, for compound assignment operators (i.e. int i = j = k = Integer.MAX_VALUE << 1)
  * Any Ops on numeric values will never result in an Op smaller than an int
  * 
