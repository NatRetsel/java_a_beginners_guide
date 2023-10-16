/*
 * Write a program that reads characters from the keyboard until a period is received. Have the program
 * count the number of spaces. Report the total at thr end of the program.
*/

class Solution {
    public static void main(String[] args)
    throws java.io.IOException {
        System.out.println("Enter characters: ");
        char ch;
        int count = 0;
        do {
            ch = (char) System.in.read();
            if (ch == ' '){
                ++count;
            }
        } while (ch != '.');
        System.out.println("Total number of spaces: "+count);
        
    }
}