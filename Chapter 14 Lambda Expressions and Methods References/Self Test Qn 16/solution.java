/*
 * To the MethodRefDemo2 program, add a new method to MyIntNum called hasCommonFactor(). Have it return true if its int
 * argument and the value stored in the invoking MyIntNum object have at least one factor in common. For example, 9 and 12
 * have a common factor, which is 3, but 9 and 16 have no common factor. Demonstrate hasCommonFactor() via method reference.
 */

// A functional interface for numeric predicates that operate on integer values
interface IntPredicate {
    boolean test(int n);
}

// This calss stores an int value and defines that instance method isFactor(), which returns true if its argument
// is a factor of the stored value.
class MyIntNum {
    private int v;

    MyIntNum(int x) { v=x;}

    int getNum() { return v; }

    // Return true if n is a factor of v.
    boolean isFactor(int n) {
        return (v % n) == 0;
    }

    // Return true if n and v have common factors.
    boolean hasCommonFactor(int n) {
        int min_num = Math.min(v,n);
        for (int i=2; i<= min_num/2; i++) {
            if (v%i == 0 && n%i == 0) return true;
        }
        return false;
    }
}

class MethodRefDemo2 {
    public static void main(String[] args) {
        boolean result;

        MyIntNum myNum = new MyIntNum(12);
        MyIntNum myNum2 = new MyIntNum(16);

        // Here, a method reference to isFactor on myNum is created.
        IntPredicate ip = myNum::isFactor;

        // Now it is used to call isFactor() via test()
        result = ip.test(3);
        if(result) System.out.println("3 is a factor of " + myNum.getNum());

        // This time, a method reference to isFactor on myNum2 is created.
        // and used to call isFactor() via test().
        ip = myNum2::isFactor;
        result = ip.test(3);
        if(!result) System.out.println("3 is not a factor of " + myNum2.getNum());

        // Let's create a method reference to hasCommonFactor() on myNum.
        IntPredicate ip2 = myNum::hasCommonFactor;
        result = ip2.test(9);
        if(result) System.out.println("9 has a common factor with " + myNum.getNum());

        // A method reference to hasCommonFacotr on myNum2
        ip2 = myNum2::hasCommonFactor;
        result = ip2.test(9);
        if(!result) System.out.println("9 does not have a common factor with " + myNum2.getNum());
    }
}