# Chapter 6 Self Test

1. Given this fragment,
   ```
   class X {
     private int count;
   ```
   is the following fragment correct?
   ```
   class Y {
     public static void main(String[] args) {
       X ob = new X();
       ob.count = 10;
   ```
   - No. `count` is a private member and can only be accessed through member of X and not directly outside of the class.
  
2. An access modifier must ____ a member's declaration.
   - Precede.
  
3. The complement of a queue is a stack. It uses the first-in, last-out accessing and is often likened to a stack of plates. The first plate put on the table is the last plate used. Create a stack class called Stack that can hold characters. Call the methods that access the stack `push()` and `pop()`. Allow the user to specify the size of the stack when it is created. Keep all other members of the Stack class private.
   - Visit solution folder.
  
4. Given this class,
   ```
   class Test {
     int a;
     Test(int i) {a = i;}
   }
   ```
   write a method called swap() that exchanges contents of the objects referred to by two Test object references.
   ```
   void swap(Test ob1, Test ob2){
     int temp = ob1.a;
     ob1.a = ob2.a;
     ob2.a = temp;
   }
   ```

5. Is the following fragment correct?
   ```
   class X {
     int meth(int a, int b) { ... }
     String meth(int a, int b) { ... }
   ```
   - No. Overloaded methods must differ in either parameter types and or number of parameters.

6. Write a recursive method that displays the contents of a string backwards.
   ```
   static void recursive_backprint(String str, curr_idx) {
     if (curr_idx < 0) {
       return;
     }

     System.out.print(str.charAt(curr_idx));
     recursive_backprint(str, curr_idx-1);
   }
   // to call
   recursive_backprint(STRING_OBJECT, STRING_OBJECT.length - 1);
   ```

7. If all objects of a class need to share the same variable, how must you declare that variable?
   - With the `static` keyword.
  
8. Why might you need to use a `static` block?
   - When a class required some additional steps to run before its construction.
  
9. What is an inner class?
  - An inner class is a non static class within a class.
  
10. To make a member accessible by only other members of its class, what access modifier must be used?
    - `private`.
   
11. The name of a method plus its parameter list constitutes the method's ____.
    - Signature.
   
12. An `int` argument is passed to a method by using call-by-_____.
    - Value.
   
13. Create a varargs method called `sum()` that sums the int values passed to it. Have it return the result. Demonstrate its use.
    ```
    static int sum(int ...v) {
      int sum = 0;
      for (int i=0; i < v.length; i++) {
        sum += v[i];
      }
      return sum;
    }

    // to call
    int result = sum(1,2,3,53,5) // result = 64
    ```

14. Can a varargs method be overloaded?
    - Yes, with the same constraints as regular methods.
   
15. Show an example of an overloaded varargs method that is ambiguous.
    ```
    void test(int a, int ... v);
    void test(int ... v);
    void (1,2,3); // ambiguous call

    // as well as
    void test(int ...v);
    void test(boolean ...v);
    test(); // ambiguous call
    ```
   
   
