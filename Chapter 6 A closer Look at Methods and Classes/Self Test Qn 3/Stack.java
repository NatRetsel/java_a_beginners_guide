/*
 * The complement of the queue is a stack. It uses first-in, last-out accessing and is often likened to a stack of plates. The first plate
 * put on the table is the last plate used. Create a stack class called Stack that can hold characters. Call the methods that access the stack
 * push() and pop(). Allow the user to specify the size of the stack when it is created. Keep all other members of the Stack class private.
 */
class Stack {
    private char[] s;
    private int putloc;

    Stack(int size){
        s = new char[size];
        putloc = 0;
    }

    Stack(char[] a){
        s =  new char[a.length];
        putloc = 0;

        for (int i=0; i < a.length; i++) push(a[i]);
    }

    Stack(Stack ob){
        s = new char[ob.s.length];
        putloc = ob.putloc;

        for (int i=0; i < putloc; i++) s[i] = ob.s[i];
    }

    void push(char ch){
        if (putloc == s.length) {
            System.out.println("Stack is full.");
            return;
        }
        s[putloc] = ch;
        putloc++;
    }

    char pop(){
        if (putloc == 0 ){
            System.out.println("Stack is empty.");
            return (char)0;
        }
        char return_val = s[putloc-1];
        putloc--;
        return return_val;
    }
}

// Demonstrate the Queue class
class SDemo {
    public static void main(String[] args) {
        // construct 10-element empty queue
        Stack s1 = new Stack(10);

        char[] name = {'T', 'o', 'm'};
        // construct queue from array
        Stack s2 = new Stack(name);
        
        char ch;
        int i;

        // put some characers into q1
        for (i=0; i<10; i++){
            s1.push((char)('A'+i));
        }

        // construct queue from another queue
        Stack s3 = new Stack(s1);

        // Show the queues
        System.out.print("Contents of s1: ");
        for(i=0; i<10; i++){
            ch = s1.pop();
            System.out.print(ch);
        }

        System.out.println("\n");

        System.out.print("Contents of s2: ");
        for(i=0; i<3; i++){
            ch = s2.pop();
            System.out.print(ch);
        }

        System.out.println("\n");

        System.out.print("Contents of s3: ");
        for(i=0; i<10; i++){
            ch = s3.pop();
            System.out.print(ch);
        }
        
    }
}