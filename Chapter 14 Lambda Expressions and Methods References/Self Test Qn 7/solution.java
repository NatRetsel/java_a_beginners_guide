/*
 * Create a block lambda that computes the factorial of an integer value. Demonstrate its use.
 * Use NumericFunc, shown in this chapter, for the functional interface.
 */
import java.io.*;

interface NumericFunc {
    int func(int n);
}

class Solution {
    public static void main(String[] args) throws IOException {
        int num;
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a positve integer: ");
        num = Integer.parseInt(reader.readLine());

        NumericFunc factorial = (n) -> {
            int i = n;
            int fac = 1;
            while (i >= 1) {
                fac *= i;
                --i;
            }
            return fac;
        };

        System.out.println("The factorial of " + num + " is: " + factorial.func(num));

    }
}