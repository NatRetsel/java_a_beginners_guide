# Chapter 11 Self Test

1. How does Java's multithreading capability enable you to write more efficient programs?
   - Programs containing subroutines that are seemingly independent from each other can run in parallel threads concurrently instead of linearly.
  
2. Multithreading is supported by the ____ class and the _____ interface.
   - `Thread`, `Runnable`.
  
3. When creating a runnable object, why might you want to extend `Thread` rather than implement `Runnable`?
   - When there is a need to override methods provided in the `Thread` class other than `run()`, it might be convenient to extend.
  
4. Show how to use `join()` to wait for a thread object called `MyThrd` to end.
   ```
   try {
     MyThrd.join();
   }catch(InterruptException exc) {
     System.out.println("Thread " + MyThrd.getName() + " interrupted.");
   }
   ```

5. Show how to set a thread called `MyThrd` to three levels above normal priority.
   - `MyThrd.setPriority(Thread.NORM_PRIORITY+3);`
  
6. What is the effect of adding the synchronized keyword to a method?
   - When the synchronized method gets first called, the object is locked preventing other threads from calling the method.
  
7. The `wait()` and `notify()` methods are used to perform _______.
   - Interthreaded communications.
  
8. Change the TickTock class so that it actually keeps time. That is, have each tick take one half second, and each tock take one half second. Thus, each tick-tock will take one second. (Don't worry about the time it takes to switch tasks, etc)
   - Visit solution folder.
  
9. Why can't you use `suspend()`, `resume()` and `stop()` for new programs?
   - They are deprecated beyond Java 2 and they can cause serious run-time problems.
  
10. What method defined by `Thread` obtains the name of a thread?
    - `.getName()`.
   
11. What does `isAlive()` return?
    - `true` if invoking thread is still running, `false` if it has terminated.
