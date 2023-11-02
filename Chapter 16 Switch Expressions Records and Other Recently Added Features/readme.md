# Chapter 16 Self Test

1. Rewrite the following sequence so that it uses a constant list:
   ```
   case 3: prime = true;
           break;
   case 5: prime = true;
           break;
   case 7: prime = true;
           break;
   ```
   ```
   case 3, 5, 7:
      prime = true;
      break;
   ```

2. When using an arrow case, does execution fall through to the next case?
   - No.
  
3. Given this `switch`, show the `yield` statement that returns the value 98.6:
   ```
   double val = switch(x) {
     case "temp":  // produce the value 98.6
   // ...
   ```
   ```
   double val = switch(x) {
     case "temp":
         yield 98.6;
   }
   ```

4. Assuming the `switch` in Question 3. show to to use an arrow `case` to yield the value 98.6.
   ```
   double val = switch(x) {
     case "temp" -> 98.6;
   }

   ```

5. Can you mix an arrow `case` and a colon `case` in the same `switch`?
   - No.
  
6. Can the target of an arrow `case` be a block?
   - Yes.
  
7. A `record` is commonly referred to as a/an ______ type.
   - Aggregate
  
8. Given this record declaration, what are its components? What elements are implicitly created?
   `record MyRec(Double highTemp, Double lowTemp, String location) {}`
   - Getter methods for `highTemp`, `lowTemp`, `location` -> `highTemp()`, `lowTemp()`, `location()`.
   - Constructor mapping the supplied argument values to `highTemp`, `lowTemp`, `location`.
  
9. Does a `record` have a default constructor? If not, what type of constructor does a `record` automatically have?
    - No. A record automatically defines a canonical constructor.
  
10. Given `MyRec` from Question 8, show the compact canonical constructor that removes leading the trailing spaces from `location` string.
    ```
    public MyRec {
      location.trim();
    };
    ```

11. If you were to override a `record` getter method, in what way would you need to be very careful?
    - Ensure that the value return is not the one contained in the record.
   
12. In Try This 13-1 you created a generic queue class. can this class be sued to store `record` objects without any changes? If so, demonstrate its use to store the `Item` records used in the record examples.
    - Visit solution folder.
   
13. Rework the `Item` record so that the `price` component is generic, with an upper bound of `Number`.
    - `record Item<P extends Number> (String name, int itemNum, P price) {}`.
   
14. In the `BlockArrowCaseDemo` program, the `switch` expression yields the shipping method, but the variable `extraCharge` is set separately inside each `case`. This program can be improved by having the `switch` yield a `record` that contains both the shipping method and the `extraCharge` value. In essence, the use of a `record` enables the `switch` to yield two or more values when it returns its result. Rework the `BlockArrowcaseDemo` program to demonstrate this approach.
    - Visit solution folder.
   
15. Show the general form of `instanceof` when using pattern matching.
    - `obj instanceof type pattern-var`.
   
16. Given `Object myOb = "A test string.";` fill in the blank in the following `if` statement that uses `instanceof` to determine whether `myOb` refers to a `String`.
    `if(myObj instanceof _______) System.out.println("Is a string: " + str);`
    - `String str`.
   
17. A `sealed` class explicitly specifies the subclasses that can inherit it. True or false?
    - True.
   
18. Given the following:
    `public sealed class MyClass permits Alpha, Beta, Gamma { //...`
    which of the following declarations are legal?
    a. `public final class Alpha extends MyClass { //...`
    b. `public final class Beta { //...`
    c. `public class Gamma extends MyClass { //...`
    d. `public non-sealed SomeOtherClass extends MyClass { // ...`
    - a.
   
19. Can an interface be sealed? If so, what effect does sealing interface have?
    - Yes, it can permit certain objects to implement the interface.
   
20. A preview feature is a new feature that is fully developed, but not yet formally part of Java. True or False?
    - True.
   
21. A preview feature is subject to change or may even be withdrawn. True or False?
    - True.
