/*
 * Write a program that uses an array to find the average of 10 double values. Use any 10 values you like.
 */

class Solution {
    public static void main(String[] args){
        double arr[] = {6.0, 5.5, 4.3, 6.7, 3.44, 8.9, 9.1, 7.5, 4.2, 1.23};

        double sum = 0.0;
        for (double num: arr){
            sum += num;
        }
        System.out.println("Average is: "+sum/arr.length);
    }
}