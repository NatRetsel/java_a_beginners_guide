class GenStackDemo {
    public static void main(String[]args) {
         // construct 10-element empty integer stack
        Integer[] arr = new Integer[10];
        GenStack<Integer> s1 = new GenStack<Integer>(arr);
        
        int iVal;
        int i;

        try {
            // put some characers into s1 and overrun it
            for (i=0; i<11; i++){
                System.out.print("Attempting to store : " + i);
                s1.push(i);
                System.out.println(" - OK");
            }
           System.out.println();
        }
        catch (StackFullException exc) {
            System.out.println(exc);
        }

        System.out.println();
        
        try {
            // over-empty the stack
            for(i=0; i<11; i++){
                System.out.print("getting next element: ");
                iVal = s1.pop();
                System.out.println(iVal);
            }
        }
        catch (StackEmptyException exc) {
            System.out.println(exc);
        }
    }
}
