// Demonstrate the Stack class
class SDemo {
    public static void main(String[] args) {
        // construct 10-element empty stack
        Stack s1 = new Stack(10);
        
        char ch;
        int i;

        try {
            // put some characers into s1 and overrun it
            for (i=0; i<11; i++){
                System.out.print("Attempting to store : " + (char)('A' + i));
                s1.push((char)('A'+i));
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
                System.out.print("getting next char: ");
                ch = s1.pop();
                System.out.println(ch);
            }
        }
        catch (StackEmptyException exc) {
            System.out.println(exc);
        }
        
        
    }
}
