/*
 * Create a generic functional interface called MyFunc<T>. Call its abstract method func(). Have func() return a reference
 * of type T. Have it take a parameter of type T. (Thus, MyFunc will be a generic version of NumericFunc shown in the
 * chaper.). Demonstrate its use by rewriting your answer to question 7 so it uses MyFunc<T> rather than NumericFunc.
 */

import java.io.*;

interface MyFunc<T> {
    T func(T t);
}

class Solution {
    public static void main(String[] args) throws IOException {
        int num;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a positive integer: ");
        num = Integer.parseInt(reader.readLine());

        MyFunc<Integer> factorial = (n) -> {
            int i = n;
            int fac = 1;
            while (i >= 1) {
                fac *= i;
                --i;
            }
            return fac;
        };

        System.out.println(num + " factorial is: "+ factorial.func(num));
    }
}