# Chapter 15 Self Test

1. In general terms, modules give you a way to specify when on unit of code depends on another. True or False?
   - True
  
2. A module is declared using what keyword?
   - `module`.
  
3. The keywords that support modules are context sensitive. Explain what this means.
   - They are recognised as keywords only in within a module declaration.

4. What is `module-info.java` and why is it important?
   - It is a way to specify the current directory this script lives and its subdirectories are part of a module.
  
5. To declare that one module depends on another module, what keyword do you use?
   - `requires`
  
6. To make the public members of a package accessible outside the module in which it is contained, it must be specified in an ____ statement?
   - `exports`
  
7. When compiling or running a module-based applciation, why is the module path important?
   - It informs the compiler on the location of the modules.
  
8. What does `requires transitive` do?
   - Enabling a module's dependence to be passed to another module so any module relying on the current module also relies on the depended module. (implied dependence).

9. Does an `exports` statement export another module, or does it export a package?
    - package.
  
10. In the first example, if you remove
    `exports appfuncs.simplefuncs;`
    from the `appfuncs` module-info file and then attempt to compilte the program, what error do you see?
    - `appfuncs.simplefuncs` cannot be found.
   
11. Module-based services are supported by what keywords?
    - `uses`, `provides`, `with`
   
12. A service specifies the general form of a unit of program functionality using either an interface or abstract class. True or False?
    - True
   
13. A service provider ____ a service.
    - Provides, implements.
   
14. To load a service, what class do you use?
    - `ServiceLoader`
   
15. Can a module dependency be made optional at run time? If so, how?
    - Yes, `exports static`.
   
16. Briefly describe what `open` and `opens` do.
    - `open` enables access at run time, including by reflection whether they have been exported or not. `opens` enables run-time access to a package.
