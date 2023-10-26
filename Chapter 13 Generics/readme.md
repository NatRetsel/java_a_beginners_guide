# Chapter 13 Self Test

1. Generics are important to Java because they enable the creation of code that is
   a. Type-safe
   b. Reusable
   c. Reliable
   d. All of the above
   - d.
  
2. Can a primitive type be used as a type argument?
   - No, only reference types.
  
3. Show how to declare a class called `FlightSched` that takes two generic parameters.
    ```
    class FlightShed <T, V> {
      T ob;
      V ob2;

      FlightSched(T t, V v) {
        ob = t;
        ob2 = v;
      }
    }

    FlightSched <Integer, String> obj = new FlightSched<Integer, String>(1, "String");
    ```

4. Beginning with your answer to question 3, change `FlightSched`'s second type parameter so that is must extend `Thread`.
   ```
    class FlightShed <T, V extends Thread> {
      T ob;
      V ob2;

      FlightSched(T t, V v) {
        ob = t;
        ob2 = v;
      }
    }
    Thread thrd = new Thread();
    FlightSched <Integer, Thread> obj = new FlightSched<Integer, Thread>(1, thrd);
    ```

5. Now, change `FlightSched` so that its second type parameter must be a subclass of its first type parameter.
   ```
    class FlightShed <T, V extends T> {
      T ob;
      V ob2;

      FlightSched(T t, V v) {
        ob = t;
        ob2 = v;
      }
    }
    Thread thrd = new Thread();
    FlightSched <Integer, Double> obj = new FlightSched<Integer, Double>(1, 2.0);
    ```

6. As it relates to generics, what is the ? and what does it do?
   - It is the wildcard operator that allows for any valid type when it is supplied as a type parameter.
  
7. Can the wildcard argument be bounded?
   - yes.
  
8. A generic method called `MyGen()` has one type parameter. Furthermore, `MyGen()` has one parameter whose type is that of the type parameter. Show how to declare `Mygen()`.
   - `public <T> T MyGen(T t) {//...`
  
9. Given this generic interface
   `interface IGenIF<T, V extends T> { // ..`
   show the declaration of a class called `MyClass` that implements `IGenIF`.
   - `MyClass <T, V extends T> implements IGenIF <T, V> { //...`
  
10. Given a generic class called `Counter<T>`, show how to create an object of its raw type.
    - `Counter raw = new Counter(); or supply the arguments without specifying the type specification.`
   
11. Do type parameters exist at run time?
    - No. All type parameters are erased during compilation, and appropriate casts are substituted - erasure.
   
12. Convert your solution to question 10 of the Self Test for Chapter 9 so that it is generic. in the process, create a stack interface called `IGenStack` that generically defines the operations `push()` and `pop()`.
    - Visit solution folder.
   
13. What is `< >`;
    - The diamond operator.
   
14. How can the following be simplified?
    `MyClass<Double, String> obj = new MyClass<Double, String>(1.1,"Hi");`
    - `MyClass<Double, String> obj = new MyClass<>(1.1, "Hi");`
