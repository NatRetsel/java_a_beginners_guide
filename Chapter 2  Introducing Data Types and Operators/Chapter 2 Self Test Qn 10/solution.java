/*
 * Write a program that finds all of the prime numbers between 2 and 100.
 */

 class Solution {
    public static void main(String[] args){
        for (int i = 2; i<=100; i++){
            if (is_prime(i)) {
                System.out.println(i + " is prime");
            }
        }
    }

    public static boolean is_prime(int x){
        for (int i=2; i <= x/2; i++){
            if (x%i == 0) {
                return false;
            }
        }
        return true;
    }
 }