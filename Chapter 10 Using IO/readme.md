# Chapter 10 Self Test

1. Why does Java define both byte and character streams?
   - Byte streams for the initial development of Java useful for binary I/O, and they support random-access files. The character streams are optimized for Unicode.
  
2. Even though console input and output is text-based, why does Java still use byte streams for this purpose?
   - The predefined streams were defined before Java added the character streams.

3. Show how to open a file for reading bytes.
   - `FileInputStream fin = new FileInputStream(filename);`
  
4. Show how to open a file for reading characters.
   - `FileReader rin = new FileReader(filename);`
  
5. Show how to open a file for random-access I/O.
   - `rfile = new RandomAccessFile("test", "rw");`

6. How can you convert a numeric string such as "123.23" into its binary equivalent?
   - `Number.parseInt(string); or Double.parseDouble(String);`
  
7. Write a program that copies a text file. In the process, have it convert all spaces into hyphens. Use the byte stream file classes. Use the traditional approach to closing a file by explicitly calling close().
   - Visit solution folder.
  
8. Rewrite the program described in question 7 so that it uses the character stream clases. This time, use the try-with-resources statement to automatically close the file.
   - Visit solution folder.
  
9. What type of stream is `System.in`?
    - `InputStream`.
  
10. What does the `read()` method of `InputStream` return when an attempt is made to read at the end of the stream?
    - -1.
   
11. What type of stream is used to read binary data?
    - `DataInputStream`.
   
12. `Reader` and `Writer` are at the top of the _____ class hierarchies.
    - character-based I/O.

13. The try-with-resources statement is used for ____ ____ ____.
    - Automatic resource management.
   
14. If you are using the traditional method of closing a file, then closing a file within a `finally` block is generally a good approach. True or False?
    - True.
   
15. Can local variable type inference be used when declaring the resource in a try-with-resources statement?
    - Yes.
