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

    Stack(char[] a) throws StackFullException{
        s =  new char[a.length];
        putloc = 0;

        for (int i=0; i < a.length; i++) push(a[i]);
    }

    Stack(Stack ob){
        s = new char[ob.s.length];
        putloc = ob.putloc;

        for (int i=0; i < putloc; i++) s[i] = ob.s[i];
    }

    void push(char ch) throws StackFullException{
        if (putloc == s.length) {
            throw new StackFullException(s.length);
        }
        s[putloc] = ch;
        putloc++;
    }

    char pop() throws StackEmptyException{
        if (putloc == 0 ){
            throw new StackEmptyException();
        }
        char return_val = s[putloc-1];
        putloc--;
        return return_val;
    }
}

