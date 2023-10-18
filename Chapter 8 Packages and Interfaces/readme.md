# Chapter 8 Self Test

1. Using the code from Try This 8-1, put the `ICharQ` interface and its three implementations into a package called `qpack`. Keeping the queue demonstration class `IQDemo` in the default package, show how to import and use the classes in `qpack`.
   - Visit solution folder.
  
2. What is a namespace? Why is it important that Java allows you to partition the namespace?
   - A namespace is a declarative region. Paritioning the namespace resolves naming conflicts.
  
3. Typically, packages are stored in ____.
   - Their own directory.
  
4. Explain the difference between `protected` and default access.
   - `protected` access allows visibility from the same class, package and different package subclass while default access limits access to the same class and package only.
  
5. Explain the two ways that the members of a package can be used by other packages.
   - `import package.member_name` after including the package name.
   - Fully qualify its name.
  
6. "One interface, multiple methods" is a key tenet of Java. What feature best exemplifies it?
   - Interfaces and abstract methods.
  
7. How many classes can implement an interface? How many interface can a class implement?
   - As many as the programmer wants.
  
8. Can interfaces be extended?
   - Yes.
  
9. Create an interface for the `Vehicle` class from Chapter 7. Call the interface `IVehicle`.
    ```
    public interface IVehicle {
      // Return the range
      int range();

      // Compute fuel needed for a given distance.
      double fuelneeded(int miles);

      // Access methods for instance variables.
      int getPassengers();
      void setPassengers(int p);
      int getFuelcap();
      void setFuelcap(int f);
      int getMpg();
      void setMpg(int m);
    }
    ```

10. Variables declared in an interface are implicitly `static` and `final`. Can they be shared with other parts of a program?
    - They cannot be inherited but they act as global constants that can be used in other parts of the program by calling `interface_name.member`.
   
11. A package is, in essence, a container for classes. True or False?
    - True.
   
12. What standard Java package is automatically imported into a program?
    - `java.lang`.
   
13. What keyword is used to declare a default `interface` method?
    - `default`
   
14. Is it possible to define a `static` method in an `interface`?
    - Yes.
   
15. Assume that the `ICharQ` interface shown in Try This 8-1 has been in widespread use for several years. Now, you want to add a method to it called `reset()`, which will be used to reset the queue to its empty, starting condition. How can this be accomplished without breaking preexisting code?
    - Implementing it as a `default` interface method.
   
16. How is a `static` method in an interface called?
    - `interface_name.method`.
   
17. Can an interface have a private method?
    - Yes.
