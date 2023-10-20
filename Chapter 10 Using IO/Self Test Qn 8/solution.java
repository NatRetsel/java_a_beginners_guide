/*
 * Rewrite the program described in question 7 so that it uses the character stream classes. This time, use the try-with-resources
 * statement to automatically close the file
 */
import java.io.*;

class Solution {
    public static void main(String[] args) throws IOException {
        int ch;
        if (args.length != 2) {
            System.out.println("Usage: Hyphen From To");
            return;
        }

        try (BufferedReader rin = new BufferedReader(new FileReader(args[0]));
            BufferedWriter wout = new BufferedWriter(new FileWriter(args[1]))) {

                do {
                    ch = rin.read();
                    if((char)ch == ' ') ch = '-';
                    if(ch != -1) wout.write(ch);
                }while (ch != -1);
            }catch (IOException exc){
                System.out.println("I/O Error: " + exc);
            }
    }
}