/*
 * The ASCII lowercase letters are separated from the uppercase letters by 32. Thus, to convert a lowercase letter
 * to uppercase, subtract 32 from it. Use this information to write a program that reads characters from the keyboard.
 * Have it convert all lowercase letters to uppercase, and all uppercase letter to lowercase, displaying the result. 
 * Make no changes to any other character. Have the program stop when the user enters a period. At the end, have the
 * program display the number of case changes that have taken place.
 */

class Solution {
    public static void main(String [] args) 
        throws java.io.IOException {
            char ch;
            int count=0;
            System.out.println("Enter characters: ");
            do {
                ch = (char) System.in.read();
                if (ch >= 'A' & ch <= 'Z'){
                    ch += 32;
                    ++ count;
                }else if (ch >= 'a' & ch <= 'z') {
                    ch -=32;
                    ++ count;
                }
                System.out.print(ch);
            }while (ch != '.');

            System.out.println("Number of case changes: "+ count);
        }
        
    
}