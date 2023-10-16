# Chapter 2 Self Test

1. Why does Java Strictly specify the range and behavior of its primitive types?
   - To ensure consistency across different platforms.
  
2. What is Java's character type, and how does it differ from the characer type used by some other programming languages?
   - Java's character type is a 16 bit unsigned integeral type. Compared to other programming languages of 8 bit, Java's character type supports languages that require more than 8 bit such as Chinese.
  
3. A boolean value can have any value you like because any non-zero value is true. True or False?
   - False
  
4. Given this output,
   ```
    One
    Two
    Three
   ```
   using a single string, show the `println()` statement that produced it.
   - `System.out.println("One\nTwo\nThree");`
  
5. What is wrong with this fragment?
   ```
    for (i=0; i < 10; i++) {
       int sum;

       sum = sum + i;
     }
     System.out.println("Sum is: " + sum);
   ```
   - Variable sum is not initialized and it gets re-declared every iteration of the loop.
   - Variable sum only exist in the scope of the for loop, so the outer print statement will not work.
  
6. Explain the differences between the prefix and postfix forms of the increment operator.
   - The prefix form of the increment operator increments the value of the variable before it is used in a wider expression while the postfix forms takes the value of the variable before it is incremented to be used in wider expression and then increment it.
  
7. Show how a short-circuit AND can be used to prevent a divide-by-zero error.
   - `if (denominator < 0 && numerator/denominator >= some value)`. Since left operand evaluates to false, there is no need to evaluate the right operand, the entire expression in the condition evaluate to false immediately, bypassing the divide by zero error.
  
8. In an expression, what type are byte and short promoted to?
   - int type.
  
9. In general, when is a cast needed?
   - When converting between incompatible types or when a narrowing conversion is occurring. E.g. double to int.
  
10. Write a program that finds all of the prime numbers between 2 and 100.
    - Visit solution folder.
   
11. Does the use of redundant parentheses affect program performance?
    - No.
   
12. Does a block define a scope?
    - Yes.
