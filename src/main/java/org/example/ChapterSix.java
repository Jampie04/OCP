package org.example;

public class ChapterSix {
    protected double size;

    //by the time the constructor completes, all final instance variables
    // must be assigned a value exactly once.


    //■
    //A class is initialized at most once by the JVM before it is referenced or used.
    //■
    //All static final variables must be assigned a value exactly once, either when they
    //are declared or in a static initializer.
    //■
    //All final fields must be assigned a value exactly once, either when they are declared, in an
    //instance initializer, or in a constructor.
    //■
    //Non-final static and instance variables defined without a value are assigned a
    //default value based on their type.
    //■
    //Order of initialization is as follows: variable declarations, then initializers, and finally
    //constructors.


    //Abstract Classes

    //Easy so far. But there are some rules you need to be aware of:
    //■
    //Only instance methods can be marked abstract within a class, not variables, construc-
    //tors, or static methods.
    //■
    //An abstract method can only be declared in an abstract class.
    //■
    //A non-abstract class that extends an abstract class must implement all inherited
    //abstract methods.
    //■
    //Overriding an abstract method follows the existing rules for overriding methods that
    //you learned about earlier in the chapter.
}
