/*
 * Show a lambda expression that returns true if a number is between 10 and 20, inclusive.
 */


import java.io.*;

interface Test {
    boolean test(double n);
}

class Solution {
    public static void main(String[] args) throws IOException{
        double num;
        System.out.println("Enter a number: ");

        BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));

        num = Double.parseDouble(reader.readLine());

        // Show a lambda expression that returns true if a number is between 10 and 20, inclusive.
        Test mytest = (n) -> (n>=10 & n<=20);

        if (mytest.test(num))
            System.out.println(num + " is between 10 and 20 inclusive");
        else
            System.out.println(num + " is not between 10 and 20 inclusive");
    }
}