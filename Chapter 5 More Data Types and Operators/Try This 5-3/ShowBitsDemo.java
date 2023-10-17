/*
 * Create a class ShowBits that enables you to display in binary the bit pattern for any integer value.
 */

class ShowBits {
    int numbits;

    ShowBits(int n){
        numbits = n;
    }

    void show(long val) {
        long mask = 1;

        // left-shift a 1 int the proper position (leftmost valid bit position of specified by numbits)
        mask <<= numbits-1;

        int spacer = 0;
        for (; mask !=0; mask >>>=1) {
            if ((val & mask)!=0) System.out.print("1");
            else System.out.print("0");
            spacer++;
            if((spacer%8) == 0) { // prints space every 8 bits
                System.out.print(" ");
                spacer = 0;
            }
        }
        System.out.println();
    }
}

class ShowBitsDemo {
    public static void main(String[] args) {
        ShowBits b = new ShowBits(8);
        ShowBits i = new ShowBits(32);
        ShowBits li = new ShowBits(64);

        System.out.println("123 in binary: ");
        b.show(123);

        System.out.println("123 in binary: ");
        i.show(123);

        System.out.println("\n87987 in binary: ");
        li.show(87987);

        System.out.println("\n237658768 in binary: ");
        b.show(237658768);

        // low-order bits of any integer
        System.out.println("\nLow order 8 btis of 87987 in binary: ");
        b.show(87987);

    }
}