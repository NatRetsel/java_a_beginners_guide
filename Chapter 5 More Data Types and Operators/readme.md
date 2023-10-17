# Chapter 5 Self Test

1. Show two ways to declare a one-dimensional array of 12 doubles.
   - `double [] arr = new double[12];`, `double arr[] = new double[12];`
  
2. Show how to initialize a one-dimensional array of integers to the values 1 through 5.
   -  `int arr[] = {1,2,3,4,5};`
  
3. Write a program that uses an array to find the average of 10 `double` values. Use any 10 values you like.
   - Visit solution folder.
  
4. Change the sort in Try This 5-1 so that it sorts an array of strings. Demonstrate that it works.
   - Visit solution folder.
  
5. What is the difference between the `String` methods `indexOf()` and `lastIndexOf()`?
   - `indexOf()` returns the index of the first occurrence of the substring found in the invoking string.
   - `lastIndexOf()` returns the index of the last occurrence of the substring found in the invoking string.
  
6. Since all strings are objects of type `String`, show how you can call the `length()` and `charAt()` methods on this string literal: "I like Java".
   - `int x = "I like Java".length();`, `char x = "I like Java".charAt(0);`
  
7. Expanding on the `Encode` cipher class, modify it so that it uses an eight-character string as the key.
   - Visit solution folder.
  
8. Can the bitwise operators be applied to the `double` type?
   - No.
  
9. Show how this sequence can be rewritten usig the `?` operator.
    ```
    if (x < 0) y = 10;
    else y = 20;
    ```
    - `y = (x < 0) ? 10 : 20;`
  
10. In the following fragment, is the `&` a bitwise or logical operator? Why?
    ```
    boolean a, b;
    // ...
    if (a & b) ...
    ```
    - Logical, it is acting on boolean type.
   
11. Is it an error to overrun the end of an array? Is it an error to index an array with negative value?
    - Yes, yes.
   
12. What is the unsigned right-shift operator?
    - `>>>`
   
13. Rewrite the `MinMax` class shown earlier in this chapter so that it uses a for-each style `for` loop.
    - Visit solution folder.
   
14. Can the `for` loops that perform sorting in the Bubble class shown in Try This 5-1 be converted into `for-each` style loops? If not, why not?
    - No, we need to rearrange element's positions, which we cannot do it with for-each loop.
   
15. Can a `String` control a `switch` statement?
    - Yes
   
16. What keyword is reserved for use with local variable type inference?
    - `var`.
   
17. Show how to use local variable type inference to declare a `boolean` variable called `done` that has an initial value of `false`.
    - `var done = false`;
   
18. Can `var` be the name of a variable? Can `var` be the name of a class?
    - Yes to variable, no to class.
   
19. Is the following declaration valid? If not, why not.
    `var [] avgTemps = new double [7];`
    - No, we cannot declare an array of `var`. The complete type is inferred from the initializer.
   
20. Is the following declaration valid? If not, why not.
    `var alpha = 10, beta = 20;`
    - No, variables of `var` can only be declared one at a time.
   
21. In the `show()` method of the `ShowBits` class developed in Try This 5-3, the local variable `mask` is declared as shown here:
    `long mask = 1;`
    Change this declaration so that it uses local variable type inference. When doing so, be sure that `mask` is of type `long` and not `int`.
    - `var mask = 1L;`
    
