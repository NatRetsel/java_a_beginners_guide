/*
 * Create a functional interface that can support the lambda expression you created in question 5.
 * Call the interface MyTest and its abtract method testing()
 */


import java.io.*;

interface MyTest {
    boolean testing(double n);
}

class Solution {
    public static void main(String[] args) throws IOException{
        double num;
        System.out.println("Enter a number: ");

        BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));

        num = Double.parseDouble(reader.readLine());

        // Show a lambda expression that returns true if a number is between 10 and 20, inclusive.
        MyTest mytest = (n) -> (n>=10 & n<=20);

        if (mytest.testing(num))
            System.out.println(num + " is between 10 and 20 inclusive");
        else
            System.out.println(num + " is not between 10 and 20 inclusive");
    }
}