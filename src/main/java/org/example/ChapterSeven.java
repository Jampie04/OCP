package org.example;

public class ChapterSeven {
    // Beyond classes

    //Interface Classes
    //■
    //Interfaces are implicitly abstract.
    //■
    //Interface variables are implicitly public, static, and final.
    //■
    //Interface methods without a body are implicitly abstract.
    //■
    //Interface methods without the private modifier are implicitly public.


    //Default Interface Method Definition Rules
    //1.
    //A default method may be declared only within an interface.
    //2.
    //A default method must be marked with the default keyword and include a method body.
    //3.
    //A default method is implicitly public.
    //4.
    //A default method cannot be marked abstract, final, or static.
    //5.
    //A default method may be overridden by a class that implements the interface.
    //6.
    //If a class inherits two or more default methods with the same method signature, then the
    //class must override the method.

    //Static Interface Method Definition Rules
    //1.
    //A static method must be marked with the static keyword and include a
    //method body.
    //2.
    //A static method without an access modifier is implicitly public.
    //3.
    //A static method cannot be marked abstract or final.
    //4.
    //A static method is not inherited and cannot be accessed in a class implementing the
    //interface without a reference to the interface name.

    //Private Interface Method Definition Rules
    //1.
    //A private interface method must be marked with the private modifier and include a
    //method body.
    //2.
    //A private static interface method may be called by any method within the interface
    //definition.
    //3.
    //A private interface method may only be called by default and other private non-static methods within the interface definition.



//    ■
//    Treat abstract, default, and non-static private methods as belonging to an instance of the interface.
//            ■
//    Treat static methods and variables as belonging to the interface class object.
//            ■
//    All private interface method types are only accessible within the interface declaration.


    //Polymorphism: letterlijke betekenis many behaviour.
    //Wanneer vele methods die exact zelfde zijn in verschillende classes zijn, maar je andere result geven zie video telusko Dynamic Method Dispatch in Java


    // Casting objects
    //We summarize these concepts into a set of rules for you to memorize for the exam:
    //1.
    //Casting a reference from a subtype to a supertype doesn’t require an explicit cast.
    //2.
    //Casting a reference from a supertype to a subtype requires an explicit cast.
    //3.
    //At runtime, an invalid cast of a reference to an incompatible type results in a
    //ClassCastException being thrown.
    //4.
    //The compiler disallows casts to unrelated types.

}




























//abstract class Shape {
//    getOmtrek();
//}
//
//class Circle extends Shape {
//    getOmtrek() {
//
//    }
//}
//
//class Triangle extends  Shape{
//    getOmtrek()
//}
//
//
//
//class Math {
////    void multiplyOmtrek(Triangle t) {
////        t.getOmtrek() * 2
////    }
////
////    void multiplyOmtrek(Circle c) {
////        c.getOmtrek() * 2
////    }
//
//    void multiplyOmtrek(Shape s) {
//        s.getOmrek() * 2
//    }
//
//}
//
//Triangle t = new Triangle();
//Circle c = new Circle();
//
//Math.multiplyOmtrek(t);
//Math.multiplyOmtrek(c);













