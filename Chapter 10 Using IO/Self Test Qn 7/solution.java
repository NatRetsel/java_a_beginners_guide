/*
 * Write a program that copies a text file. In the process, have it convert all spaces into hyphens. Use the byte stream file classes. Use
 * the traditional approach to closing a file by explicitly calling close().
 */

import java.io.*;

class Solution {
    public static void main(String[] args) throws IOException {
        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;

        if(args.length != 2) {
            System.out.println("Usage: Hyphen From To");
            return;
        }

        // Copy file and substitute hyphens
        try {
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);

            do {
                i = fin.read();

                // convert spaces to hyphen
                if ((char)i == ' ') i = '-';
                if(i != -1) fout.write(i);
            }while (i !=-1);
        }catch (IOException exc) {
            System.out.println("I/O error: " + exc);
        }finally {
            try {
                if (fin != null) fin.close();
            }catch (IOException exc) {
                System.out.println("Error closing input file.");
            }

            try {
                if (fout != null) fout.close();
            }catch (IOException exc) {
                System.out.println("Error closing output file.");
            }
        }
    }
}