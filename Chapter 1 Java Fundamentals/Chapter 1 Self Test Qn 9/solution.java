/*
    The moon's gravity is about 17 percent that of earth's. Write a program that computes your effective weight
    on the moon.
*/
import java.util.Scanner;
class Solution {
    public static void main(String[] args){
        System.out.print("Enter weight on Earth (kg): ");
        try (Scanner s = new Scanner(System.in)){
            double weight_earth = s.nextDouble();
            System.out.println("Weight on moon (kg): "+ weight_earth*0.17);
        }
    }
}