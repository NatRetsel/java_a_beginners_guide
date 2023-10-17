/*
 * Change the sort in Try This 5-1 so that it sorts an array of strings. Demonstrate that it works.
 */

// Bubble sort
class Bubble {
    public static void main(String[] args){
        String str[] = {"ABV", "ADLV", "abv", "adlv", "crypto", "wagmi", "PraYge", "Froge", "Pepe", "Pepega"};
        int a, b;
        String t;
        int size;

        size = 10; // number of elements to sort

        // display original array
        System.out.print("Original array is:");
        for(int i=0; i < size; i++)
            System.out.print(" " + str[i]);
        System.out.println();

        // This is the Bubble sort
        for(a=1; a < size; a++)
            for (b=size-1; b >=a; b--){
                if(str[b-1].compareTo(str[b]) > 0) { // if out of order
                    // exchange numbers
                    t = str[b-1];
                    str[b-1] = str[b];
                    str[b] = t;
                }
            }
        
        // display sorted array
        System.out.print("Sorted array is:");
        for(int i=0; i<size; i++)
            System.out.print(" " + str[i]);
        System.out.println();

    }
}