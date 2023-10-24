# Chapter 12 Self Test

1. Enumeration constants are said to be self-typed. What does this mean?
   - They are of the same type as the enumeration they are declared in.
  
2. What class do all enumerations automaticlaly inherit?
   - `java.lang.Enum`
  
3. Given the following enumeration, write a program that uses `values()` to show a list of constants and their ordinal values.
   ```
   enum Tools {
     SCREWDRIVER, WRENCH, HAMMER, PLIERS
   }
   ```
   ```
   enum Tools {
     SCREWDRIVER, WRENCH, HAMMER, PLIERS
   }

   class Solution {
     public static void main(String[] args) {
       for (Tools t: Tools.values()) {
         System.out.println(t + "has an ordinal value of " + t.ordinal());
       }
    }
   }

   ```
  
4. The traffic light simulation developed in Try This 12-1 can be improved with a few simple changes that take advantage of an enumeration's class features. In the version shown, the duration of each color was controlled by the `TrafficLightSimulator` class by hard-coding these values into the `run()` method. Change this so that the duration of each oclor is stored by the constants in the `TrafficLightColor` enumeration. To do this, you will need to add a constructor, a private instance variable, and a method called `getDelay()`. After making these chagnes, what improvements do you see? On your own, can you think of other improvements? (Hint: Try using ordinal values to switch light colors rather than relying on a `switch` statement.)
   - Visit solution folder.
  
5. Define boing and unboxing. How does autoboxing/unboxing affect these actions?
   - Boxing refers to the wrapping of primitive types in a wrapper class as objects and unboxing means the retrieval of the primitive type's value into a primitive type from a wrapper object. Autoboxing/unboxing automatically performs wrapping/unwrapping in an expression without the need for manual methods.
  
6. Change the following fragment so that it uses autoboxing.
   `Double val = Double.valueOf(123.0);`
   - `Double val = 123.0;`
  
7. In your own words, what does static import do?
   - It imports `static` methods into the current namespace, allowing reference to the method directly without the need for the package and class specifiers.
  
8. What does this statement do?
   `import static java.lang.Integer.parseInt;`
   - It imports the static method `parseInt`, allowing usage in the current namespace without referring to the `Integer` class name.
  
9. Is static import designed for special-case situations, or is it good practice to bring all static members of all classes into view?
   - Best practice to import for special-case situations, as the purpose of packaging is to avoid namespace collisions.
  
10. An annotation is syntactically based on a/an ______.
    - Interface
   
11. What is a marker annotation?
    - One that does not take arguments

12. An annotation can be applied only to methods. True or False?
    - False.
   
13. What operator determines if an object is of a specified type?
    `instanceof`

14. Will an invalid cast that occurs at run time result in an exception?
    - Yes
