# Chapter 7 Self Test

1. Does a superclass have access to the members of a subclass? Does a subclass have access to the members of a superclass?
   - No, and yes to non private members.
  
2. Create a subclass of `TwoDShape` called `Circle`. Include an `area()` method that computes the area of the circle and a constructor that uses `super` to initialize the `TwoDShape` portion.
   - Visit solution folder.
  
3. How do you prevent a subclass from ahving access to a member of a superclass?
   - precede the member with the `private` keyword.
  
4. Describe the purpose and use of the two versions of `super` described in this chapter.
   - To reference overridden methods of superclass and to call the constructor of the superclass.
  
5. Given the following hierarchy:
   ```
   class Alpha {...
   class Beta extends Alpha {...
   class Gamma extends Beta {...
   ```
   In what order do the constructors for these classes complete their execution when a `Gamma` object is instantiated?
   - Alpha, Beta, Gamma.
  
6. A superclass reference can refer to a subclass object. Explain why this is important as it relates to method overriding.
   - When an overridden method is called through the superclass reference, the specific version that is being called is determined at runtime based on the type of the object is being referred to at the time of call. If the superclass reference is referring to the superclass at time of call, the superclass' version will be called. If it is referring to the subclass, the subclass' version will be called.
  
7. What is an abstract class?
   - An abstract class is a class that contains one or more abstract methods. They cannot be instantiated as objects and can only be inherited.
  
8. How do you prevent a method from being overriden? How do you prevent a class from being inherited?
   - With the `final` keyword preceding the method or class.
  
9. Explain how inheritance, method overriding, and abstract classes are used to support polymorphism.
   - Inheritance, method overriding, and abstract classes support polymorphism by enabling you to create a generalized class structure that can be implemented by a variety of classes. Thus, the abstract class defines a consistent interface that is shared by all implementing classes. This embodies the concept of "one interface, multiple methods."

10. What class is a superclass of every other class?
    - Java's `Object` class.
   
11. A class that contains at least one abstract method must, itself, be declared abstract. True or False?
    - True.
   
12. What keyword is used to create a named constant?
    - The `final` keyword.
   
13. Assume that class `B` inherits class `A`. Further, assume a method called `makeObj()` that is declared as shown here:
    ```
    A makeObj(int which) {
      if(which == 0) return new A();
      else return new B();
    }
    ```
    Notice that `makeObj()` returns a reference to an object of either type `A` or `B`, depending on the value of `which`. Notice, however, that the return type of `makeObj()` is `A`. Given this situation and assuming you are using JDK 10 or later, what is the type of `myRAef` in the following declaration and why?
    `var myRef = makeObj(1);`
    - Class `A` reference to class `B`.
   
14. Assuning the situation described in Question 13, what will the type of `myRef` be given the statement?
    `var myRef = (B) makeObj(1);`
    - Class `B` reference to class `B`.
