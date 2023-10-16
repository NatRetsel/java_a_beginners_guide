/*
 * A truth table for the logical operators
 * 
 * Challenge: try modifying so that it uses and displays 1's and 0's.
 */

 class LogicalOpTable {
    public static void main(String[] args) {
        boolean p,q;
        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

        p = true; q = true;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (!p));

        p = true; q = false;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (!p));

        p = false; q = true;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (!p));

        p = false; q = false;
        System.out.print(p + "\t" + q + "\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (!p));

        System.out.println();
        
        int x,y;
        System.out.println("X\tY\tAND\tOR\tXOR\tNOT");

        x = 1; y = 1;
        System.out.print(x + "\t" + y + "\t");
        System.out.print((numerical_bool_and(x,y)) + "\t" + (numerical_bool_or(x, y)) + "\t");
        System.out.println((numerical_bool_xor(x, y)) + "\t" + (numerical_bool_not(x)));

        x = 1; y = 0;
        System.out.print(x + "\t" + y + "\t");
        System.out.print((numerical_bool_and(x,y)) + "\t" + (numerical_bool_or(x, y)) + "\t");
        System.out.println((numerical_bool_xor(x, y)) + "\t" + (numerical_bool_not(x)));

        x = 0; y = 1;
        System.out.print(x + "\t" + y + "\t");
        System.out.print((numerical_bool_and(x,y)) + "\t" + (numerical_bool_or(x, y)) + "\t");
        System.out.println((numerical_bool_xor(x, y)) + "\t" + (numerical_bool_not(x)));

        x = 0; y = 0;
        System.out.print(x + "\t" + y + "\t");
        System.out.print((numerical_bool_and(x,y)) + "\t" + (numerical_bool_or(x, y)) + "\t");
        System.out.println((numerical_bool_xor(x, y)) + "\t" + (numerical_bool_not(x)));
    }

    public static int numerical_bool_and(int x, int y) {
        boolean a = false, b = false;
        if (x == 1) {
            a = true;
        }
        if (y == 1) {
            b = true;
        }

        if (a&b){
            return 1;
        }
        return 0;
    }

    public static int numerical_bool_or(int x, int y) {
        boolean a = false, b = false;
        if (x == 1) {
            a = true;
        }
        if (y == 1) {
            b = true;
        }

        if (a|b){
            return 1;
        }
        return 0;
    }

    public static int numerical_bool_xor(int x, int y) {
        boolean a = false, b = false;
        if (x == 1) {
            a = true;
        }
        if (y == 1) {
            b = true;
        }

        if (a^b){
            return 1;
        }
        return 0;
    }

    public static int numerical_bool_not(int x) {
        boolean a = false;
        if (x == 1) {
            a = true;
        }
        
        if (!a){
            return 1;
        }
        return 0;
    }
 }