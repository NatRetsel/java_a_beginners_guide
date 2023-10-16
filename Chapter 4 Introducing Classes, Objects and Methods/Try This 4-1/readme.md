# Chapter 4 Self Test

1. What is the difference between a class and an object?
   - A class is the logical abstraction that describes the form and behavior of the object. An object is an instance of the class.
  
2. How is a class defined?
   - With the `class` keyword.
  
3. What does each object have its own copy of?
   - instanced / member variables.
  
4. Using two separate statements, show how to decalre an object called `counter` of a class called `MyCounter`.
   - `MyCounter counter; counter = new MyCounter();`
   - `MyCounter counter = new MyCounter();`
  
5. Show how a method called `myMeth()` is declared if it has a return type of `double` and has two `int` parameters called `a` and `b`.
   - `double myMeth(int a, int b) {//...;}`.
  
6. How must a method return if it returns a value?
   - With the `return` statement.
  
7. What name does a constructor have?
   - The name of the class.
  
8. What does `new` do?
   - Allocates memory dynamically (on runtime) for the object and initializes it using the object's constructor.
  
9. What is garbage collection, and how does it work?
   - JVM's way of managing unused objects without the programmer's inteference. When it sees that there is no reference to the object, memory allocated for the object is freed for subsequent uses.
  
10. What is `this`?
    - A reference to the invoking object. It is automatically passed to a method.
   
11. Can a constructor have one or more parameters?
    - Yes.
   
12. If a method returns no value, what must its return type be?
    - `void`.
